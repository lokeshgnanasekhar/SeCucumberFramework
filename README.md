# SeCucumberFramework
Selenium Cucumber Framework - This Framework developed using BDD on top of Selenium. It has the following feauture
1. Parallel Execution
2. Reporting
3. Project Configuration
4. Logging
5. Screenshot Attachment to reports on failure


## To Execute From Command Prompt
Download the Project and Navigate into the project. Use the  following command

```mvn clean verify```

## To Execute Testcases based on Tag

```mvn clean verify -Dcucumber.options="--tags @smoke" ```
