/**
 * Contato_Comercial
 */
public class Contato_Comercial extends Contato_Basico{
private  String atividade;
private String funcionario;
public Contato_Comercial(String nome,String atividade, String funcionario ){
    super(nome);
    this.atividade = atividade;
    this.funcionario = funcionario;
}   
@Override
public void getDados(){
    super.getDados();
    System.out.println("Funcionario é " + this.funcionario);
    System.out.println("Atividade é " + this.atividade);
}
}