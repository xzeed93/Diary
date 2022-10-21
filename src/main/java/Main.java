import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Input.getEntriesFromJson();

        Scanner usersMenuChoice = new Scanner(System.in);

        while (true) {

            Display.displayMainMenu();

            int menuChoice = usersMenuChoice.nextInt();

            switch (menuChoice) {

                case 1 -> Display.displayAllEntriesFromArrayList();

                case 2 -> Input.userCreatesANewEntry();

                case 3 -> {
                    System.out.println("We hope to see you soon!");

                    System.exit(0);
                }
            }

        }

    }

}
