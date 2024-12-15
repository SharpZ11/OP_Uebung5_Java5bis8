package gui.sportartikel;

import business.baelle.*;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.*;
import ownUtil.MeldungsfensterAnzeiger;
import ownUtil.*;

public class SportartikelView implements Observer{
	
	private SportartikelControl sportartikelControl;
	private BaelleModel baelleModel;	
	private Stage stage;
	
    //---Anfang Attribute der grafischen Oberflaeche---
    private Pane pane = new  Pane();
    private Label lblAnzeigeTrikotsaetze    = new Label("Anzeige Trikots");
    private Label lblAnzeigeBaelle          = new Label("Anzeige Bälle");
    private TextArea txtAnzeigeTrikots      = new TextArea();
    private TextArea txtAnzeigeBaelle       = new TextArea();
 
    //-------Ende Attribute der grafischen Oberflaeche-------
     
    public SportartikelView(SportartikelControl sportartikelControl, 
    	Stage stage, BaelleModel baelleModel){
    	Scene scene = new Scene(this.pane, 640, 340);
    	stage.setScene(scene);
    	stage.setTitle("Anzeige von Sportartikeln");
    	stage.show();
    	this.sportartikelControl = sportartikelControl;
    	this.baelleModel = baelleModel;
    	this.baelleModel.addObserver(this);
    	this.stage = stage;
		this.initKomponenten();
		this.initListener();
   	}
  
    private void initKomponenten(){
    	// Label
 	    Font font = new Font("Arial", 20);
 	    lblAnzeigeTrikotsaetze.setLayoutX(20);
        lblAnzeigeTrikotsaetze.setLayoutY(40);
        lblAnzeigeTrikotsaetze.setFont(font);
        lblAnzeigeTrikotsaetze.setStyle("-fx-font-weight: bold;"); 
        lblAnzeigeBaelle.setLayoutX(310);
        lblAnzeigeBaelle.setLayoutY(40);
        lblAnzeigeBaelle.setFont(font);
        lblAnzeigeBaelle.setStyle("-fx-font-weight: bold;"); 
        pane.getChildren().addAll(lblAnzeigeTrikotsaetze, lblAnzeigeBaelle);    
      	// Textbereiche	
    	txtAnzeigeTrikots.setEditable(false);
       	txtAnzeigeTrikots.setLayoutX(20);
       	txtAnzeigeTrikots.setLayoutY(90);
       	txtAnzeigeTrikots.setPrefWidth(220);
       	txtAnzeigeTrikots.setPrefHeight(185);
       	txtAnzeigeBaelle.setEditable(false);
       	txtAnzeigeBaelle.setLayoutX(310);
       	txtAnzeigeBaelle.setLayoutY(90);
       	txtAnzeigeBaelle.setPrefWidth(300);
       	txtAnzeigeBaelle.setPrefHeight(185);
        pane.getChildren().add(txtAnzeigeBaelle);        	
    }
    
    private void initListener() {
    	
    	/*stage.setOnCloseRequest(
     		new EventHandler<WindowEvent>() {
        		@Override
        		public void handle(WindowEvent e) {
     				SportartikelView.this.baelleModel
     					.removeObserver(SportartikelView.this);
        			}
        		}); */
    	// Lambda Ausdruck
    	stage.setOnCloseRequest(e -> SportartikelView.this.baelleModel.removeObserver(SportartikelView.this));
        		
    }
       
//  public void update(Observable obs, Object obj) {
//        if(obs.getClass().getSimpleName().equals("BaelleModel")) {
    public void update() {
   		String text = "";
   		for(int i = 0; i < baelleModel.getBaelle().getAnzahlSportartikel(); i++) {
   			text = text + baelleModel.getBaelle().getSportartikel(i).gibZurueck('|') + "\n";
   		}
   		txtAnzeigeBaelle.setText(text);
   		zeigeInformationsfensterAn(
       		"Beachten Sie die Anzeige!");
 //  }   		
    }	
   
    private void zeigeInformationsfensterAn(String meldung){
 		new MeldungsfensterAnzeiger(AlertType.INFORMATION,
 			"Information", meldung).zeigeMeldungsfensterAn();
    }	
    

}
