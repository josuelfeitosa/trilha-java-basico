package estabelecimento;

import iphone.Iphone;

public class Fabrica {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.ligar("999999999");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina("www.seusite.com.br");
		
		iphone.tocar();
		iphone.selecionarMusica("Paranoid");
		iphone.pausar();
	}

}
