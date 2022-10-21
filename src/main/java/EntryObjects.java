public class EntryObjects {

    /**
     * Maps out the object used for storing users entry.
     */

    private String dateOfEntry;

    private String titleOfEntry;

    private String entry;

    public EntryObjects(String dateOfEntry, String titleOfEntry, String entry) {
        this.dateOfEntry = dateOfEntry;

        this.titleOfEntry = titleOfEntry;

        this.entry = entry;

    }

    public EntryObjects() {
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public String getTitleOfEntry() {
        return titleOfEntry;
    }

    public void setTitleOfEntry(String titleOfEntry) {
        this.titleOfEntry = titleOfEntry;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    /**
     * Used for displaying users new entry.
     */
    void printEntry () {

        System.out.println(dateOfEntry);
        System.out.println(titleOfEntry);
        System.out.println(entry);
    }
}
