package com.client;

import com.client.service.TestComsumerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=EurekaClientComsumerApplication.class)
public class EurekaClientComsumerApplicationTests {

	@Resource
	private TestComsumerService testComsumerService;

	@Test
	public void contextLoads() {
		System.out.println(testComsumerService.get("0000==============0000"));
	}


}
