package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by George Fouche on 4/5/17.
 */
public class I18nExample {
    public static void main(String[] args) {

        // Default
        ResourceBundle bundle1 = ResourceBundle.getBundle("TestBundle");
        displayValues(bundle1);

        //Default
        Locale defaultLocale = Locale.getDefault();
        ResourceBundle bundle2 = ResourceBundle.getBundle("TestBundle",defaultLocale);
        displayValues(bundle2);

        // English/US
        Locale englishLocale = new Locale("en","US");
        ResourceBundle bundle3 = ResourceBundle.getBundle("TestBundle",englishLocale);
        displayValues(bundle3);

        //French/France
        Locale frenchLocale = new Locale("fr","FR");
        ResourceBundle bundle4 = ResourceBundle.getBundle("TestBundle",frenchLocale);
        displayValues(bundle4);

       Locale frenchLocale2 = Locale.FRANCE;
       ResourceBundle bundle5 = ResourceBundle.getBundle("TestBundle",frenchLocale2);
      displayValues(bundle5);
    }

    public static void displayValues(ResourceBundle bundle) {
        System.out.println("Hello message: " + bundle.getString("my.hello"));
        System.out.println("Goodbye message: " + bundle.getString("my.goodbye"));
        System.out.println("Question message: " + bundle.getString("my.question"));
        System.out.println();
    }
}
