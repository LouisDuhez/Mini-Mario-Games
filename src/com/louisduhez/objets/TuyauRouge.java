package com.louisduhez.objets;

import javax.swing.ImageIcon;

public class TuyauRouge extends Objet{
	

	
	//Constructor
	public TuyauRouge(int x, int y) {
		super(x, y, 43, 65);
		super.icoObjet = new ImageIcon(getClass().getResource("/image/tuyauRouge.png"));
		super.imgObjet = this.icoObjet.getImage();
		
	}
	
}
