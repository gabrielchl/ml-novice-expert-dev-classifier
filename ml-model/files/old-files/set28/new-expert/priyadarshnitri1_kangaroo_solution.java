import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
            if(x1>x2 && v1>=v2)
                return "NO";
            else if(x2>x1 && v2>=v1)
                return "NO";
            else if((x1==x2) && (v1!=v2))
                return "NO";
            else if((v1==v2) && (x1!=x2))
                return "NO";
            else
            {
                int newX1=x1, newX2=x2, jCnt1=0, jCnt2=0;
                while(true)
                {
                    newX1=newX1+v1;
                    newX2=newX2+v2;
                    jCnt1++;
                    jCnt2++;
                    if(newX1==newX2 && jCnt1==jCnt2)
                        return "YES";
                    else if(newX1>newX2 && v1>v2)
                        return "NO";
                    else if(newX2>newX1 && v2>v1)
                            return "NO";
                    else if((newX1==newX2) && (v1!=v2))
                            return "NO";
                    else if((v1==v2) && (newX1!=newX2))
                            return "NO";
                }

            }

    }

}
