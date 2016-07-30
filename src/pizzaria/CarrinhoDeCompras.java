package pizzaria;
import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	Map<Integer,Pizza> pizzas = new HashMap<Integer,Pizza>();
	Integer count = 1;
	
	public void adicionaPizza(Pizza P){
		pizzas.put(count,P);
		count++;
	}
	
	public void valorTotal(){
		Integer total = 0;
		
		for (Integer chave : pizzas.keySet()) {
            Pizza p = pizzas.get(chave);
            
            // Esta seção abaixo é só para re-listar no prompt os ingredientes por cada pizza e seu valor
            System.out.println("\n Pizza nº " + chave + " - Ingredientes: \n");
            for (Integer item : p.pizza.keySet()) {
            	String ingrediente = p.pizza.get(item);
            	System.out.println("\t" + ingrediente);
            } 
            System.out.println("\n Valor da pizza nº " + chave + ": R$" + p.getPreco() + ",00 \n");
            total += p.getPreco();
		}
		// Conforme solicitado segue abaixo
		System.out.println(" - Valor total das pizzas: R$" + total + ",00 ");
	}
}
