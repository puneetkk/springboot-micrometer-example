package com.springbytes.sb.micrometer;

import com.springbytes.sb.micrometer.config.ApiConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@SpringBootTest
@AutoConfigureMockMvc
class SpringbootMicrometerExampleApplicationTests {

	@Test
	void contextLoads() {
	}
}
