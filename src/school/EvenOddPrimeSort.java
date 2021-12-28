package school;

import java.util.Scanner;

public class EvenOddPrimeSort {
    public static void main(String[] args) {
        int a[]=new int[20];
        int even[]=new int[20];
        int odd[]=new int[20];
        int prime[]=new int[20];
        int e,o,p;
        e=o=p=0;
        System.out.println("Enter 20 numbers");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<20;i++)
            a[i]= sc.nextInt();
        for(int i=0;i<20;i++) {
            if(a[i]%2==0)
                even[e++]=a[i];
            else
                odd[o++]=a[i];
            int c=0;
            for(int j=a[i];j>1;j--)
                if(a[i]%j==0)
                    c++;
            if(c==1)
                prime[p++]=a[i];
        }
        int res[]=new int[e+o+p];
        int r=0;
        for(int t=0;t<e;t++)
            res[r++]=even[t];
        for(int t=0;t<o;t++)
            res[r++]=odd[t];
        for(int t=0;t<p;t++)
            res[r++]=prime[t];
        for(int t:res)
            System.out.print(" "+t);
    }
}
