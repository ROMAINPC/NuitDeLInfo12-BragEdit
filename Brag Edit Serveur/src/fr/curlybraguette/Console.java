package fr.curlybraguette;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class Console extends ScrollPane{

	private VBox group;
	
	public Console(){
		
		group = new VBox();
		group.setPadding(new Insets(10,10,10,10));
		this.setContent(group);
				
		
	}

	public void afficher(String txt) {
		Label label = new Label(txt);
		
		this.setVvalue(this.getVvalue()+42);
		
		group.getChildren().add(label);
		
	}
}

