package com.company;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ButtonGadget extends JFrame   {
    JLabel LabelName;
    JTextField name;
    JLabel LabelMAh;
    JTextField mAhComponent;
    JLabel LabelStringComp;
    JTextField StringComponent;
    JLabel LabelIntComp;
    JTextField IntComponent;
    JLabel LabelCoreAndVideoName;
    JTextField CoreAndVideoNameComp;
    JLabel LabelCoreAndVideoHz;
    JTextField CoreAndVideoHzComp;
    JLabel CountLabel;
    JTextField CountField;
    JButton Create;
    List<Gadget> V= new ArrayList();
    public ButtonGadget()
    {

       super("Ввод данных");


        this.setBounds(400,300,200,450);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Container GadgetForm = super.getContentPane();
        GadgetForm.setLayout(new GridLayout(14,1,1,10));
         LabelName=new JLabel("Название");
         name = new JTextField("",1);
       LabelMAh = new JLabel("Объём батареи");
       mAhComponent = new JTextField();
        StringComponent = new JTextField();
        IntComponent = new JTextField();
        CountLabel = new JLabel("Количество");
        CountField = new JTextField();
        Create = new JButton("Создать");
        this.add(LabelName);
        this.add(name);
        this.add(LabelMAh);
        this.add(mAhComponent);

    }



}


