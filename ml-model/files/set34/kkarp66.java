import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        return IntStream.of(queries)
                .map(i -> {
                    int effectiveIndex = Math.abs(a.length - (k % a.length) + i);
                    return (effectiveIndex > a.length - 1)
                            ? a[effectiveIndex % (a.length)]
                            : a[effectiveIndex];
                            }
                )
                .toArray();
    }

}
