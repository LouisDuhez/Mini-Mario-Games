package com.louisduhez.jeu;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		
	// Création de la fenêtre d'application 
		JFrame fenetre = new JFrame("Jeu en 2D");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(700, 360);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
	//Instanciation de l'objet scene
		scene = new Scene();
		
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
		
		
	}

}
