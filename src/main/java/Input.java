import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Input {

    static ObjectMapper mapper = new ObjectMapper();

    static List<EntryObjects> allEntries = new ArrayList<>();

    /**
     * Enables user to create a new entry by entering a title and an entry. Date is automatically added to the entry.
     * Also saves users new entry in a JSON-file.
     */

    static void userCreatesANewEntry() throws IOException {

        Scanner userInputsATitle = new Scanner(System.in);

        Scanner userInputsAnEntry = new Scanner(System.in);

        DateFormat formattedDate = new SimpleDateFormat("dd-MM-yyyy");

        Date dateThatGoesIntoAString = new Date();

        String dateForAddingToEntry = formattedDate.format(dateThatGoesIntoAString);

        System.out.println("Enter a title for your entry: ");

        String userInputsATitleToThisString = userInputsATitle.nextLine();

        System.out.println("Enter your entry: ");

        String userInputsAEntryToThisString = userInputsAnEntry.nextLine();

        EntryObjects entryAsAnObject =  new EntryObjects(dateForAddingToEntry,
                userInputsATitleToThisString, userInputsAEntryToThisString);

        allEntries.add(new EntryObjects(dateForAddingToEntry, userInputsATitleToThisString,
                userInputsAEntryToThisString ));

        mapper.writeValue(Paths.get("src/main/java/userEntries.json").toFile(),allEntries);

        entryAsAnObject.printEntry();
    }

    /**
     * Takes all entries saved in JSON-file and adds them to an Arraylist.
     */
    static void getEntriesFromJson()  {

        try {

        List<EntryObjects> allEntriesFromJsonFile = List.of(mapper.readValue(Paths.get
        ("src/main/java/userEntries.json").toFile(), EntryObjects[].class));

        allEntries.addAll(allEntriesFromJsonFile);

    }
        catch (Exception e) {

        }

        }
}
