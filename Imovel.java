// TOTAL = 18 PTOS
public abstract class Imovel //implements Comparable //Comparable<?> // 2 ptos
{
	
	private String insc;// 1 pto
	private int cep;
	
	public Imovel(String insc,int cep){// 1 pto
		
		this.insc = insc;
		this.cep = cep;
		
	}
	
	
//get's
	
	public int getCep(){//ok
		
		return cep;
		
	}
	
	
//Functions
	
	public abstract double calcularAluguel();// 5 ptos
	
	@Override
	public String toString(){// 4 ptos
		
		return "\nInscrição Municipal: " + insc + "\nCEP: " + cep + "\nValor do Aluguel: " + calcularAluguel();
		
	}
	
	
	
//@Override
/*public int compareTo (Imovel i){//Oredem decrescente // 5 ptos
		
		if(this.getCep() > i.getCep()){
			
			return 1;//Erro: -1
			
		}else if(this.getCep() < i.getCep()){
			
			return -1;// Erro: 1
			
		}else{
			
			return 0;
			
		}
		
	}
*/

}  



