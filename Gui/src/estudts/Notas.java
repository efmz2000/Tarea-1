
package estudts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Creación de la clase notas
 * @author Erick
 */
//el keyword extends permite realizae una HERENCIA de la clase estudiante
public class Notas extends estudiante{
    public SimpleDoubleProperty prom_proyc;
    public SimpleDoubleProperty prom__ex_quiz_tarea;
    public SimpleDoubleProperty notaFinal;
    public static String SEPARADOR = ",";
    
    
    //Al usar la keyword private en este se crea el encapsulamiento 
    private void notFinal(){ 
        double py=(((Proyec_1.get()+Proyec_3.get()+Prom_ex.get())/3)*60/100);
        double qz=Prom_quiz.get()*10/100;
        double tr=Prom_tareas.get()*10/100;
        double ex=Prom_ex.get()*20/100;
        double nota=(py+qz+tr+ex);
        this.notaFinal=new SimpleDoubleProperty(nota);
    } 
    //Hay una sobrecarga debido a que hay otro metodo del mismo nombre pero 
    //con diferentes parametros
    private void notFinal(double nota){
         this.notaFinal=new SimpleDoubleProperty(nota);   
    }    
    
    /**
     * Método para obtener la nota final
     * @return Nota Final
     */
    public SimpleDoubleProperty getNota(){
    return notaFinal;
    }
    /**
     * Método para calcular y establecer el promedio de los proyectos
     */
    //se realiza una sobreescritura del metodo heredado de la clase estudinate
    @Override //se realiza una sobreescritura del metodo heredado de la clase estudinate
    public void setProm_proyc() {
            double prom=(Proyec_1.get()+Proyec_2.get()+Proyec_3.get())/3;
            this.prom_proyc= new SimpleDoubleProperty(prom);
    }
     /**
     * Método para calcular y establecer el promedio de quices,tareas y examenes
     */
    public void setProm__ex_quiz_tarea() {
            double prom=(Prom_ex.get()+Prom_quiz.get()+Prom_tareas.get())/3;
            this.prom__ex_quiz_tarea=new SimpleDoubleProperty(prom);
    }
    /**
     * Metodo para obtener la el promedio de los proyectos en formato SimpleDoubleProperty
     * @return SimpleDoubleProperty devuelve un numero que representa el
     *         promedio de los proyectos
     */
    public SimpleDoubleProperty get_prom_proy(){
        return prom_proyc;          
    }
    /**
     * Método para obtener el promedio de quices, tareas y examenes en formato SimpleDoubleProperty
     * @return SimpleDoubleProperty devuelve un numero que representa 
     *         el promedio de quices, tareas y examenes
     */
    public SimpleDoubleProperty get_prom_ex_quiz_tarea(){
        return prom__ex_quiz_tarea;          
    }
    /**
     * Método para obtener el promedio de examenes en formato SimpleDoubleProperty
     * @return SimpleDoubleProperty devuelve un numero que representa 
     *         el promedio de examenes
     */
    public SimpleDoubleProperty getEx() {
            return Prom_ex;
    }
    /**
     * Método para obtener el promedio de quices en formato SimpleDoubleProperty
     * @return SimpleDoubleProperty devuelve un numero que representa 
     *         el promedio de quices
     */
    public SimpleDoubleProperty getQuiz() {
            return Prom_quiz;
    }
    /**
     * Método para obtener el promedio de tareas en formato SimpleDoubleProperty
     * @return SimpleDoubleProperty devuelve un numero que representa 
     *         el promedio de tareas 
     */
    public SimpleDoubleProperty getTarea() {
            return Prom_tareas;
    }
    /**
     * Método para obtener la nota del proyecto 1 formato SimpleDoubleProperty
     * @return SimpleDoubleProperty devuelve un numero que representa 
     *         la nota del proyecto 1
     */
    public SimpleDoubleProperty getProy1() {
            return Proyec_1;
    }
    /**
     * Método para obtener la nota del proyecto 1 formato SimpleDoubleProperty
     * @return SimpleDoubleProperty devuelve un numero que representa 
     *         la nota del proyecto 2
     */
    public SimpleDoubleProperty getProy2() {
            return Proyec_2;
    }
    /**
     * Método para obtener la nota del proyecto 1 formato SimpleDoubleProperty
     * @return SimpleDoubleProperty devuelve un numero que representa 
     *         la nota del proyecto 3
     */
    public SimpleDoubleProperty getProy3() {
            return Proyec_3;
    }

    private void calificar()
    {

            if("A".equals(Tipo.get().toUpperCase())) {
                setProm_proyc();
            } else {			
            }
            if("B".equals(Tipo.get().toUpperCase())) {		
                    setProm__ex_quiz_tarea();
            }
    }
    
    
    
    /**
     * Metodo para abrir y leer el archivo csv 
     * @param dir dirección del archivo csv que se va a leer
     * @return devuelve un ArrayList con los objetos creados en base al csv
     */
    public static ArrayList<Notas> read(String dir) {
            ArrayList <Notas> listaEstudiantes= new ArrayList <> (); 
            BufferedReader bufferLectura = null;
            try {
                // Abrir el .csv en buffer de lectura
                bufferLectura = new BufferedReader(new FileReader(dir ));
              
                // Leer una linea del archivo
                String linea = bufferLectura.readLine();
                linea = bufferLectura.readLine();
                while (linea != null) {
                    //creacion de una INSTANCIA
                    Notas Erick=new Notas(); 
                    
                    String[] listDatos= linea.split(SEPARADOR); 
                    Integer carnet  = Integer.parseInt(listDatos[0]);
                    String  nombre  = listDatos[1];
                    String  correo  = listDatos[2];
                    Integer celular = Integer.parseInt(listDatos[3]);
                    String  apodo   = listDatos[4];
                    String  tipoEst = listDatos[5];
                    Double  examen  = (double)Integer.parseInt(listDatos[6]);
                    Double  quiz    = (double)Integer.parseInt(listDatos[7]);
                    Double  tarea   = (double)Integer.parseInt(listDatos[8]);
                    Double  proy1   = (double)Integer.parseInt(listDatos[9]);
                    Double  proy2   = (double)Integer.parseInt(listDatos[10]);
                    Double  proy3   = (double)Integer.parseInt(listDatos[11]);
                    if  (tipoEst.equals("A")) {
                        tipoEst="A";
                    }
                    if ( tipoEst.equals("B")) {
                        tipoEst="B";
                    }
                    Erick.setDatos(carnet,nombre,correo,celular,apodo,tipoEst);
                    Erick.setEvaluacion(examen,quiz,tarea,proy1,proy2,proy3);
                    Erick.calificar();
                    Erick.notFinal();
                    listaEstudiantes.add(Erick);
                 // Volver a leer otra línea del fichero
                linea = bufferLectura.readLine();

                }
                } 
            catch (IOException e) {
                e.printStackTrace();
                }
            finally {
                // Cierro el buffer de lectura
                if (bufferLectura != null) {
                    try {
                        bufferLectura.close();
                        } 
                    catch (IOException e) {
                        e.printStackTrace();
                        }
                    }   
                }
    return listaEstudiantes;
    }

}

