/** This class is expected to be immutable. Please make necessary changes. */
package com.apptware.interview.immutability;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public final class Student {
  private final String name;
  private final Date dateOfBirth;
  private final List<String> courses;


  // Creating Constructor which initializes mutable values`
  public Student(String name, Date dateOfBirth, List<String> courses) {
    this.name = name;
    // creating mutable date
    this.dateOfBirth = new Date(dateOfBirth.getTime());
    // creating mutable list
    this.courses = Collections.unmodifiableList(courses);
  }

}
