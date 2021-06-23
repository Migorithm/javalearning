package com.migorithm.PlayData;
interface Horrible{
    String Migo(String a);

}



public class Lambda_1 {
    public static void main(String[] args) {
        Horrible s = (name) ->  name +"씨 안녕하세요"; //easy form
        ;

        System.out.println(s.Migo("gg"));


        System.out.println(Mago("주영")); // hard form
        Horrible a = (b)->{
            int e =  b.length();
            while (e >0){
                System.out.println(b);
                e--;
            }
            return "루핑 끝";
        };
        System.out.println(a.Migo("민회님 열공!"));

    }

    public static String Mago(String xName) {
        return xName+"씨 안녕하세요";
    }

}
