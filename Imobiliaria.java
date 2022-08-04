import java.util.*;// TOTAL = 17 PTOS

public class Imobiliaria{
	
	private String nome;//2 ptos
	private int cnpj;
	
	private ArrayList<Imovel> imoveis;
	
	public Imobiliaria(String nome, int cnpj){// 1 pto
		
		this.nome = nome;
		this.cnpj = cnpj;
		
		imoveis = new ArrayList<Imovel>();
		
	}
	
	
//Functions
	
	public void cadastrarImovel(Imovel i){// 8 ptos
		
		if(imoveis.size() <= 30){//Erro: <
			
			imoveis.add(i);
			
		}else{
			
			throw new LimiteImoveisExcedido(nome); 
			
		}
		
	}
	
	public void gerarRelatorio(){// 6 ptos
		
		//Collections.sort(imoveis); 
		
		for(Imovel i : imoveis){
			
			System.out.println(i);
			
		}
	
	}
	
}
