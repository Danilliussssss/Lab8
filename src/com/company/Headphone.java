package com.company;
import java.util.Map;
import java.util.Scanner;
class Headphone extends Gadget{
   private int Radius;
   private String Color;


    Headphone()
    {
        counter++;
    }
   void  InitHeadphone(Headphone H)
    {
        InitGadget(H.name,H.mAh);
        Radius=H.Radius;
        Color=H.Color;
    }
    void InitComponent(String one,int two,String Three,int Four)
    {
        InitGadget(one,two);
        Color = Three;
        Radius = Four;
    }
 static void Counter()
 {
     counter=0;
 }

    void EnterHeadphone()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные наушников:");
        EnterGadget();
        System.out.print("Введите Цвет:");
        Color = in.nextLine();
        System.out.print("Введите Радиус действия:");
        Radius = in.nextInt();


    }

     void  PrintHeadphone()
    {
        PrintGadget();
        System.out.print("Цвет:");
        System.out.println(Color);
        System.out.print("Радиус действия:");
        System.out.println(Radius);
        System.out.print("Цена:");
        System.out.println(Cost);

    }


}

