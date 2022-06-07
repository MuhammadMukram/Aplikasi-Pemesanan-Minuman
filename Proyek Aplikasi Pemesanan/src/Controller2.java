import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller2 {
    //Scene 2
    @FXML
    private AnchorPane KonfirMenu;

    @FXML
    private Button BatalkanPesanan;

    @FXML
    private Button Konfirmasi;

    @FXML
    private Label MenuYangDipesan;

    @FXML
    private Label Rp;

    @FXML
    private Label totalHarga;


    private int jarak1;

    void communicatorJarak1(int nilai){
        jarak1 = nilai;
    }

    public void tampilkanHarga(String seluruhHarga){
        totalHarga.setText(seluruhHarga);
    }

    @FXML
    void BatalkanPesananButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tampilan1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene (root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void KonfirmasiButton(ActionEvent event) throws IOException {

        Parent root;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tampilan3.fxml"));
        root = loader.load();

        Controller3 controller3 = loader.getController();
        controller3.communicatorJarak2(jarak1);
        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene (root);
        stage.setScene(scene);
        stage.show();
    }
}
