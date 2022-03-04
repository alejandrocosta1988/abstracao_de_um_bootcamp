package dev.alejandrocosta.bootcamps.dominio;

//Classe abstrata para diminuir repetição de código.
public abstract class Conteudo 
{
	
	protected static final double XP_PADRAO = 10d; // static significa que vai ser possível acessar XP_PADRAO fora da classe. protected significa que as classes filhas terão acesso a XP_PADRAO
	private String titulo;
	private String descricao;
	
	
	public abstract double calcularXP(); //se esse método é abstrato, a classe também precisa ser abstrata.

	public String getTitulo() 
	{
		return titulo;
	}

	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}

	public String getDescricao() 
	{
		return descricao;
	}

	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}
	
	

}
