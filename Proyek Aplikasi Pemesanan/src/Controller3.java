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

public class Controller3 {

    @FXML
    private Label label1;

    @FXML
    private Button OK1;

    @FXML
    private Label label2;

    @FXML
    private AnchorPane tungguPesanan;

    private int jarak2;

    void communicatorJarak2(int jarak){
        jarak2 = jarak;
    }

    @FXML
    void OKButton1(ActionEvent event) throws IOException {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        Parent root;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tampilan4.fxml"));
        root = loader.load();

        Controller4 controller4 = loader.getController();
        controller4.communicatorJarak3(jarak2);
        if (controller4.jarak3 > 0 && controller4.jarak3 <= 1) controller4.waktuSampai.setText("16,5 menit");
        else if (controller4.jarak3 > 1 && controller4.jarak3 <= 2) controller4.waktuSampai.setText("18 menit");
        else if (controller4.jarak3 > 2 && controller4.jarak3 <= 3) controller4.waktuSampai.setText("19,5 menit");
        else if (controller4.jarak3 > 3 && controller4.jarak3 <= 4) controller4.waktuSampai.setText("21 menit");
        else if (controller4.jarak3 > 4 && controller4.jarak3 <= 5) controller4.waktuSampai.setText("22,5 menit");
        else if (controller4.jarak3 > 5 && controller4.jarak3 <= 6) controller4.waktuSampai.setText("24 menit");
        else if (controller4.jarak3 > 6 && controller4.jarak3 <= 7) controller4.waktuSampai.setText("25,5 menit");
        else if (controller4.jarak3 > 7 && controller4.jarak3 <= 8) controller4.waktuSampai.setText("27 menit");
        else if (controller4.jarak3 > 8 && controller4.jarak3 <= 9) controller4.waktuSampai.setText("28,5 menit");
        else if (controller4.jarak3 > 9 && controller4.jarak3 <= 10) controller4.waktuSampai.setText("30 menit");
        else if (controller4.jarak3 > 10) {controller4.waktuSampai.setText(""); controller4.txtPengantaran.setText(""); controller4.TxtDriverDitemukan.setText("Maaf, Anda melewati batas");;}
        else {controller4.waktuSampai.setText(""); controller4.txtPengantaran.setText(""); controller4.TxtDriverDitemukan.setText("Maaf, Anda tidak dapat memesan");}

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene (root);
        stage.setScene(scene);
        stage.show();
    }
}
