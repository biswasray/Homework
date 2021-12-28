package algo;

import java.util.ArrayList;

public class BackTracking {
    static ArrayList<Integer> res=new ArrayList<>();
    public static boolean fun(int a[],int i,int sum,int t) {
        if(i>=a.length)
            return false;
        if(sum+a[i]==t) {
            res.add(i);
            return true;
        }
        if(fun(a,i+1,sum+a[i],t)) {
            //System.out.println(i);
            res.add(i);
            return true;
        }
        if(fun(a,i+1,sum,t)) {
            //System.out.println(i);
            //res.add(i);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={5,8,9,23,0,8,81,2};
        int tar=10;
        if(fun(arr,0,0,tar)) {
            System.out.println("Found");
            System.out.println(res.toString());
        }
    }
}
