import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        //int a[]=new int[10];
        int n=s.nextInt();
        int a[]=new int[n];
        int k=s.nextInt();
        int in=s.nextInt();
        int c[]=new int[in];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<in;i++)
        {
            c[i]=s.nextInt();
        }
        int g=0;
        while(g<k)
        {
            int index=a[n-1];
            for(int i=n-1;i>0;i--)
            {
            a[i]=a[i-1];
            }
            a[0]=index;
            g=g+1;
        }
        for(int i=0;i<a.length;i++)
        {
            int flag=1;
            for(int j=0;j<c.length;j++)
            {
                if(i==c[j])
                {
                    flag=0;
                    break;
                }
                else
                {
                    continue;
                }
            }
            if(flag==0)
            {
                System.out.println(a[i]);
            }
        }
        
    }
}
