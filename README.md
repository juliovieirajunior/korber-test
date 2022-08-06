
# Korber Test

An Spring Boot API that provides information about taxi Trips


## Resume

Could not finish the solution in 4h. So this project it's what i achieved on that time.

- **Automating the data load** (NOT COMPLETED) 
```
  Had two ideas for this requirement:
  
  First one: upload the data at server start up 
  but it's a bad idea because it would require 
  a pod restart every time we want o upload a file

  Second one: an endpoint that would receive the .csv files
  as application/octet-stream and then process @Async the file and store the information
  on database.
  To this implementation i don't have the required knowledge and it would require more
  than 4 hours to implement.

  Database: 
  - Created necessary tables and relations between them.
  - Scripts on resources/sql folder
```

- Building the backend
```
Created an API with Spring Boot with Swagger 2
Connection with database ok.
Repository created.
Services created.

Endpoints: 
- POST /top-zones (NOT COMPLETED)
    - Endpoint created but not working as required

- POST /zone-trips (NOT COMPLETED)
    - Endpoint created but not working as required

- POST /list-yellow (NOT COMPLETED)
    - Returns data but isn't pagination or filtering

    curl --request POST 'localhost:8080/list-yellow'
```

- Concerns/Problems
```
The .csv data from green taxi and yellow taxi were not clear.
After reading the dictionary from both taxis, the order doesn't seems right.
Lost a lot of time figuring out which field represents what
since those .csv didn't have headers

Ended using only the 5-6 fields from .csv that were needed to implement the endpoint.

```

## Tech Stack

**Framework:** Spring Boot

**Java:** 17

**Database:** PostegreSQL


## Feedback

Even thought the project is far from completed, i would like to know
the solution for this challenge.

If you don't mind you can share with me by email juliovieira@outlook.pt


## Authors

- [Julio Vieira Junior](https://github.com/juliovieirajunior)

