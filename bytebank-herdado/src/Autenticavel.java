//Contrato, quem assinar precisa implementar os m�todos

public abstract interface Autenticavel {
	public void setSenha(int senha);

	public boolean autentica(int senha); 
}
