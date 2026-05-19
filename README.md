# Selenium TestNG Framework

A full-featured Java/Selenium/TestNG automation framework demonstrating industry-standard QA patterns including parallel execution, data-driven testing, logging, and grouped test suites.

## Tech Stack
| Tool | Purpose |
|------|---------|
| Java | Core language |
| Selenium WebDriver | Browser automation |
| TestNG | Test runner, parallelism, grouping |
| Log4j | Test execution logging |
| Apache POI | Excel data-driven testing |
| Maven | Build & dependency management |

## Framework Features
| Feature | File |
|---------|------|
| Parallel execution | `parallel.xml` |
| Test grouping (smoke/regression) | `groups.xml` |
| Parameterized tests | `parameter.xml` |
| Log4j logging config | `log4j.xml` |
| Data-driven via Excel | `read.xlsx` + `DataDriven.java` |
| Custom TestNG listener | `BaseListener.java` |

## Test Suites
- **SmokeTest** — critical path, fast feedback
- **UnitTest** — component-level tests
- **DBTest** — database connectivity validation

## Running Tests
```bash
# Run all tests
mvn clean test

# Run smoke suite only
mvn clean test -Dsurefire.suiteXmlFiles=groups.xml

# Run in parallel
mvn clean test -Dsurefire.suiteXmlFiles=parallel.xml
```

## Skills Demonstrated
- Parallel test execution across browsers
- Log4j structured logging
- Excel-based data-driven testing
- TestNG listeners for custom reporting
