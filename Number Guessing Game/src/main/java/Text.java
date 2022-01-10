import javax.swing.*;
import java.awt.*;

public class Text extends JLabel {
    JLabel txt;

    public Text() {

    }

    public Text(String name, JFrame frame, int y) {
        txt = new JLabel("Include " + name + " Characters:");
        txt.setBounds(30, y, 800, 50);
        txt.setForeground(Color.black);
        txt.setFont(new Font("Serif", Font.PLAIN, 30));
        frame.add(txt);
    }

    public Text(JFrame frame, int y, String text) {
        txt = new JLabel(text);
        txt.setBounds(30, y, 800, 50);
        txt.setForeground(Color.black);
        txt.setFont(new Font("Serif", Font.PLAIN, 30));
        frame.add(txt);
    }

    public Text(JFrame frame, int x, int y, String text, int width, int height) {
        txt = new JLabel(text);
        txt.setBounds(x, y, width, height);
        txt.setForeground(Color.black);
        txt.setFont(new Font("Serif", Font.PLAIN, 30));
        frame.add(txt);
    }
}
