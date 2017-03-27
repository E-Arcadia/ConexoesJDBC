package entidade;

public class ConexaoInfo {
	private String DESCRICAO;
	private String SESSAO;
	private String DRIVER_CLASS;
	private String USUARIO;
	private String SENHA;
	private String BASE;
	private String URL;
	
	
	
	public String getURL_BASE(){
		return URL + BASE;
	}
	
	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}

	public String getSESSAO() {
		return SESSAO;
	}

	public void setSESSAO(String sESSAO) {
		SESSAO = sESSAO;
	}

	public String getDRIVER_CLASS() {
		return DRIVER_CLASS;
	}
	public void setDRIVER_CLASS(String dRIVER_CLASS) {
		DRIVER_CLASS = dRIVER_CLASS;
	}
	public String getUSUARIO() {
		return USUARIO;
	}
	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}
	public String getSENHA() {
		return SENHA;
	}
	public void setSENHA(String sENHA) {
		SENHA = sENHA;
	}
	public String getBASE() {
		return BASE;
	}
	public void setBASE(String bASE) {
		BASE = bASE;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BASE == null) ? 0 : BASE.hashCode());
		result = prime * result + ((DESCRICAO == null) ? 0 : DESCRICAO.hashCode());
		result = prime * result + ((DRIVER_CLASS == null) ? 0 : DRIVER_CLASS.hashCode());
		result = prime * result + ((SENHA == null) ? 0 : SENHA.hashCode());
		result = prime * result + ((SESSAO == null) ? 0 : SESSAO.hashCode());
		result = prime * result + ((URL == null) ? 0 : URL.hashCode());
		result = prime * result + ((USUARIO == null) ? 0 : USUARIO.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConexaoInfo other = (ConexaoInfo) obj;
		if (BASE == null) {
			if (other.BASE != null)
				return false;
		} else if (!BASE.equals(other.BASE))
			return false;
		if (DESCRICAO == null) {
			if (other.DESCRICAO != null)
				return false;
		} else if (!DESCRICAO.equals(other.DESCRICAO))
			return false;
		if (DRIVER_CLASS == null) {
			if (other.DRIVER_CLASS != null)
				return false;
		} else if (!DRIVER_CLASS.equals(other.DRIVER_CLASS))
			return false;
		if (SENHA == null) {
			if (other.SENHA != null)
				return false;
		} else if (!SENHA.equals(other.SENHA))
			return false;
		if (SESSAO == null) {
			if (other.SESSAO != null)
				return false;
		} else if (!SESSAO.equals(other.SESSAO))
			return false;
		if (URL == null) {
			if (other.URL != null)
				return false;
		} else if (!URL.equals(other.URL))
			return false;
		if (USUARIO == null) {
			if (other.USUARIO != null)
				return false;
		} else if (!USUARIO.equals(other.USUARIO))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConexaoInfo [DESCRICAO=" + DESCRICAO + ", SESSAO=" + SESSAO + ", DRIVER_CLASS="
				+ DRIVER_CLASS + ", USUARIO=" + USUARIO + ", SENHA=" + SENHA + ", BASE=" + BASE
				+ ", URL=" + URL + "]";
	}

	

}
