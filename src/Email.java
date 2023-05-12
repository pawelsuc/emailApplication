public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

//    Constructor to receive the firstName and the LastName

//    Ask for the department

//    Generate a random password

//    Set the mailboxCapacity

//    Set the alternate email

//    Change the password

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
    }
}
