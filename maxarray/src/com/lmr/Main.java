package com.lmr;

public class Main {

    public static void main(String[] args) {
        int []a={-2,1,-3,4,-1,2,1,-5,4};
        Solution solution=new Solution();
        int maxarr=solution.maxSubArray(a);
        System.out.println(maxarr);
    }
}
