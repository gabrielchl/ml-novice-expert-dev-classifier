import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> solve(List<Integer> grades)
    {
        List<Integer> updatedIntegers = new ArrayList<>();

        for(int eachGrade: grades)
        {
            int updatedGrade = eachGrade;
            int nextFiveMultiple = (eachGrade - (eachGrade % 5)) + 5;
            if(eachGrade >= 38 && nextFiveMultiple - eachGrade < 3)
            {
                updatedGrade = nextFiveMultiple;
            }
            updatedIntegers.add(updatedGrade);
        }
        return updatedIntegers;

    }

}
