Design Structure:

No Front End

Spring Reactive (WebFlux)  + Reactive Redis as Cache + Reactive mysql Database: mysql

Sample data: Employee Data https://github.com/datacharmer/test_dbPOJO
- Use Gson to create mojos 
- Mybatis Generator to generate the POJO (Not this time)

Steps:
```bash
docker-compose -f docker/docker-compose.yml up -d
```
- Run docker redis
- Run docker mysql 

- load data into it. 

Requirements:
- Get TOP 10 Employee with highest salaries