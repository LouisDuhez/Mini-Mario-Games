package com.louisduhez.personnages;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.louisduhez.objets.Objet;

public class Tortue extends Personnage implements Runnable{

	private Image imgTortue;
	private ImageIcon icoTortue;
	
	private int dxTortue;
	private final int PAUSE = 15;
	
	public Tortue(int x, int y) {
		super(x, y, 27, 30);
		
		super.setVersDroite(true);
		super.setMarche(true);
		this.dxTortue = 1;
		this.icoTortue = new ImageIcon(getClass().getResource("/image/tortueArretDroite.png"));
		this.imgTortue = icoTortue.getImage();
		
		Thread chronoTortue = new Thread(this);
		chronoTortue.start();
	}


		// GETTERS
		public Image getImgChamp() {
			return imgTortue;
		}

		// Methodes
		public void bouge() {
			if (super.isVersDroite() == true ) {
				this.dxTortue= 1 ;
			}else {
				this.dxTortue = -1;
			}
			super.setX(super.getX() + this.dxTortue);
		}
		
		@Override
		public void run() {
			try {
				Thread.sleep(20);
			}catch (InterruptedException e) {
				
			}
			while (true) {
				this.bouge();
				try {
					Thread.sleep(PAUSE);
				}catch (InterruptedException e) {
					
				}
			}
			
		}
		public void contact(Objet objet) {
			if (super.contactAvant(objet) == true && this.isVersDroite()== true) {
				super.setVersDroite(false);
				this.dxTortue = -1;
			}else  if(super.contactArriere(objet) == true && this.isVersDroite() == false ){
				super.setVersDroite(true);
				this.dxTortue = 1;
			}
		}
		public void contact(Personnage personnage) {
			if (super.contactAvant(personnage) == true && this.isVersDroite()== true) {
				super.setVersDroite(false);
				this.dxTortue = -1;
			}else  if(super.contactArriere(personnage) == true && this.isVersDroite() == false ){
				super.setVersDroite(true);
				this.dxTortue = 1;
			}
		}
}
