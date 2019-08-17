package estudts;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *Creacion de la clase estudiante
 * @author Erick
 */
public class estudiante {
    //En las siguientes lineas se establecen los ATRIBUTOS de la clase
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
    
    /**
     * Método para obtener el tipo del estudiante SimpleStringProperty
     * @return SimpleDoubleProperty devuelve el tipo del estudiante
     */
    public SimpleStringProperty getTipo() {
            return Tipo;
    }
    /**
     * Método para obtener el nombre del estudiante SimpleStringProperty
     * @return SimpleDoubleProperty devuelve el nombre del estudiante
     */
    public SimpleStringProperty getNombre(){
        return Nombre;
    }
    /**
     * Método para obtener el Nickname del estudiante SimpleStringProperty
     * @return SimpleDoubleProperty devuelve el Nickname del estudiante
     */
     public SimpleStringProperty getNick(){
        return Nickname;
    }
     /**
     * Método para obtener el correo del estudiante SimpleStringProperty
     * @return SimpleDoubleProperty devuelve el correo del estudiante
     */
    public SimpleStringProperty getCorreo(){
        return Correo;
    }
    /**
     * Método para obtener el carné del estudiante SimpleStringProperty
     * @return SimpleIntegerProperty devuelve el valor en del carné del estudiante
     */
    public SimpleIntegerProperty getCarnet(){
        return Carnet;
    }
     /**
     * Método para obtener el número del estudiante SimpleStringProperty
     * @return SimpleIntegerProperty devuelve el valor en del número del estudiante
     */
    public SimpleIntegerProperty getTelefono(){
        return Numero;
    }
    /**
     * Método que estabacle los atributos: carné, nombre,correo, numero, nicname y 
     * tipo de estudiante
     * @param carnet Integer para darle un carné al estudiante
     * @param nombre String para establecer el nombre del estudiante
     * @param correo String para establecer el correo del estudiante
     * @param numero Integer para establecer el numero del estudiante
     * @param nickname String para establecer el Nicname del estudiante
     * @param tipo String para establecer el tipo de estudiante
     */
    public void setDatos(Integer carnet,String nombre,String correo,Integer numero,String nickname,String tipo) {
            
            this.Carnet=new SimpleIntegerProperty (carnet);
            this.Nombre=new SimpleStringProperty(nombre);
            this.Correo=new SimpleStringProperty(correo);
            this.Numero=new SimpleIntegerProperty (numero);
            this.Nickname=new SimpleStringProperty(nickname);
            this.Tipo=new SimpleStringProperty(tipo);
    }
    /**
     * Método para establecer los atributos prom_ex,prom_quiz, prom_tareas, 
     * proyec_1, proyec_2 y proyec_3 del estudiante
     * @param prom_ex Double para establecer el promedio de examenes
     * @param prom_quiz Double para establecer el promedio de quices
     * @param prom_tareas Double para establecer el promedio de tareas
     * @param proyec_1 Double para establecer la nota del proyecto 1
     * @param proyec_2 Double para establecer la nota del proyecto 2
     * @param proyec_3 Double para establecer la nota del proyecto 3
     */
    public void setEvaluacion(Double prom_ex,Double prom_quiz,Double prom_tareas,
                              Double proyec_1,Double proyec_2,Double proyec_3) {
        Prom_ex= new SimpleDoubleProperty (prom_ex);
        Prom_quiz= new SimpleDoubleProperty( prom_quiz);
        Prom_tareas= new SimpleDoubleProperty(prom_tareas);
        Proyec_1= new SimpleDoubleProperty(proyec_1);
        Proyec_2= new SimpleDoubleProperty( proyec_2);
        Proyec_3= new SimpleDoubleProperty(proyec_3);
        
    }
    /**
     * Funcion que se sobre escribe en la clase notas
     */
    public void setProm_proyc() {
    }
    }


   

