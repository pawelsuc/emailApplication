import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String changePassword;
    private String alternateEmail;
    private String companySuffix = "xyzcompany.com";

    //        Constructor to receive the firstName and the LastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email created: " + this.firstName + " " + this.lastName);
//        Call a method asking for the department - return the department
        this.department = setDepartment();

//        Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

//        Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //    Ask for the department
    private String setDepartment() {
        System.out.print("New worker: " + firstName + lastName + "Enter the department\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter Department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "development";
        } else if (departmentChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    //    Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWZ0123456789!@#$%^&*()";
        char[] passwd = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            passwd[i] = passwordSet.charAt(random);
        }
        return new String(passwd);
    }

    //    Set the mailboxCapacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
//    Set the alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
//    Change the password

    public void setChangePassword(String changePassword) {
        this.changePassword = changePassword;

    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + " " +
                "\nCOMPANY EMAIL: " + email + " " +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}