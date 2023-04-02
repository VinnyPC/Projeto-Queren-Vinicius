package jasport.repository;


public interface JasportRepository {
	
	 public void cadastrar(String titular, String cpf, String celular);
     public void listagem(int escolha);
     public void contratar(int planob, int planoP);
     public void cancelar(String cpf);
     public void listarTitular();
     public void escolhaPlano();
     public void listaPlanos();
	void deletar(String cpf);
}
