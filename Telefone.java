/**
 * Telefone
 */
public class Telefone{
    private String numero;
    private String tipo;

    public Telefone(String numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
    }
    
    public void getTelefone(){
        System.out.println( this.numero + " do tipo " + this.tipo);
    }
}