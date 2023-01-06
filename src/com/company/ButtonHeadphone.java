package com.company;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHeadphone extends ButtonGadget implements ActionListener {
   public ButtonHeadphone()
   {
       LabelStringComp = new JLabel("Цвет");
       StringComponent = new JTextField();
       LabelIntComp = new JLabel("Радиус действия");
       IntComponent = new JTextField();
       this.add(LabelStringComp);
       this.add(StringComponent);
       this.add(LabelIntComp);
       this.add(IntComponent);
        this.add(CountLabel);
        this.add(CountField);
        this.add(Create);
       Create.addActionListener(new HeadphonePrint());
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(true);
    }
    public class HeadphonePrint extends JFrame implements ActionListener{
       int Head=1; Headphone[][] H = new Headphone[5][];
        public void actionPerformed(ActionEvent e) {
            String Name = name.getText();
            int mAh = Integer.parseInt(mAhComponent.getText());
            String Color = StringComponent.getText();
            int Radius = Integer.parseInt(IntComponent.getText());
            int counter = Integer.parseInt(CountField.getText());
            if(Head<5) {
                JOptionPane.showMessageDialog(null, "Название:" + Name + "\n" +
                        "Объём батареи: " + mAh + "\nЦвет: " + Color + "\nРадиус сигнала: " + Radius);
                Headphone HEADPHONE = new Headphone();
                HEADPHONE.InitComponent(Name,mAh,Color,Radius);
                H[ Head- 1] = new Headphone[counter];
                for (int i = 0; i < counter; i++)
                {  H[Head - 1][i] = new Headphone();
                    H[Head - 1][i].InitHeadphone(HEADPHONE);
                }
                V.add(H[Head- 1][0]);
                V.sort(Gadget::compareTo);
                Iterator<Gadget> Count = V.iterator();
                while(Count.hasNext())
                {
                    Gadget C = Count.next();
                }
                Head++;
            }
            else JOptionPane.showMessageDialog(null,"Слишком много гаджетов!");


        }

    }

}
