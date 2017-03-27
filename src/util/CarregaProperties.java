package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import entidade.ConexaoInfo;

public class CarregaProperties {
	
	
	public CarregaProperties() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Map<String, ConexaoInfo> getConexaoInfo(Path path) {
		return getConexaoInfo(getProperties(path));
	}
	
	public Map<String, ConexaoInfo> getConexaoInfo(List<Path> paths) {
		Map<String, ConexaoInfo> mapConexaoInfo = getConexaoInfo(paths.remove(0));
		for(Path path : paths)
			mapConexaoInfo.putAll(getConexaoInfo(path));
		return mapConexaoInfo;
	}



	public Map<String, ConexaoInfo> getConexaoInfo(Properties properties) {
		Map<String, ConexaoInfo> mapConexaoInfo = new HashMap<>();
		
		for (String sessao : getSessoes(properties)) {
			ConexaoInfo conexaoInfo = new ConexaoInfo();
			conexaoInfo.setSESSAO(sessao);

			conexaoInfo.setDESCRICAO(properties.getProperty(sessao+".DESCRICAO"));
			conexaoInfo.setDRIVER_CLASS(properties.getProperty(sessao+".DRIVER_CLASS"));
			conexaoInfo.setUSUARIO(properties.getProperty(sessao+".USUARIO"));
			conexaoInfo.setSENHA(properties.getProperty(sessao+".SENHA"));
			conexaoInfo.setBASE(properties.getProperty(sessao+".BASE"));
			conexaoInfo.setURL(properties.getProperty(sessao+".URL"));
			mapConexaoInfo.put(sessao, conexaoInfo);
		}
		return mapConexaoInfo;
	}

	private Set<String> getSessoes(Properties properties) {
		Set<String> sessoes = new HashSet<>();
		Set<Object> chavesProperties = properties.keySet();
		for (Object chave : chavesProperties) {
			sessoes.add(chave.toString().split("\\.")[0]);
		}
		return sessoes;
	}
	
	private Properties getProperties(Path path) {
		Properties properties = new Properties();

		try (BufferedReader bufferedReader = Files.newBufferedReader(path,
				StandardCharsets.ISO_8859_1)) {
			properties.load(bufferedReader);
		} catch (IOException e) {
			System.err.println("Arquivo conf.properties não encontrado");
		}
		return properties;
	}
}
