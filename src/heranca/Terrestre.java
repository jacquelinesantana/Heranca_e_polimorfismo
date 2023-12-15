package heranca;

public class Terrestre extends Transporte{
	private int numeroRodas;
	protected float velocidade;
	
	public Terrestre(int capacidade, int numeroRodas, float velocidade) {
		super(capacidade);//super indica que esse atributo esta vindo da classe pai
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		
		System.out.println("N�mero de rodas �: " + this.numeroRodas);
		System.out.println("Velocidade � de: " + this.velocidade);
	}
	
	
	
}
