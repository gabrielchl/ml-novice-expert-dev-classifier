import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static int solve(List<Integer> a) {
        ArrayList<Integer> al = new ArrayList<>();
        Collections.sort(a);
        int firstNum = a.get(0);
        for(int i = 1; i < a.size();i++){
            int secNum = a.get(i);
            if(Math.abs(firstNum - secNum) <=1) {
                if(al.isEmpty())
                {
                        al.add(firstNum);
                        al.add(secNum);
                }
                else
                {
                    int arNum = al.get(al.size()-1);
                    int arNumOne = al.get(0);
                    if(Math.abs(firstNum - arNum) <=1 && Math.abs(secNum - arNum) <=1
                            &&
                            Math.abs(firstNum - arNumOne) <=1 && Math.abs(secNum - arNumOne) <=1) {
//                        al.add(firstNum);
                        al.add(secNum);
                    }
                }
            }
            firstNum = secNum;
        }
        return al.size();
    }

}
