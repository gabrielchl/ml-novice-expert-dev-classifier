import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(List<Integer> arr) {
        int maxCounter = 0;
        int element=0;
        for (int i = 0; i <arr.size() ; i++) {
            int counter =1;
            for (int j = i+1; j <arr.size() ; j++) {
                if(arr.get(i)==arr.get(j)){
                    counter++;
                }
            }
            if(maxCounter<counter){
                maxCounter=counter;
                element = arr.get(i);
            }
        }
        return element;
    }

}
