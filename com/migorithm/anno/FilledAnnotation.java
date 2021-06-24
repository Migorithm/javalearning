package com.migorithm.anno;

public @interface FilledAnnotation {
    String name() default "Bob"; //java automatically defines source code for this method whenever you compile the program.

    int value() default 0;
}
