package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

// 부서

// @: 어노테이션 / 시스템 주석

// @Controller :서버가 인식할 수 있게해주는 주석
@Controller
public class DeptController {

	@Resource(name="/deptService")
	private DeptService deptService;
	
	// 데이터입력
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {

//		return "deptWrite";  
		return "dept/deptWrite";
	}

	// 데이터 저장 
	// 데이터 입력/전송 -> /deptWriteSave.do -> 메소드에 데이터 전달 -> vo에 데이터 저장 -> vo메소드 이용하여 데이터 다루기 
	@RequestMapping(value = "/deptWriteSave.do") 
	public String deptWriteSave(DeptVO vo) 
			throws Exception
	{
		// vo의 데이터에 접근 하는 방법 vo에 셋팅한 메소드이용		
		System.out.println("부서번호 : " + vo.getDeptno());
		System.out.println("부서명 : " + vo.getDname());
		System.out.println("부서위치 : " + vo.getLoc());
		
		String result = deptService.InsertDept(vo);
//		
//		// null을 받아오면 저장된 것
		if(result == null) {
			System.out.println("저장완");
		}
		else{
			System.out.println("저장실패");
		}
//		
		return "";
	}

}
