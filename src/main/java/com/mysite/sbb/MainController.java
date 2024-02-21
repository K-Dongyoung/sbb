package com.mysite.sbb;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbb.question.Question;

@Controller
public class MainController {
	
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 sbb에 오신 것을 환영합니다.";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
