package fr.curlybraguette;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class Interface extends Scene{
	
	private static Group root = new Group();
	

	public Interface(double width, double height) {
		
		
		super(root, width, height);
		
		Tab t1 = new Tab();
		t1.setText("Editeur de Texte");
		Editeur editeur = new Editeur();
		editeur.prefWidthProperty().bind(this.widthProperty());
		t1.setContent(editeur);
		
		Tab t2 = new Tab();
		t2.setText("Dessins");
		
		Tab t3 = new Tab();
		t3.setText("Taches");
		
		
		
		
		
		
		
		TabPane tp = new TabPane();
		tp.getTabs().addAll(t1,t2,t3);
		
		root.getChildren().add(tp);
		}

	

}