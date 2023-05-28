package ss15_io_text_file.exercise.copy_file_text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadAndWirteFileToFile file = new ReadAndWirteFileToFile();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap duong dan source file:");
            String pathOfSource = scanner.nextLine();
            String messagesOfSource=file.readSourceFile(pathOfSource);
            if(!messagesOfSource.equals("")) {
                System.out.println("nhap duong dan target file:");
                String pathTargetFile = scanner.nextLine();
                file.writeTargetFile(pathTargetFile, messagesOfSource);
                break;
            }
        }while (true);
    }
}
