import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
          int result[] = new int[p.length];
          for(int x=0; x<p.length; x++) {
              int a = 0;
              for(int i=0; i<p.length; i++){
                  if(p[i] == x+1) {
                    a = i+1;
                    for(int j=0; j<p.length; j++) {
                        if(p[j] == a) {
                            result[x] = j+1;
                        }
                    }
                  }
              }
          }
          return result;
    }

}
