/** This class is expected to be a singleton. Please make necessary changes. */
package com.apptware.interview.singleton;

public class Singleton {
  private static Singleton single_instance = null;

  public String s;

  private Singleton() {
    s = "Hello I am a string part of Singleton class";

    // If instance is not null, means instance is already created
    // Throwing an exception when instance is created, or when someone tries reflection
    // Reflection can be caused to destroy singleton property of the singleton class.
    if (single_instance != null) {
      throw new IllegalStateException("Cannot create another instance of Singleton");
    }
  }

  public static synchronized Singleton getInstance() {
    if (single_instance == null) single_instance = new Singleton();

    return single_instance;
  }
}