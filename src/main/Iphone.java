package main;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Pagina exibida!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Aba adicionada!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada!");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando!");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendido!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio iniciado!");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausado");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música");
		
	}

}
