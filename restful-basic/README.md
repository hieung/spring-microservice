### Basic Springboot RESTful Webservice
This is a basic demo Restful API using spring boot. It could be used in local machine, aws and cloud environment.

It is basic understanding about restful webservice before building **micro services** with restful api

Technology
* Spring boot (version 2.0.1)
* Spring data rest (using CRUDRepository , PagingAndSortingRepository)
* Database H2

#### How to run
Setup environment
* Java 8
* Maven

Clone repository
> git clone <..this repository..>

Build project by command line
> mvn clean install

Run on command line on folder ../target
>java -jar customer-0.0.1-SNAPSHOT.jar

#### Check Database H2
	Open URL on browser
		http//:localhost:8080/h2

	Login with credential
		jdbc url: jdbc:h2:~/test
		username: sa
		password: 

	Table Customer
		 -------------------------------
		| ID | NAME | JOB | CREATE_DATE |
		|----|------|-----|-------------|
		|  1 | ABC  | XYZ |  1521687670 |
		|  2 |      |     |             |
		|____|______|_____|_____________|

#### Check Restful API
* End point

	Simulate 100 records customer
		POST http://localhost:8080/api/v1/simulateData

	Find all records customer
		GET http://localhost:8080/api/v1/getAll

* End point by HATOES

Get data in table customer
> GET http://localhost:8080/customers

Create a customer
> POST http://localhost:8080/customers 
	Example body:
	{
		"name": "Liam Nguyen",
		"job": "Technical Architect",
		"createDate" : 1521687670
	}

Update a customer
> PUT http://localhost:8080/customers/{id}

Delete a customer
> DELETE http://localhost:8080/customers/{id}

	... (some api follow spring hatoes)

* HAL Browser URL

> http://localhost:8080/browser/index.html#/


