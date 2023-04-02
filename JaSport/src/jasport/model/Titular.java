package jasport.model;

public class Titular {

	private String titular;
	private String cpf;
	private String celular;
	private String plano;

	public Titular(String titular, String cpf, String celular,String plano) {
		super();
		this.titular = titular;
		this.cpf = cpf;
		this.celular = celular;
		this.plano = plano;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}
	

	
}
