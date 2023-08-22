package com.openclassroom.hellowords;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.openclassroom.hellowords.service.BusinessService;

@SpringBootTest
class HellowordsApplicationTests {

	@Autowired
    private BusinessService bs;

	@Test
	void contextLoads() {
	}

	   @Test
    public void testGetHelloWorld() {

        String expected = "Hello World!";

        String result = bs.getHelloworld().getValue();

        assertEquals(expected, result);
    }

}
