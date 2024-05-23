package yang.test;

import java.util.LinkedList;
import java.util.List;

class Solution {
    static List<List<Integer>> res = new LinkedList<>();

    public static void main(String[] args) {
        combinationSum3(3,9);
        System.out.println(res);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k,n,1,new LinkedList<Integer>());
        return res;
    }

    private static void backtrack(int k, int sum, int value, LinkedList<Integer> list){
        if(k == 0){
            if(sum == 0){
                res.add(new LinkedList(list));
            }
            return ;
        }
        for(int i = value;i < 10; i++ ){
            if(sum-i < 0) {
                return;
            }
            list.add(i);
            backtrack(k-1,sum-i,i+1,list);
            list.removeLast();
        }
    }
}
