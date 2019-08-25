# spring-boot-lombok-builder-desgin-pattern

Demonstration of how to use builder design pattern for complex object creation with help of lombok in spring boot.
Advantage:- Lombok @Builder annotation takes care of all the code that is required for builder pattern creatiion.
Reduces boilerplate coding.

Swagger link Below:
http://localhost:8080/swagger-ui.html


List of API:
http://localhost:8080/home/createOrganization
http://localhost:8080/home/getOrganizations


Sample request body for post method below:

{
  "name": "mockingOrgnizatiion",
  "employee": [
    {
      "name": "Samarth",
      "age": 24,
      "salary": 30000
    }
  ],
  "projects": [
    {
      "name": "paymentGateway",
      "capacity": 50,
      "budget": 999999
    }
  ],
  "marketValue": 99999
}
