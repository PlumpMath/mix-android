package com.davidykay.mix.exception;

public class InvalidAddressException extends IllegalArgumentException {

  /**
   * 
   */
  private static final long serialVersionUID = -2300399739417865851L;

  public InvalidAddressException(String string) {
    super(string);
  }

}