package com.acc.lkm.test;
import org.junit.jupiter.api.*;
 
@DisplayName("JUnit 5 Nested Testing Example")
class NestedTest {
 
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all my test methods");
    }
 
    @BeforeEach
    void beforeEach() {
        System.out.println("Before my each test method");
    }
 
    @AfterEach
    void afterEach() {
        System.out.println("After my each test method");
    }
 
    @AfterAll
    static void afterAll() {
        System.out.println("After all my test methods");
    }
 
    @Nested
    @DisplayName("Tests for the nested calss method A")
    class A {
 
        @BeforeEach
        void beforeEach() {
            System.out.println("Before each my test method of the A class");
        }
 
        @AfterEach
        void afterEach() {
            System.out.println("After each my test method of the A class");
        }
 
        @Test
        @DisplayName("Test for method A")
        void sampleTestForMethodA() {
            System.out.println("Test for method A");
        }
    }
}