import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSubstitution {

    public static String substituteRegex(String input, String regexPattern, String replacement) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);

        return matcher.replaceAll(mr -> mr.group().toLowerCase());
    }
    
}