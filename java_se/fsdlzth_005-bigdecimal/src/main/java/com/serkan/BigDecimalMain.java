package com.serkan;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 *        BigDecimal and BigInteger are classes in Java used for high-precision arithmetic.
 *        They are part of the java.math package and are used when the standard primitive data types
 *        (like float, double, int, long) are not sufficient for the required precision or range.
 *        BigDecimal is used for representing decimal numbers with arbitrary precision.
 *        It is particularly useful in financial calculations where precision is crucial.
 *        BigInteger is used for representing integers of arbitrary size.
 *        It can handle very large integers that exceed the limits of primitive data types like int and long
 *        they are immutable, meaning that once created, their values cannot be changed.
 *        Any arithmetic operations on BigDecimal or BigInteger result in the creation of a new object.
 *        They provide various methods for arithmetic operations, comparisons, and conversions.
 *
 */

//-------------------------------------//


public class BigDecimalMain {
    static void main() {
/*
 *      BigDecimal Overview
 *      BigDecimal is an immutable, arbitrary-precision decimal number class in Java used for calculations that require fixed decimal accuracy.
 *      A BigDecimal value is represented by an unscaled value (an arbitrary-precision integer) and a 32-bit scale; the numeric value equals unscaledValue × 10^-scale.
 */

        // example: 123.45 is represented as unscaledValue = 12345 and scale = 2.


 /*
 *      Internal Representation and Core Features
 *  	Two parts: an unscaled value (arbitrary-precision integer) and a scale (int). If scale is zero or positive it indicates the number of decimal places;
 *      if negative it indicates multiplication of the unscaledValue by powers of ten.
 */
        // Example:
        BigDecimal bd = new BigDecimal("123.45"); // unscaledValue = 12345, scale = 2

 /*
        Immutability: all arithmetic operations return new BigDecimal instances; original objects are not modified.
 */
 /*
     	Rounding control: rounding behavior is fully controllable; precision and rounding mode can be specified with MathContext and RoundingMode.
 */
        // Example: ==> below we round to 1 decimal place using HALF_UP rounding mode and using setScale method and HALF_UP constant
        // HALF_UP: Rounds towards "nearest neighbor" unless both neighbors are equidistant, in which case round up.
        //syntax explanation: ==> setScale(int newScale, RoundingMode roundingMode)
        BigDecimal rounded = bd.setScale(1, RoundingMode.HALF_UP); // rounded = 123.5
        //important note: RoundingMode enum is preferred ; older integer rounding constants are deprecated.

        //List of RoundingMode enum values:
        /*
         * RoundingMode.UP
         * RoundingMode.DOWN
         * RoundingMode.CEILING
         * RoundingMode.FLOOR
         * RoundingMode.HALF_UP
         * RoundingMode.HALF_DOWN
         * RoundingMode.HALF_EVEN
         * RoundingMode.UNNECESSARY
         */

        // Example using deprecated constant:

        BigDecimal roundedDeprecated = bd.setScale(1, BigDecimal.ROUND_HALF_UP); // rounded = 123.5

        //Lİst of deprecated constants:

        /*
         * BigDecimal.ROUND_UP
         * BigDecimal.ROUND_DOWN
         * BigDecimal.ROUND_CEILING
         * BigDecimal.ROUND_FLOOR
         * BigDecimal.ROUND_HALF_UP
         * BigDecimal.ROUND_HALF_DOWN
         * BigDecimal.ROUND_HALF_EVEN
         * BigDecimal.ROUND_UNNECESSARY
         */

        //important note: Changing scale: use ; when reducing scale you must provide appropriate rounding mode or an  will occur.

 /*
        Creation Methods and Best Practices
        Recommended and safe ways:
 */
        // From String:  — preferred for most accurate and predictable results.
        BigDecimal fromString = new BigDecimal("123.45");
        // From char[]:  — similar to String constructor.
        BigDecimal fromCharArray = new BigDecimal(new char[] {'1', '2', '3', '.', '4', '5'});
        // Using valueOf:  — generally safe because it converts the double to String first.
        BigDecimal fromValueOf = BigDecimal.valueOf(123.45);
        // From long, int, BigInteger: use direct constructors or use with ValueOf.
        BigDecimal fromLong = new BigDecimal(12345L); // scale 0
        BigDecimal fromInt = new BigDecimal(12345); // scale 0
        BigDecimal fromBigInteger = new BigDecimal(BigInteger.valueOf(12345L));

        //important note: Avoid:  — preserves binary floating-point representation errors and yields unexpected values.
        BigDecimal fromDouble = new BigDecimal(123.45); // Not recommended

 /*
        Arithmetic Operations;
        Basic operations like add, subtract, multiply, divide, pow, negate, abs are available.
        Many accept a MathContext parameter to apply desired precision and RoundingMode to the result.
 */
        //Example of arithmetic operations;
        BigDecimal fromBigDecimal = new BigDecimal(123.45);
        BigDecimal fromFloat = new BigDecimal(110.45F);

        BigDecimal add = fromBigDecimal.add(fromFloat);
        BigDecimal subtract = fromBigDecimal.subtract(fromFloat);
        BigDecimal multiply = fromBigDecimal.multiply(fromFloat);

        // BigDecimal pow = fromBigDecimal.pow(fromFloat, RoundingMode.HALF_UP); ==> ther is no poe method for BIGDECIMAL numbers we must use int for pow
        BigDecimal x = new BigDecimal("1.5");
        BigDecimal y = new BigDecimal("1.5");
        BigDecimal a = x.pow(3); // 1.5^3 = 3.375
        BigDecimal b = x.pow(3, new MathContext(10, RoundingMode.HALF_UP));
        // or convert to double
        double xd = x.doubleValue();
        double yd = y.doubleValue();
        double rd = Math.pow(xd, yd);
        BigDecimal result = BigDecimal.valueOf(rd); // precision limits is limited by double type

        /*	Divide operations require care: the exact result can produce an endless decimal expansion;
        	if no MathContext is provided and the result cannot be represented exactly, an ArithmeticException is thrown;
        	with a MathContext you can control rounding and precision.
        */
        // Example of divide operations;

        BigDecimal d = new BigDecimal("1");
        BigDecimal e = new BigDecimal("3");
        BigDecimal f = d.divide(e, 10, RoundingMode.HALF_UP); // 0.3333333333

        // With MathContext.UNLIMITED for addition and multiplication (exact result)
        MathContext unlimited = MathContext.UNLIMITED;
        BigDecimal aa = new BigDecimal("1.234567890123456789");
        BigDecimal bb = new BigDecimal("2.000000000000000001");

        BigDecimal sum = a.add(b, unlimited);       // exact 3.234567890123456790
        BigDecimal product = a.multiply(b, unlimited); // exact 2.469135780246913578...

        System.out.println("sum: " + sum);          // sum: 3.234567890123456790
        System.out.println("product: " + product);  // product printed with full BigDecimal precision

        // Division: a plain divide call throws ArithmeticException for non-terminating decimal expansions
        BigDecimal one = new BigDecimal("1");
        BigDecimal three = new BigDecimal("3");
        try {
            BigDecimal bad = one.divide(three); // ArithmeticException: Non-terminating decimal expansion
            System.out.println("bad: " + bad);
        } catch (ArithmeticException ex) {
            System.out.println("Caught expected exception: " + ex.getMessage());
        }



        // Correct usage for division — specify scale and RoundingMode
        BigDecimal safe = one.divide(three, 10, RoundingMode.HALF_UP); // 0.3333333333
        System.out.println("safe (scale=10): " + safe);

        // Or restrict precision using MathContext (precision is meaningful here)
        MathContext mc = new MathContext(5, RoundingMode.HALF_UP); // 5 significant digits
        BigDecimal approx = one.divide(three, mc); // 0.33333 (5 significant digits)
        System.out.println("approx (precision=5): " + approx);

         /*
        Short explanation
        MathContext.UNLIMITED (or precision = 0) does not impose a digit limit for operations like addition/multiplication;
        such operations attempt to produce exact results.
        Division results can have non-terminating decimal expansions; the default divide() throws an ArithmeticException in that case.
        Therefore, for divide calls either specify scale + RoundingMode or use the overload that accepts a MathContext (precision).
         */

        // Summary: UNLIMITED only means "no digit limit" from the MathContext perspective; for divide you must
        // use either scale + RoundingMode or the divide overload that accepts a MathContext (precision).
        // Otherwise you will get an ArithmeticException.


 /*
        Comparison, equals, and hashCode
  	    compareTo(BigDecimal) compares numeric magnitude and ignores scale differences (for example, 2.0 and 2.00 can be equal under ).
  	    equals(Object) checks both unscaled value and scale; numerically equal BigDecimal instances can return  from  (for example,  yields ).
  	    hashCode considers scale and unscaled value to remain consistent with ; for collection behavior prefer working with normalized forms (e.g., )
  	    or use a comparator compatible with .
 */
        // EXAMPLES;

        BigDecimal xx = new BigDecimal("2.0");
        BigDecimal yy = new BigDecimal("2.00");
        BigDecimal zz = new BigDecimal("2");

        // compareTo
        System.out.println("xx.compareTo(yy) = " + xx.compareTo(yy)); // 0
        System.out.println("xx.compareTo(zz) = " + xx.compareTo(zz)); // 0

        /*
        compareTo behavior;
        compareTo compares numerical magnitude and checks whether two BigDecimal numbers are mathematically equal.
        The reason x.compareTo(y) == 0 and x.compareTo(z) == 0 is that all of them have the numerical value 2.0; compareTo does not consider scale differences

        compareTo returns an integer: negative, zero, or positive.
        Negative value: the left operand is less than the right operand.
        Zero: the two operands are numerically equal.
        Positive value: the left operand is greater than the right operand
         */
        //---------------------------------------------------------------//

        // equals
        System.out.println("xx.equals(y) = " + xx.equals(yy)); // false
        System.out.println("xx.equals(z) = " + xx.equals(zz)); // false or true? here false because scale differs

        /*
        equals behavior;
        equals compares both the unscaled value and the scale.
        x.equals(y) returns false because x has scale 1 (2.0) and y has scale 2 (2.00), so their representations differ.
        x.equals(z) also returns false because z has scale 0 (2); equals requires both the numeric value and the scale to be identical.
         */

        // hashCode
        System.out.println("xx.hashCode() = " + xx.hashCode());
        System.out.println("yy.hashCode() = " + yy.hashCode());
        System.out.println("zz.hashCode() = " + zz.hashCode());

        // HashSet behavior (uses equals/hashCode)
        Set<BigDecimal> hashSet = new HashSet<>();
        hashSet.add(xx);
        hashSet.add(yy);
        hashSet.add(zz);
        System.out.println("HashSet size = " + hashSet.size()); // likely 3

       // TreeSet uses natural ordering (compareTo)
        Set<BigDecimal> treeSet = new TreeSet<>();
        treeSet.add(xx);
        treeSet.add(yy);
        treeSet.add(zz);
        System.out.println("TreeSet size = " + treeSet.size()); // 1

        // Using compareTo-compatible normalization (need to normalize keys for HashSet)
        Set<BigDecimal> normalizedSet = new HashSet<>();
        normalizedSet.add(xx.stripTrailingZeros());
        normalizedSet.add(yy.stripTrailingZeros());
        normalizedSet.add(zz.stripTrailingZeros());
        System.out.println("Normalized HashSet size = " + normalizedSet.size()); // 1



        /*
        Practical notes and when to use which
        If you only need numeric equality or ordering, use -  compareTo == 0.
        If you need equality of both numeric value and exact representation (including scale), use - equals.
        If you want to use - If you want to use equals  to check numeric equality, normalize first (for example with stripTrailingZeros() ).
         */


        /*
        Normalization example and warning
        You can normalize the numeric representation by removing trailing zeros with :
        */
        BigDecimal ab = new BigDecimal("2.0");
        BigDecimal ba = new BigDecimal("2.00");

        BigDecimal na = ab.stripTrailingZeros();
        BigDecimal nb = ba.stripTrailingZeros();
        na.equals(nb); // => true
        /*
        Warning:  - stripTrailingZeros() can produce a negative scale
        (for example new BigDecimal("1000.00").stripTrailingZeros() may result in a negative scale).
        Take hash/equals behavior into account when a negative scale is present.
         */

//-------------------------------------------------------------------------------//

/*
 * String Conversions and Formatting
  	toString() provides a canonical representation.
 	toPlainString() is useful when you want to avoid scientific notation.
  	Double/float conversions require care: methods like / and choices such as  vs  produce different results; for financial output prefer String-based construction and explicit formatting.

 * Performance and Usage Notes
  	Performance trade-offs: BigDecimal uses arbitrary precision so it is slower and uses more memory than double/float; be careful in performance-critical loops.
  	Use case: preferred in financial and currency calculations because it prevents floating-point accumulation errors and allows explicit rounding control.

 * Common Pitfalls and Practical Tips
 	Avoid the double constructor; use the String constructor or .
 	For numeric equality check use  or normalize with  before calling .
  	For divisions that may not terminate, supply a MathContext or RoundingMode to  avoid .
  	For long comparisons and sorting, manage BigDecimals with a comparator consistent with  (for example ), because  and  have different semantics.
 */















    }
}
