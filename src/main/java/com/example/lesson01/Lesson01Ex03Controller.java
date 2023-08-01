package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		// jsp로 뿌릴 때는 무조건 @Controller
@RequestMapping("/lesson01")
public class Lesson01Ex03Controller {

	@RequestMapping("/ex03")
	public String ex03() {
		// @ResponseBody 없이 단독 @Controller만 사용되는 경우
		// return String(뷰 경로)   viewResolver에 의해 jsp 경로를 찾는다.
		
		return "lesson01/ex03";  //jsp view 경로
	}
}
