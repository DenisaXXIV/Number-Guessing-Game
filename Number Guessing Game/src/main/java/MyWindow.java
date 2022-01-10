import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void initUI() {
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = environment.getDefaultScreenDevice();

        JFrame frame1 = new JFrame("Number Guessing Game");

        //setez icon-ul ferestrei
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon.png");
        frame1.setIconImage(icon);

        //adaugare background
        ImageIcon fundalIcon = new ImageIcon("src/main/resources/fundal.png");
        Image fundal = fundalIcon.getImage();
        Image newfundal = fundal.getScaledInstance(1940, 1080, java.awt.Image.SCALE_SMOOTH);
        fundalIcon = new ImageIcon(newfundal);
        JLabel fundalLabel;
        fundalLabel = new JLabel(fundalIcon);
        fundalLabel.setBounds(0, 0, 1940, 1080);

        //centreaza fereastra
        frame1.setLocation(-10, 0);

        //Button
        Button buton = new Button(" Submit ");
        buton.setBounds(665, 550, 120, 35);
        buton.setFont(new Font("Serif", Font.PLAIN, 30));
        buton.setBackground(Color.WHITE);
        frame1.add(buton);

        //sa se inchida aplicatia atunci cand inchid fereastra
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //adaugare imagine
        ImageIcon imageIcon = new ImageIcon("src/main/resources/logo.png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(1450, 200, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        JLabel logoIcon;
        logoIcon = new JLabel(imageIcon);
        logoIcon.setBounds(50, 20, 1450, 200);
        frame1.add(logoIcon);

        //Text
        Text welcome = new Text(frame1, 500, 250, "Welcome to Number Guessing Game!", 1700, 50);
        Text task = new Text(frame1, 25, 300, "We have selected a random number between 1 and 100. See if you" +
                "can guess it in 10 turns or fewer. We'll tell you if your", 1700, 50);
        Text task2 = new Text(frame1, 25, 340, "guess was too high or too low. You have Maximum 5 Attemp Limit. Succes!", 1700, 50);

        //Spinner
        SpinnerModel value = new SpinnerNumberModel(50, 1, 100, 1);
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(650, 500, 150, 30);
        spinner.setFont(new Font("Serif", Font.PLAIN, 20));
        frame1.add(spinner);

        frame1.add(buton);

        //setez dimensiunea ferestrei
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setUndecorated(true);
        frame1.setLayout(null);

        //fac fereastra vizibila
        frame1.setVisible(true);

        frame1.add(fundalLabel);

        int number = (int) (Math.random() * 99 + 1);
        Attempt attempt = new Attempt();
        attempt.SetAttempt(0);

        buton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                boolean stillContinue = true;
                System.out.println(attempt.GetAttempt());

                if (attempt.GetAttempt() == 4) {
                    Notice notice = new Notice();
                    notice.SetLost(number);
                    stillContinue = false;
                }
                if (stillContinue == true) {
                    GameLogic game = new GameLogic();
                    if (game.StartGame(spinner, number) == false) {
                        attempt.Increase();
                    }
                }
            }
        });

    }
}