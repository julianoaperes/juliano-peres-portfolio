# Juliano Peres — personal portfolio
English portfolio for international QA/SDET recruiters. Static deployment lives in `dist/`.

## Run with Java
Requires JDK 17 or newer. From this directory:

```bash
java backend/PortfolioServer.java
```
Visit http://127.0.0.1:8080. This first version uses a minimal Java HTTP server; Spring Boot API features are planned, not implemented. Sites hosts only the static frontend, not the Java process.

## Content pending
- Confirmed professional contact and LinkedIn URL
- Approved English CV file
- Earlier career details, dates, achievements and lessons
- Expanded project case studies

## Testing direction
Robot Framework scenarios will call custom Java keywords through the Remote library. Java keywords will use Selenium WebDriver. This automation suite is planned; it is not yet implemented or executed. The site does not claim a test pass status.
