# Modular Java Demo

Demo for the Stockholm Java Meetup - Feb 2018.

## Branches

### master

The master branch contains a simple Java 9 application consisting of 2 main modules and 2 optional modules:

* `api` - the API module defining the abstract features of the application (that can be implemented by other modules).
* `core` - The core module which loads the application.
* `hello` - An optional module implementing the `MessageProvider` interface from the `api` module.
* `goodbye` - An optional module implementing the `MessageProvider` interface from the `api` module.

To build, run `gradle jar`.

This creates a file at `core/build/mod-path.txt` with the Java 9 module path, as well as all the jars.

To run the application:

```
java -p $(cat core/build/mod-path.txt) -m meetup.core/meetup.core.Main
```

To add/remove modules from the module path, edit the text file or comment out unnecessary dependencies in the
core module's `build.gradle` file and re-build.

### microservices

This branch adds a remote service in the `hello` module via the `meetup.hello.internal.HelloRemoteMessageProvider`
class and a `meetup.core.RemoteMain` main class to
the `core` module that calls the remote `MessageProvider`.

Remote service support (server and client) is provided by the
`[protobuf-tcp-rsa-provider](https://github.com/renatoathaydes/protobuf-tcp-rsa-provider)` library.

To start the `hello` module remote server:

```
java -p $(cat core/build/mod-path.txt) -m meetup.hello/meetup.hello.internal.HelloRemoteMessageProvider
```

Then, run the `RemoteMain` class:

```
java -p $(cat core/build/mod-path.txt) -m meetup.core/meetup.core.RemoteMain
```
