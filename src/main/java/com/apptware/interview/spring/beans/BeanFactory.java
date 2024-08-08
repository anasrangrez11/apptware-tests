package com.apptware.interview.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BeanFactory {

  @Autowired private ApplicationContext context;

  // Creating the bean objects manually and giving the specific string value,
  // so the Spring doesn't get confused on how to create them.
  public OnDemand getOnDemandBean(SomeEnum someEnum, String someString) {
    if(someEnum == SomeEnum.SOME_ENUM_A){
      return new OnDemandA(someString);
    } else if (someEnum == SomeEnum.SOME_ENUM_B){
      return new OnDemandB(someString);
    } else {
      throw new IllegalArgumentException("Unknown enum value: " + someEnum);
    }
//    return context.getBean(BaseOnDemand.class, someString);
  }
}
