import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Splash s = new Splash();
        s.setVisible(true);
        Thread t = Thread.currentThread();
        try {
            t.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.dispose();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //opening the main application
                new Splash().setVisible(true);
            }
        });

        SwingUtilities.invokeLater(new Runnable() //new Thread()
        {
            public void run() {
                MyWindow window = new MyWindow();
                window.initUI();
            }
        });


    }
}
