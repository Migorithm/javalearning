package com.migorithm.PlayData.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<People> people = new ArrayList<People>();
        Student Amy = new Student("Amy",19);


        people.add(new People("길동"));
        people.add(new People("길봉"));
        people.add(new People("길상"));
        people.add(new People("길정"));
        people.add(Amy);

        for (People p:people){
            p.intro();

        }
        people.get(4).intro();

    }
}

