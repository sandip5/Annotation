package com.bridgelabz.annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Sandip";
    String date();
    int revision() default 1;
    String comments();
}
