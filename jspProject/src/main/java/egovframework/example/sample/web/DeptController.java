package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 부서

// @: 어노테이션 / 주석

// @Controller :서버가 인식할 수 있게해주는 주석
@Controller
public class DeptController {
	
	@RequestMapping(value="/deptWrite.do")
	public String deptWrite() {
	
		return "dept/deptWrite";
	}

}
