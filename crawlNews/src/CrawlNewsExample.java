import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewsExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            //open the stream and put it into Scanner
            InputStreamReader isReader = new InputStreamReader(url.openStream());
            Scanner scanner = new Scanner(isReader);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            //close scanner
            scanner.close();
            //remove all new line
            content.replace("</html>", "");
            content = content.replaceAll("\\n+", "");
            content = content.replaceAll( "\\(Dân trí\\)&nbsp;-", "");
            content = content.replaceAll("href=\"(.*?)\"", "");
            content = content.replaceAll("&quot;", "");
            //regex
//            Pattern pattern = Pattern.compile("\">(.*?)</a>");

            Pattern pattern = Pattern.compile("title=\"(.*?)\">");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1)+"\n");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
