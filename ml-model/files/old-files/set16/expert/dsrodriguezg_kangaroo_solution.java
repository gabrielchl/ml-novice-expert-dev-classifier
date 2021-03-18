import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        
        int [] k1 = new int[1000];
        int [] k2 = new int[1000];
        String respuesta = "NO";
        
        int cont1 = x1;
        int cont2 = x2;
       
        for(int i=0; i<1000; i++){
            
            
            k1[i] = cont1;
            cont1 += v1;
            
            k2[i] = cont2;  
            cont2 += v2;
                        
            
        }
   
        for(int i=0; i<1000;i++){
            
           if(k1[i]==k2[i]){                
                
               respuesta = "YES";
               break;
            }
            
        }
        
        return respuesta;         
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
