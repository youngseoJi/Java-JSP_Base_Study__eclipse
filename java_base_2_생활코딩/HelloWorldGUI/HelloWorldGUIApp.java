import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;

// 데스크톱 애플리케이션 만들어보기
// 느껴만 보기@
public class HelloWorldGUIApp{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // 화면 사이즈 설정
                frame.setPreferredSize(new Dimension(1000, 300)); 
                
                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);
                // 코드의 위치 절하기 CENTER/RIGTH 등 
                frame.getContentPane().add(label);
                
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                // 
                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);

                frame.pack();
                frame.setVisible(true);
                System.out.println();
                // ctrl + space 자동완성
            }
        });
    }
}