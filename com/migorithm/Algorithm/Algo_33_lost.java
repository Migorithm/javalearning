package com.migorithm.Algorithm;


import java.util.ArrayList;


public class Algo_33_lost {
    public static void main(String[] args) {
        Algo_33_lost A = new Algo_33_lost();
        System.out.println(A.solution(5, new int[]{ 2, 4}, new int[]{3})); //5
    }
    public int solution(int n, int[] lost, int[] reserve) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i : lost) {
            array.add(i);
        }
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i : reserve) {
            array2.add(i);
        }
        ArrayList<Integer> arr = (ArrayList<Integer>) array.clone(); //cloning for reusing the same elements when removing stuff from array2.
        array.removeAll(array2);
        array2.removeAll(arr);
        System.out.println(array);
        System.out.println(array2);

        for (int i =0; i <array.size();i++){
            for(int j =0 ; j <array2.size();j++){
                if (Math.abs(array.get(i)-array2.get(j)) == 1){
                    array.set(i,-1);
                    array2.set(j,-1);
                }
            }
        }
        Object[] ans = array.stream().filter(x -> x!=-1).toArray();
    return n-ans.length;
}
}
