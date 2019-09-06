package com.hao.learn.reactiveemployeeservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  public Mono<Employee> find_employee_by_id(int id) {
    return employeeRepository.findById(id);
  }
}