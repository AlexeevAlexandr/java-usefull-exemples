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

public class EffectsAndTransformsDemo extends Application {
	double angle=0.0, scaleFactor=0.4, blurVal=1.0, scaleRotateFactor=0.4, blurValRotate=1.0, blurValScale=1.0;
	
	Reflection reflection = new Reflection();

	BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
	Rotate rotateBlur = new Rotate();
	Scale scaleBlur = new Scale();

	Rotate rotate = new Rotate();
	Scale scaleRotate = new Scale();
	BoxBlur blurRotate = new BoxBlur(1.0, 1.0, 1);

	Scale scale = new Scale(scaleFactor, scaleFactor);
	BoxBlur blurScale = new BoxBlur(1.0, 1.0, 1);
	Rotate rotateScale = new Rotate();

	Button btnRotate = new Button("Rotate");
	Button btnBlur = new Button("Blur off");
	Button btnScale = new Button("Scale");

	Label reflect = new Label("Raflection Adds Visual Sparcle");
	public static void main (String args[]){
		launch(args);
		}
	public void start(Stage myStage){
		myStage.setTitle("Effects and Transforms");

		FlowPane rootNode = new FlowPane(20, 20);

		rootNode.setAlignment(Pos.CENTER);

		Scene myScene = new Scene(rootNode, 300, 120);
		
		myStage.setScene(myScene);

		btnRotate.getTransforms().addAll(rotate, scaleRotate);
		btnScale.getTransforms().addAll(scale, rotateScale);
		btnBlur.getTransforms().addAll(rotateBlur, scaleBlur);
	
		reflection.setTopOpacity(0.7);
		reflection.setBottomOpacity(0.3);
		reflect.setEffect(reflection);

		btnRotate.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ае) {
				angle += 15.0;
				rotate.setAngle(angle);
				rotate.setPivotX(btnRotate.getWidth()/2);
				rotate.setPivotY(btnRotate.getHeight()/2);
				
				scaleRotateFactor += 0.1;
				if(scaleRotateFactor > 2.0) scaleRotateFactor = 0.4;
				scaleRotate.setX(scaleRotateFactor);
				scaleRotate.setY(scaleRotateFactor);

				if(blurValRotate == 10.0){
					blurValRotate = 1.0;
					btnRotate.setEffect(null);
					}
				else{
					blurValRotate++;
					btnRotate.setEffect(blurRotate);
					}
				blurRotate.setWidth(blurValRotate);
				blurRotate.setHeight(blurValRotate);

				}
			});
		btnScale.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ае) {
				scaleFactor += 0.1;
				if(scaleFactor > 2.0) scaleFactor = 0.4;
				scale.setX(scaleFactor);
				scale.setY(scaleFactor);

				if(blurValScale == 10.0){
					blurValScale = 1.0;
					btnScale.setEffect(null);
					}
				else{
					blurValScale++;
					btnScale.setEffect(blurScale);
					}
				blurScale.setWidth(blurValScale);
				blurScale.setHeight(blurValScale);

				angle += 15.0;
				rotateScale.setAngle(angle);
				rotateScale.setPivotX(btnScale.getWidth()/2);
				rotateScale.setPivotY(btnScale.getHeight()/2);
				}
			});
		btnBlur.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ае){
				if(blurVal == 10.0){
					blurVal = 1.0;
					btnBlur.setEffect(null);
					btnBlur.setText("Blur off");
					}
				else{
					blurVal++;
					btnBlur.setEffect(blur);
					btnBlur.setText("Blur on");
					}
				blur.setWidth(blurVal);
				blur.setHeight(blurVal);

				angle += 15.0;
				rotateBlur.setAngle(angle);
				rotateBlur.setPivotX(btnBlur.getWidth()/2);
				rotateBlur.setPivotY(btnBlur.getHeight()/2);
				
				scaleFactor += 0.1;
				if(scaleFactor > 2.0) scaleFactor = 0.4;
				scaleBlur.setX(scaleFactor);
				scaleBlur.setY(scaleFactor);
				}
			});
		rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);

		myStage.show();
		}
	}