package principal;

import controle.ControleCarros;

public class Principal {

	public static void main(String[] args) {

		ControleCarros conexaoCarro = new ControleCarros();
		conexaoCarro.executa(conexaoCarro.getConfiguracoesConexoes());
		System.exit(0);
	}

}
