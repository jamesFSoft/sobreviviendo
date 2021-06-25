package application;

import application.clases.Carne;
import application.clases.Nocivo;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.text.TextAlignment;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
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
			
			Label info = new Label("El personaje abondonado debe de comer el alimento correcto y solo usted sabe con cual, ayudalo!");
			info.setWrapText(true);
			
			Label labelfirst = new Label("Primer alimento");
			Label labelresponse = new Label();

			Button button = new Button("Finalizar");

			RadioButton radio1, radio2;
			radio1 = new RadioButton("Trucha");
			radio2 = new RadioButton("Arena");

			ToggleGroup question1 = new ToggleGroup();

			radio1.setToggleGroup(question1);
			radio2.setToggleGroup(question1);

			button.setDisable(true);

			radio1.setOnAction(e -> button.setDisable(false));
			radio2.setOnAction(e -> button.setDisable(false));

			button.setOnAction(e -> {
				
				Carne pescado = new Carne("Trucha", 25, true);
				Integer nuevoPuntaje = pescado.getPuntaje();
				Nocivo arena = new Nocivo("Arena", - 10 , -10);

				System.out.println(arena.getPuntaje());

				if (radio1.isSelected()) {
					labelresponse.setText("Su puntaje es: " + pescado.getPuntaje());
					button.setDisable(true);
				}

				else {
					String auxilio = arena.getDolor() != 0 ? "Le dio intoxicacion" : "No me genero dolor"; 
					labelresponse.setText("Respuesta incorrecta, su puntaje es: " + arena.getPuntaje() + " Y " + auxilio);
					button.setDisable(true);
				}
			});
			
			VBox layout= new VBox(5);

			layout.getChildren().addAll(text, info, labelfirst, radio1, radio2, button, labelresponse);

			
			Scene scene = new Scene(layout, 500, 400);
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
