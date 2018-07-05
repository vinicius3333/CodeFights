package CodeFights.The_Core.Book_Market;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTML_End_Tag_By_Start_Tag {
    public static void main(String[] args) {

    }

    static String htmlEndTagByStartTag(String startTag) {

        startTag = startTag.substring(startTag.indexOf("<")+1, startTag.indexOf(">"));
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(startTag);



        System.out.println(startTag);

        return "";
    }
}
