package ss15_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class ReadAndWirteFileToFile {
    public String readSourceFile(String pathOfSourceFile) {
        String str="";
        try {
            File sourceFile = new File(pathOfSourceFile);

            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fileReader);
            String line ="";

            while ((line = br.readLine())!=null){
                str+=line+"\n";
            }
            br.close();
            fileReader.close();
        }catch (Exception e){
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return str;
    }
    public void writeTargetFile(String path,String messages){

        try {
            File tagetFile = new File(path);
            if (tagetFile.exists()) {
                System.out.println("file da ton tai");
                return;
            }
            FileWriter fileWriter = new FileWriter(tagetFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(messages);
            bw.flush();
            bw.close();
            fileWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
