import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> solve(List<Integer> grades) {

        ArrayList<Integer> newGradeList= new ArrayList<>();

        for(int i = 0; i < grades.size(); i++){

            if(grades.get(i)>37){
                if((grades.get(i) % 5)> 2){
                    newGradeList.add((grades.get(i) - (grades.get(i) % 5))+5);
                }
                else{
                    newGradeList.add(grades.get(i));

                }

            }
            else{
                newGradeList.add(grades.get(i));
            }


        }

        return newGradeList;
    

    }

}
