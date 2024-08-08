package com.apptware.interview.jpa.employee;

import jakarta.persistence.Entity;
import java.util.UUID;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
class Employee {

  // If we want to use JPA, there must be a primary assigned to the entity
  // because it will update db based on that primary key
  @Id
  private UUID id;
  private String name;
}
