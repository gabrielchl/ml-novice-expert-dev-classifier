import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int d = 0;
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt();
        int grade[] = new int[f];
		for(int i=0;i<f;i++){
			grade[i]=sc.nextInt();
		}
        for (int k = 0; k < f;k++) {
            if (grade[k] < 40) {
                if (grade[k] < 38) {
                    continue;
                }else if(grade[k] >= 38){
			d=grade[k];
                  while(d%5!=0){
                      
                      d++;
			if(d%5==0){
				grade[k]=d;
				break;
			}
			else{
				continue;
			}
                  }
                      }
            }
else{
                    int c = grade[k] % 5;
					int e=5-c;
                    if(e>=3){
				continue; 
				}
		else{
				grade[k]=grade[k]+e;
			}
                        }
                       }
					   for(int i=0;i<f;i++){
						   System.out.println(grade[i]);
					   }
    }
}
