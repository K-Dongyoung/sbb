package com.mysite.sbb.answer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionService;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;

@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {
	
	private final QuestionService questionService;
	
	@PostMapping("/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, 
			@RequestParam(value = "content") String content) {
		
		Question question = this.questionService.getQuestion(id);
		
		return String.format("redirect:/question/detail/%s", id);
	}
}
