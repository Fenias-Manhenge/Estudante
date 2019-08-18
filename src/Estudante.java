/**
 *
 * @author Fenias
 */
public class Estudante {
    private int codigo;
    public String nome;
    public double media;
    
    public Estudante(){
        codigo=0;
        nome="  ";
        media=0.0;
    }
    public void setcodigo(int a){
        codigo=a;
    }
    public int getcodigo(){
        return codigo;
    }
}
