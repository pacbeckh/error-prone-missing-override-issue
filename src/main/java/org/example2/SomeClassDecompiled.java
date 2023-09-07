//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example2;

import lombok.Generated;

@SuppressWarnings("MissingOverride") // let's focus on the issue here
public final class SomeClassDecompiled {
  private final String someDefaultString;

  @Generated
  private static String $default$someDefaultString() {
    return "default";
  }

  @Generated
  protected SomeClassDecompiled(SomeClassDecompiledBuilder<?, ?> b) {
    if (b.someDefaultString$set) {
      this.someDefaultString = b.someDefaultString$value;
    } else {
      this.someDefaultString = $default$someDefaultString();
    }

  }

  @Generated
  public static SomeClassDecompiledBuilder<?, ?> builder() {
    return new SomeClassDecompiledBuilderImpl();
  }

  @Generated
  public String getSomeDefaultString() {
    return this.someDefaultString;
  }

  @Generated
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    } else if (!(o instanceof SomeClassDecompiled)) {
      return false;
    } else {
      SomeClassDecompiled other = (SomeClassDecompiled) o;
      Object this$someDefaultString = this.getSomeDefaultString();
      Object other$someDefaultString = other.getSomeDefaultString();
      if (this$someDefaultString == null) {
        if (other$someDefaultString != null) {
          return false;
        }
      } else if (!this$someDefaultString.equals(other$someDefaultString)) {
        return false;
      }

      return true;
    }
  }

  @Generated
  public int hashCode() {
    int result = 1;
    Object $someDefaultString = this.getSomeDefaultString();
    result = result * 59 + ($someDefaultString == null ? 43 : $someDefaultString.hashCode());
    return result;
  }

  @Generated
  public String toString() {
    return "SomeClassDecompiled(someDefaultString=" + this.getSomeDefaultString() + ")";
  }

  @Generated
  public abstract static class SomeClassDecompiledBuilder<C extends SomeClassDecompiled,
    B extends SomeClassDecompiledBuilder<C, B>> {
    @Generated
    private boolean someDefaultString$set;
    @Generated
    private String someDefaultString$value;

    public SomeClassDecompiledBuilder() {
    }

    @Generated
    public B someDefaultString(String someDefaultString) {
      this.someDefaultString$value = someDefaultString;
      this.someDefaultString$set = true;
      return this.self();
    }

    @Generated
    protected abstract B self();

    @Generated
    public abstract C build();

    @Generated
    public String toString() {
      return "SomeClassDecompiled.SomeClassDecompiledBuilder(someDefaultString$value="
             + this.someDefaultString$value + ")";
    }
  }

  @Generated
  private static final class SomeClassDecompiledBuilderImpl
    extends SomeClassDecompiledBuilder<SomeClassDecompiled,
    SomeClassDecompiledBuilderImpl> {
    @Generated
    private SomeClassDecompiledBuilderImpl() {
    }

    @Generated
    protected SomeClassDecompiledBuilderImpl self() {
      return this;
    }

    @Generated
    public SomeClassDecompiled build() {
      return new SomeClassDecompiled(this);
    }
  }
}
