package heranca;

public class Transporte {

	private int capacidade;

	//metodo construtor
	public Transporte(int capacidade) {
		this.capacidade = capacidade;
	}
	
	

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void visualizar() {
		System.out.println("\n******************************************************");
		System.out.println("*****************Dados do meio de transporte***********");
		System.out.println("*******************************************************");
		System.out.println("Capacidade (n�mero de passageiros: " + this.capacidade + ")");
		
	}
	
}
