import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int i,j,k=0,j1,j2;
        j1=x1;j2=x2;
        for(i=0;i<=10000;i++)
        {
            if(j1==j2)
            {
                k=1;
                break;
            }
            j1+=v1;
            j2+=v2;
        }
        if(k==0)
            return "NO";
        else
            return "YES";

    }

}
