package interfaceex;

// 스케쥴 인터페이스 : 어떠한 기능인지 
public interface Scheduler {
  void getNextCall(); // 상담전화 고객 우선 연결방식
  void sendCallToAgent(); // 상담원 상담전화 우선 배분방식 
}
