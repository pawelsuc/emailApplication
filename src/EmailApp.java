public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John", "Smith");
        email.setAlternateEmail("zyx@gmail.com");
        System.out.println(email.showInfo());
    }
}