package com.example.springboothelloworld.myfunction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyfunctionTest {
    @Autowired
    private Myfunction myfunctionTest;
    @Test
    public void test_add(){
        Assertions.assertEquals(2, myfunctionTest.add(1,1));
    }
}
