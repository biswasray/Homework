package exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
    static ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    static void fun(ArrayList<Integer> A,int B,int sum,int index,ArrayList<Integer> op) {
        if(sum==B) {
            res.add(op);
            return;
        }
        if(sum>B)
            return;
        for (int i=index;i<A.size();i++) {
            ArrayList<Integer> temp=(ArrayList<Integer>) op.clone();
            temp.add(A.get(i));
            fun(A,B,sum+A.get(i),i,temp);
        }
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        ArrayList<Integer> t=new ArrayList<>();
        fun(A,B,0,0,t);
        return res;
    }

    public static void main(String[] args) {
         ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(2,5,6,7));
         System.out.println(combinationSum(arr,16));
    }
}
