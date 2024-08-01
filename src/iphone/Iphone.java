package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegador.NavegadorDeInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando Música no IPHONE!");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música no IPHONE!");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando " + musica + " no IPHONE!");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo " + url + " no IPHONE!");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba no IPHONE!");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página no IPHONE!");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + " pelo IPHONE!");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação no IPHONE!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz no IPHONE!");
	}

}
