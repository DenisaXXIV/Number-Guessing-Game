import javax.swing.*;
import java.util.Scanner;

public class GameLogic {
    GameLogic(JSpinner userInput){
        int attempt = 1;
        int userGuessNumber=0;
        int number = (int) (Math.random() * 99 + 1);
        boolean guess=false;
        Notice notice=new Notice();

        do {
            if (guess == false) {
                userGuessNumber =(int) userInput.getNextValue();

                if (userGuessNumber == number)
                    notice.setNotice(1);
                else if (userGuessNumber < number)
                notice.setNotice(2);
                else if (userGuessNumber > number)
                notice.setNotice(3);


                if (attempt == 5) {
                    notice.setNotice(4);
                    break;
                }
                attempt++;
            }
        } while (userGuessNumber != number);
    }
}
