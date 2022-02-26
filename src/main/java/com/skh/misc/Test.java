package com.skh.misc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        Class cls = Emp.class;
        Annotation[] anns =  cls.getAnnotations();
        for (Annotation ann : anns) {
            System.out.println(ann);
        }




    }
}
