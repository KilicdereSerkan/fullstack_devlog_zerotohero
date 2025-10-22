package com.serkan;


import java.math.BigInteger;

public class BigIntegerMain {
    static void main() {
/*
BigInteger Overview

BigInteger is a Java class for representing integers larger than primitive types (int, long).
It supports arbitrary precision integer arithmetic limited only by available memory and provides exact integer operations.

Key Features
• 	Arbitrary precision: Bit length is dynamically allocated so integers can grow without a fixed limit.
• 	Immutable: Every arithmetic operation returns a new BigInteger instance; existing instances do not change.
• 	Extends Number and implements Comparable: Enables numeric conversions and sorting.

Constructors and Conversions
• 	From String: new BigInteger("12345678901234567890");
• 	With radix: new BigInteger("FF", 16);
• 	From byte array: new BigInteger(byteArray);
• 	From long: BigInteger.valueOf(longValue);
• 	To primitive types: intValue(), longValue(), byteValue(), etc.

Basic Operations and Usage
• 	Addition: a.add(b)
• 	Subtraction: a.subtract(b)
• 	Multiplication: a.multiply(b)
• 	Division: a.divide(b)
• 	Other useful methods: mod, modPow, gcd, compareTo, abs, negate, pow


Performance and Practical Notes
• 	Cost: Large integers increase memory and CPU usage; heavy arithmetic on huge numbers may be slow.
• 	Use case: For fractional or decimal high-precision needs, prefer BigDecimal; BigInteger is for integers only.

Quick Decision Guide
• 	If integer range of primitives is insufficient use BigInteger.
• 	If decimal precision or financial rounding is required use BigDecimal.

 */

        BigInteger a = new BigInteger("123456789012345678901234567890");
        BigInteger b = BigInteger.valueOf(42);

        BigInteger sum = a.add(b);
        BigInteger prod = a.multiply(b);
        BigInteger pow = b.pow(10);
        BigInteger gcd = a.gcd(b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
        System.out.println("Power: " + pow);
        System.out.println("GCD: " + gcd);


/*
Advanced BigInteger Notes
- Modular arithmetic: Methods mod, modPow(base, exp, mod), and modInverse(mod) are commonly used in cryptography and fast exponentiation;
modPow computes large exponents efficiently.
- Primality and prime generation: isProbablePrime(certainty) provides a probabilistic primality test;
probablePrime(bitLength, rnd) generates a random probable prime.
- Bit-level operations: Methods such as testBit, setBit, clearBit, flipBit, and getLowestSetBit let you operate on individual bits;
use shiftLeft and shiftRight for shifting.
- Two's‑complement representation: BigInteger internally uses two's‑complement; when constructing from a byte[],
the highest bit affects the sign, so be careful with negative values.
- Immutability and memory: Every operation returns a new object; intensive arithmetic produces many temporary objects,
increasing GC and memory overhead. For performance-critical code consider algorithmic optimizations or lower-level libraries.
- Constants and helpers: Common constants BigInteger.ZERO, ONE, TEN and the valueOf(long) factory are frequently used;
prefer valueOf over new BigInteger(String) for small long values.
- Conversions and radices: Use toString(radix) for output in different bases and new BigInteger(String, radix) for input;
when converting to/from byte[] watch sign bit and leading zeros.
- Division behavior: divide and remainder follow Java integer division rules (ArithmeticException on division by zero,
sign rules for negative/positive); floorDivandfloorMod` are useful in specific scenarios.
- No exact-overflow checks: BigInteger does not overflow, so there are no addExact-style overflow exceptions;
handle unexpected large values at the application level.
- Use cases: Suitable for cryptography (RSA, DSA), number theory, large combinatorial calculations, and any domain requiring exact integer arithmetic.
- Performance tips: Avoid recreating the same BigInteger repeatedly in tight loops; consider algorithmic changes
(e.g., Montgomery modular multiplication, Karatsuba multiplication) or libraries that provide native optimizations.
- Thread-safety: BigInteger is immutable and therefore safe to read concurrently from multiple threads.
 */

    }
}