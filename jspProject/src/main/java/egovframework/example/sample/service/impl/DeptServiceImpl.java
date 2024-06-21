package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

//implements 
// 서비스와 연결이되는  = 서비스 상위 인터페이스의 것을 상속받아서 추상클래스에서 구현한다.


// 서비스와 연결하는 어노테이션
@Service("deptService")
public class DeptServiceImpl  extends EgovAbstractServiceImpl implements DeptService{
	
	@Resource(name="deptDAO")
	private DeptDAO deptDAO;
	
	@Override
	public String InsertDept(DeptVO vo) throws Exception {
		// TODO Auto-generated method stub
		return deptDAO.InsertDept(vo);
	}
	
	
}
