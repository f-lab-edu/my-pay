package com.hello.money.config.redis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DistributedMultiLock {

  String[] keys();

  long waitTime() default 40L;

  long leaseTime() default 2L;

  TimeUnit timeUnit() default TimeUnit.SECONDS;
}
