# boilerplate-android

Module of most used common code practices: commons

## How to use
* clone as `git clone git@github.com:iAppStreet/boilerplate-android.git <NAME-OF-NEW-PROJECT>`
* create a new package path inside `app/java/com`, for e.g. create a package like: `app/java/com/name-of-new-project/android`
* Move the `App.java` class from `app/java/com/iappstreet/boilerplate` to the new package (in android studio)
* Delete the old package as it is no longer essential
* Update Manifest: change top level package to the newly created package - in this case `com.name-of-new-project.android`
* Update Gradle: change applicationId to the newly created package

## 2015/12/11
* Thread Utils: submit callables to it using `ThreadUtils.getDefaultExecutorService().submit(callable)`
* Network Util to encapsulate Volley: submit requests to it using: `Network.getGeneralRequestQueue().add(request)`
* Support for integration of https://github.com/chemouna/Decor to handle custom fonting of all views in the layout
* Seperate Loggers for debug and release configs: use it using `App.log().d(....)` or `App.log().e(....)` etc
* Easy access to resources in non-context classes: use it using `App.R().getString(....)`
* Base Application: handles initialization of Network and Loggers
* Base Activity `ASActivity`: life-cycle verbose logs + integration of Decor via `getDecorators` and `attachBaseContext`
* Base Fragment `ASFragment`: life-cycle verbose logs only
