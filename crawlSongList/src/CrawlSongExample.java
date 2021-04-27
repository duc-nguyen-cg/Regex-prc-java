import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.*;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL(" https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            //open the stream and put it into BufferedReader
            InputStreamReader isReader = new InputStreamReader(url.openStream());
            Scanner scanner = new Scanner(isReader);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            //close scanner
            scanner.close();

            //remove all new line
            content = content.replaceAll("\\n+", "");

            //regex
            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1)+"\n");
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
