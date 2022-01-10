import javax.swing.*;
import java.awt.*;

public class Notice {
    boolean guess = false;

    void SetNotice(int cases) {
        switch (cases) {
            case 1:
                JFrame corect = new JFrame("You won!");

                //setez icon-ul ferestrei
                Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
                corect.setIconImage(icon);

                //centreaza fereastra
                corect.setLocation(-10, 0);

                //Text
                Text win = new Text(corect, 10, 20, "You're right! You have to be a", 1700, 50);
                Text win2 = new Text(corect, 10, 60, "clairvoyant! You Win the Game!", 1700, 50);

                //setez dimensiunea ferestrei
                corect.setSize(500, 300);
                corect.setLayout(null);
                corect.setLocation(550, 375);
                corect.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                //fac fereastra vizibila
                corect.setVisible(true);

                corect.setBackground(Color.WHITE);

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
                small.setSize(500, 300);
                small.setLayout(null);
                small.setLocation(550, 375);
                small.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                //fac fereastra vizibila
                small.setVisible(true);

                small.setBackground(Color.WHITE);

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
                great.setSize(500, 300);
                great.setLayout(null);
                great.setLocation(550, 375);
                great.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                //fac fereastra vizibila
                great.setVisible(true);

                great.setBackground(Color.WHITE);

                break;
        }
    }

    void SetLost(int number) {
        JFrame maximum = new JFrame("You lost!");

        //setez icon-ul ferestrei
        Image icon4 = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
        maximum.setIconImage(icon4);

        //centreaza fereastra
        maximum.setLocation(-10, 0);

        //Text
        Text lost = new Text(maximum, 10, 20, "You have exceeded the maximum", 1700, 50);
        Text lost2 = new Text(maximum, 10, 60, "attempt.The number was " + number + ".", 1700, 50);
        Text lost3 = new Text(maximum, 10, 100, "Try Again", 1700, 50);

        //setez dimensiunea ferestrei
        maximum.setSize(500, 300);
        maximum.setLayout(null);
        maximum.setLocation(550, 375);
        maximum.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //fac fereastra vizibila
        maximum.setVisible(true);

        maximum.setBackground(Color.WHITE);
    }
}
