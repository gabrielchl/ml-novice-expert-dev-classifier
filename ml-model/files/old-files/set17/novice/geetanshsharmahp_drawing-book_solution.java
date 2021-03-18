import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution
{
    static int solve(int n, int p)
    {
        int b=0;
        int end_page=0;
        int front=p/2;
        int back=n/2-p/2;
        if(front>back)
            b=back;
        else
            b=front;
        System.out.println(""+Math.abs(b));
    }



    }
