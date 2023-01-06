package com.company;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSmartphone extends ButtonGadget implements ActionListener {


    public ButtonSmartphone()
    {
        this.setLayout(new GridLayout(15,1,1,10));
        LabelStringComp = new JLabel("Тип экрана");
        LabelIntComp = new JLabel("Частота обновления экрана");
        LabelCoreAndVideoName = new JLabel("Процессор");
        CoreAndVideoNameComp = new JTextField();
        LabelCoreAndVideoHz = new JLabel("Частота процессора");
        CoreAndVideoHzComp = new JTextField();
        this.add(LabelStringComp);
        this.add(StringComponent);
        this.add(LabelIntComp);
        this.add(IntComponent);
        this.add(LabelCoreAndVideoName);
        this.add(CoreAndVideoNameComp);
        this.add(LabelCoreAndVideoHz);
        this.add(CoreAndVideoHzComp);
        this.add(CountLabel);
        this.add(CountField);
        this.add(Create);

        Create.addActionListener(new SmartphonePrint());
    }    @Override
        public void actionPerformed(ActionEvent e) {
        this.setVisible(true);
    }
    public class SmartphonePrint extends JFrame implements ActionListener{
        int Smart=1;
        public void actionPerformed(ActionEvent e) {
            String Name = name.getText();
            int mAh = Integer.parseInt(mAhComponent.getText());
            String TypeScreen = StringComponent.getText();
            int Hz = Integer.parseInt(IntComponent.getText());
            String ProcessorName = CoreAndVideoNameComp.getText();
            int ProcessorGHz = Integer.parseInt(CoreAndVideoHzComp.getText());
            int counter= Integer.parseInt(CountField.getText());
            if(Smart<5) {
                JOptionPane.showMessageDialog(null, "Название:" + Name + "\n" +
                        "Объём батареи: " + mAh + "\nТип экрана: " + TypeScreen + "\nЧастота обновления: " + Hz +
                        "\nНазвание процессора:" + ProcessorName + "\nЧастота ядра:" + ProcessorGHz);
                Smartphone[][] S = new Smartphone[5][];
                Smartphone SMARTPHONE = new Smartphone();
                SMARTPHONE.InitComponent(Name,mAh,TypeScreen,Hz,ProcessorName,ProcessorGHz);
                S[Smart-1] = new Smartphone[counter];
                for (int i = 0; i < counter; i++) {
                    S[Smart-1][i] = new Smartphone();
                    S[Smart-1][i].InitSmartphone(SMARTPHONE);
                    S[Smart-1][i].P.InitProcessor(SMARTPHONE.P);
                }
                V.add(S[Smart- 1][0]);
                V.sort(Gadget::compareTo);
                Smart++;
            }
            else JOptionPane.showMessageDialog(null,"Слишком много гаджетов!");





        }

    }

}
