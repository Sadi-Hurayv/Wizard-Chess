package project;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class board5 extends JPanel{
  static int squareSize=128;
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.yellow);
        for (int i=0;i<64;i+=2) {
            g.setColor(new Color(204, 255, 255));
            g.fillRect((i%8+(i/8)%2)*squareSize, (i/8)*squareSize, squareSize, squareSize);
            g.setColor(new Color(32, 178, 170));
            g.fillRect(((i+1)%8-((i+1)/8)%2)*squareSize, ((i+1)/8)*squareSize, squareSize, squareSize);
       
        
        }}}

