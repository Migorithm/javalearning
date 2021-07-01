package com.migorithm.PlayData.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame  {
    Panel p1,p2,p3,p4;
    Label la,lb;
    TextField txt_a,txt_b,txt_result;
    CheckboxGroup cbg;
    Checkbox rd1,rd2,rd3,rd4;
    Button bt;
    Calc my_calc;



    public MyFrame(){
        super("Encore_expcetion_handling");
        this.my_calc = new Calc();
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        la = new Label("A: ");
        lb = new Label("B: ");
        txt_a = new TextField(20);//meaning that it is the size of letters being seen at one sight.
        txt_b = new TextField(20);
        txt_result = new TextField(30);
        cbg = new CheckboxGroup(); //택일기능 (radiobutton)을 부여한다.
        rd1 = new Checkbox("+",cbg,false);
        rd2 = new Checkbox("-",cbg,false);
        rd3 = new Checkbox("*",cbg,true); //default
        rd4 = new Checkbox("/",cbg,false);
        bt = new Button("Ok");

    };


    public void go(){
        //레이아웃
        setFont(new Font("궁서",1,30));
        setLayout(new GridLayout(4,1));

        //p1
        p1.add(la);
        p1.add(txt_a);
        this.add(p1);

        // p2
        p2.add(lb);
        p2.add(txt_b);
        this.add(p2);

        //p3
        p3.add(rd1);
        p3.add(rd2);
        p3.add(rd3);
        p3.add(rd4);
        p3.add(bt);
        this.add(p3);

        //p4
        p4.add(txt_result);
        this.add(p4);
        this.setSize(new Dimension(1280,640));


        //이벤트 구현 #1 끄기.
        this.addWindowListener(new WindowAdapter(){ //bear in mind that it is an abstract class.
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });


        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txt_a.getText());
                int b = Integer.parseInt(txt_b.getText());
                my_calc.setA(a);
                my_calc.setB(b);
                String choosen = cbg.getSelectedCheckbox().getLabel();
                // choosen -> + - * /
                switch (choosen){
                    case "+":
                        txt_result.setText(String.valueOf(my_calc.getHap()));
                        break;
                    case "-":
                        txt_result.setText(String.valueOf(my_calc.getSub()));
                        break;
                    case "*":
                        txt_result.setText(String.valueOf(my_calc.getMul()));
                        break;
                    case "/":
                        txt_result.setText(String.format("%.1f",my_calc.getDiv()));
                        break;
                }
            }
        });


        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame =new MyFrame();
        frame.go();

    }



}