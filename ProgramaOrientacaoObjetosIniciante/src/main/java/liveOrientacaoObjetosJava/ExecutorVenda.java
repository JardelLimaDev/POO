package liveOrientacaoObjetosJava;

import java.math.BigDecimal;
//converções usadas para fins didaticos
public class ExecutorVenda {
	public static void main(String[] args) {
		Venda venda = new Venda();
		
		venda.setDescricaoVenda("Formação Java Web 23");
		venda.setEnderecoEntrega("Endereço de e-mail");
		venda.setId(01L);
		venda.setNomeClinte("Jardel Lima");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		Produto produto1 = new Produto();
		
		produto1.setId(1L);
		produto1.setNome("Modulo Orientação a Objetos");
		produto1.setValor(BigDecimal.valueOf(12));
		
		Produto produto2 = new Produto();
		
		produto2.setId(2L);
		produto2.setNome("Modulo Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(15));
		
		Produto produto3 = new Produto();
		
		produto3.setId(3L);
		produto3.setNome("Bando de dados");
		produto3.setValor(BigDecimal.valueOf(20));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.addProduto(produto3); //poderia usar esse metodo para fazer validação
		
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println(produto);
		}
		
		System.out.println("Curso " + venda.getDescricaoVenda() + " Valor Total da Compra R$ " + venda.totalVenda());
		System.out.println("Valor total do Curso R$ " + venda.getValorTotal());
	}
}
