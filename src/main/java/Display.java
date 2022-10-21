public class Display {

    /**
     * Used for displaying the Main Menu to the user.
     */
    static void displayMainMenu () {

        System.out.println("Welcome to the Main Menu! Please choose what you want to do: ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("1. Press 1 to read your diary ");
        System.out.println("2. Press 2 to write a new entry ");
        System.out.println("3. Press 3 to exit program ");

    }

    /**
     * Used for displaying all entries from an Arraylist originally stored in the JSON-file.
     */
    static void displayAllEntriesFromArrayList() {

        try {

            for (EntryObjects p : Input.allEntries) {

                System.out.println(p.getDateOfEntry());

                System.out.println(p.getTitleOfEntry());

                System.out.println(p.getEntry());

        }

        }

        catch (Exception e) {


        }

    }
}
