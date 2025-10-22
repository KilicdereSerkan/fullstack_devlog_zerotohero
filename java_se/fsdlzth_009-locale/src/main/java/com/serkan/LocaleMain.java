package com.serkan;
import java.util.Locale;
import java.util.Arrays;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ResourceBundle;




public class LocaleMain {
    static void main() {
/*
        Locale overview
        A Locale represents a specific geographical, political, or cultural region and tells Java how to present language-sensitive data such as text, dates, numbers, and currencies. Locales are identified by fields such as language, country (region), variant, script, and extensions; they let a program run the same logic while producing region-appropriate output.

                Locale fields and common constructors
        - language: ISO 639 code like "en", "tr", "fr".
                - country: ISO 3166 two-letter country code like "US", "TR", "FR".
                - variant: vendor or platform-specific variation (case sensitive).
        - script and extensions: used for more granular subtags (modern Locale API supports them).
                Common constructors and factory methods:
        - new Locale("en") — only language.
        - new Locale("en", "US") — language + country.
                - new Locale("en", "US", "POSIX") — language + country + variant.
                - Locale.forLanguageTag("sr-Latn-RS") — use BCP 47 language tags (recommended for scripts/extensions).
        - Locale.getDefault() and Locale.getAvailableLocales() let you inspect JVM defaults and installed locales.
        Explanation and availability details appear in standard Java references and tutorials.

 */

  //              Basic code examples: creating Locale objects

                Locale.setDefault(Locale.US);
                Locale l5 = Locale.of("tr","TR"); // below are deprecated ==> new Locale
                Locale l1 = new Locale("en");                 // English
                Locale l2 = new Locale("en", "US");           // English, United States
                Locale l3 = new Locale("tr", "TR");           // Turkish, Turkey

        Locale l4 = Locale.forLanguageTag("sr-Latn-RS"); // Serbian in Latin script, Serbia

                System.out.println(l1); // en
                System.out.println(l2); // en_US
                System.out.println(l3.getDisplayLanguage(l2)); // shows how Turkish looks in English locale


  //      Explanation: construct Locales using language/country strings; forLanguageTag is preferred for modern subtags and scripts.

  //      Locale defaults and available locales


                Locale def = Locale.getDefault(); // JVM default locale
                System.out.println("Default: " + def);

                Locale[] all = Locale.getAvailableLocales();
                System.out.println("Number of available locales: " + all.length);
                Arrays.stream(all).limit(10).forEach(System.out::println);


  //      Explanation: getDefault returns JVM’s current locale; getAvailableLocales returns all installed locales on the platform, useful when offering user choices.



  //      Formatting numbers and currency with Locale
                double amount = 1234567.89;

                Locale us = Locale.US;
                Locale de = Locale.GERMANY;    // Germany uses dot grouping and comma decimal
                Locale tr = new Locale("tr", "TR"); // Turkey

                NumberFormat nfUs = NumberFormat.getNumberInstance(us);
                NumberFormat nfDe = NumberFormat.getNumberInstance(de);
                NumberFormat nfTr = NumberFormat.getNumberInstance(tr);

                NumberFormat curUs = NumberFormat.getCurrencyInstance(us);
                NumberFormat curDe = NumberFormat.getCurrencyInstance(de);
                NumberFormat curTr = NumberFormat.getCurrencyInstance(tr);

                System.out.println("US number: " + nfUs.format(amount));
                System.out.println("DE number: " + nfDe.format(amount));
                System.out.println("TR number: " + nfTr.format(amount));

                System.out.println("US currency: " + curUs.format(amount));
                System.out.println("DE currency: " + curDe.format(amount));
                System.out.println("TR currency: " + curTr.format(amount));

//       Explanation: NumberFormat uses the Locale to decide decimal separators, grouping, currency symbol and placement. This is how the same numeric value appears correctly in each region.



 //       Formatting dates and times with Locale (java.time)


                LocalDateTime now = LocalDateTime.now();

                Locale enUS = Locale.US;
                Locale frFR = Locale.FRANCE;
                Locale trTR = Locale.of("tr", "TR");

                DateTimeFormatter fmtLongUS = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                        .withLocale(enUS);
                DateTimeFormatter fmtShortFR = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .withLocale(frFR);
                DateTimeFormatter fmtShortTR = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                        .withLocale(trTR);

                System.out.println("US full: " + now.format(fmtLongUS));
                System.out.println("FR medium: " + now.format(fmtShortFR));
                System.out.println("TR short: " + now.format(fmtShortTR));

 //  Explanation: java.time formatters pick localized names for months, weekdays, and order of date/time parts based on Locale.



  /*
        Localized messages with ResourceBundle
        - Create property files:
        - Messages_en.properties greeting=Hello dateLabel=Date
                - Messages_tr.properties greeting=Merhaba dateLabel=Tarih
                - Java code to load localized messages:

   */
                Locale en = Locale.of("en");
                Locale trr = Locale.of("tr", "TR");

                ResourceBundle rbEn = ResourceBundle.getBundle("Messages", en);
                ResourceBundle rbTr = ResourceBundle.getBundle("Messages", tr);

                System.out.println("EN greeting: " + rbEn.getString("greeting"));
                System.out.println("TR greeting: " + rbTr.getString("greeting"));

        //       Explanation: ResourceBundle picks the right properties file by matching the requested Locale;
        //       fallbacks occur if an exact match isn’t available (for example, Messages_tr_TR → Messages_tr → Messages).




        //      Comparing and matching Locales

                Locale a = Locale.of("en", "US");
                Locale b = Locale.forLanguageTag("en-US");
                Locale c = Locale.of("en");

                System.out.println(a.equals(b)); // true because tags match
                System.out.println(a.getLanguage().equals(c.getLanguage())); // true
                System.out.println(a.getCountry()); // US

   //     Explanation: equals compares full Locale identity; often you check getLanguage or getCountry if partial matching is intended.




   /*

        Best practices and tips
        - Prefer Locale.forLanguageTag for BCP 47 compatibility and script subtags.
        - Use Locale constants (Locale.US, Locale.FRANCE) for readability.
                - Always format user-visible numbers/dates/currency using locale-aware formatters rather than manual string building.
        - Provide a fallback resource bundle or default Locale to avoid MissingResourceException when localized resources are absent.
                - Use Locale.getAvailableLocales to populate UI locale selectors so you only show supported options.

    */

    }
}
