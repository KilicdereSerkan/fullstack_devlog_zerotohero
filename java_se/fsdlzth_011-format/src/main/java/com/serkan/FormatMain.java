package com.serkan;


import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;


public class FormatMain {
    static void main() {
/*
        Overview of Format in Java
        Java provides formatted output and string creation through the String.format method, System.out.printf, and the java.util.Formatter class. These use C-like format specifiers to control how values are converted to text, including width, alignment, precision, flags, argument indexing, and locale-aware formatting.

                Key APIs and Method Signatures
        - String.format(String format, Object... args) returns a formatted String.
        - String.format(Locale l, String format, Object... args) formats using a specific Locale.
                - System.out.printf has the same format syntax but writes to standard output.
        - java.util.Formatter allows incremental formatting to Appendable targets.
        The format methods throw IllegalFormatException for bad formats and use Locale.getDefault() when no locale is supplied.

 */
/*
                Format String Structure
        A placeholder has the form: %[arg$][flags]width][.precision]conversion.
                - arg$ chooses which argument to use (1-based).
                - flags control sign, padding, grouping, left-justify, alternate form, and more.
                - width is minimum field width.
        - .precision limits digits or string length.
        - conversion selects type (e.g., s, d, f, b, h, t, %).
        Details of flags and conversions are defined by the Formatter syntax.

 */
/*
                Common Conversions and Flags
                - %s string; %S uppercase string.
                - %d decimal integer.
                - %x / %X hexadecimal.
                - %f floating point decimal.
                - %,d grouping (thousands separator) affected by locale.
                - %b boolean.
                - %h hashcode in hex.
                - %n platform newline.
                - %% literal percent sign.
                - %t date/time conversions (see examples below).
     Flags examples: - left-justify, 0 zero-pad, + always show sign, space prefix for positive numbers, , group digits, # alternate form (e.g., 0x for hex).

 */

  //      Examples with Explanations

        //    1. Basic String.format and printf
        String name = "Ada";
        int age = 30;
        String s = String.format("Name: %s, Age: %d", name, age);
        System.out.println(s);
        System.out.printf("Welcome %s! You are %d years old.%n", name, age);

/*
        - %s replaced by name.
        - %d replaced by integer age.
        - %n prints the platform newline.

 */


 //       2. Width and Alignment
        System.out.printf("|%10s|%10s|%n", "left", "right");
        System.out.printf("|%-10s|%10s|%n", "left", "right");
/*
        - %10s reserves 10 characters, right-justified by default.
        - %-10s left-justifies inside the width.

 */



//       3. Precision for Strings and Floating Numbers
        String longText = "HelloWorld";
        System.out.printf("%.5s%n", longText);         // prints Hello

        double pi = Math.PI;
        System.out.printf("%.2f%n", pi);              // prints 3.14
        System.out.printf("%8.2f%n", pi);             // width 8, 2 decimal places, padded left
/*
        - %.5s prints at most 5 characters of the string.
        - %.2f rounds the floating number to 2 decimal places.

 */



 //       4. Zero Padding and Sign Flags
        int n = 42;
        System.out.printf("%05d%n", n);               // prints 00042
        System.out.printf("%+d and % d%n", 42, 42);   // prints +42 and  42
/*
        - %05d pads with zeros to width 5.
         - %+d shows sign for positive numbers.
        - % d prefixes a space for positive numbers.
*/




//        5. Grouping Separator and Locale
        long big = 1234567890L;
        System.out.printf("%,d%n", big);              // prints 1,234,567,890 with default locale

        Locale tr = new Locale("tr", "TR");
        System.out.println(String.format(tr, "%,d", big)); // locale-aware separators may differ.
//      - %,d groups digits by thousands; grouping format depends on locale.


//        6. Argument Indexing and Reuse
        System.out.printf("%2$s is %1$d years old.%n", 25, "Ali");
//      prints Ali is 25 years old.

        System.out.printf("%1$s %1$s %2$d%n", "repeat", 3); // reuse first argument twice
/*
        - %2$s uses the second argument; %1$d uses the first.
        - This enables reordering for locale-sensitive sentences.

 */



//        7. Hex, Octal, and Alternate Forms
        int value = 255;
        System.out.printf("Dec: %d Hex: %x HEX: %X Oct: %o%n", value, value, value, value);
        System.out.printf("Alternate hex: %#x%n", value); // prints 0xff with # flag
/*
    - %x lowercase hex, %X uppercase.
        - %o octal.
        - # adds prefix for octal/hex where applicable.

 */




//        8. Booleans and Hashcodes
        Object obj = null;
        System.out.printf("%b %h%n", (obj != null), obj);
//      prints false null
//      - %b prints boolean; %h prints hashcode in hex or "null" for null.




//        9. Date and Time with format specifiers
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Date: %1$td-%1$tm-%1$tY Time: %1$tH:%1$tM:%1$tS%n", now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime Localx = LocalDateTime.of(2025,07,12,14,32)  ;
        formatter.format(Localx);
        System.out.println(Localx);
/*
        - %t conversions require a date/time object and a trailing conversion letter (e.g., tY year, tm month, td day, tH hour, tM minute, tS second).
                - Use the same argument index (here 1$) for clarity.
 */



//        10. Using Formatter for building strings incrementally
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb, Locale.US);
        fmt.format("Price: %,.2f %n", 123456.789);
        fmt.close();
        System.out.println(sb.toString());
//      - Formatter attaches to Appendable and formats repeatedly; close to release resources.

//       -Currency;

        double amount = 1234567.89;
        NumberFormat nfDefault = NumberFormat.getCurrencyInstance();        // default Locale
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);    // US format: $1,234,567.89
        NumberFormat nfTR = NumberFormat.getCurrencyInstance(new Locale("tr", "TR")); // Türkiye

        System.out.println(nfDefault.format(amount));
        System.out.println(nfUS.format(amount));
        System.out.println(nfTR.format(amount));




/*
        Error Cases and Exceptions
        - Passing a null format string causes NullPointerException.
        - Mismatched or insufficient arguments cause IllegalFormatException.
                - Using an invalid conversion character or incompatible argument type triggers IllegalFormatConversionException.

 */
/*
        Practical Tips
        - Prefer String.format for building strings and System.out.printf for console printing.
        - Use argument indexes when translating messages to reorder placeholders for other languages.
        - Use Locale-aware formatting when presenting numbers or dates to users in different regions.
                - Validate your format strings or write small tests to catch IllegalFormatExceptions early.
 */


/*
        Short Cheat Sheet
                - Basic numeric: %d integer, %f floating, %.2f two decimals.
        - Strings: %s, %.Ns truncate to N chars, %Ns minimum width.
                - Padding: %0Nd zero-pad, %-Ns left-justify.
                - Grouping: %,d.
                - Sign: %+d.
                - Literal percent: %%.
        - Newline: %n.
                - Date/time: %tY year, %tm month, %td day, etc.
        - Locale: String.format(Locale, ...).

 */


    }
}
