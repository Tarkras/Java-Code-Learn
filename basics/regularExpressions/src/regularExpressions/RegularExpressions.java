package regularExpressions;
import java.util.regex.*;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* A regular expression defines a search pattern for strings. The abbreviation for regular expression
		 * is regex. The search pattern can be anything from a simple character, a fixed string or a complex
		 * expression containing special characters describing the pattern. The pattern defined by the regex
		 * may match one or several times or not at all for a given string.
		
			Regular expressions can be used to search, edit and manipulate text. */
		
		// See https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html  and  https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
		
		// First method.
		Pattern pat = Pattern.compile("D...."); // Needs to specify how many characters there are after and before.
		Matcher mat = pat.matcher("Didac");
		
		boolean result1 = mat.matches();
		
		System.out.println(result1);
		
		// Second method.
		boolean result2 = Pattern.compile("D....").matcher("Didac").matches();
		
		System.out.println(result2);
		
		// Third method.
		boolean result3 = Pattern.matches("D....", "Didac");
		
		System.out.println(result3);
	}

}
