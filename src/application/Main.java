package application;

import application.clases.Carne;
import application.clases.Fruta;
import application.clases.Nocivo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;

import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.text.TextAlignment;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();

			Text text = new Text(0, 30, "Juego - Sobrevive (conteste correctamente si quiere vivir!!)");
			text.setWrappingWidth(500);
			text.setTextAlignment(TextAlignment.CENTER);
			Group group = new Group(text);
			
			TextField txt = new TextField();
			txt.setPrefWidth(180);
			txt.setMaxWidth(180);
			Label nombre = new Label("Escriba su nombre");
			Button guardar = new Button("Guardar nombre");
			guardar.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent AE) {
					nombre.setText(txt.getText());
				}
			});
			
			
			Line linea = new Line(); 
			linea.setStartX(100.0); 
		    linea.setStartY(150.0); 
		    linea.setEndX(500.0); 
		    linea.setEndY(150.0);
		    
		    Line linea2 = new Line();
		    linea2.setStartX(100.0); 
		    linea2.setStartY(150.0); 
		    linea2.setEndX(500.0); 
		    linea2.setEndY(150.0);
		    
		    Line linea3 = new Line();
		    linea3.setStartX(100.0); 
		    linea3.setStartY(150.0); 
		    linea3.setEndX(500.0); 
		    linea3.setEndY(150.0);
			
			Label info = new Label("El personaje abondonado debe de comer el alimento correcto y solo usted sabe con cual, ayudalo!");
			info.setWrapText(true);
			info.setTextAlignment(TextAlignment.JUSTIFY);
			
			Label labelfirst = new Label("Seleccione el primer alimento");
			Label labelsecond = new Label("Seleccione el segundo alimento");
			Label labellast = new Label("Seleccione el ultimo alimento");
			Label labelresponse = new Label();

			Button button = new Button("Finalizar");

			RadioButton radio1, radio2, radio3, radio4, radio5, radio6;
			radio1 = new RadioButton("Trucha");
			radio2 = new RadioButton("Arena");
			
			radio3 = new RadioButton("Carton");
			radio4 = new RadioButton("Coco");
			
			radio5 = new RadioButton("Colbon");
			radio6 = new RadioButton("Mango");

			ToggleGroup question1 = new ToggleGroup();
			ToggleGroup question2 = new ToggleGroup();
			ToggleGroup question3 = new ToggleGroup();

			radio1.setToggleGroup(question1);
			radio2.setToggleGroup(question1);
			
			radio3.setToggleGroup(question2);
			radio4.setToggleGroup(question2);
			
			radio5.setToggleGroup(question3);
			radio6.setToggleGroup(question3);

			button.setDisable(true);

			radio1.setOnAction(e -> button.setDisable(false));
			radio2.setOnAction(e -> button.setDisable(false));
			radio3.setOnAction(e -> button.setDisable(false));
			radio4.setOnAction(e -> button.setDisable(false));
			radio5.setOnAction(e -> button.setDisable(false));
			radio6.setOnAction(e -> button.setDisable(false));

			button.setOnAction(e -> {
				
				Carne pescado = new Carne("Trucha", 25, false);
				Nocivo arena = new Nocivo("Arena", - 10 , -10);
				Fruta arbol = new Fruta("Coco", 20, true);
				Nocivo desecho = new Nocivo("Carton", - 5, -5);
				Fruta mango = new Fruta("Mango", 25, true);
				Nocivo colbon = new Nocivo("Colbon", - 8, -7);
				Integer nuevoPuntaje;
				String auxilio;

				
				if (radio1.isSelected() && radio4.isSelected() && radio6.isSelected()) {
					nuevoPuntaje = pescado.getPuntaje() + arbol.getPuntaje() + mango.getPuntaje();
					labelresponse.setText(nombre.getText() + ", su puntaje es: " + nuevoPuntaje + " y se convirtio en un sobreviviente!!");
					button.setDisable(true);

				} else if (radio1.isSelected() && radio3.isSelected() && radio6.isSelected()) {
					nuevoPuntaje = pescado.getPuntaje() + desecho.getPuntaje() + mango.getPuntaje();
					auxilio =  nuevoPuntaje < 0 ? "Le dio intoxicacion" : "No le genero dolor"; 
					labelresponse.setText(nombre.getText() + ", su puntaje es: " + nuevoPuntaje + " Y " + auxilio);
					button.setDisable(true);
				} else if (radio2.isSelected() && radio4.isSelected() && radio6.isSelected()) {
					nuevoPuntaje = arena.getPuntaje() + arbol.getPuntaje() + mango.getPuntaje();
					auxilio =  nuevoPuntaje < 0 ? "Le dio intoxicacion" : "No le genero dolor"; 
					labelresponse.setText(nombre.getText() + ", su puntaje es: " + nuevoPuntaje + " Y " + auxilio);
					button.setDisable(true);
				} else if (radio1.isSelected() && radio4.isSelected() && radio5.isSelected()) {
					nuevoPuntaje = pescado.getPuntaje() + arbol.getPuntaje() + colbon.getPuntaje();
					auxilio =  nuevoPuntaje < 0 ? "Le dio intoxicacion" : "No le genero dolor"; 
					labelresponse.setText(nombre.getText() + ", su puntaje es: " + nuevoPuntaje + " Y " + auxilio);
					button.setDisable(true);
				} else if (radio2.isSelected() && radio3.isSelected() && radio6.isSelected()) {
					nuevoPuntaje = arena.getPuntaje() + desecho.getPuntaje() + mango.getPuntaje();
					auxilio =  nuevoPuntaje < 0 ? "Le dio intoxicacion" : "No le genero dolor"; 
					labelresponse.setText(nombre.getText() + ", su puntaje es: " + nuevoPuntaje + " Y " + auxilio);
					button.setDisable(true);
				} else {
					nuevoPuntaje = arena.getPuntaje() + desecho.getPuntaje() + colbon.getPuntaje();
					auxilio =  nuevoPuntaje < 0 ? "le dio intoxicacion" : "no le genero dolor,"; 
					labelresponse.setText(nombre.getText() + ", su puntaje es: " + nuevoPuntaje + " y " + auxilio + " y lo mataste!");
					button.setDisable(true);
				}
			});
			
			VBox layout= new VBox(10);

			layout.getChildren().addAll(text, info, txt, nombre, guardar, linea, labelfirst, radio1, radio2, linea2, 
					labelsecond, radio3, radio4, linea3, labellast, radio5, radio6, button, labelresponse);
			
			layout.setAlignment(Pos.CENTER);

			
			Scene scene = new Scene(layout, 800, 600);
			primaryStage.setTitle("Sobreviviendo");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

			//

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
