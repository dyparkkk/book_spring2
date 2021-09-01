package com.dypark.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)      // 파라메터에만 쓸 수 있음 
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser { // LoginUser 로 사용
}
