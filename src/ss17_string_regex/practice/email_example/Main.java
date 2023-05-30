package ss17_string_regex.practice.email_example;

public class Main {
    private static EmailRegex emailRegex;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String args[]) {
        emailRegex = new EmailRegex();
        for (String email : validEmail) {
            boolean isvalid = emailRegex.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailRegex.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
