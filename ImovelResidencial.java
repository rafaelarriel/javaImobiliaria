// TOTAL = 9 PTOS
public class ImovelResidencial extends Imovel{// 2 ptos
	
	int numQ;//private???
	
	public ImovelResidencial(String insc,int cep,int numQ){// 2 ptos
		
		super(insc,cep);
		
		this.numQ = numQ;
		
	}
	
	
//Functions
	
	@Override
	public double calcularAluguel(){// 5 ptos
		
		if(numQ < 3){
			
			return 800.00;
			
		}else{
			
			return 1200.00;
			
		}
	}
	
	
}
