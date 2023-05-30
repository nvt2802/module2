package ss17_string_regex.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();

            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("<h3 class=\"article-title\"><a(.*?)htm\">(.*?)</a></h3>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(2));
                System.out.println();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("k tim thay");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
