package liveOrientacaoObjetosJava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private Long id;
	private String descricaoVenda;
	private String nomeClinte;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();	
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public String getNomeClinte() {
		return nomeClinte;
	}
	public void setNomeClinte(String nomeClinte) {
		this.nomeClinte = nomeClinte;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeClinte=" + nomeClinte
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + "]";
	}
	
	public void addProduto (Produto produto) {
		this.listaProdutos.add(produto);
	}
	
	public double totalVenda() {
		double total = 0;
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		
		this.valorTotal = BigDecimal.valueOf(total);
		
		return total;
	}
	
}
