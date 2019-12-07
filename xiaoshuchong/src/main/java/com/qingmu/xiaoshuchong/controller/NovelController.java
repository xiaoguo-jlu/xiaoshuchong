package com.qingmu.xiaoshuchong.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@ResponseBody("text/json")
public class NovelController {
	@RequestMapping("/novel/home")
	public Map<Integer, String> home() {
		Map<Integer, String> result = new HashMap<Integer, String>();
		result.put(1, "10");
		result.put(2, "20");
		return result;
	}

}
