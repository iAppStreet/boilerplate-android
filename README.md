# boilerplate-android

Module of most used common code practices: commons

## 2015/12/11
* Thread Utils
* Network Util to encapsulate Volley
* Support for integration of https://github.com/chemouna/Decor to handle custom fonting of all views in the layout
* Seperate Loggers for debug and release configs
* Base Application: handles initialization of Network and Loggers
* Base Activity `ASActivity`: life-cycle verbose logs + integration of Decor via `getDecorators` and `attachBaseContext`
* Base Fragment `ASFragment`: life-cycle verbose logs only
