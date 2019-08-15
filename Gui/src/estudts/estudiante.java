package estudts;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Erick
 */
public class estudiante {
    public SimpleIntegerProperty Carnet;
    public SimpleStringProperty Nombre;
    public SimpleStringProperty Correo;
    public SimpleIntegerProperty Numero;
    public SimpleStringProperty Nickname;
    public SimpleStringProperty Tipo;
    public SimpleDoubleProperty Prom_ex;
    public SimpleDoubleProperty Prom_quiz;
    public SimpleDoubleProperty Prom_tareas;
    public SimpleDoubleProperty Proyec_1;
    public SimpleDoubleProperty Proyec_2;
    public SimpleDoubleProperty Proyec_3;
    public SimpleDoubleProperty Prom_proyc;
    public SimpleDoubleProperty Prom__ex_quiz_tarea;

    public SimpleStringProperty getTipo() {
            return Tipo;
    }
    public SimpleStringProperty getNombre(){
        return Nombre;
    }
     public SimpleStringProperty getNick(){
        return Nickname;
    }
    public SimpleStringProperty getCorreo(){
        return Correo;
    }
    public SimpleIntegerProperty getCarnet(){
        return Carnet;
    }
    public SimpleIntegerProperty getTelefono(){
        return Numero;
    }
    
    public void setDatos(Integer carnet,String nombre,String correo,Integer numero,String nickname,String tipo) {
            
            this.Carnet=new SimpleIntegerProperty (carnet);
            this.Nombre=new SimpleStringProperty(nombre);
            this.Correo=new SimpleStringProperty(correo);
            this.Numero=new SimpleIntegerProperty (numero);
            this.Nickname=new SimpleStringProperty(nickname);
            this.Tipo=new SimpleStringProperty(tipo);
    }
    public void setEvaluacion(Double prom_ex,Double prom_quiz,Double prom_tareas,
                              Double proyec_1,Double proyec_2,Double proyec_3) {
        Prom_ex= new SimpleDoubleProperty (prom_ex);
        Prom_quiz= new SimpleDoubleProperty( prom_quiz);
        Prom_tareas= new SimpleDoubleProperty(prom_tareas);
        Proyec_1= new SimpleDoubleProperty(proyec_1);
        Proyec_2= new SimpleDoubleProperty( proyec_2);
        Proyec_3= new SimpleDoubleProperty(proyec_3);
        
    }
    /*publi
    c void setEvaluacion(double prom_ex,double prom_quiz,double prom_tareas,
    double proyec_1,double proyec_2,double proyec_3) {
    }*/
    
    }


   

