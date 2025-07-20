package TestPreparation;

public enum Day {
	MONDAY("Start of the week", 1, ""),
    TUESDAY("Second day of the week", 2,""),
    WEDNESDAY("Midweek", 3,""),
    THURSDAY("Almost there", 4,""),
    FRIDAY("End of the workweek", 5,""),
    SATURDAY("Weekend", 6,""),
    SUNDAY("Rest day", 7,"");
	
	// Fields
    private final String description;
    private final int dayNumber;
    private final String msg;

    // Constructor
    Day(String description, int dayNumber,String msg) {
        this.description = description;
        this.dayNumber = dayNumber;
        this.msg=msg;
    }

    // Methods
    public String getDescription() {
        return description;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String getMsg() {
    	return msg;
    }

}
