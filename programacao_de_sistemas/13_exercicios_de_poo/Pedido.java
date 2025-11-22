import java.util.ArrayList;
import java.util.Scanner;

public class Pedido implements Manipulacao {
    private Data data;
    private Cliente cliente = new Cliente("Levi", "529.603.058-33", "(11)94050-5439");
    private float totalPedido;
    private ArrayList<Produto> produtos;

    Caderno caderno = new Caderno(100, "10x30", "Paltado", true, "seila", 10);
    CaixaLapis caixaLapis = new CaixaLapis(1, true, "num sei", "FaberCastel", 5);
    Papel papel = new Papel("Branca", "Linha", 10, 10, 1, true, "Papeles", 1);

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public Data getData() {return data;}
    public void setData(Data data) {this.data = data;}
    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
    public float getTotalPedido() {return totalPedido;}
    public void setTotalPedido(float totalPedido) {this.totalPedido = totalPedido;}
    public ArrayList<Produto> getProdutos() {return produtos;}
    public void setProdutos(ArrayList<Produto> produtos) {this.produtos = produtos;}

    public void calculaTotalPedido() {
        totalPedido = 0;
        for(Produto i: produtos) {
            totalPedido += i.getValor() + (i.getValor() * 0.18);  
        }
        System.out.println("Valor total do pedido: " + totalPedido);
    }

    @Override
    public void cadastro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<Data do Pedido>>>");

        System.out.println("Dia: ");
        int dia = sc.nextInt();
        System.out.println("Mês: ");
        int mes = sc.nextInt();
        System.out.println("Ano: ");
        int ano = sc.nextInt();
        Data data = new Data(dia, mes, ano);
        System.out.println("--------------------------");

        String produto;
        do {
            System.out.println("<<<Adicione um Produto>>>");
            System.out.println("(Papel/Caderno/Caixa de Lapis/Finalizar): ");
            
            produto = sc.nextLine();

            switch (produto) {
                case "Papel":
                    produtos.add(papel);
                    break;

                case "Caderno":
                    produtos.add(caderno);
                    break;

                case "Caixa de Lapis":
                    produtos.add(caixaLapis);
                    break;

                case "Finalizar":
                    System.out.println("Finalizando pedido...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!produto.equals("Finalizar"));
    }

    @Override
    public String consulta() {
        for(Produto i: produtos) {
            if(i instanceof Caderno){
                System.out.println("--- Cliente ---");
                System.out.println("Nome: " + cliente.getNome() + "\n" + "CPF: " + cliente.getCpf() + "\n" + "Telefone: " + cliente.getTelefone());
                return i.consulta();
            } else if(i instanceof CaixaLapis) {
                System.out.println("--- Cliente ---");
                System.out.println("Nome: " + cliente.getNome() + "\n" + "CPF: " + cliente.getCpf() + "\n" + "Telefone: " + cliente.getTelefone());
                return i.consulta();
            } else {
                System.out.println("--- Cliente---");
                System.out.println("Nome: " + cliente.getNome() + "\n" + "CPF: " + cliente.getCpf() + "\n" + "Telefone: " + cliente.getTelefone());
                return i.consulta();
            }
        }
        return "Consulta realizada!";
    } 
}