package com.hao.learn.reactiveemployeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveEmployeeServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactiveEmployeeServiceApplication.class, args);
  }

  @Autowired
  private EmployeeService employeeService;

  @Bean
  public CommandLineRunner runner() {
    return args ->
        employeeService
            .find_employee_by_id(10001)
            .subscribe(System.out::println);
  }
}
