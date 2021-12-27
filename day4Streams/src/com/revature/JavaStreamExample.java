package com.revature;

import java.util.stream.Stream;

public class JavaStreamExample {  
    public static void main(String[] args){  
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(6)  
        .forEach(System.out::println);  
    }  
}  