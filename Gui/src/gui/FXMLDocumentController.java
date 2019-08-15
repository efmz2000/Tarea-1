/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import estudts.Notas;
import static estudts.Notas.read;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;



/**
 *
 * @author Erick
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML TableView<Notas> tablaEstudiantes=new TableView<Notas>() ;	
    @FXML public   TableColumn <Notas,Number> colCarne ;
    @FXML private  TableColumn <Notas,String> colNombre;
    @FXML private  TableColumn <Notas,String> colCorreo;
    @FXML private  TableColumn <Notas,Number> colTelefono;
    @FXML private  TableColumn <Notas,String> colNick;
    @FXML private  TableColumn <Notas,String> colTipo;
    @FXML private  TableColumn <Notas,Number> colPromEx;
    @FXML private  TableColumn <Notas,Number> colPromQuiz;
    @FXML private  TableColumn <Notas,Number> colPromTareas;
    @FXML private  TableColumn <Notas,Number> colPromETQ;
    @FXML private  TableColumn <Notas,Number> colProy1;
    @FXML private  TableColumn <Notas,Number> colProy2;
    @FXML private  TableColumn <Notas,Number> colProy3;
    @FXML private  TableColumn <Notas,Number> colProyProm;
    @FXML private  TableColumn <Notas,Number> colNota;
    @FXML private Button cargarBtn;
    @FXML private TextField dirTxt;
    ObservableList <Notas> Estudiantes=FXCollections.observableArrayList();
    
   

    
  
    
    
   
    public void ver(){
        String dir="C:\\Users\\Erick\\Desktop\\datos II\\Prueba_lista.csv";
        ArrayList <Notas> listaEst=(read(dir));
        
        int largo=listaEst.size();
        for (int a=0; a<largo;a++){            
            Notas est = listaEst.get(a);
            Estudiantes.add(est);           
        } 
        
        
        //tablaEstudiantes.setItems(Estudiantes);
    }

    
@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ver();
        
        colCarne.setCellValueFactory(e->e.getValue().getCarnet());
        colNombre.setCellValueFactory(e->e.getValue().getNombre());
        colCorreo.setCellValueFactory(e->e.getValue().getCorreo());
        colTelefono.setCellValueFactory(e->e.getValue().getTelefono());
        colNick.setCellValueFactory(e->e.getValue().getNick());
        colTipo.setCellValueFactory(e->e.getValue().getTipo());
        colPromEx.setCellValueFactory(e->e.getValue().getEx());
        colPromQuiz.setCellValueFactory(e->e.getValue().getQuiz());
        colPromTareas.setCellValueFactory(e->e.getValue().getTarea());
        colPromETQ.setCellValueFactory(e->e.getValue().get_prom_ex_quiz_tarea());
        colProy1.setCellValueFactory(e->e.getValue().getProy1());
        colProy2.setCellValueFactory(e->e.getValue().getProy2());
        colProy3.setCellValueFactory(e->e.getValue().getProy3());
        colProyProm.setCellValueFactory(e->e.getValue().get_prom_proy());
        colNota.setCellValueFactory(e->e.getValue().getNota());
        
        tablaEstudiantes.setItems(Estudiantes);
     }
}
  
        


    