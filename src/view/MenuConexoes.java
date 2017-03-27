package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entidade.ConexaoInfo;

public class MenuConexoes {
	private List<String> listaChavesConexaoInfo = null;
	private Map<String, ConexaoInfo> mapConexoesInfo = null;

	public MenuConexoes(Map<String, ConexaoInfo> mapConexoesInfo) {
		if (mapConexoesInfo != null) {
			this.mapConexoesInfo = mapConexoesInfo;
			this.listaChavesConexaoInfo = new ArrayList<>(mapConexoesInfo.keySet());
		}
	}

	public ConexaoInfo runMenu() {
		Scanner teclado = new Scanner(System.in);
		String opc = null;

		while (true) {
			mostraMenu();
			opc = teclado.nextLine();
			if (isSair(opc))
				return null;
			ConexaoInfo conexaoInfo = pegaConexaoInfo(opc);
			if (conexaoInfo != null)
				return conexaoInfo;
			System.out.println("Opção inválida....");
		}
	}

	private ConexaoInfo pegaConexaoInfo(String opc) {
		try {
			int opcInt = Integer.parseInt(opc) - 1;
			if (opcInt >= 0 & opcInt < listaChavesConexaoInfo.size())
				return mapConexoesInfo.get(listaChavesConexaoInfo.get(opcInt));
			return null;
		} catch (NumberFormatException e) {
			return null;
		}

	}

	private void mostraMenu() {
		int opcao = 0;
		for (String menu : listaChavesConexaoInfo) {
			System.out.println(++opcao + " - " + menu);
		}
		System.out.println("S - Sair");
		System.out.println("Digite sua opção: ");
	}

	private boolean isSair(String opc) {
		return opc.equalsIgnoreCase("S");
	}

	// public void limpaTela(){
	// try {
	// Runtime.getRuntime().exec("cls").waitFor();
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
}
