package egovframework.example.sample.service;

public class DeptVO {
	
	// 객체지향 : 캡슐화(접근지정자 세팅) private 사용
	
	private String deptno;
	private String dname;
	private String loc;
	
	// 데이터를 사용하기 위한
	// 같은 프로젝트 내에서 접근 할 수 있도록하는 메소드생성 
	
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
	