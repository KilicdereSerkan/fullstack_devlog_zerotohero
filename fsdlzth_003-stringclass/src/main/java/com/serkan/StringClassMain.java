package com.serkan;


public class StringClassMain {
    static void main() {
        //String is not a primitive data type, it is a class in Java
        String str = "Hello, World!";
        System.out.println("String: " + str);

        //it is immutable
        str = str + " How are you?";
        System.out.println("Modified String: " + str);


        //it is sequence of characters
        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);

        //String is an object
        int length = str.length();
        System.out.println("Length of the string: " + length);

        //Commonly used methods
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);

        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);

        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring);

        String trimmedStr = "   Hello   ".trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");

        String[] words = str.split(" ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }

        String joinedStr = String.join("-",words);
        System.out.println("Joined String: " + joinedStr);

        //other string methods;

        boolean containsJava = str.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        boolean endsWithQuestionMark = str.endsWith("?");
        System.out.println("Ends with '?': " + endsWithQuestionMark);


        // below code demonstrates string formatting and conversion
        //String formatting using String.format() method to create a formatted string with placeholders for variables.
        //here we format a string to include the original string and its length using %s for string and %d for integer.
        //this is useful for creating dynamic strings with variable content in a readable way.
        //it works like printf in other languages. in java printf method can also be used for formatted output to console.
        String formattedStr = String.format("Formatted String: %s - Length: %d", str, length);
        System.out.println(formattedStr);

        String valueOfInt = String.valueOf(123);
        System.out.println("String value of integer 123: " + valueOfInt);

        //String comparison ==> below code demonstrates the difference between equals() method and == operator for String comparison.
        //equals() method compares the content of the strings, while == operator compares the references (memory addresses) of the string objects.
        //here we create two String objects with the same content and compare them using both methods.
        //the equals() method will return true, while the == operator will return false since they are different objects in memory.
        //this is an important distinction to understand when working with strings in Java.
        //always use equals() method for content comparison of strings.
        //also using new keyword creates a new String object in heap memory, bypassing the String pool. and so even if the content is the same, the references will be different.

        String str1 = "Hello";
        String str2 = new String("Hello");
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);
        boolean isSameReference = (str1 == str2);
        System.out.println("str1 == str2: " + isSameReference);


        //StringBuilder and StringBuffer for mutable strings ==> below code demonstrates the usage of StringBuilder and StringBuffer classes for mutable strings.
        //StringBuilder is not synchronized and is faster, while StringBuffer is synchronized and thread-safe.
        //here we create a StringBuilder and StringBuffer object, append some text to them, and print the results.
        //StringBuilder and StringBuffer are useful when we need to perform multiple modifications to a string, as they do not create new objects for each modification like String does.
        //this improves performance and reduces memory overhead in scenarios involving frequent string manipulations.
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!");
        System.out.println("StringBuilder: " + stringBuilder.toString());
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(", Java!");
        System.out.println("StringBuffer: " + stringBuffer.toString());


        //String pool ==> below code demonstrates that when we create String literals, they are stored in the String pool.
        //thus if we create another String literal with the same content, it will reference the same object in the String pool.
        //here we create two String literals with the same content and compare their references using == operator.
        //since both literals point to the same object in the String pool, the comparison will return true.
        //this is an important optimization in Java to save memory and improve performance.
        String poolStr1 = "Hello";
        String poolStr2 = "Hello";
        boolean isSamePoolReference = (poolStr1 == poolStr2);
        System.out.println("poolStr1 == poolStr2: " + isSamePoolReference);

        //Using new keyword ==> below code demonstrates that when we create String objects using the new keyword, they are stored in the heap memory and not in the String pool.
        //thus even if the content is the same, they will have different references.
        //here we create two String objects using new keyword and compare their references using == operator.
        String newStr1 = new String("Hello");
        String newStr2 = new String("Hello");
        boolean isSameNewReference = (newStr1 == newStr2);
        System.out.println("newStr1 == newStr2: " + isSameNewReference);

        //String immutability demonstration ==> below code demonstrates that String objects are immutable in Java. any modification to a String results in the creation of a new String object rather than altering the existing one.
        //here we will show that after calling concat method without assignment the original string remains unchanged. and after assignment the new string is stored in the variable.
        String immutableStr = "Immutable";
        System.out.println("Original String: " + immutableStr);
        immutableStr.concat(" String");
        System.out.println("After concat (without assignment): " + immutableStr);
        immutableStr = immutableStr.concat(" String");
        System.out.println("After concat (with assignment): " + immutableStr);

        //Performance consideration  below code demonstrates performance difference between String concatenation and StringBuilder append actually measuring time taken for each operation.
        //here we will use System.nanoTime() to measure the time taken for each operation. and print the results. barely noticeable for small number of concatenations but significant for large number of concatenations.
        //String concatenation performance  here all concatenations create new String objects. this gives us poor memory and performance.
        long startTime = System.nanoTime();
        String performanceStr = "";
        for (int i = 0; i < 1000; i++) {
            performanceStr += "a";  }
        Long performanceTime = System.nanoTime() - startTime;
        System.out.println("Time taken for String concatenation: " + performanceTime + " ns");

        //StringBuilder performance below code measures time taken for StringBuilder append operation . barely noticeable for small number of appends but significant for large number of appends.
        //StringBuilder append performance StringBuilder append performance is generally much faster than String concatenation for large number of operations.
        //here no new object is created for each append operation.
        startTime = System.nanoTime();
        StringBuilder performanceStrBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            performanceStrBuilder.append("a");  }
        performanceTime = System.nanoTime() - startTime;
        System.out.println("Time taken for StringBuilder append: " + performanceTime + " ns");

        //StringBuffer performance below code measures time taken for StringBuffer append operation . barely noticeable for small number of appends but significant for large number of appends.
        //StringBuffer append performance StringBuffer append performance is generally slower than StringBuilder due to synchronization overhead but still faster than String concatenation for large number of operations.
        //here no new object is created for each append operation.
        startTime = System.nanoTime();
        StringBuffer performanceStrBuffer = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            performanceStrBuffer.append("a");  }
        performanceTime = System.nanoTime() - startTime;
        System.out.println("Time taken for StringBuffer append: " + performanceTime + " ns");

        //==> StringBuilder is thread-unsafe but faster, StringBuffer is thread-safe but slower. and both are mutable alternatives to String for performance-critical applications involving numerous modifications.
        //Use StringBuilder when thread safety is not a concern and StringBuffer when it is.when concurrency is involved and multiple threads might access the same string object.

        //Conclusion
        System.out.println("Strings are powerful and versatile in Java, but understanding their characteristics is crucial for effective programming.");






    }
}
