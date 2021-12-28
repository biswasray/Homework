package school;

import java.util.Scanner;

public class Diff3rdLarge2ndSmall {
    public static void main(String[] args) {
        int a[]=new int[10];
        System.out.println("Enter 10 numbers");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<10;i++)
            a[i]= sc.nextInt();
        for(int i=0;i<10;i++) {
            for(int j=i+1;j<10;j++) {
                if(a[j]>a[i]) {
                    a[i]+=a[j];//int t=a[i];
                    a[j]=a[i]-a[j];//a[i]=a[j];
                    a[i]=a[i]-a[j];//a[j]=t;
                }
            }
        }
        System.out.print("Diff. of 3rd Largest and 2nd smallest = "+(a[2]-a[8]));
    }
}
