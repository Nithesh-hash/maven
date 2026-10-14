package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public class PrimeCheckerTest {
        void test() {
            PrimeChecker p = new PrimeChecker();
            assertTrue(p.isPrime(7));
            assertFalse(p.isPrime(4));            
        }
    }
}
