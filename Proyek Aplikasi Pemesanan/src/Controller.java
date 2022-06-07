import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Label Alamat;

    @FXML
    private CheckBox Americano;

    @FXML
    private AnchorPane AplikasiPemesananMinuman;

    @FXML
    private AnchorPane AplikasiPemesananMinuman1;

    @FXML
    private Label Cofee;

    @FXML
    private CheckBox CofeeMilk;

    @FXML
    private Label DaftarMenu;

    @FXML
    private CheckBox Espresso;

    @FXML
    private CheckBox Greentea;

    @FXML
    private Label HargaAmericano;

    @FXML
    private Label HargaCofee;

    @FXML
    private Label HargaCofeeMilk;

    @FXML
    private Label HargaEspresso;

    @FXML
    private Label HargaGreentea;

    @FXML
    private Label HargaLatte;

    @FXML
    private Label HargaLemontea;

    @FXML
    private Label HargaNonCofee;

    @FXML
    private Label HargaTaro;

    @FXML
    private Label HargaThaitea;

    @FXML
    private Label Jarak;

    @FXML
    private TextField JumlahAmericano;

    @FXML
    private Label JumlahCofee;

    @FXML
    private TextField JumlahCofeeMilk;

    @FXML
    private TextField JumlahEspresso;

    @FXML
    private TextField JumlahGreentea;

    @FXML
    private TextField JumlahLatte;

    @FXML
    private TextField JumlahLemontea;

    @FXML
    private Label JumlahNonCofee;

    @FXML
    private TextField JumlahTaro;

    @FXML
    private TextField JumlahThaitea;

    @FXML
    private CheckBox Latte;

    @FXML
    private CheckBox Lemontea;

    @FXML
    private Label NonCofee;

    @FXML
    private Button Pesan;

    @FXML
    private CheckBox Taro;

    @FXML
    private CheckBox Thaitea;

    @FXML
    private TextField TxtAlamat;

    @FXML
    private TextField TxtJarak;

    @FXML
    private ImageView lambangKopi;

    // approve empty textfield
    private int approve = 0;

    //Americano
    public int hargaAme;
    public int jumlahAme;
    @FXML
    void CheckBoxAmericano() {
        hargaAme = Americano.isSelected() ? 20000 : 0; 
    }  
    @FXML
    void TextJumlahAmericano() {
        if (JumlahAmericano.getText().trim().isEmpty()) {jumlahAme = 0;}
        else {jumlahAme = Integer.valueOf(JumlahAmericano.getText()); approve++;}
        
    }
    public int HargaAmericano() {
        CheckBoxAmericano();
        TextJumlahAmericano();
        return hargaAme * jumlahAme;
    }

    //Espresso
    public int hargaEsp;
    public int jumlahEsp;
    @FXML
    void CheckBoxEspresso() {
        hargaEsp = Espresso.isSelected() ? 15000 : 0;
    }
    @FXML
    void TextJumlahEspresso() {
        if (JumlahEspresso.getText().trim().isEmpty()) {jumlahEsp = 0;}
        else {jumlahEsp = Integer.valueOf(JumlahEspresso.getText()); approve++;}
    }
    public int HargaEspresso() {
        CheckBoxEspresso();
        TextJumlahEspresso();
        return hargaEsp * jumlahEsp;
    }

    //CofeeMilk
    public int hargaCM;
    public int jumlahCM;
    @FXML
    void CheckBoxCofeeMilk() {
        hargaCM = CofeeMilk.isSelected() ? 19000 : 0;
    }
    @FXML
    void TextJumlahCofeeMilk() {
        if (JumlahCofeeMilk.getText().trim().isEmpty()) jumlahCM = 0;
        else {jumlahCM = Integer.valueOf(JumlahCofeeMilk.getText()); approve++;}
    }
    public int HargaCofeeMilk() {
        CheckBoxCofeeMilk();
        TextJumlahCofeeMilk();
        return hargaCM * jumlahCM;
    }

    //Latte
    public int hargaLat;
    public int jumlahLat;
    @FXML
    void CheckBoxLatte() {
        hargaLat = Latte.isSelected() ? 20000 : 0;
    }
    @FXML
    void TextJumlahLatte() {
        if (JumlahLatte.getText().trim().isEmpty()) {jumlahLat = 0;}
        else {jumlahLat = Integer.valueOf(JumlahLatte.getText()); approve++;}
    }
    public int HargaLatte() {
        CheckBoxLatte();
        TextJumlahLatte();
        return hargaLat * jumlahLat;
    }
    
    //Lemontea
    public int hargaLemt;
    public int jumlahLemt;
    @FXML
    void CheckBoxLemontea() {
        hargaLemt = Lemontea.isSelected() ? 10000 : 0;
    }
    @FXML
    void TextJumlahLemontea() {
        if (JumlahLemontea.getText().trim().isEmpty()) {jumlahLemt = 0;}
        else {jumlahLemt = Integer.valueOf(JumlahLemontea.getText()); approve++;}
    }
    public int HargaLemontea() {
        CheckBoxLemontea();
        TextJumlahLemontea();
        return hargaLemt * jumlahLemt;
    }
  
    //Greentea
    public int hargaGrn;
    public int jumlahGrn;
    @FXML
    void CheckBoxGreentea() {
        hargaGrn = Greentea.isSelected() ? 17000 : 0;
    }
    @FXML
    void TextJumlahGreentea() {
        if (JumlahGreentea.getText().trim().isEmpty()) {jumlahGrn = 0;}
        else {jumlahGrn = Integer.valueOf(JumlahGreentea.getText()); approve++;}
    }
    public int HargaGreentea() {
        CheckBoxGreentea();
        TextJumlahGreentea();
        return hargaGrn * jumlahGrn;
    }

    //Thaitea
    public int hargaThai;
    public int jumlahThai;
    @FXML
    void CheckBoxThaitea() {
        hargaThai = Thaitea.isSelected() ? 17000 : 0;
    }
    @FXML
    void TextJumlahThaitea() {
        if (JumlahThaitea.getText().trim().isEmpty()) {jumlahThai = 0;}
        else {jumlahThai = Integer.valueOf(JumlahThaitea.getText()); approve++;}
    }
    public int HargaThaitea() {
        CheckBoxThaitea();
        TextJumlahThaitea();
        return hargaThai * jumlahThai;
    }
        
    //Taro
    public int hargaTaro;
    public int jumlahTaro;
    @FXML
    void CheckBoxTaro() {
        hargaTaro = Taro.isSelected() ? 17000 : 0;
    }
    @FXML
    void TextJumlahTaro() {
        if (JumlahTaro.getText().trim().isEmpty()) {jumlahTaro = 0;}
        else {jumlahTaro = Integer.valueOf(JumlahTaro.getText()); approve++;}
    }
    public int HargaTaro() {
        CheckBoxTaro();
        TextJumlahTaro();
        int result = hargaTaro * jumlahTaro;
        return result;
    }
    @FXML
    void TextAlamat() {
        if (TxtAlamat.getText().trim().isEmpty()) approve = 0;
    }
    private int jrk;
    @FXML
    void TextJarak() {
        if (TxtJarak.getText().trim().isEmpty()) approve = 0;
        else jrk = Integer.valueOf(TxtJarak.getText());
    }

    // Action for button
    @FXML
    void PesanButton(ActionEvent event) throws IOException{
        TextJumlahAmericano(); TextJumlahCofeeMilk(); TextJumlahEspresso(); TextJumlahLatte(); 
        TextJumlahLemontea(); TextJumlahGreentea(); TextJumlahThaitea(); TextJumlahTaro();
        TextJarak();
        TextAlamat();
        if (approve != 0){
            int seluruhHarga = HargaAmericano() + HargaEspresso() + HargaCofeeMilk() + HargaLatte() + HargaLemontea() + HargaGreentea() + HargaThaitea() + HargaTaro();
            String str = Integer.toString(seluruhHarga);
            Parent root;
    
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tampilan2.fxml"));
            root = loader.load();
    
            Controller2 controller2 = loader.getController();
            controller2.tampilkanHarga(str);
            controller2.communicatorJarak1(jrk);
            
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.show();
        }
        if (approve == 0){
            Parent root;
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tampilan4.fxml"));
            root = loader.load();
    
            Controller4 controller4 = loader.getController();
            controller4.TxtDriverDitemukan.setText("");
            controller4.txtPengantaran.setText("Silahkan Coba Lagi");
            controller4.waktuSampai.setText("");
            
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.show();
        }
    }
}