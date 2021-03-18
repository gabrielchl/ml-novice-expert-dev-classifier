import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
            int temp=1;
            do{

                if(x1+v1 == x2+v2){
                    return "YES";
                }
                System.out.println("value : "+(x1+v1)+"  "+(x2+v2));
                x1=x1+v1;
                x2=x2+v2;
                temp++;
            }while(temp<=10000);
            return "NO";

    }

}
