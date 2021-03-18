import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {


        ArrayList<Integer> stock = new ArrayList<Integer>();
        ArrayList<Integer> stockCount = new ArrayList<Integer>();

        for(int i = 0; i < ar.length; i++)
        {
            if(i == 0)
            {
                stock.add(ar[i]);
                stockCount.add(1);
            }
            else
            {
                if(stock.contains(ar[i]))
                {
                    int idx = stock.indexOf(ar[i]);
                    stockCount.set(idx, stockCount.get(idx)+1);
                }
                else
                {
                    stock.add(ar[i]);
                    stockCount.add(1);
                }
            }
        } // end for loop

        int match = 0;
        for (int i = 0; i < stockCount.size(); i ++)
        {
            match += stockCount.get(i) / 2;


        }

        return match;
    } // end method

}
