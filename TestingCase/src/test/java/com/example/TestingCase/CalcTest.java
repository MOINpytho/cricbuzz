package com.example.TestingCase;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalcTest {
    Calc c = new Calc();

    @BeforeAll
    public static void testAllPrint(){
        System.out.println("it will print before all test cases");
    }

    @BeforeEach
    public void testPrint(){
        System.out.println("it will print before each test case");
    }

    @Test
    public void testAdd(){
        int a = 3;
        int b = 5;
        int expectedOut = 8;
        int actualOut = c.add(a,b);
        Assertions.assertEquals(expectedOut,actualOut);
        System.out.println("Test 1");
    }
    @Test
     public void  testTrue(){
        boolean actual = true;
        Assertions.assertTrue(actual);
        System.out.println("Test 2");
    }
    @Test
    public void testEven(){
        int a = 6;
        boolean actual = c.isEven(a);
        Assertions.assertTrue(actual);
        System.out.println("Test 3");
    }
}
