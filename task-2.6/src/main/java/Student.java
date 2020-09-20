public class Student {
    private String firstName;
    private String lastName;
    private String journalNo;

    public Student(String firstName, String lastName, String journalNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.journalNo = journalNo;
    }

    // to String
    public String toString(){
        return firstName + " " + lastName + " (" + journalNo + ")";
    }
}
