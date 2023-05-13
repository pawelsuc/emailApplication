import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "xyzcompany.com";

    //        Constructor to receive the firstName and the LastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email created: " + this.firstName + " " + this.lastName);
//        Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
//        Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

//        Combine elements to generate email
        email = firstName.toLowerCase() +  "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("EMAIL CREATED is " + email);
    }


    //    Ask for the department
    private String setDepartment() {
        System.out.print("Enter the department\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \n Enter Department code:");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

//    Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWZ0123456789!@#$%^&*()";
        char[] passwd = new char[length];
        for (int i=0; i<length;i++) {
           int random = (int) (Math.random() * passwordSet.length());
           passwd[i] = passwordSet.charAt(random);
        }
        return new String(passwd);
    }


//    Set the mailboxCapacity

//    Set the alternate email

//    Change the password
}