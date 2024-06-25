package examjdbc01connection;

public class ExamDriverLoad {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("클래스 로딩 성공!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
