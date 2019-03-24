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

