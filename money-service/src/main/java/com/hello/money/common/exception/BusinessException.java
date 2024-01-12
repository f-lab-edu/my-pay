package com.hello.money.common.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

  private final ErrorCode errorCode;

  public BusinessException(final String message, final ErrorCode errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

  public BusinessException(final ErrorCode errorCode) {
    this.errorCode = errorCode;
  }
}
