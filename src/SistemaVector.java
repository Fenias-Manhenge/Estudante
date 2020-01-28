/**
 *
 * @author Fenias
 */
import java.util.*;

public class SistemaVector {
    
    public Vector x=new Vector();
    
    public void lerDados(){
        Scanner t=new Scanner(System.in);
        
        Estudante z;
        int cod;
        
        do{System.out.print("INTRODUZA O CODIGO: ");
            cod=t.nextInt();
                if(cod>0){
                    z=new Estudante();
                    z.setcodigo(cod);
                    System.out.print("INTRODUZA O NOME: ");
                    z.nome=t.next();
                    System.out.print("INTRODUZA MEDIA: ");
                    z.media=t.nextDouble();
                    x.addElement(z);
                    System.out.println();     
                }
        }while(cod>0);
    }
    public void imprimeTodos(){
        Estudante m;
        for(int i=0;i<x.size();i++){
          m=(Estudante)x.get(i);
            System.out.println(m.nome+"        "+m.media);
        }
    }
    public void imprimeDispensador(){
        Estudante k;
        
        for(int i=0;i<x.size();i++){
            k=(Estudante)x.get(i);
   
           if(k.media>=14){
            System.out.println(k.nome+"        "+k.media);
           } 
        }
    }
    public void apagarEstudante(){
        Scanner t=new Scanner(System.in);
        
        Estudante a;
        
        System.out.println("INTRODUZA CODIGO: ");
        int cod=t.nextInt();
        
        for (int i = 0; i <x.size() ; i++) {
            a=(Estudante)x.get(i);
            if(a.getcodigo()==cod){
                x.removeElementAt(i);
                System.out.println("REMOCAO FEITA COM SUCESSO");
            }    
        }
    }    
    public void ordenarVector(){
         Estudante a,b;
         int i,j;
         
         for(i=0;i<x.size()-1 ; i++) 
             for(j=i+1;j<x.size();j++){
                 a=(Estudante)x.get(i);
                 b=(Estudante)x.get(j);
                 if(a.getcodigo()>b.getcodigo()){
                     x.setElementAt(b, i);
                     x.setElementAt(a, j);
                 }
             }
    }   
    public void procurarEstudante(){
        Scanner t=new Scanner(System .in); 
        Estudante v;
             
        System.out.println("INTRODUZA CODIGO: ");
        int cod=t.nextInt();
        
        for(int i=0;i<x.size()-1 ; i++){
            v=(Estudante)x.get(i);
            if(v.getcodigo()==cod){
                System.out.println("CODIGO: "+v.getcodigo());
                System.out.println("NOME: "+v.nome);
            }    
        }
    }
    public void menu(){
          Scanner t=new Scanner(System.in);
          int j;
          
          do{System.out.println("-------------");
              System.out.println("MENU DO SISTEMA");
              System.out.println("1.INTRODUZIR DADOS: ");
              System.out.println("2.IMPRIME TODOS: ");
              System.out.println("3.IMPRIME OS QUE DISPENSARAM: ");
              System.out.println("4.PROCURAR ESTUDANTE: ");
              System.out.println("5.EXIT ");
              System.out.println("OPCAO[1/2/3/4/5]");
              
              j=t.nextInt();
              switch(j){
                  case 1:lerDados();break;
                  case 2:imprimeTodos();break;
                  case 3:imprimeDispensador();break;
                  case 4:procurarEstudante();break;
                  case 5:System.exit(0);
              }
            }while(true);
    }
    
    public static void main(String[] args) {
        SistemaVector d=new SistemaVector();
        d.menu();
    }
}
