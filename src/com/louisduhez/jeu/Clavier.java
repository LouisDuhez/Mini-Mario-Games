package com.louisduhez.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if ( Main.scene.mainPerso.isVivant()== true) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// annule décalage de 1
			if(Main.scene.getxPos() == -1) {
				Main.scene.setxPos(0);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(750);
			}
			Main.scene.mainPerso.setMarche(true);
			Main.scene.mainPerso.setVersDroite(true);
			Main.scene.setDx(1);
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			
			if(Main.scene.getxPos() == 4431) {
				Main.scene.setxPos(4430);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(750);
			}
			
			Main.scene.mainPerso.setMarche(true);
			Main.scene.mainPerso.setVersDroite(false);
			Main.scene.setDx(-1);
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Main.scene.mainPerso.setSaut(true);
		}
		}
	} 
			
		

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mainPerso.setMarche(false);
		Main.scene.setDx(0);
		
	}

}
