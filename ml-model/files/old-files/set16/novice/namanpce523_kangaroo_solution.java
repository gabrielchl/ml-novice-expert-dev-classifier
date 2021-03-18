import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int maxDiff = 0;
        
            if(v1>v2)maxDiff = v1;
            else maxDiff = v2;
            
            for(; ;){
				
                    x1 =x1+v1;
                    x2 =x2+v2;
          //      System.out.print(x1+" "+x2);
						if(x1==x2){
                        System.out.print("YES"); break;
                    }else {int diff =0;
                            if (x1>x2)  diff = x1-x2;
                             else diff = x2-x1 ;
                           
                        if (diff > maxDiff  ) {
                            System.out.print("NO"); break;
                        }
                    }
            }
                 
    }
}
