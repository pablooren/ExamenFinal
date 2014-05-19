/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Pablo
 */
public class Examen {
    Lectura lec;
    public Examen(){
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Examen().init(args[0]);
    }
    public void init(String fi){
        lec =  new Lectura();
       String file =fi;
       lec.GetFichero(file);
       lec.leer();
       lec.escribir();
    }
}
