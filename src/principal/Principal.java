package principal;

import java.io.IOException;

import controle.ControleCarros;

public class Principal {

	public static void main(String[] args) throws IOException {

		ControleCarros conexaoCarro = new ControleCarros();
		conexaoCarro.executa(conexaoCarro.getConfiguracoesConexoes());
		
	}

}
