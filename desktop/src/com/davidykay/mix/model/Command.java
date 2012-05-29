package com.davidykay.mix.model;

import com.google.inject.Inject;

public class Command {

  public Address address;
  public Field field;
  public Byte index;
  public Opcode opcode;
  
  @Inject
  public Command (
      Opcode opcode,
      Address address,
      Byte index,
      Field field
                  ) {
      this.opcode  = opcode ;
      this.address = address;
      this.index   = index  ;
      this.field   = field  ;
  }

  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Command)) {
      return false;
    }
    Command other = (Command) o;
    if (!other.address.equals(this.address)) {
      return false;
    }
    if (!other.field.equals(this.field)) {
      return false;
    }
    if (!other.index.equals(this.index)) {
      return false;
    }
    if (!other.opcode.equals(this.opcode)) {
      return false;
    }
    return true;
  }
  
  public String toString() {
    return String.format("%s %s,%s(%s)",
                  opcode.toString(),
                  address.toString(),
                  index.toString(),
                  field.toString()
                  );
  }

}