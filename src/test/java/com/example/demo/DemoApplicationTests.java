package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootTest
@org.springframework.test.context.ActiveProfiles("test")
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration.class
})
@SuppressWarnings("removal")
class DemoApplicationTests {

	@MockBean
	private KafkaTemplate<String, String> kafkaTemplate;

	@Test
	void contextLoads() {
	}

}
