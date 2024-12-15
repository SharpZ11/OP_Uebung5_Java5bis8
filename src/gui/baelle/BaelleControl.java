package gui.baelle;

import business.baelle.*;
import javafx.stage.Stage;

public class BaelleControl {
	
	private BaelleView baelleView;
	private BaelleModel baelleModel;

	public BaelleControl(Stage primaryStage){
		this.baelleModel = BaelleModel.getInstance();
		this.baelleView = new BaelleView(this, primaryStage, 
			baelleModel);
	}
	
	void leseBaelleAusDatei(){
	   	try{
   			baelleModel.leseBaelleAusDatei();
   			baelleView.zeigeInformationsfensterAn(
   				"Die Bälle wurden gelesen!");
	    } 
		catch(Exception exc){
			baelleView.zeigeFehlermeldungsfensterAn("",
				"Unbekannter Fehler beim Lesen!");
		}
    }

}
