package egovframework.example.sample.service.impl;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;

//sql 가기전의중간다리
// DB연결담당 -> sql로 연결된다.

@Repository("deptDAO")
public class DeptDAO  extends EgovAbstractDAO {

	public String InsertDept(DeptVO vo) {
		// TODO Auto-generated method stub
		return (String) insert("deptDAO.insertDept", vo);
	}

}
