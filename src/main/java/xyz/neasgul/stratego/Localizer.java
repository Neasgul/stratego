package xyz.neasgul.stratego;

import java.util.Locale;
import java.util.ResourceBundle;

@SuppressWarnings("HardCodedStringLiteral")
public class Localizer {

    private final static String RESOURCE_BUNDLE = "xyz.neasgul.stratego.string";
    private Locale locale = null;

    public Localizer() { this(Locale.getDefault()); }
    public Localizer(Locale locale) { this.locale = locale; }

    public String getLocalizedText(String key)
    {
        try
        {
            ResourceBundle bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE,
                    locale, this.getClass().getClassLoader());

            if (bundle.keySet().contains(key)) {
                return bundle.getString(key);
            }
            else {
                return key + "(No localization entry found)";
            }
        }
        catch (Exception e)
        {
            return "LOCALIZATION FAILED: " + e.toString();
        }
    }
}
