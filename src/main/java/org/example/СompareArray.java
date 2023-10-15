package org.example;

import java.util.Arrays;

public class СompareArray {

    public static <T,U> boolean  compareArrays(T[] a,   U[] b ){
        return Arrays.equals(a,b);
    }
}
