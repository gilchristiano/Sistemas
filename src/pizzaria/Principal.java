package pizzaria;
// import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pizza P1 = new Pizza();
		Pizza P2 = new Pizza();
		Pizza P3 = new Pizza();
		
		P1.adicionaIngrediente("Queijo");
		P1.adicionaIngrediente("Ovos");
		P1.adicionaIngrediente("Presunto");
		P1.adicionaIngrediente("Salame");
		P1.adicionaIngrediente("Tomate");
		P1.adicionaIngrediente("Frango");
		
		P2.adicionaIngrediente("Queijo");
		P2.adicionaIngrediente("Catupiry");
		P2.adicionaIngrediente("Bacon");
		P2.adicionaIngrediente("Salame");
		
		P3.adicionaIngrediente("Requeijão");
		P3.adicionaIngrediente("Presunto");
		P3.adicionaIngrediente("Lombo");
		P3.adicionaIngrediente("Salada");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(P1);
		carrinho.adicionaPizza(P2);
		carrinho.adicionaPizza(P3);
	
		carrinho.valorTotal();
	}

}
