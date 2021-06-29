package com.migorithm.PlayData.Try_Catch;

public class Runtime_test {
        public void sayNick(String nick) {
            try{
                System.out.println("이름을 봅시다... ");
            if("fool".equals(nick)) {
                throw new Runtime_pr();
            }}
            catch (Runtime_pr r){
                System.out.println("you are fool!");
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }

        public static void main(String[] args) {
            Runtime_test test = new Runtime_test();
            test.sayNick("fool");
            test.sayNick("genious");
        }
    }

