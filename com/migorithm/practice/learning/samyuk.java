package com.migorithm.practice.learning;


public class samyuk {
    public static void main(String[] args) {
        //369게임!  말하면 안됌.  ~100까지.
        for (int i=1 ; i <=100 ; i++) {
            String num ;
            //casting.
            num = Integer.toString(i);
            int cnt =0;
            for (int j=0;j < num.length() ;j++){
                if (num.charAt(j) == '3'){
                    cnt+=1;}
                else if(num.charAt(j) == '6'){
                    cnt+=1;
                }
                else if(num.charAt(j) == '9'){
                    cnt+=1;
                }
            }
            if (cnt == 1){
                System.out.println(num + " 짝");
            }
            else if (cnt==2){
                System.out.println(num + " 짝짝");}
            else{
                System.out.println(num);
            }}}

    }




