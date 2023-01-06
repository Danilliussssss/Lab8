package com.company;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNotebook extends ButtonGadget implements ActionListener {
    public ButtonNotebook()
    {

        this.setLayout(new GridLayout(15,1,1,10));
        LabelStringComp = new JLabel("Цвет клавиатуры");
        LabelIntComp = new JLabel("Кол-во дюймов");
        LabelCoreAndVideoName = new JLabel("Видеокарта");
        CoreAndVideoNameComp =new JTextField();
        LabelCoreAndVideoHz = new JLabel("Частота видеочипа");
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
        Create.addActionListener(new PrintNotebook());

    }
    @Override
    public void actionPerformed(ActionEvent e) {
this.setVisible(true);
    }
    public class PrintNotebook extends JFrame implements ActionListener
    {
        int Note=1;Notebook[][] N = new Notebook[5][];
        @Override
        public void actionPerformed(ActionEvent e) {
            String Name = name.getText();
            int mAh = Integer.parseInt(mAhComponent.getText());
            String ColorKeyBoard = StringComponent.getText();
            int Inch = Integer.parseInt(IntComponent.getText());
            String VideoName = CoreAndVideoNameComp.getText();

            int VideoGHz = Integer.parseInt(CoreAndVideoHzComp.getText());
            int counter = Integer.parseInt(CountField.getText());
            if(Note<5) {
                JOptionPane.showMessageDialog(null, "Название:" + Name + "\n" +
                        "Объём батареи: " + mAh + "\nЦвет клавиатуры: " + ColorKeyBoard + "\nКол-во дюймов: " + Inch +
                        "\nНазвание видеочипа:" + VideoName + "\nЧастота видеочипа:" + VideoGHz);
                Notebook NOTEBOOK = new Notebook();
                NOTEBOOK.InitComponent(Name,mAh,ColorKeyBoard,Inch,VideoName,VideoGHz);
                N[Note-1] = new Notebook[counter];
                for (int i = 0; i < counter; i++) {
                    N[Note-1][i] = new Notebook();
                    N[Note-1][i].InitNotebook(NOTEBOOK);
                    N[Note-1][i].Video.InitVideoAdapter(NOTEBOOK.Video);
                }
                V.add(N[Note- 1][0]);
                V.sort(Gadget::compareTo);
                Iterator<Gadget> Count = V.iterator();
                while(Count.hasNext())
                {
                    Gadget C = Count.next();
                }
                Note++;
            }
            else JOptionPane.showMessageDialog(null,"Слишком много гаджетов!");

        }
    ;}
}
