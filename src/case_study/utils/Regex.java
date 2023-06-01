package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Regex {
    private static final Scanner scanner = new Scanner(System.in);
    public static final String REGEX_ID ="^[N][V]-(\\d){4}$";
    public static final String REGEX_NAME ="^(([A-Z])[a-z]+(\\s|$))*$";
    public static final String REGEX_DATE ="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
    public static final String REGEX_PHONE_NUMBER ="^(0\\d{9})$";
    public static final String REGEX_IDENTITY ="^((\\d){9})|((\\d){12})$";
    public static final String REGEX_EMAIL ="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
    public static String getRegexId(String id){
        do {
            System.out.println("Input ID(NV-XXXX)");
            id = scanner.nextLine();
            if (!id.matches(Regex.REGEX_ID)) {
                System.out.println("ID wrong!");
            }
        } while (!id.matches(Regex.REGEX_ID));
        return id;
    }
    public static String getRegexName(String name){
        do {
            System.out.println("Input name:");
            name = scanner.nextLine();
            if (!name.matches(Regex.REGEX_NAME)) {
                System.out.println("This name is in the wrong format!");
            }
            if (name.length() > 30) {
                System.out.println("This name is too long!");
            }
        } while (!name.matches(Regex.REGEX_NAME) | name.length() > 30);
        return name;
    }
    public static String getRegexDate(String dayOfBirth){
        boolean check;
        do {
            check = false;
            System.out.println("Input day of birth(dd/mm/yyyy):");
            dayOfBirth = scanner.nextLine();
            DateTimeFormatter formatter;
            LocalDate localDate = null;
            LocalDate localDateNow=null;
            int years = 0;
            try {
                formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                localDate = LocalDate.parse(dayOfBirth, formatter);
                localDateNow = LocalDate.now();
                years = Period.between(localDate,localDateNow).getYears();
            }catch (DateTimeParseException | NullPointerException dateTimeParseException){
                check=true;
                System.out.println("Date is not date format");
            }
            if (!dayOfBirth.matches(Regex.REGEX_DATE)) {
                check=true;
                System.out.println("Date is in the wrong format!");
            }
            if (years <18){
                check=true;
                System.out.println("Under 18 years old");
            }
        } while (check);
        return dayOfBirth;
    }
    public static String getRegexGender(String gender){
        byte choiceGender;
        do {
            System.out.println("Input gender(male/female:\n" +
                    "1. Male\n" +
                    "2. Female\n" +
                    "3. Other genders"
            );
            choiceGender = Byte.parseByte(scanner.nextLine());
            switch (choiceGender) {
                case 1:
                    gender = "male";
                    break;
                case 2:
                    gender = "female";
                    break;
                case 3:
                    gender = "Other genders";
                    break;
            }
        } while (gender == null);
        return gender;
    }
    public static String getRegexIdentity(String identity){
        do {
            System.out.println("Input identity card number: ");
            identity = scanner.nextLine();
            if(!identity.matches(REGEX_IDENTITY)){
                System.out.println("identity card number just between 9 to 12 number!");
            }
        }while (!identity.matches(REGEX_IDENTITY));
        return identity;
    }
    public static String getRegexPhoneNumber(String phoneNumber){
        do {
            System.out.println("Input phone number:");
            phoneNumber = scanner.nextLine();
            if (!phoneNumber.matches(REGEX_PHONE_NUMBER)){
                System.out.println("This is not phone number format!");
            }
        }while (!phoneNumber.matches(REGEX_PHONE_NUMBER));
        return phoneNumber;
    }
    public static String getRegexEmail (String email){
        do {
            System.out.println("Input Email(username@xxx.xxx):");
            email = scanner.nextLine();
            if (!email.matches(REGEX_EMAIL)){
                System.out.println("This email is not email format!");
            }
        }while (!email.matches(REGEX_EMAIL));
        return email;
    }

}
