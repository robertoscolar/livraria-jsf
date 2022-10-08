package br.com.alura.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.alura.livraria.model.Livro;

@ManagedBean
public class LivroBean {
	
	private Livro livro = new Livro();
	
	//alterar action no xhtml para verificar a saída no console
	public void testeConsole() {
		System.out.println("Título -> " + livro.getTitulo());
		System.out.println("ISBN -> " + livro.getIsbn());
		System.out.println("Preço -> " + livro.getPreco());
		System.out.println("Data de Lançamento -> " + livro.getDataLancamento());
	}

	public Livro getLivro() {
		return livro;
	}
}
