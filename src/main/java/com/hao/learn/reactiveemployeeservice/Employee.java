package com.hao.learn.reactiveemployeeservice;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  @Id
  private int emp_no;
  @Column("birth_date")
  private LocalDate birthDate;
  @Column("first_name")
  private String firstName;
  @Column("last_name")
  private String lastName;
  private Gender gender;
  @Column("hire_date")
  private LocalDate hireDate;

  enum Gender {
    M, F;
  }
}
