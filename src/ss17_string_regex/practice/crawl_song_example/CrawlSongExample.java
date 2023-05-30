package ss17_string_regex.practice.crawl_song_example;
import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();

            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex

            Pattern p = Pattern.compile("name_song\">(.*?)</a>");

            Matcher m = p.matcher(content);

            while (m.find()) {
                System.out.println(m.group(1));
                System.out.println(m.group(0));
            }
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("k tim thay");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
