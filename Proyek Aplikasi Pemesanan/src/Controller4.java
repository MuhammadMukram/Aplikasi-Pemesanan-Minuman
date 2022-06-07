import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller4 {
    @FXML
    private Button OK1;

    @FXML
    private AnchorPane Pengantaran;

    @FXML
    Label TxtDriverDitemukan;

    @FXML
    Label txtPengantaran;

    @FXML
    Label waktuSampai;

    int jarak3;
    void communicatorJarak3 (int jarak){
        jarak3 = jarak;
    }

    // mengembalikan ke menu pemesanan
    @FXML
    void OKButton1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene (root);
        stage.setScene(scene);
        stage.show();
    }
}
