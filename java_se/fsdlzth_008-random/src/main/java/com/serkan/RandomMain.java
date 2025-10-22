    package com.serkan;


    import java.util.ArrayList;
    import java.util.Random;
    import java.util.List;

    import java.util.Collections;




    public class RandomMain {
        static void main() {
    /*
            Overview of java.util.Random
            java.util.Random is a class that generates pseudo-random values of several Java primitive types and streams of those values. It is deterministic when you give it the same seed and is intended for general-purpose use rather than cryptography.

            Constructors and seeding
                    - Random() creates a generator seeded from a system-dependent source of entropy so outputs differ each run.
            - Random(long seed) creates a generator that will produce the same sequence of values every time you construct it with the same seed.

     */
            // example

                    Random r1 = new Random();           // seeded from system time/entropy: different each run
                    Random r2 = new Random(12345L);     // deterministic seed: same outputs each run

                    System.out.println(r1.nextInt());   // unpredictable across runs
                    System.out.println(r2.nextInt());   // predictable: same on every run


    /*
            Common methods with examples
            - nextInt() and nextInt(bound)
            */

                    Random rnd = new Random();

    // nextInt(): returns any int (positive, negative, zero)
            int anyInt = rnd.nextInt();  // full 32-bit range

    // nextInt(bound): returns 0 (inclusive) to bound (exclusive)
    // bound must be positive, otherwise throws IllegalArgumentException
            int zeroToNine = rnd.nextInt(10); // values 0..9


            //- nextBoolean(), nextFloat(), nextDouble()
            boolean b = rnd.nextBoolean(); // true or false, ~50/50
            float f = rnd.nextFloat();     // 0.0 (inclusive) to 1.0 (exclusive)
            double d = rnd.nextDouble();   // 0.0 (inclusive) to 1.0 (exclusive)


          //  - nextLong(), nextBytes(byte[]), nextGaussian()
            long l = rnd.nextLong();       // 64-bit signed random value

            byte[] buf = new byte[8];
            rnd.nextBytes(buf);            // fills array with random bytes

            double gaussian = rnd.nextGaussian(); // normal distribution, mean 0.0, std dev 1.0


           // Each method draws bits from the generator’s internal state and returns the requested type; nextInt(bound) maps the raw bits into the requested range while preserving uniform distribution for positive bounds.


          //  - Random selection from an array:
            String[] colors = {"red","green","blue","yellow"};
            String pick = colors[rnd.nextInt(colors.length)]; // uniform pick




     /*
            Streams and protected next(int bits)
            - Java Random exposes stream-producing methods such as ints(), longs(), and doubles() that return IntStream/LongStream/DoubleStream of random values useful with the Stream API.
            - The protected method next(int bits) is the low-level hook that subclasses use to produce pseudorandom bits; higher-level methods build on it.
            Example creating a stream of 5 random ints 0..99:

      */
    // Requires Java 8+
            rnd.ints(5, 0, 100) // produces IntStream of 5 ints in [0,100)
                    .forEach(System.out::println);

    /*

            Thread-safety, portability, and cryptography notes
            - Instances of Random are thread-safe for concurrent use but contend on a single shared seed state if many threads share the same Random, which can become a bottleneck; consider ThreadLocalRandom for multithreaded scenarios.
            - The Random algorithm and behavior are specified so Java code is portable, but subclasses may use different algorithms as long as they honor method contracts.
            - java.util.Random is not cryptographically secure; use java.security.SecureRandom for cryptographic needs.

     */
    /*
            Practical tips and common pitfalls
                    - Do not create a new Random repeatedly in tight loops using the no-arg constructor; it may use the same seed if created in very short time intervals, producing duplicate sequences. Create one Random and reuse it.
            - To reproduce test cases, store and reuse a fixed seed.
                    - For multithreaded code prefer ThreadLocalRandom (java.util.concurrent) to avoid contention.
            - For security-sensitive randomness, use SecureRandom instead of Random.

     */



        }
            /*
            How to use Random for common tasks (with code)
            - Random integers inside an arbitrary range [min, max]:
            */

        int randInRange(Random rnd, int min, int max){
            // assumes min <= max
            int bound = max - min + 1;
            return rnd.nextInt(bound) + min; // maps 0..(bound-1) into min..max

        }

        //- Shuffling a list (Fisher–Yates):
        int i;
        List<int[]> list = new ArrayList<int[]>();
        void shuffleList(List<?> list, Random rnd) {
            // Use Collections.shuffle(list, rnd) in real code.
            for (int i = list.size() - 1; i > 0; i--) {
                int j = rnd.nextInt(i + 1); // 0..i
                Collections.swap(list, i, j);
            }
        }

    }
