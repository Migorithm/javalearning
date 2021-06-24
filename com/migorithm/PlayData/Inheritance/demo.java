package com.migorithm.PlayData.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Parent>lst = new ArrayList<Parent>(); //by upcasting, it can get all the child class converge on one Array!
        lst.add(new Child1());
        lst.add(new Child2());
        lst.add(new Child3());
        lst.add(new Child4());

        for(Parent p:lst){
            p.work();
        }
        Child1 c1 = (Child1)lst.get(0);
        c1.relax();

        Parent parent = getChild("2");
        parent.work();
    }

    public static Parent getChild(String childName){
        Parent p = null;
        if(childName.equals("1")){
            p = new Child1();
        }
        else if(childName.equals("2")){
            p = new Child2();
        }
        else if(childName.equals("3")){
            p = new Child3();
        }
        else if(childName.equals("4")){
            p = new Child4();
        }
        return p;

    }

}
