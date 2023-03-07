import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class Agenda {
    private static ArrayList<EContato> eContatos;
    private static ArrayList<Contato_Comercial> contatosComerciais;
    public Agenda(){
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eContatos = new ArrayList<EContato>();
        contatosComerciais = new ArrayList<Contato_Comercial>();
        int ui = 1;
        
        ArrayList<Contato_Basico> empregados = new ArrayList<Contato_Basico>();
        while(ui !=0){
            System.out.println("Para adicionar um empregado a lista favor digitar 1 ");
            System.out.println("Para buscar dados de um empregado atravéz de seu nome digite 2 ");
            System.out.println("Para buscar dados de um empregado atravéz de sua posicao digite 3 ");
            System.out.println("Para buscar dados de um empregado atravéz de seu email digite 4 ");
            System.out.println("Para buscar a quantidade de empregados cadastrados digite 5 ");
            System.out.println("Para retornar todos os dados de todos os empregados digite 6 ");
            System.out.println("Para encerrar o programam digite 0");
            ui = sc.nextInt();
            switch(ui){
                case 0:
                System.exit(0);
                break;
                case 1:
                inserir();
                break;
                case 2:
                buscarNome(sc.next());
                break;
                case 3:
                buscarPosicao(sc.nextInt());
                break;
                case 4:
                buscarEmail(sc.next());
                break;
                case 5:
                obterQuantidade();
                break;
                case 6:
                buscarTodos();
                break;
            }
        }
       

    }
    private static void inserir(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite dia, mês em seguida ano do nascimento do empregado a ser cadastrado");
        int day = sc.nextInt();
        int month = sc.nextInt() -1;
        int year = sc.nextInt();
        Calendar birtdate = new GregorianCalendar(year, month, day);
        System.out.println("Em seguida inserir o nome, email e hp do empregado");
        String nome = sc.next();
        EContato eContatoEmpregado = new EContato(nome, birtdate, sc.next(), sc.next());
        System.out.println("Em seguida inserir atividade e o funcionario");
        Contato_Comercial contatoComercialEmpregado = new Contato_Comercial(nome, sc.next(), sc.next());
        System.out.println("Por fim inserir o número de telefone do emrpegado e seu tipo");
        Telefone empregadoTelefone = new Telefone(sc.next(),sc.next());
        contatoComercialEmpregado.setTelefone(empregadoTelefone);
        eContatos.add(eContatoEmpregado);
        contatosComerciais.add(contatoComercialEmpregado);
        
    }
    private static void buscarNome(String nome){
        for(int i = 0; i<eContatos.size();i++){
            if(nome.equals(eContatos.get(i).getNome())){
                eContatos.get(i).getDados();
                contatosComerciais.get(i).getDados();

            }else if(i == eContatos.size()-1 ){
                System.out.println("Não foi encontrado um empregado com este nome");
            }
        }
    }
    private static void buscarPosicao(int pos) {
        if(pos-1<eContatos.size()){
            eContatos.get(pos-1).getDados();
            contatosComerciais.get(pos-1).getDados();
        }else{
            System.out.println("Não há nenhum empregado nesta posicao");
        }
    }
    private static void buscarEmail(String email){
        for(int i = 0; i<eContatos.size();i++){
            if(email.equals(eContatos.get(i).getEmail())){
                eContatos.get(i).getDados();
                contatosComerciais.get(i).getDados();

            }else if(i == eContatos.size()-1 ){
                System.out.println("Não foi encontrado um empregado com este email");
            }
        }
    }
    private static void obterQuantidade(){
        System.out.println("Existem " + eContatos.size() + " empregados cadastrados");
    }
    private static void buscarTodos(){
        for(int i =0; i<eContatos.size();i++){
            contatosComerciais.get(i).getDados();
            eContatos.get(i).getDados();
        }
    }
}
