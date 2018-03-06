package codeFighters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestDigitsPrefix {
	public static void main(String[] args) {
		System.out.println(longestDigitsPrefix("aab 5 5 "));
	}
	
	static String longestDigitsPrefix(String inputString) {
		String myRegex = "^\\d+";
		Pattern pattern = Pattern.compile(myRegex);
		Matcher matcher = pattern.matcher(inputString);
		if(matcher.find()){
			return matcher.group(0);
		}
		return "";
	}
}
