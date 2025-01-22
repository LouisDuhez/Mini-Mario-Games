package com.louisduhez.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.louisduhez.jeu.Main;

public class Objet {
	private int largeur, hauteur;
	private int x,y;
	
	
	protected Image imgObjet;
	protected ImageIcon icoObjet;
	//Constructeur
	public Objet(int x, int y, int largeur, int hauteur) {
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}


	public int getLargeur() {
		return largeur;
	}

	public int getY() {
		return y;
	}
	
	public int getX() {
		return x;
	}
	
	public Image getImgObjet() {
		return imgObjet;
	}


	public int getHauteur() {
		return hauteur;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	//Methode 
	public void deplacement(){  
		  if(Main.scene.getxPos() >= 0){
		   this.x = this.x - Main.scene.getDx();
		  }
		 }
}
