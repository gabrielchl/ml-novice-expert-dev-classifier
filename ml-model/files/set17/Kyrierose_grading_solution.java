import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
	   int []res = new int[grades.length];
        for(int i=0;i<grades.length;i++){
		  if(grades[i] < 38)
			res[i] = grades[i];
		  else{
			if(grades[i] % 5 == 3 ||grades[i] % 5 == 4)
				res[i] = grades[i] +  java.lang.Math.abs((grades[i] % 5)-5);
		    else
                res[i] = grades[i];
          }
	    }
	   return res;
    }

}
