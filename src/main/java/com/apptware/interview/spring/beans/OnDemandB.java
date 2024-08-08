package com.apptware.interview.spring.beans;

import org.springframework.stereotype.Component;

//Removed the @Component annotation so spring won't need to create these beans automatically.
class OnDemandB extends BaseOnDemand {

  OnDemandB(String someString) {
    super(someString);
  }

  @Override
  public SomeEnum getSomeEnum() {
    return SomeEnum.SOME_ENUM_B;
  }
}
