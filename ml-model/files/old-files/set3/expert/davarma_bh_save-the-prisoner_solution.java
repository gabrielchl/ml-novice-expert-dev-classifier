import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i = 0 ; i < T ; i++){
            int N = input.nextInt();
            int M = input.nextInt();
            int S = input.nextInt();
            int pp = (S+M-1)%N;
            if(pp == 0){pp = N;}
            System.out.println(pp);
        }
    }
}
