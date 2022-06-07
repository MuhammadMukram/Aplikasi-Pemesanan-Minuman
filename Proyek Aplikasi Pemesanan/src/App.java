import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage){
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
            stage.setTitle("Aplikasi Pemesanan Minuman");
            stage.setResizable(false);
            Image icon = new Image("Logo.png");
            stage.getIcons().add(icon);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
        }
    }
}
