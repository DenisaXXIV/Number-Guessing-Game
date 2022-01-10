import javax.swing.*;
import java.awt.*;

public class Notice {
    void setNotice(int cases) {
        switch (cases) {
            case 1:
                JFrame corect = new JFrame("You won!");

                //setez icon-ul ferestrei
                Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
                corect.setIconImage(icon);

                //centreaza fereastra
                corect.setLocation(-10, 0);

                //Text
                Text win = new Text(corect, 10, 20, "You're right! You have to be a clairvoyant! You Win the Game!", 1700, 50);

                //setez dimensiunea ferestrei
                corect.setUndecorated(true);
                corect.setSize(500, 300);
                corect.setLayout(null);
                corect.setLocation(720, 375);
                corect.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                //fac fereastra vizibila
                corect.setVisible(true);

                Fundal funal1 = new Fundal(corect);

                break;
            case 2:
                JFrame small = new JFrame("Oh, no!");

                //setez icon-ul ferestrei
                Image icon2 = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
                small.setIconImage(icon2);

                //centreaza fereastra
                small.setLocation(-10, 0);

                //Text
                Text smaller = new Text(small, 10, 20, "Your Guess Number is Smaller.", 1700, 50);

                //setez dimensiunea ferestrei
                small.setUndecorated(true);
                small.setSize(500, 300);
                small.setLayout(null);
                small.setLocation(720, 375);
                small.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                //fac fereastra vizibila
                small.setVisible(true);

                Fundal funal2 = new Fundal(small);
                break;
            case 3:
                JFrame great = new JFrame("Oh, on!");

                //setez icon-ul ferestrei
                Image icon3 = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
                great.setIconImage(icon3);

                //centreaza fereastra
                great.setLocation(-10, 0);

                //Text
                Text greater = new Text(great, 10, 20, "Your Guess Number is Greater.", 1700, 50);

                //setez dimensiunea ferestrei
                great.setUndecorated(true);
                great.setSize(500, 300);
                great.setLayout(null);
                great.setLocation(720, 375);
                great.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                //fac fereastra vizibila
                great.setVisible(true);

                Fundal funal3 = new Fundal(great);
                break;

            case 4:
                JFrame maximum = new JFrame("You lost!");

                //setez icon-ul ferestrei
                Image icon4 = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
                maximum.setIconImage(icon4);

                //centreaza fereastra
                maximum.setLocation(-10, 0);

                //Text
                Text lost = new Text(maximum, 10, 20, "You have exceeded the maximum attempt. Try Again", 1700, 50);

                //setez dimensiunea ferestrei
                maximum.setUndecorated(true);
                maximum.setSize(500, 300);
                maximum.setLayout(null);
                maximum.setLocation(720, 375);
                maximum.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                //fac fereastra vizibila
                maximum.setVisible(true);

                Fundal funal4 = new Fundal(maximum);

                break;
        }
    }
}
