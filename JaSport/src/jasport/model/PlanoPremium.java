package jasport.model;

public class PlanoPremium extends Titular {

	private int planoP;

	public PlanoPremium(String titular, String cpf, String celular) {
		super(titular, cpf, celular);
	}
	public int getPlabob() {
		return planoP;
	}

	public void setPlabob(int planoP) {
		this.planoP = planoP;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Seu plano é" + this.planoP);
	}
}
