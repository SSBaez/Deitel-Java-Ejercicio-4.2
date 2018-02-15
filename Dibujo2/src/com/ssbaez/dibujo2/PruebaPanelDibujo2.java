package com.ssbaez.dibujo2;

import javax.swing.*;

public class PruebaPanelDibujo2 {
	
	public static void main(String[] args){
		
		PanelDibujo2 panel = new PanelDibujo2();
		
		JFrame api = new JFrame("DIBUJO 2");
		
		api.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		api.add(panel);
		api.setSize(500, 500);
		api.setVisible(true);
		
	}

}
