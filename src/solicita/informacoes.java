package solicita;

public class informacoes {
	
	
	private int conta;
	private String nome;
	private  double valor;
	
	
	public informacoes(int conta, String nome, double valor) {
		
		this.conta = conta;
		this.nome = nome;
		this.valor = valor;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	
	
	public void addinheiro (double valor){
	this.valor += valor;
}
	
	public void removedinheiro (double valor){
		this.valor -= valor + 5.0;
	}
	
	public String ToString () {
		
		return "Account "
				+ conta
				+", Holder: "
				+ nome
				+", balance: $ "
				+ String.format("%.2f", valor);
				
		
	}
	
	
}