package com.company;

import java.util.Scanner;

 class Smartphone extends Gadget{
     private int Hz;
     private String TypeScreen;
     protected Processor P = new Processor();

    Smartphone()
    {
     counter++;
    }
    void InitComponent(String One,int Two,String Three,int Four,String Five,int Six)
    {
        InitGadget(One,Two);
        TypeScreen = Three;
        Hz = Four;
        P.InitCompPr(Five,Six);
    }
    void InitSmartphone(Smartphone S)
    {
InitGadget(S.name,S.mAh);
TypeScreen = S.TypeScreen;
Hz = S.Hz;
    }

    void EnterSmartphone()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные смартфона:");
        EnterGadget();
        System.out.print("Введите тип экрана:");
        TypeScreen = in.nextLine();
        System.out.print("Введите Частоту обновления:");
        Hz = in.nextInt();
    }
    public   void  PrintSmartphone()
    {
     PrintGadget();
        System.out.print("Цена:");
        System.out.println(Cost);

    }

}
