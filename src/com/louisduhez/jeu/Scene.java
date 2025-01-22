package com.louisduhez.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.louisduhez.objets.Bloc;
import com.louisduhez.objets.Objet;
import com.louisduhez.objets.Piece;
import com.louisduhez.objets.TuyauRouge;
import com.louisduhez.personnages.Champ;
import com.louisduhez.personnages.MainPerso;
import com.louisduhez.personnages.Tortue;

@SuppressWarnings("serial")
public class Scene extends JPanel{
	
	private ImageIcon icoFond;
	private Image imgFond1;
	private Image imgFond2;
	private int imgFondWidth;
	private ImageIcon icoChateau1;
	private Image imgChateau1;
	private ImageIcon icoDepart;
	private Image imgDepart;

	
	private int xFond1;
	private int xFond2;
	private int dx;
	private int xPos;
	private int ySol;
	private int hauteurPlafond;
	
	public MainPerso mainPerso;
	public Champ champ;
	public Tortue tortue;
	
	public TuyauRouge tuyauRouge1;
	public TuyauRouge tuyauRouge2;
	public TuyauRouge tuyauRouge3;
	public TuyauRouge tuyauRouge4;
	public TuyauRouge tuyauRouge5;
	public TuyauRouge tuyauRouge6;
	public TuyauRouge tuyauRouge7;
	public TuyauRouge tuyauRouge8;
	
	public Bloc bloc1;
	public Bloc bloc2;
	public Bloc bloc3;
	public Bloc bloc4;
	public Bloc bloc5;
	public Bloc bloc6;
	public Bloc bloc7;
	public Bloc bloc8;
	public Bloc bloc9;
	public Bloc bloc10;
	public Bloc bloc11;
	public Bloc bloc12;
	
	public Piece piece1;
	public Piece piece2;
	public Piece piece3;
	public Piece piece4;
	public Piece piece5;
	public Piece piece6;
	public Piece piece7;
	public Piece piece8;
	public Piece piece9;
	public Piece piece10;
	
	public ImageIcon icoDrapeau;
	public Image imgDrapeau;
	public ImageIcon icoChateauFin;
	public Image imgChateauFin;
	
	private ArrayList<Objet> tabObjets;
	private ArrayList<Piece> tabPieces;
	
	//Constructeur//
	public Scene() {
		super();
		this.xFond1 = -50;
		this.xFond2 = 750;
		this.dx = 0;
		this.xPos = -1;
		this.ySol = 293;
		this.hauteurPlafond =0;
		
		
		icoFond = new ImageIcon(getClass().getResource("/image/fondEcran.png"));
		this.imgFond1 = this.icoFond.getImage();
		this.imgFond2 = this.icoFond.getImage();
		
		
		icoChateau1 = new ImageIcon(getClass().getResource("/image/chateau1.png"));
		this.imgChateau1 = this.icoChateau1.getImage();
		
		icoDepart = new ImageIcon(getClass().getResource("/image/depart.png"));
		this.imgDepart = this.icoDepart.getImage()
;		
		this.imgFondWidth = icoFond.getIconWidth(); // On note la taille en px de l'image
		
		mainPerso = new MainPerso(300,245);
		champ = new Champ (800,263);
		tortue = new Tortue(950,243);
		
		tuyauRouge1 = new TuyauRouge(600,230);
		tuyauRouge2 = new TuyauRouge(1000,230);
		tuyauRouge3 = new TuyauRouge(1600,230);
		tuyauRouge4 = new TuyauRouge(2600,230);
		tuyauRouge5 = new TuyauRouge(3000,230);
		tuyauRouge6 = new TuyauRouge(3300,230);
		tuyauRouge7 = new TuyauRouge(3800,230);
		tuyauRouge8 = new TuyauRouge(4500,230);
		
		bloc1 = new Bloc(400,150);
		bloc2 = new Bloc(800,130);
		bloc3 = new Bloc(1150,170);
		bloc4 = new Bloc(1100,130);
		bloc5 = new Bloc(2300,150);
		bloc6 = new Bloc(2900,130);
		bloc7 = new Bloc(3400,180);
		bloc8 = new Bloc(3450,140);
		bloc9 = new Bloc(3700,150);
		bloc10 = new Bloc(4000,150);
		bloc11 = new Bloc(4050,150);
		bloc12 = new Bloc(4300,150);
		
		piece1 = new Piece(402,145);
		piece2 = new Piece(1202,140);
		piece3 = new Piece(1272,95);
		piece4 = new Piece(1342,40);
		piece5 = new Piece(1650,145);
		piece6 = new Piece(2650,145);
		piece7 = new Piece(3000,135);
		piece8 = new Piece(3400,125);
		piece9 = new Piece(4200,145);
		piece10 = new Piece(4600,40);
		
		
		
		this.icoChateauFin = new ImageIcon(getClass().getResource("/image/chateauFin.png"));
		this.imgChateauFin = this.icoChateauFin.getImage();
		
		this.icoDrapeau = new ImageIcon(getClass().getResource("/image/drapeau.png"));
		this.imgDrapeau = this.icoDrapeau.getImage();
		
		tabObjets = new ArrayList<Objet>();
		this.tabObjets.add(this.tuyauRouge1);
		this.tabObjets.add(this.tuyauRouge2);
		this.tabObjets.add(this.tuyauRouge3);
		this.tabObjets.add(this.tuyauRouge4);
		this.tabObjets.add(this.tuyauRouge5);
		this.tabObjets.add(this.tuyauRouge6);
		this.tabObjets.add(this.tuyauRouge7);
		this.tabObjets.add(this.tuyauRouge8);
		
		this.tabObjets.add(this.bloc1);
		this.tabObjets.add(this.bloc2);
		this.tabObjets.add(this.bloc3);
		this.tabObjets.add(this.bloc4);
		this.tabObjets.add(this.bloc5);
		this.tabObjets.add(this.bloc6);
		this.tabObjets.add(this.bloc7);
		this.tabObjets.add(this.bloc8);
		this.tabObjets.add(this.bloc9);
		this.tabObjets.add(this.bloc10);
		this.tabObjets.add(this.bloc11);
		this.tabObjets.add(this.bloc12);
		
		tabPieces = new ArrayList<Piece>();
		this.tabPieces.add(this.piece1);
		this.tabPieces.add(this.piece2);
		this.tabPieces.add(this.piece3);
		this.tabPieces.add(this.piece4);
		this.tabPieces.add(this.piece5);
		this.tabPieces.add(this.piece6);
		this.tabPieces.add(this.piece7);
		this.tabPieces.add(this.piece8);
		this.tabPieces.add(this.piece9);
		this.tabPieces.add(this.piece10);
		
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
	}
	
	// Getters
	
	public int getDx() {
		return dx;
	}
	
	
	public int getySol() {
		return ySol;
	}

	

	public int getHauteurPlafond() {
		return hauteurPlafond;
	}

	

	public int getxPos() {
		return xPos;
	}

	
	public int getxFond1() {
		return xFond1;
	}


	public int getxFond2() {
		return xFond2;
	}


	// Setters
	public void setHauteurPlafond(int hauteurPlafond) {
		this.hauteurPlafond = hauteurPlafond;
	}
	
	public void setySol(int ySol) {
		this.ySol = ySol;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}
	
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	
	public void setxFond1(int xFond1) {
		this.xFond1 = xFond1;
	}

	public void setxFond2(int xFond2) {
		this.xFond2 = xFond2;
	}
	
	
	//Methode
	
	public void deplacementFond() {
		if(this.xPos >= 0 && this.xPos <= 4430) {
			this.xPos = this.xPos + this.dx;
		
		this.xFond1 = this.xFond1 - this.dx;
		this.xFond2 = this.xFond2 - this.dx;
		}
		
		if(this.xFond1 == -imgFondWidth) {
			this.xFond1 = imgFondWidth;
		}
		else if(this.xFond2 == -imgFondWidth) {
			this.xFond2 = imgFondWidth;
		}
		else if(this.xFond1 == imgFondWidth) {
			this.xFond1 = -imgFondWidth;
		}
		else if(this.xFond2 == imgFondWidth) {
			this.xFond2 = -imgFondWidth;
		}
	}
	

	public void paintComponent(Graphics g) { 
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		//Detection contact 
		 for (int i = 0; i < this.tabObjets.size(); i++) {
			 if(this.mainPerso.proche(this.tabObjets.get(i))) {
				 this.mainPerso.contact(this.tabObjets.get(i));
			 }
			 if(this.champ.proche(this.tabObjets.get(i))) {
				 this.champ.contact(this.tabObjets.get(i));
			 }
			 if(this.tortue.proche(this.tabObjets.get(i))) {
				 this.tortue.contact(this.tabObjets.get(i));
			 }
			 
		 }
		 
		 // detection contact piece 
		 
		 for (int i = 0; i < this.tabPieces.size(); i ++ ) {
			 if(this.mainPerso.proche(this.tabPieces.get(i))) {
				 if( this.mainPerso.contactPiece(this.tabPieces.get(i))) {
					 this.tabPieces.remove(i);
				 }
			 }
		 }
		
		 if (this.champ.proche(tortue)) {
			 this.champ.contact(tortue);
		 }
		 if (this.tortue.proche(champ)) {
			 this.tortue.contact(champ);
		 }
		 if (this.mainPerso.proche(champ)) {
			 this.mainPerso.contact(champ);
		 }
		// Detection mouvement
		this.deplacementFond();
		if( this.xPos >= 0 && this.xPos <= 4430) {
			for (int i = 0; i < this.tabObjets.size(); i++) {
			this.tabObjets.get(i).deplacement();
			}
			for(int i = 0; i < tabPieces.size(); i++) {
				this.tabPieces.get(i).deplacement();
			}
			this.champ.deplacement();
			this.tortue.deplacement();
		}
		
		
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null);
		g2.drawImage(this.imgFond2, this.xFond2, 0, null);
		
		g2.drawImage(imgChateau1, 10- this.xPos, 95, null);
		g2.drawImage(imgDepart, 220 - this.xPos, 234,null);
		
		// Images des objets 
		for(int i = 0; i < this.tabObjets.size(); i++) {
			g2.drawImage(this.tabObjets.get(i).getImgObjet(), this.tabObjets.get(i).getX(), this.tabObjets.get(i).getY(), null);
		}
		
		// Images des pièces 
		
		for(int i = 0 ; i < tabPieces.size(); i++) {
			g2.drawImage(this.tabPieces.get(i).bouge(), this.tabPieces.get(i).getX(), this.tabPieces.get(i).getY(),null);
		}
		
		g2.drawImage(imgDrapeau, 4650 - this.xPos, 115, null);
		g2.drawImage(imgChateauFin, 5000 - this.xPos, 145, null);
		
		if(this.mainPerso.isSaut()) {
			g2.drawImage(this.mainPerso.saut(), this.mainPerso.getX(), this.mainPerso.getY(), null);
		}else {g2.drawImage(this.mainPerso.marche("mario", 25), this.mainPerso.getX(), this.mainPerso.getY(), null);}
		
		if(this.champ.isVivant()== true) {
		g2.drawImage(this.champ.marche("champ", 45), this.champ.getX(), this.champ.getY(), null);}
		else {
			g2.drawImage(this.champ.meurt(), this.champ.getX(), this.champ.getY() + 20, null);
		}
		g2.drawImage(this.tortue.marche("tortue", 45), this.tortue.getX(), this.tortue.getY(), null);
		
	}
	
}
