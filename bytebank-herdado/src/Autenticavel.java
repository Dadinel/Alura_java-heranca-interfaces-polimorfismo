//Contrato, quem assinar precisa implementar os métodos

public abstract interface Autenticavel {
	public void setSenha(int senha);

	public boolean autentica(int senha); 
}
