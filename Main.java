// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome! May i have the Password sir?");
        Scanner scanner = new Scanner(System.in);

        String passcode = "chris";

      int Tries = 0;
        do {
            String Mycard = scanner.nextLine();
            if (Mycard.equals(passcode)) {
                Tries = 3;
                System.out.println("Aha! thats right my boi now lets get you inside!");
            } else {
                Tries++;
                System.out.println("not quite kid try again");
            }
        }
        while (Tries != 3);{

        }

    }
}