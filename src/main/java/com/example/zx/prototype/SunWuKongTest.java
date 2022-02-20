package com.example.zx.prototype;

import javax.swing.*;
import java.awt.*;

public class SunWuKongTest {

    public static void main(String[] args) {
        JFrame jf=new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(2,2));
        Container contentPane = jf.getContentPane();
        SunWuKong obj1 = new SunWuKong();
        contentPane.add(obj1);
        SunWuKong obj2 = (SunWuKong) obj1.clone();
        contentPane.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
