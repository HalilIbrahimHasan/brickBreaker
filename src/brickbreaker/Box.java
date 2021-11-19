package brickbreaker;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Box extends JPanel{

int x, y, w, h;
private String name;

public Box(int x, int y, String name) {
    this.x = x;
    this.y = y;
    this.w = 100;
    this.h = 100;
    this.name=name;
}


public void paint(Graphics g){
    System.out.println(this.name.equalsIgnoreCase("box1"));
    if(this.name.equalsIgnoreCase("box1")){
        g.setColor(Color.BLACK);
        g.fillRect(x, y, w, h);
    }else{
        g.setColor(Color.GREEN);
        g.fillRect(x, y, w, h);
    }


}


public void update() {
    if(this.name.equalsIgnoreCase("box1"))
        x++;
    else
        y++;
    //this.setBounds(x, y, w, h);
    System.out.println("Current "+name+": X: "+x+", Y: "+y+", W: "+w+", H: "+h);
    repaint();
}

}