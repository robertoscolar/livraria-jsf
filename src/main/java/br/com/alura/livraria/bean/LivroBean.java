package br.com.alura.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.alura.livraria.model.Livro;

@ManagedBean
public class LivroBean {
	
	private Livro livro = new Livro();
	
	//alterar action no xhtml para verificar a sa�da no console
	public void testeConsole() {
		System.out.println("T�tulo -> " + livro.getTitulo());
		System.out.println("ISBN -> " + livro.getIsbn());
		System.out.println("Pre�o -> " + livro.getPreco());
		System.out.println("Data de Lan�amento -> " + livro.getDataLancamento());
	}

	public Livro getLivro() {
		return livro;
	}
}
