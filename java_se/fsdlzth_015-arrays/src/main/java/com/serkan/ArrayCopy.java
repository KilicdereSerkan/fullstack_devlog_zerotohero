package com.serkan;

import java.util.Arrays;

class MyObj {
    String name;
    int[] data;
    MyObj(String name, int[] data) { this.name = name; this.data = data == null ? null : data.clone(); }
    MyObj(MyObj other) { this.name = other.name; this.data = other.data == null ? null : other.data.clone(); }
    public String toString() { return name + Arrays.toString(data); }
}

class Example {
    public static void main(String[] args) {
        // Primitives: copies values
        int[] src = {1, 2, 3};
        int[] dst = Arrays.copyOf(src, src.length); // copies values
        src[0] = 9; // mutating src does not affect dst

        // Objects: deep copy by copying each element
        MyObj[] original = {
                new MyObj("A", new int[]{1,2}),
                new MyObj("B", new int[]{3,4})
        };
        MyObj[] deep = new MyObj[original.length];
        for (int i = 0; i < original.length; i++) {
            deep[i] = original[i] == null ? null : new MyObj(original[i]); // use copy constructor
        }
        original[0].data[0] = 99; // mutate original to show deep copy

        System.out.println("src: " + Arrays.toString(src));
        System.out.println("dst: " + Arrays.toString(dst));
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("deep: " + Arrays.toString(deep));
    }
}

/*
console;

src: [9, 2, 3]
dst: [1, 2, 3]
-----
original: [A[99, 2], B[3, 4]]
deep: [A[1, 2], B[3, 4]]
 */