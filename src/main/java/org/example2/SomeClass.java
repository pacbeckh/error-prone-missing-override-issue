package org.example2;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
public class SomeClass {

  @Builder.Default
  String someDefaultString = "default";
}