Step to set up spring boot REST api project:
1. Open https://start.spring.io/ page.
2. Set below property:
   * Project: Maven
   * Language: java
   * Spring Boot: 2.2.6.RELEASE
   * Group: com.prateekbangre
   * Artifact: employee_api
   * Name: employee_api
   * Description: Demo project for Spring Boot
   * Package name: com.prateekbangre.employee_api
   * Packaging: jar
   * Java: 8
   
3. Now in right side click on "Add Dependencies" and add 
    * MySQL Driver (for MYSQL)
    * Spring Data JPA(for SQL injection)
    * Spring Web(for rest api)
    * Lombok(for getter setter and method)

Now Open Your project in IDE.
Add MYSQL(Database) details in application.properties file.

No create HealthCheck java class and write healthcheck api.

GET API http://localhost:8080/healthcheck
