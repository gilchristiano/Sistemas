package pizzaria;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	static Map<Integer,String> contabiliza = new HashMap<Integer,String>(); // chave , valor
		   Map<Integer,String> pizza = new HashMap<>(); // Para cada pizza
	
	public void adicionaIngrediente(String ingrediente){
		if(ingrediente.equals("")){
			System.out.println("\n Insira um ingrediente! \n");
		}
		else { 
			pizza.put(pizza.size()+1,ingrediente); // Inserindo ingredientes em uma pizza
			contabilizaIngrediente(ingrediente);
		}
	}
	
	public Integer getPreco(){
			Integer count = pizza.size();
			if(count >= 3 && count <= 5)
				return 20;
			else 
				if(count > 5)
					return 23;
				else
					if(count < 3) 
						return 15;
					else
						return 0;
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
	
		contabiliza.put(contabiliza.size()+1,ingrediente);
	}
}