package com.dio.springboottest.springboottestapplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dio.springboottest.springboottestapplication.controller.TestController;

import org.junit.jupiter.api.Test;

public class TestUnitController {

    @Test
    public void testUnit(){
        TestController controller = new TestController();
        String resultado = controller.saudacao("DIO");
        assertEquals("Bem-vindo, DIO", resultado);
    }
    
}
