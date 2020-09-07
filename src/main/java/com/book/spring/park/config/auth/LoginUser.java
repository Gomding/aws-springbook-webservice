package com.book.spring.park.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) // 어노테이션이 생성될 수 있는 위치를 지정
@Retention(RetentionPolicy.RUNTIME) // 어느 시점까지 어노테이션이 영향을 미칠지 결정함
public @interface LoginUser {
}
