package com.example.restapi;

import com.example.restapi.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new UserRequest();
		user.setName("홍길동");
		user.setTel("010-1234-5677");
		user.setEmail("hong@mail.com");
		user.setIsKorean(true);

		var json = objectMapper.writeValueAsString(user);
		System.out.println(json);

		 var dto = objectMapper.readValue(json, UserRequest.class);
		System.out.println(dto);
	}

}
