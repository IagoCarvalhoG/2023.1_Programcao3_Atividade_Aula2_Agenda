/**
 * Contato_Basico
 */
import java.util.ArrayList;
public class Contato_Basico{
    private String nome;
    private ArrayList<Telefone> telefones;
    
    public Contato_Basico(String nome){
        this.nome = nome;
        this.telefones = new ArrayList<Telefone>();
    }
    
    public void printNome(){
        System.out.println("O nome é " + this.nome);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(Telefone telefone){
        telefones.add(telefone);
    }
    public void getDados(){
        printNome();
        System.out.println("E seus telefones são ");
        for(int i=0; i<telefones.size();i++){
            telefones.get(i).getTelefone();
        }
    }
}
