import java.util.Calendar;
import java.util.GregorianCalendar;
public class Contato extends Contato_Basico {
    private Calendar dtnasc;
    public Contato(String nome, Calendar dtnasc){
        super(nome);
        this.dtnasc = dtnasc;
    }
    public int getIdade(){
        Calendar data = new GregorianCalendar();
        int idade = data.get(Calendar.YEAR) -this.dtnasc.get(Calendar.YEAR);
        data.set(Calendar.YEAR, this.dtnasc.get(Calendar.YEAR));
        if(data.before(this.dtnasc) == true){
            idade-=1;
            return idade;
        }
        return idade;
    }
    @Override
    public void getDados(){
        System.out.println("Nascido em " + this.dtnasc.get(Calendar.DAY_OF_MONTH) + "/" + (this.dtnasc.get(Calendar.MONTH)+1)+"/" + this.dtnasc.get(Calendar.YEAR));
        System.out.println("Sua idade é " + getIdade());

    }
}
