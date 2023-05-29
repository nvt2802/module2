package ss16_binary_file_and_serialization.exercise.copy_binary_file;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        String sourceFile;
        try {
            do {
                try {
                    System.out.println("nhap source file");
                    sourceFile = scanner.nextLine();
                    in = new FileInputStream(sourceFile);
                    break;
                } catch (FileNotFoundException e) {
                    System.out.println("khong tim thay file");
                }
            } while (true);
            System.out.println("nhap target file");
            String targetFile = scanner.nextLine();
            File file = new File(targetFile);
            if (file.exists()) {
                System.out.println("file da ton tai");
            }
            out = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println(Arrays.toString(sourceFile.getBytes()));
    }
}
