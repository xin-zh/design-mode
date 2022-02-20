package com.example.zx.prototype;

import javax.swing.*;

public class SunWuKong extends JPanel implements Cloneable {
    public SunWuKong(){
        JLabel jl=new JLabel(new ImageIcon("src/imgs/WuKong.jpg"));
        this.add(jl);
    }

    @Override
    public Object clone(){
        SunWuKong w=null;
        try {
            w = (SunWuKong) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("孙悟空拷贝失败");
        }
        return w;
    }
}
