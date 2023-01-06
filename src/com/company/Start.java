package com.company;
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame{

    Start()
    {
        super("Конструктор гаджетов");
        this.setBounds(250,300,200,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container Objects = super.getContentPane();
               Objects.setLayout(new BoxLayout(Objects,BoxLayout.Y_AXIS));
               JLabel MainMenu = new JLabel("Выберите категорию:");
               MainMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
               JButton Smartphone = new JButton("Смартфон");
               Smartphone.setAlignmentX(Component.CENTER_ALIGNMENT);
               Smartphone.size();
        JButton Headphone = new JButton("Наушники");
        Headphone.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton Notebook = new JButton("Ноутбук");
        Notebook.setAlignmentX(Component.CENTER_ALIGNMENT);
        Objects.add(MainMenu);
        Objects.add(Smartphone);
        Objects.add(Headphone);
        Objects.add(Notebook);

        Smartphone.addActionListener(new ButtonSmartphone());
Headphone.addActionListener(new ButtonHeadphone());
Notebook.addActionListener(new ButtonNotebook());

    }
}
