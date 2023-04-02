package jasport.model;

public class PlanoBasic extends Titular {

	private int planob;

	public PlanoBasic(String titular, String cpf, String celular) {
		super(titular, cpf, celular);

	}

	public int getPlabob() {
		return planob;
	}

	public void setPlabob(int planob) {
		this.planob = planob;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Seu plano é" + this.planob);
	}
}
