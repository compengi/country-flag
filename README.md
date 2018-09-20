# Country Flag Add-on for Vaadin 8

[![Build Status](https://travis-ci.org/mvysny/country-flag.svg?branch=master)](https://travis-ci.org/mvysny/country-flag)
[![Published on Vaadin  Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/country-flag-add-on)
[![Stars on Vaadin Directory](https://img.shields.io/vaadin-directory/star/country-flag-add-on.svg)](https://vaadin.com/directory/component/country-flag-add-on)

Country Flag is a UI component add-on for Vaadin 8 which shows Country Flags. It uses the https://github.com/lipis/flag-icon-css
project. The flags are self-hosted in the add-on jar file, so the flags are not downloaded from some third-party server.

## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to https://vaadin.com/directory#!addon/country-flag-add-on

## Building and running demo

```bash
git clone https://github.com/mvysny/country-flag
mvn clean install
cd country-flag-demo
mvn jetty:run
```

To see the demo, navigate to http://localhost:8080/

## Development with Eclipse IDE

For further development of this add-on, the following tool-chain is recommended:
- Eclipse IDE
- m2e wtp plug-in (install it from Eclipse Marketplace)
- Vaadin Eclipse plug-in (install it from Eclipse Marketplace)
- JRebel Eclipse plug-in (install it from Eclipse Marketplace)
- Chrome browser

### Importing project

Choose File > Import... > Existing Maven Projects

Note that Eclipse may give "Plugin execution not covered by lifecycle configuration" errors for pom.xml. Use "Permanently mark goal resources in pom.xml as ignored in Eclipse build" quick-fix to mark these errors as permanently ignored in your project. Do not worry, the project still works fine. 

### Debugging server-side

If you have a JRebel license, it makes on the fly code changes faster. Just add JRebel nature to your country-flag-demo project by clicking project with right mouse button and choosing JRebel > Add JRebel Nature

To debug project and make code modifications on the fly in the server-side, right-click the country-flag-demo project and choose Debug As > Debug on Server. Navigate to http://localhost:8080/ to see the application.

## Release notes

### Version 1.0-SNAPSHOT
- Initial versoin

## Roadmap

This component is developed as a hobby with no public roadmap or any guarantees of upcoming releases. That said, the following features are planned for upcoming releases:
- ...
- ...

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

CountryFlag is written by Martin Vysny

# Developer Guide

## Getting started

Here is a simple example on how to try out the add-on component:

```java
yourLayout.addComponent(new CountryFlag("fi"));
```

The flag is by default 150x120 px.

For a more comprehensive example, see src/test/java/org/vaadin/template/demo/DemoUI.java
