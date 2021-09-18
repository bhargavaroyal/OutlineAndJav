// Java program to demonstrate
// working of Locale class in
// toLowerCase() method
import java.util.Locale;
class Gfg {
    public static void main(String args[])
    {
        String s = "I Know YOI Bui You Don't Know ME.";
 
        // Locales with the language "tr" for TURKISH
        //"en" for ENGLISH is created
        Locale TURKISH = Locale.forLanguageTag("tr");
        Locale ENGLISH = Locale.forLanguageTag("en");
 
        // converting string s to lowercase letter
        // using TURKISH and ENGLISH language
        String gfg2 = s.toLowerCase(TURKISH);
        String gfg3 = s.toLowerCase(ENGLISH);
        System.out.println(gfg2);
        System.out.println(gfg3);
    }
}