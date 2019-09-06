package com.hao.learn.reactiveemployeeservice;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {

}
