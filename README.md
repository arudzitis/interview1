# Exercise
### General info
- As a user, I want to receive collection of specific records defined below.

`Policy` model can have two types of records: 1 - `policy`, 2 - `quote`. We can have quotes without policy but we can not have policies without quotes.
It means that each `Policy` has at least one quote. End-user expect report where they will be able to see: how many quotes we have for each policy.

* Candidate have to return list of `ReportDTO` records on REST facade `/report` using any Java structure or his own.
* Candidate can't touch Repository interfaces.
* Candidate need to write logic in `@Service` and `@Controller` classes.


### * Service part
You need to implement `loadReport` method. This method can use any Java or нщгк own structure. The only method what you can use from `PolicyRepository` is `Stream<Policy> loadAllPolicyRecords()`. This method will return Stream with all policy records from DB.

### * Controller part
You need to fix `getReport()` method.

### * Testing
You have to implement test which will test `/report` end-point (end-point exist, receive expected media-type, response can be mapped to `ReportDTO` class)

### Tech spec.
- H2 DB console: http://localhost:8080/h2-console
- H2 DB User: sa
- H2 DB Pass:123456qaz
- H2 DB address: jdbc:h2:mem:interview
- You don't need to change any `application.properties` parameters

** Exercise required time is up to 40 minutes.
