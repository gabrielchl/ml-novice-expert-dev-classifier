
import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Solution {


    public static void main(String[] args)  {
    HashSet<Integer> socks=new HashSet();        
    
    Scanner scanner = new Scanner(System.in);
    
    int output,size,count=0;;
    size=scanner.nextInt();
    int[] arr=new int[size];
    
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=scanner.nextInt();   
    }

    

    for(int j=0;j<arr.length;j++)
    {
        int e=arr[j];
        if(socks.contains(e))
        {
            socks.remove(e);
        count++;
        }
        else
        {
            
            socks.add(e);
            
        }
    }
    System.out.println(count);


    }
}
