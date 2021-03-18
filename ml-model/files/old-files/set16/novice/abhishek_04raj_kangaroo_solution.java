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
        int flag=0;
        
        while(x1!=x2){
            if(x2>x1 && v2>=v1){
            break;
        }
            if(x1>x2 && v1>=v2)
            	break;
            x1+=v1;
            x2+=v2;
            if(x1==x2){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
