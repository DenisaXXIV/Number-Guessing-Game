import javax.swing.*;
import java.awt.*;

public class Fundal {
    Fundal(JFrame frame){
        ImageIcon fundalIcon = new ImageIcon("src/main/resources/fundal.png");
        Image fundal = fundalIcon.getImage();
        Image newfundal = fundal.getScaledInstance(1940, 1080, java.awt.Image.SCALE_SMOOTH);
        fundalIcon = new ImageIcon(newfundal);
        JLabel fundalLabel;
        fundalLabel = new JLabel(fundalIcon);
        fundalLabel.setBounds(0, 0, 1940, 1080);
        frame.add(fundalLabel);
    }
}
