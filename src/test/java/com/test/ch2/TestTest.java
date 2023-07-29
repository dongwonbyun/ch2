package com.test.ch2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void main() {

       System.out.println("test1");
       System.out.println("test2");
       System.out.println("test3");
    }
}