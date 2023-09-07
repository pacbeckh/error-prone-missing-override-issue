package org.example;

import lombok.Generated;

// Adding @Generated annotation on class level will fix the check, but Lombok only adds these to
// the method.
// Possibly because not the entire class is generated, but just parts of it.
public class AnyClassDeLombok implements AnyInterface {
  private String anything;

  @Generated
  public String getAnything() {
    return this.anything;
  }

}