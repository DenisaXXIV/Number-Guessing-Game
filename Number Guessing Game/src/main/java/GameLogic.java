import javax.swing.*;
import java.util.Scanner;

public class GameLogic {
    boolean StartGame(JSpinner userInput,int number) {
        int userGuessNumber = userInput.getValue().hashCode();
        Notice notice = new Notice();

        if (userGuessNumber == number) {
            notice.SetNotice(1);
            return true;
        }

        else if (userGuessNumber < number) {
            notice.SetNotice(2);
            return false;

        } else if (userGuessNumber > number) {
            notice.SetNotice(3);
            return false;
        }
        return false;

    }

}
