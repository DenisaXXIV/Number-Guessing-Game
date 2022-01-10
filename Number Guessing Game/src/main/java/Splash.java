import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash extends JFrame {
    private JLabel imglabel;
    private ImageIcon img;
    private static JProgressBar pbar;
    Thread t = null;

    public Splash() {
        super("Splash");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);

        ImageIcon fundalIcon = new ImageIcon("src/main/resources/fundalLoad.png");
        Image fundalImage = fundalIcon.getImage();
        Image newFundal = fundalImage.getScaledInstance(700, 400,  java.awt.Image.SCALE_SMOOTH);
        fundalIcon = new ImageIcon(newFundal);
        JLabel fundalLabel;
        fundalLabel = new JLabel(fundalIcon);
        fundalLabel.setBounds(0, 0, 700, 400);

        setLayout(null);
        pbar = new JProgressBar();
        pbar.setMinimum(0);
        pbar.setMaximum(100);
        pbar.setStringPainted(true);
        pbar.setForeground(Color.pink);
        add(fundalLabel);
        add(pbar);
        pbar.setPreferredSize(new Dimension(310, 30));
        pbar.setBounds(175, 200, 350, 20);

        Thread t = new Thread() {

            public void run() {
                int i = 0;
                while (i <= 100) {
                    pbar.setValue(i);
                    try {
                        sleep(90);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                }
            }
        };
        t.start();
    }
}
