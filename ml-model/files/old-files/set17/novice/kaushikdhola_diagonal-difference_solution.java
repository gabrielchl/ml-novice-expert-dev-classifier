import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int n, int[][] a) {
    /*for(int i=0;i<=a.length-1;i++)
    {
        for(int j=0;j<=a.length-1;j++)
        {
            System.out.print(a[i][j]+" ");
        }
    System.out.println("");
    }*/
    int length=a.length;
    int sum1=0;
    int sum2=0;
    for(int k=0;k<=a.length-1;k++)
    {
        //System.out.print(a[k][k]+" ");
        sum1=sum1+a[k][k];
    }
     int h=0;


     int number=length-1;
    for(int l=number;l>=0;l--)
    {


        sum2=sum2+a[h][l];
      //  System.out.print(a[h][l]+" ");
        h++;
    }


  //System.out.println(sum1);
    //System.out.println(sum2);

    int result=sum1-sum2;

    if(result < 0){

        System.out.println(Math.abs(result));
    }
    else{
    System.out.println(result);
    }
    }
}
