package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.hsqldb.HsqlException;

import entidade.ConexaoInfo;

public class Conexao {

	public Connection getConexao(ConexaoInfo conexao) {
		System.out.println(conexao.getURL_BASE());
		try {
			Class.forName(conexao.getDRIVER_CLASS());
			return DriverManager.getConnection(conexao.getURL_BASE(), conexao.getUSUARIO(), conexao.getSENHA());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			return null;
		} catch (org.hsqldb.HsqlException e) {
			System.out.println("HsqlException");
			return null;
		}catch (SQLException e) {
			System.out.println("SQLException: Erro de conexão: Class Conexao.java."+ e.toString());
			return null;
		}
	}
}
