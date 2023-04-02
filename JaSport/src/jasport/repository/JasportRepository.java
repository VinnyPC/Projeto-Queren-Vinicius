package jasport.repository;


public interface JasportRepository {
	
	 public void cadastrar(String titular, String cpf, String celular);
     public void listagem(int escolha);
     public void contratar(int planob, int planoP);
     public void cancelar(String titular, String cpf);
     public void listarTitular();
     Integer listagem();
}
