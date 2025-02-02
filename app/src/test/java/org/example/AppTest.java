package org.example;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    @Test
    public void greetingIsCorrect() {
        GreetingGenerator generator = new GreetingGenerator();
        assertEquals("Hello, World!", generator.getGreeting());
    }
}