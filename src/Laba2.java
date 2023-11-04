import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba2 {
    public static void var5() { // logic-bool of 16ID HTML Color Code

        String text = "#955591";
        String regex = "^#[0-9a-fA-F]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

    }



    public static void main(String[] args) {

      var5();

    }
}

