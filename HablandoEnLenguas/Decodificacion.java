/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pablo
 */
public class Decodificacion {
    String linea="";
    String decifrado="";
    public Decodificacion(){
        
    }
    public String Decoficar(String lin){
        this.linea=lin;
        char[] lt = new char[linea.length()];
        for(int i=0;i<linea.length();i++){ 
            lt[i]=linea.charAt(i);
            switch(lt[i]){
                case 'a':
                    lt[i]='y';
                    break;
                case 'b':
                    lt[i]='h';
                    break;
                case 'c':
                    lt[i]='e';
                    break;
                case 'd':
                    lt[i]='s';
                    break;
                case 'e':
                    lt[i]='o';
                    break;
                case 'f':
                    lt[i]='c';
                    break;
                case 'g':
                    lt[i]='v';
                    break;
                case 'h':
                    lt[i]='x';
                    break;
                case 'i':
                    lt[i]='d';
                    break;
                case 'j':
                    lt[i]='u';
                    break;
                case 'k':
                    lt[i]='i';
                    break;
                case 'l':
                    lt[i]='g';
                    break;
                case 'm':
                    lt[i]='l';
                    break;
                case 'n':
                    lt[i]='b';
                    break;
                case 'o':
                    lt[i]='k';
                    break;
                case 'p':
                    lt[i]='r'; 
                    break;
                case 'q':
                    lt[i]='z';
                    break;
                case 'r':
                    lt[i]='t';
                    break;
                case 's':
                    lt[i]='n';
                    break;
                case 't':
                    lt[i]='w';
                    break;
                case 'u':
                    lt[i]='j';
                    break;
                case 'v':
                    lt[i]='p';
                    break;
                case 'w':
                    lt[i]='f';
                    break;
                case 'x':
                    lt[i]='m';
                    break;
                case 'y':
                    lt[i]='a';
                    break;
                case 'z':
                    lt[i]='q';
                    break;
                default:
                    lt[i]=lt[i];
                                                                            
            }
        }
        decifrado= String.valueOf(lt);
        return decifrado;
    }
}
