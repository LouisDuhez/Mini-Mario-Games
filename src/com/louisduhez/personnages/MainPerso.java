package com.louisduhez.personnages;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.louisduhez.jeu.Main;
import com.louisduhez.objets.Objet;
import com.louisduhez.objets.Piece;

public class MainPerso extends Personnage{

	// VARIABLES
	private Image imgMainPerso;
	private ImageIcon icoMainPerso;
	private boolean saut;
	private int compteurSaut;
	
	
	//CONSTRUCTEUR
	public MainPerso(int x, int y) {
		super(x, y, 28, 50);
		this.icoMainPerso = new ImageIcon(getClass().getResource("/image/marioMarcheDroite.png"));
		this.imgMainPerso = this.icoMainPerso.getImage();
				
	this.saut = false;
	this.compteurSaut = 0;
	}

	
	//GETTERS 
	public Image getImgMainPerso() {
		return imgMainPerso;
	}

	
	public boolean isSaut() {
		return saut;
	}
	
	// SETTERS

	public void setImgMainPerso(Image imgMainPerso) {
		this.imgMainPerso = imgMainPerso;
	}
	
	public void setSaut(boolean saut) {
		this.saut = saut;
	}
	
	// METHODES 
	@Override
	public Image marche(String nom, int frequence) {
		
		String str;
		ImageIcon ico;
		Image img;
		
		if(this.marche == false || Main.scene.getxPos() <= 0 || Main.scene.getxPos() > 4430){
			
            if(this.versDroite == true) {str = "/image/" + nom + "ArretDroite.png";} 
            else {str = "/image/" + nom + "ArretGauche.png";}
        } else {
            this.compteur++;
            if(this.compteur / frequence == 0) {
                if(this.versDroite == true) {str = "/image/" + nom + "ArretDroite.png";} 
                else {str = "/image/" + nom + "ArretGauche.png";}
            } else {
                if(this.versDroite == true) {str = "/image/" + nom + "MarcheDroite.png";} 
                
                else {str = "/image/" + nom + "MarcheGauche.png";}
            }
                if(this.compteur == 2 * frequence) {this.compteur = 0;}
                
          	}
          //Affichage de l'image du personnage
    		ico = new ImageIcon(getClass().getResource(str));
    		img = ico.getImage();
    		return img;
        }
	
	public Image saut() {
		ImageIcon ico;
		Image img;
		String str;
		this.compteurSaut++;
		
		if (this.compteurSaut <=40) {
			if(this.getY() > Main.scene.getHauteurPlafond()) {
				this.setY(this.getY()-4);
			} else {this.compteurSaut = 41;}
			if (this.isVersDroite() == true) {
				str = "/image/marioSautDroite.png";
			}else {
				str = "/image/marioSautGauche.png";
			}
		}else {
			if (this.getY() + this.getHauteur() < Main.scene.getySol()) {
				this.setY(this.getY()+1);
				if (this.isVersDroite() == true) {
					str = "/image/marioSautDroite.png";
				}else {
					str = "/image/marioSautGauche.png";
				}
			}else {
				if (this.isVersDroite() == true) {
					str = "/image/marioArretDroite.png";
				}else {
					str = "/image/marioArretGauche.png";
				}
				this.saut=false;
				this.compteurSaut = 0;
			}
			
		}
		ico = new ImageIcon(getClass().getResource(str));
		img= ico.getImage();
		return img;
	}
	
	public void contact(Objet objet) {
		if((super.contactAvant(objet)==true && this.isVersDroite() == true) || (super.contactArriere(objet) == true && this.isVersDroite() == false)) {
			Main.scene.setDx(0);
			this.setMarche(false);
		}
		if(super.contactDessous(objet)== true && this.saut == true) {
			Main.scene.setySol(objet.getY());
		}else if (super.contactDessous(objet)== false ) {
				Main.scene.setySol(293); // Hauteur sol initial
				if (this.saut == false) {
					this.setY(243); // hauteur initail de mainPerso
				}
				
			}
			if (super.contactDessus(objet)== true) {
				Main.scene.setHauteurPlafond(objet.getY() + objet.getHauteur());
			}else if (super.contactDessus(objet) == false && this.saut == false) {
				Main.scene.setHauteurPlafond(0);
			}
		}
	
	public boolean contactPiece(Piece piece) {
		if ( this.contactArriere(piece)== true || this.contactAvant(piece) == true || this.contactDessous(piece)== true || this.contactDessus(piece) == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public void contact (Personnage personnage) {
		if ( (super.contactAvant(personnage)== true) || (super.contactArriere(personnage)== true)) {
			this.setMarche(false);
			this.setVivant(false);
			
		}else if ( super.contactDessous(personnage) == true){
			personnage.setMarche(false);
			personnage.setVivant(false);
		}
	}
}

	
	
	
