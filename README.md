Design Structure:

No Front End

Spring Reactive (WebFlux)  + Reactive Redis as Cache + Reactive mysql Database: mysql

Sample data: Employee Data https://github.com/datacharmer/test_db
- Use Gson to create mojos 
- Mybatis Generator to generate the POJO (Not this time)

Steps:
- Spawn environment
  ```bash
  docker-compose -f docker/docker-compose.yml up -d
  ```
  - Run docker redis
  - Run docker postgresql
- Load sample data
  ```bash
  docker exec -it docker_db_1 bash
  # apt update && apt install git -y
  # git clone https://github.com/vrajmohan/pgsql-sample-data/tree/master/employee
  # cd test_db
  # mysql -uroot -ppassword < employees.sql
  ```
- Login via adminer 
  ```yaml
  server: db
  username: postgres
  password: password
  ```
- Replace `Gender` user type by `character` in `employee.employees` table because
user type is not supported by `r2dbc-postgresq` at this moment.

Requirements:
- Get TOP 10 Employee with highest salaries
- Use webflux to display results via websocket