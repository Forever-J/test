package javaw;  
  
import javax.swing.*;  
  
public class HelloWorldSwing {  
    private static void createAndShowGUI() {  
        JFrame jFrame = new JFrame("HelloWorld Swing");  
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        JLabel helloLabel = new JLabel("Hello World!");  
        jFrame.getContentPane().add(helloLabel);  
        jFrame.pack();  
        jFrame.setVisible(true);  
    }  
   
    public static void main(String[] args) {  
        javax.swing.SwingUtilities.invokeLater(new Runnable() {  
            public void run() {  
                createAndShowGUI();  
            }  
        });  
    }  
}  
