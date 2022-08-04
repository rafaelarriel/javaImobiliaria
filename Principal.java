import java.util.Scanner;// TOTAL = 57 PTOS

public class Principal {
    private static Imobiliaria imob;
    public static void main(String[] args) {
        imob = new Imobiliaria("Morar Bem", 123456789);
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do{
            exibirMenu();
            opcao = entrada.nextInt();
            executarOpcao(opcao);
        }while(opcao != 4);
    }
    private static void exibirMenu(){
        System.out.println("=======MENU=======");
        System.out.println("1 - Cadastrar imóvel residencial");
        System.out.println("2 - Cadastrar imóvel comercial");
        System.out.println("3 - Imprimir relatório de imóveis");
        System.out.println("4 - Sair\n");
        System.out.print("Digite sua opcao: ");
    }
    private static void executarOpcao(int opcao){
        switch(opcao){
            case 1:
                cadastrarImovelResidencial();
                break;
            case 2:
                cadastrarImovelComercial();
                break;
            case 3:
                gerarRelatorio();
                break;
            case 4://sair
                break;
            default: 
                System.out.println("Opção inválida!");
        }
    }
    private static void cadastrarImovelResidencial(){
        ImovelResidencial ir = new ImovelResidencial(pedirInsc(),pedirCep(),pedirNumQuartos());
        imob.cadastrarImovel(ir);//Erro: try/catch???
        System.out.println("Imóvel cadastrado com sucesso");
    }
    private static void cadastrarImovelComercial(){
        ImovelComercial ic = new ImovelComercial(pedirInsc(),pedirCep(),pedirTamanho());
        
        try{// 4 ptos
			
			imob.cadastrarImovel(ic);
			System.out.println("Imóvel cadastrado com sucesso");
			
		}catch(LimiteImoveisExcedido e ){
			
			e.getMessage();//Erro: Impressão do erro?
			
		}
    
    }
    
    private static void gerarRelatorio(){
        imob.gerarRelatorio();
    }
    private static String pedirInsc(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inscrição Municipal: ");
        return entrada.nextLine();
    }
    private static int pedirCep(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("CEP: ");
        return entrada.nextInt();
    }
    private static int pedirNumQuartos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero de Quartos: ");
        return entrada.nextInt();
    }
    private static int pedirTamanho(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tamanho (m2): ");
        return entrada.nextInt();
    }
}
