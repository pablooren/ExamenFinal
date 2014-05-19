/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Lectura {
     File f;
     
       FileReader lectorArchivo;
       FileWriter escritorArchivo;
       ArrayList<String> desco=new ArrayList<String>();
       String files="";
       Decodificacion deco;
       public void GetFichero(String file){
           this.files=file;
           
}
       public Lectura(){
           
       }
       public void leer(){
           f = new File (files);
           try{
               lectorArchivo = new FileReader(f);
               BufferedReader lr = new BufferedReader(lectorArchivo);
               String linea = "";
             
               String temp = "";
               linea=lr.readLine();
               int nu = Integer.parseInt(linea);
               linea= lr.readLine();
            for(int j=1;j<=nu;j++){
                  deco = new Decodificacion();
                 temp=deco.Decoficar(linea);
                 System.out.println(temp);
                 desco.add(temp);
                   linea=lr.readLine();
              }
               
                lr.close();
            lectorArchivo.close();
           }catch(Exception e){
               e.fillInStackTrace();
                          }
       }
       public void escribir(){
           File f;
           f= new File("HablandoLenguas_201314881.txt");
           if(f.exists()){
               f.delete();
           }
	FileWriter flujoSalida=null;
        BufferedWriter bw=null;
           try{
	flujoSalida=new FileWriter(f);
        bw = new BufferedWriter(flujoSalida);
        for(int a=0;a<desco.size();a++){
	int no=a+1;
	bw.write("Caso No."+no+"  "+desco.get(a));
        bw.newLine();
	
        }
        bw.close();
        flujoSalida.close();
       }catch(IOException ex){
           
       }}
}
