package com.company;

import java.util.Scanner;

 class VideoAdapter{
     private String nameV;
     private int TF;

    VideoAdapter()
    {
        this.TF=0;
        this.nameV="";

    }
     void InitCompPr(String one,int two)
     {
         nameV = one;
         TF = two;
     }
     void  InitVideoAdapter(VideoAdapter V)
    {

        this.TF=V.TF;
        this.nameV=V.nameV;

    }

    void EnterVideoAdapter()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные видеокарты:");
        System.out.print("Введите название:");
        nameV = in.nextLine();
        System.out.print("Введите кол-во ТерраФлопс:");
        TF = in.nextInt();
    }

    public   void  PrintVideoAdapter()
    {
        System.out.print("Название:");
        System.out.println(nameV);
        System.out.print("Террафлопсы:");
        System.out.println(TF);
    }

}
