package com.company;
import java.util.*;

class Gadget implements  Comparable<Gadget>{
protected String name;
protected int mAh;
     protected static int counter=0;
     protected static int Cost;



    Gadget(){

     counter++;
 }
     @Override
   public  int compareTo(Gadget G)
     {
         return this.name.compareTo(G.name);
     }
Gadget EnterGadget()
        {
            Scanner in=new Scanner(System.in);
            System.out.print("Введите название:");
            name = in.nextLine();
            System.out.print("Введите объём батареи:");
            mAh = in.nextInt();
            System.out.print("Введите цену:");
            Cost = in.nextInt();
            return this;
        }


    void InitGadget(String Pname,int PmAh)
    {
name =Pname;
mAh = PmAh;
    }
    void PrintGadget() {
        System.out.print("Название:");
        System.out.println(name);
        System.out.print("Объём батареи:");
        System.out.println(mAh);
        System.out.print("Цена:");
        System.out.println(Cost);

    }

}
