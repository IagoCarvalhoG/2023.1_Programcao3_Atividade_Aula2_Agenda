import java.util.Calendar;

public class EContato extends Contato {
    protected String email;
    protected String hp;
    public EContato(String nome,Calendar dtnasc,String email,String hp){
        super(nome, dtnasc);
        this.email = email;
        this.hp = hp;
    }
    @Override
    public void getDados(){
        super.getDados();
        System.out.println("Email é " + this.email);
        System.out.println("Homepage é " + this.hp);
    }
    public String getEmail(){
        return this.email;
    }
    public String getHomepage(){
        return this.hp;
    }
    
}
