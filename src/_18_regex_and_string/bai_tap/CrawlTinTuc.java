package _18_regex_and_string.bai_tap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlTinTuc {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder contentBuilder = new StringBuilder();
            String content;
            while ((content = bufferedReader.readLine()) != null) {
                contentBuilder.append(content);
            }
            content = contentBuilder.toString();
            bufferedReader.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("title=\"(.*?)\">");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
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
