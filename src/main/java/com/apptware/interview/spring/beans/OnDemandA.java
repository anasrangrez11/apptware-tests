package com.apptware.interview.spring.beans;

import org.springframework.stereotype.Component;

//Removed the @Component annotation so spring won't need to create these beans automatically.
class OnDemandA extends BaseOnDemand {

  OnDemandA(String someString) {
    super(someString);
  }

  @Override
  public SomeEnum getSomeEnum() {
    return SomeEnum.SOME_ENUM_A;
  }
}
