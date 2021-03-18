import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> solve(List<Integer> grades) {
        List<Integer> fin = new ArrayList<Integer>();

        for (int i = 0; i < grades.size(); i++)
        {
            int temp = grades.get(i);

            if(temp < 38)
            {
                fin.add(temp);
            }
            else
            {
                int near = 5 + 5*((int)Math.ceil(Math.abs(temp/5)));
                if((near - temp) < 3)
                {
                    fin.add(near);
                }
                else
                {
                    fin.add(temp);
                }
            }
        }
        return fin;
    }

}
