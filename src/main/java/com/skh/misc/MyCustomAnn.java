package com.skh.misc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // where we need to apply the custome annotation
@Retention(RetentionPolicy.RUNTIME) // it talks about scope of annotation
public @interface MyCustomAnn {
    int id() default 0; // it is kind of abstract methods.
    String name() default "";
}
