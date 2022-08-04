// TOTAL = 9 PTOS
public class ImovelComercial extends Imovel{// 2 ptos
	
	int tam;//private???
	
	public ImovelComercial(String insc,int cep,int tam){// 2 ptos
		
		super(insc,cep);
		
		this.tam = tam;
		
	}
	
	
//Functions
	
	@Override
	public double calcularAluguel(){// 5 ptos
		
		if(tam <= 100 ){
			
			return 2000.00;
			
		}else{
			
			return 3500.00;
			
		}
	}

}

