# VaibhavKoshta_ORMandSpringMVCAssignmentSolution

In this project a customer relationship management web application is designed using the Object Relational Mapping and Spring MVC concepts.
A MySQl database is created and named as customerrelationshipmanagement. It is used to store the records entered the user in a table named as Crm.
A servlet file is created which defines all the hibernate properties and a MySQl username and password along with the name of the database is provided in it. Also session factory body is defined which maintains all the CRUD (Create, Read, Update and Delete) operations in the database.

CrmService.java class is created to define the functions which are used to control or perform the CRUD operations.
CrmServiceImpl.java class implements all the instructions for the functions defined in the CrmService.java class.
Crm.java class is defined as an entity module which defines all the variables, getters and setters, constructors with no argument, constructors with arguments and a toString override method.
CrmController.java class defines all the logic and rules to control the CRUD operations on Customer Relationship Management database.
list-crm.jsp file and Crm-form.jsp file implements the front end development of the web applications. These files are used to the format of the application different screens or pages which can be seen by the users.
