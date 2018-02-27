import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.transform.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;

public class EffectsAndTransformsDemo extends Application{
	double angle = 0.0, scaleFactor = 1.0, blurVal = 1.0, glowVal=1;
	
	Reflection reflection = new Reflection();

	BoxBlur blur = new BoxBlur(1.0, 1.0, 2);
	Rotate rotate = new Rotate();
	Glow glow = new Glow();
	Scale scale = new Scale(scaleFactor, scaleFactor);

	CheckBox obRotation;
	CheckBox obBlur;
	CheckBox obScale;
	CheckBox obGlow;

	Label response;
	Label responseGlow;
	Label responseScale;
	Label responseBlur;
	Label selected;

	Button btnRotate = new Button ("Rotate");
	Button btnBlur = new Button ("Blur off");
	Button btnScale = new Button ("Scale");
	Button btnGlow = new Button ("Glow");

	Label reflect = new Label("Reflection Adds Visual Sparcle");

	public static void main (String [] args){
		launch (args);
		}

	public void start (Stage myStage){
		myStage.setTitle("Effects and transfors");

		TilePane rootNode = new TilePane(50, 50);
		
		rootNode.setOrientation(Orientation.VERTICAL);

		Scene myScene = new Scene (rootNode, 600, 350);
		
		myStage.setScene(myScene);

		btnRotate.getTransforms().addAll(rotate, scale);
		btnScale.getTransforms().addAll(rotate, scale);
		btnBlur.getTransforms().addAll(rotate, scale);
		btnGlow.getTransforms().addAll(rotate, scale);

		reflection.setTopOpacity(0.7);
		reflection.setBottomOpacity(0.7);
		reflect.setEffect(reflection);

		response=new Label("");
		responseGlow=new Label("");
		responseScale=new Label("");
		responseBlur=new Label("");

		selected=new Label("");

		obRotation = new CheckBox("Rotation");
		obBlur = new CheckBox("Blur");
		obScale = new CheckBox("Scale");
		obGlow = new CheckBox("Glow");

		obRotation.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent ae){
				if(obRotation.isSelected()){response.setText("Rotation switch on");}else{response.setText("");}
				btnRotate.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent ae){
						if(obRotation.isSelected()){
							response.setText("Rotation switch on");
							angle += 45.0;
							rotate.setAngle(angle);
							rotate.setPivotX(btnRotate.getWidth()/2);
							rotate.setPivotY(btnRotate.getHeight()/2);	
							}
						else{response.setText("");}							
						}
					});
				}
			});

		obGlow.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent ae){
				if(obGlow.isSelected()){responseGlow.setText("Glow switch on");}else{responseGlow.setText("");}
				btnGlow.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent ae){
						if(obGlow.isSelected()){
							if(glowVal == 2.0){
								glowVal = 1.0;
								btnGlow.setEffect(null);
								btnScale.setEffect(null);
								btnRotate.setEffect(null);
								btnBlur.setEffect(null);
								btnGlow.setText("Glow off");
								}
							else{
								glowVal++;
								btnGlow.setEffect(glow);
								btnRotate.setEffect(glow);
								btnScale.setEffect(glow);
								btnBlur.setEffect(glow);
								btnGlow.setText("glow on");
								}
							}
						else{responseGlow.setText("");}
						}
					});
				}
			});
		obScale.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent ae){
				if(obScale.isSelected()){responseScale.setText("Scale switch on");}else{responseScale.setText("");}
				btnScale.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent ae){
						if(obScale.isSelected()){
							scaleFactor+=0.1;
							if(scaleFactor>1.5) scaleFactor=0.5;
							scale.setX(scaleFactor);
							scale.setY(scaleFactor);				
							}
						else{responseScale.setText("");}
						}
					});
				}
			});
		obBlur.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent ae){
				if(obBlur.isSelected()){responseBlur.setText("Blur switch on");}else{responseBlur.setText("");}
				btnBlur.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent ae){
						if(obBlur.isSelected()){
							if(blurVal == 2.0){
								blurVal = 1.0;
								btnBlur.setEffect(null);
								btnGlow.setEffect(null);
								btnScale.setEffect(null);
								btnRotate.setEffect(null);
								btnBlur.setText("Blur off");
								}
							else{
								blurVal++;
								btnBlur.setEffect(blur);
								btnGlow.setEffect(blur);
								btnRotate.setEffect(blur);
								btnScale.setEffect(blur);
								btnBlur.setText("Blur on");
								}
							blur.setWidth(blurVal);
							blur.setHeight(blurVal);
							}
						else{responseBlur.setText("");}
						}
					});
				}
			});
		rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, btnGlow, reflect,  response, responseScale, responseBlur, responseGlow, selected, obRotation, obScale, obBlur, obGlow);
		myStage.show();
		}
	}
				