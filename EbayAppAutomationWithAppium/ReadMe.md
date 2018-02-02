=============================================================
QAIT Mindtap Mobile - Android Mobile Automation
=============================================

### Mindtap Android Mobile Automation [Java - Maven - TestNG]
---
#### Summary:

This Automation Framework serves the purpose of automating the test cases and getting the tests results. Please refer the below mentioned guidelines/prerequisites for the same.

#### System Requirement:

* JDK 1.8 or above
* Maven 3.1 or above
* Eclipse or IDE of choice in case there is need to update the script. (optional)
* Appium 1.4 or higher 

### Deprecated code

Packages like DWMP,MOB,MTPM contains deprecated code and now not in use and must not be considered for code review. 

### Automation Engineers in MindTap mobile
 
 * Anshul Garg - Captain
 * Vibha - Daenerys
 * Kamran - Thor
 * Aakriti - Wonder Woman

#### Prerequisite for the execution of Android Native App :
For the given stash link , switch to Android branch to access Android Code. 
Launch the appium 

#### Test Execution:
Script can be executed through testng and 

#### Guidelines for code review:
* Use camelCase coding conventions for writing test scripts literals (method names , keywords , variable Names & locators in spec files)
* Spec files contains all the locator values for webElements of certain pages . If test cases fails due to NoSuchElementException , change the locator values.
* Plugins to be managed via POM only. Please don't add any external jars/exe in project.
* Assign specific names for the variables
* Remove dead/obsolete code/warnings if any
* Don't use system.out.print() to print the logs. use Reporter class methods
* Write JavaDoc for each method

#### Result Files: 
The Test Execution Results will be stored in the following directory once the test has completed

##### TestNG Emailable reports
    ./test-output/emailable-report.html 
 

-------------
# _Automation_V8
Automation using V8 frame work