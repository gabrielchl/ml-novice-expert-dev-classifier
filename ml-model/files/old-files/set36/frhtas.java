import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = new int[p.length];
        int index = 0;

        for (int i = 0; i < p.length; i++) {
            list.add(p[i]);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= p.length; i++) {
            list2.add(list.indexOf(i) + 1);
        }

        for (int i = 0; i < p.length; i++) {
            array[index] = list.indexOf(list2.get(i)) + 1;
            index++;
        }

        return array;
    }

}
