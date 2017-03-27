package controle;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import dao.AutomovelDAO;
import entidade.ConexaoInfo;
import util.CarregaProperties;
import view.AutomovelView;
import view.MenuConexoes;
import view.SelecionaArquivosProperties;

public class ControleCarros {

	private static final String JFrame = null;

	public Map<String, ConexaoInfo> getConfiguracoesConexoes() {
		List<Path> paths = new SelecionaArquivosProperties().get(System.getProperty("user.dir"));
		if (paths != null) {
			return new CarregaProperties().getConexaoInfo(paths);
		}
		return null;
	}

	public void executa(Map<String, ConexaoInfo> mapConexoesInfo) {
		ConexaoInfo conexaoInfo = null;
		MenuConexoes menuConexoes = new MenuConexoes(mapConexoesInfo);
		while ((conexaoInfo = menuConexoes.runMenu()) != null) {
			new AutomovelView(new AutomovelDAO().listar(conexaoInfo), conexaoInfo.getDESCRICAO());
		}		
	}


}
