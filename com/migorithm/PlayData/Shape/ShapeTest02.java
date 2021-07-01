package com.migorithm.PlayData.Shape;

import java.util.ArrayList;

public class ShapeTest02 {
    public static void main(String[] args) {
        ArrayList<Shape> sm = new ArrayList<Shape>();
        sm.add(new Triangle(7,5,"Blue"));
        sm.add(new Rectangle(4,6,"Blue"));
        sm.add(new Triangle(6,7,"Red"));
        sm.add(new Rectangle(8,3,"Red"));
        sm.add(new Triangle(9,8,"White"));
        sm.add(new Rectangle(5,7,"White"));


        System.out.println("기본정보");
        System.out.println();
//        String shapeType = null;

        sm.forEach(x -> {
            Shape s = (Shape) x;
            if (x instanceof Triangle){
                String shapeType = "Triangle";
                System.out.println(shapeType + "\t" + s.getArea() + "\t" + s.getColors());}
            if(x instanceof Rectangle) {
                String shapeType = "Rectangle";
                System.out.println(shapeType + "\t" + s.getArea() + "\t" + s.getColors());;
            }
        });


        System.out.println();
        System.out.println("사이즈 변경 후 정보");
        System.out.println();

        for (int i=0; i<sm.size();i++) {
            Shape s = (Shape) sm.get(i);
            if(s instanceof Triangle) {
                String shapeType = "Triangle";
                ((Triangle)s).setResize(5);
                System.out.println(shapeType + "\t" + s.getArea() + "\t" + s.getColors());
            }
            if(s instanceof Rectangle) {
                String shapeType = "Rectangle";
                ((Rectangle)s).setResize(5);
                System.out.println(shapeType + "\t" + s.getArea() + "\t" + s.getColors());
            }

        }

    }
}
