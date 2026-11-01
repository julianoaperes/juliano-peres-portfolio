# Portfolio SEO research and implementation
Reviewed 1 November 2026. Audience: international recruiters hiring QA engineers in Brazil/LATAM.

## Method and limits
Two search engines were used to discover employer job descriptions and Google Search Central guidance. This is a qualitative vocabulary review, not keyword search-volume research or a representative market survey. A posting being retrievable does not establish that applications are still open. No ranking or traffic improvement is promised.

## Primary references
- StockX, Software Development Engineer in Test: https://job-boards.greenhouse.io/stockx/jobs/8790338002 — regression, integration, E2E, CI/CD, UI/API automation, SQL, troubleshooting, AI-assisted testing.
- Zafin, Senior QA Automation Engineer: https://job-boards.greenhouse.io/zafinlabsamericasinc/jobs/5155690007 — automation strategy, API testing, SQL/backend validation, CI/CD, cross-functional collaboration.
- Oceans Code Experts, Senior QA Automation, LATAM: https://www.oceanscode.com/careers/senior-qa-automation-yr-03 — JavaScript, Cypress, E2E workflows, GitHub Actions, test coverage, English.
- Air, Software Development Engineer in Test: https://job-boards.greenhouse.io/air/jobs/4068849009 — manual and automated testing, test plans/cases, regression, defect management, Selenium, JavaScript. Used for vocabulary, not as an eligible job recommendation.
- Mahisoft: https://mahisoft.com/careers/1/ — QA Automation Engineer / remote LATAM title. Detailed skills were visible in search extraction, not in the opened page; not counted as independently verified skill evidence.
- Google SEO starter guide: https://developers.google.com/search/docs/fundamentals/seo-starter-guide — natural language, descriptive titles/links, avoid keyword stuffing; Google ignores meta keywords.
- Google developer guide: https://developers.google.com/search/docs/fundamentals/get-started-developers — semantic HTML, title/description, crawl access, login blocks discovery of protected content.
- ProfilePage documentation: https://developers.google.com/search/docs/appearance/structured-data/profile-page — profile structured data; no rich-result guarantee.

## Vocabulary mapped to page evidence
| Focus | Evidence in this portfolio | Placement |
| --- | --- | --- |
| QA Engineer / Quality Assurance Engineer | CV role history | Title, introduction, contact |
| QA Automation Engineer / SDET | Target roles; automation contributions and projects | Metadata, role positioning, contact; historical job titles preserved |
| Cypress / JavaScript / UI automation | Electrolux and AB InBev | Experience, skills, personal project |
| E2E / regression / integration testing | Test responsibilities and personal projects | Experience and descriptive project headings |
| API testing / Postman / SOAP | CV API and service testing | Skills and Caiena experience |
| SQL / MySQL / MongoDB / data validation | CV database checks | Skills and Caiena experience |
| CI/CD / GitHub Actions / BrowserStack | CV execution and cross-browser testing | Experience and skills |
| BDD / Cucumber / Gherkin / POM | User-confirmed experience | Experience tags and prose |
| Brazil / LATAM / advanced English | Location, project scope, international background | Introduction and contact |
| Robot Framework / Selenium / Java | Professional Robot/Java contributions and personal Selenium project | Separate professional and learning contexts |

## Implemented
- Descriptive title and meta description; role-focused H1 and section/project headings.
- Original copy throughout experience, projects, skills, career journey, education, and contact.
- Expanded SDET, E2E, BDD, POM, UAT acronyms where helpful.
- Descriptive repository links and English CV download text.
- Explicit HTML head; canonical URL; Open Graph/Twitter metadata.
- ProfilePage/Person JSON-LD with existing identity/profile links and visible skills.
- robots.txt and single-canonical-URL sitemap. Section anchors are not separate pages.
- Original role titles, dates, client/employer distinction, photo choice, and existing user-requested tags retained.

## Deliberate exclusions
No invented accomplishments, framework ownership, expert Java claims, Playwright professional experience, mobile automation, cloud expertise, or unsupported performance improvements. No hidden keyword blocks, meta-keywords tag, or JobPosting schema. No employer copy reused as personal achievements.

## Remaining activation and measurement
The Site remains owner-private. The sign-in gate prevents crawlers from reaching the portfolio; robots.txt and sitemap cannot override it. Public access requires the owner's explicit instruction, including awareness that the photo, contact details, career history, and downloadable CV would become accessible.
After public launch: verify Google Search Console ownership, inspect the canonical URL, submit sitemap.xml, inspect live rendered metadata and structured data, and measure actual impressions/queries/clicks and Core Web Vitals. These steps have not been performed. No analytics/tracking scripts added.
