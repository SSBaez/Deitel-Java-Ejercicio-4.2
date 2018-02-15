package com.ssbaez.dibujo2;

import javax.swing.*;
import java.awt.*;

public class PanelDibujo2 extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);

	    int anchura = getWidth();
	    int altura = getHeight();

	    int contador1 = 0;  
	    int contador2 = 0;
	    int contador3 = 0;
	    int contador4 = 0;
	    

	    int x1 = 0; // cords change with the while statemetns
	    int x2 = 0;
	    int y1 = 0;
	    int y2 = 0;  
	    
	    
	    /*g.drawLine(anchura, y1, x2, altura);*/
	    /*
	    g.drawLine(anchura*1/15, y1, anchura, altura*1/15);
	    g.drawLine(anchura*2/15, y1, anchura, altura*2/15);
	    g.drawLine(anchura*3/15, y1, anchura, altura*3/15);*/
	    
	    
	     
	    //Izq. inferior
	    while(contador1 <= 15){ 
	    	
	    	y2 = altura;
	    
	    	g.drawLine(x1, altura*y1/15, anchura*x2/15, y2);
	    
	    	x2 += 1;
	    	y1 += 1;
	    
	    	contador1++;
	    
	    }
	    
	    int a1 = 15;
	    int b1 = 0;
	    int a2 = 0;
	    int b2 = 0;
	    
	    //Izq. superior
	    while(contador2 <= 15){
	    	
	    	g.drawLine(anchura*a1/15, b1, a2, altura*b2/15);
	    	
	    	a1 -= 1;
	    	b2 += 1;
	    	
	    	contador2++;
	 
	    }
	    
	    int r1 = 0;
	    int s1 = 0;
	    int r2 = 0;
	    int s2 = 0;
	    
	    //Der. Superior
	    while(contador3 <= 15){
	    	
	    	r2 = anchura;
	    	
	    	g.drawLine(anchura*r1/15, s1, r2, altura*s2/15);
	    	
	    	r1 += 1;
	    	s2 += 1;
	    	
	    	contador3++;
	    	
	    }
	    
	    int v1 = 0;
    	int t1 = 0;
    	int v2 = 0;
    	int t2 = 15;
    	
    	//Der. inferior
    	while(contador4 <= 15){
    		
    		t1 =  altura;
    		v2 = anchura;
    		
    		g.drawLine(anchura*v1/15, t1, v2, altura*t2/15);
    		
    		v1 += 1;
    		t2 -= 1;
    		
    		contador4++;
    		
    	}
		
	}

}
