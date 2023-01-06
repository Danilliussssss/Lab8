package com.company;

import java.util.Scanner;

 class Processor {
     private float GHz;
     private String name;
     Processor()
    {
       this. GHz=0;
       this. name="";
    }
void InitCompPr(String one,int two)
{
    name = one;
    GHz = two;
}

  void  InitProcessor(Processor Pr)
    {
        this.GHz=Pr.GHz;
        this.name=Pr.name;
    }
    void EnterProcessor()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные процессора:");
        System.out.print("Введите название:");
        name = in.nextLine();
        System.out.print("Введите частоту ядра:");
        GHz = in.nextInt();
    }
void PrintProcessor()
{
    System.out.print("Название:");
    System.out.println(name);
    System.out.print("Частота ядра:");
    System.out.println(GHz);
}
}
