import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(""));
        Scene screen = new Scene(root);
        primaryStage.setTitle("appJavaCinei");
        primaryStage.setScene(screen);
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        primaryStage.show();        
    }
}
