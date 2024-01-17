# Facebook Automation with Selenium WebDriver, TestNG, and JUnit

This repository contains automated test scripts for Facebook using Selenium WebDriver along with TestNG and JUnit for test execution. The project structure includes a `pom.xml` file to manage dependencies and separate files for login automation (`LoginAutomation.java`) and clicking on profile and menu buttons (`ProfileMenuAutomation.java`).

## Project Structure

- **src/main/java**: Contains utility classes and any additional code for setting up the WebDriver.
- **src/test/java**: Contains the test scripts.
  - **com.example.tests**: Test classes for Facebook automation.
    - `LoginAutomation.java`: Automation script for Facebook login.
    - `ProfileMenuAutomation.java`: Automation script for clicking on profile and menu buttons.

## Prerequisites

- Make sure you have Java installed on your machine.
- Configure the dependencies in the `pom.xml` file to ensure you have the required libraries.

## Getting Started

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/your-username/facebook-automation.git
