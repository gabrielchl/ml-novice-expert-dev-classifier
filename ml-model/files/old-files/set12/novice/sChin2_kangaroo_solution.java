import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        for(int i=0;i<=10000;i++)
        {       if(x1==x2){
                    System.out.println("YES");
                    System.exit(0);
                }    
                else if(v1 < v2)
                {
                    System.out.println("NO");
                    System.exit(0);
                }
                else{
                    x1 = x1 + v1;
                    x2 = x2 + v2;
                }
        }
        System.out.println("NO");
    }
}
