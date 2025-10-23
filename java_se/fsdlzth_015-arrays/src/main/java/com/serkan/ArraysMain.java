package com.serkan;

import java.util.Arrays;

public class ArraysMain {
    static void main() {
/*
        Arrays Overview
        An array is an ordered container that holds a fixed number of elements of the same type.In Java arrays are
        objects and provide a built - in length property;
        their size is fixed at creation and indexing starts at 0.

 */

        //       Declaration and Initialization
        //              - Declaration syntax examples.
// Two common declaration styles
        int[] nums;       // preferred
        String names[];   // also valid


        //      -Create with size (elements set to default values).
        int[] a = new int[5];    // five ints, all 0 by default
        String[] s = new String[3]; // three Strings, all null by default


        //       -Create with initializer (length inferred).
        int[] b = new int[]{1, 2, 3};
        int[] c = {4, 5, 6};      // shorthand literal


        //       Console output showing defaults and initialized arrays:
 /* Console
        a: [0, 0, 0, 0, 0]
        s: [null, null, null]
        b: [1, 2, 3]
        c: [4, 5, 6]

  */

 /*
             Arrays can store primitives and objects;
        when storing objects the array holds references to those objects.

  */

//        Accessing Elements, Indexing, and Bounds
        //               - Access by index;
        //       first element at index 0;
        //      last at length - 1.
        int[] x = {10, 20, 30};
        System.out.println(x[0]);            // prints 10
        System.out.println(x[x.length - 1]);   // prints 30


        //      -Out of bounds example(throws runtime exception).
        int[] xx = {1, 2, 3};
        System.out.println(xx[3]); // ArrayIndexOutOfBoundsException

/*
        Console:
        10
        30
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:Index 3 out of bounds for length 3

 */




 /*
        Iteration Patterns (with examples)
        -Classic for -loop.
  */

        int[] arr = {2, 4, 6, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i=" + i + " value=" + arr[i]);
        }


//        -Enhanced for -loop.
        for (int v : arr) {
            System.out.println(v);
        }


        //       -Using java.util.Arrays to print.

        System.out.println(Arrays.toString(arr));

/*
        Console:
        i = 0 value = 2
        i = 1 value = 4
        i = 2 value = 6
        i = 3 value = 8
        2
        4
        6
        8
                [2, 4, 6, 8]

 */


//        Copying, Aliasing, Shallow vs Deep
        //       -Assignment copies reference, not contents(aliasing).
        int[] aa = {1, 2, 3};
        int[] bb = aa;        // b references same array
        bb[0] = 99;
        System.out.println(Arrays.toString(a)); // [99, 2, 3]


//        -Shallow copy(arrays of objects copy references).
        StringBuilder[] sb = {new StringBuilder("a"), new StringBuilder("b")};
        StringBuilder[] sbCopy = sb.clone(); // shallow copy
        sbCopy[0].append("X");
        System.out.println(sb[0]); // prints aX







/*
        Java arrays are objects with reference semantics;
        cloning an array of references does not clone the referenced objects.

 */
/*
                Multidimensional Arrays
        -Java supports arrays of arrays;
        rows may vary in length.
 */
        int[][] matrix = new int[2][3]; // 2 rows, 3 columns
        matrix[0][1] = 5;
        int[][] ragged = new int[3][];
        ragged[0] = new int[2];
        ragged[1] = new int[4];
        ragged[2] = new int[1];


//        -Initialize literal.
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6}
        };

/*
        Console:
        matrix: [[0, 5, 0], [0, 0, 0]]
        m[1][2]:6
        ragged row lengths:
        2, 4, 1

 */


        //      Multidimensional arrays are implemented as arrays of arrays rather than contiguous multi -dimensional blocks.

        //              Useful Utility Methods (java.util.Arrays)
        //              - Sorting, searching, filling, equals, toString, copyOf.

        int[] z = {5, 1, 9};
        Arrays.sort(z);                 // sorts in place
        int idx = Arrays.binarySearch(a, 9);
        int[] t = Arrays.copyOf(a, 5);  // extend with zeros
        Arrays.fill(t, 3, 5, -1);       // fill range with -1
        System.out.println(Arrays.equals(z, new int[]{1, 5, 9}));
        System.out.println(Arrays.toString(t));

/*
        Console:
        z after sort: [1, 5, 9]
        idx:
        2
        t: [1, 5, 9, -1, -1]
        true

 */

/*
        Common Pitfalls and Best Practices
                - Remember arrays are fixed - size;
        use ArrayList when size must vary.
        -Watch for ArrayIndexOutOfBoundsException;
        always use length.
                - When copying arrays of objects, choose shallow vs deep carefully.
        -Prefer int[] x declaration style and Arrays.toString for debugging.
                - Use Arrays.copyOf and System.arraycopy for fast copies.

 */
/*
        Practical Example:Small Program with Multiple Concepts
        Complete runnable program illustrating declaration, loops, copying, multidimensional arrays, and utilities.

 */


        int[] numsx = {3, 1, 4, 1, 5};
        System.out.println("Original: " + Arrays.toString(numsx));

        // sort and search
        Arrays.sort(numsx);
        System.out.println("Sorted: " + Arrays.toString(numsx));
        System.out.println("Index of 4: " + Arrays.binarySearch(numsx, 4));

        // copy and mutate
        int[] alias = numsx;                 // alias
        int[] copy = Arrays.copyOf(numsx, numsx.length);
        alias[0] = 99;
        System.out.println("After alias change, nums: " + Arrays.toString(numsx));
        System.out.println("Copy unaffected: " + Arrays.toString(copy));

        // 2D array example
        int[][] table = {{1, 2}, {3, 4, 5}};
        System.out.println("Table row lengths: " + table[0].length + ", " + table[1].length);
        System.out.println("Table toString (shallow): " + Arrays.toString(table));
        System.out.println("Deep toString: " + Arrays.deepToString(table));
/*
        Console:
        Original: [3, 1, 4, 1, 5]
        Sorted: [1, 1, 3, 4, 5]
        Index of 4:3
        After alias change, nums: [99, 1, 3, 4, 5]
        Copy unaffected: [1, 1, 3, 4, 5]
        Table row lengths:
        2, 3
        Table toString (shallow): [[I @ 15d b9742, [I @ 6d 06d 69 c]
        Deep toString: [[1, 2], [3, 4, 5]]

 */

/*
        Quick Summary
        -Arrays are fixed -size objects holding same - typed elements with zero - based indexing.
                - Assignment copies references;
        clone / copy methods differ between shallow and deep copying.
                - Multidimensional arrays are arrays of arrays and can be ragged.
                - Use java.util.Arrays for common operations like sort, copy, fill, and printable string
        representations.

 */


    }
}
