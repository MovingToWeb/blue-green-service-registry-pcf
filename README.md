# Blue Green Deployment in PCF

## Setup
- `demo-blue` - Production app. Deployed as `demo-app-techprimers`
- `demo-green` - New Version app. Deployed as `demo-green-techprimers`
- `demo-client` - Production Client app. Deployed as `demo-client-techprimers`

## Build Command.
Under every package, run `mvn clean install` to generate artifacts

## Deployment Command
Under every package, run `cf push` to push the artifacts based on `manifest.yml` present under each package.

## Create new Service Registry service from Marketplace
- Goto `Marketplace` in PCF and create a service with name `service-registry` (if this name is different, please update `manifest.yml` with the new service name.

After the deployment of all these apps, Service Registry should show up 2 names. one with DEMO, another with DEMO-CLIENT. Notice that DEMO will have 2 instances running (blue + green).

Inorder to leverage PCF, you can create an alternate route for blue app using `cf map-route demo-green-techprimers cfapps.io --hostname demo-app-techprimers`. This creates 2 routes for the `demo-app-techprimers` app, which basically means, you can create your app in 2 different URLs and CF will take care of routing to the App which is UP and healthy. CF has a `Go Router` which holds all these mappings and hence it will redirect the request to the healthy instance.

You can use the `cf unmap-route` to remove the mapping once you want to remove the old/new version name.

Since the PCF platform provides routes to help us in following Blue Green deployment strategy, you can see the same behaviour with Service Registry/API Gateway or without them.

Hope this helps..!

Happy Coding!

