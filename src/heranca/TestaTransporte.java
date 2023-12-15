package heranca;

public class TestaTransporte {

	public static void main(String[] args) {
		// testar as classes anteriores ( Transporte, Terrestre , Automovel)
		//instanciando a classe Transporte
		Transporte t1 = new Transporte(4);
		//t1.visualizar();
		//public Automovel(int capacidade, int numeroRodas, float velocidade, String cor, int numeroPortas, String placa,int marcha) {
		Automovel automovel = new Automovel(5,4,150.0f,"Verde",4,"abc-1512",5);
		
		//retornando o metodo visualizar da classe automovel
		automovel.visualizar();
		
		
		//CONTEÚDO EXTRA ALTERANDO UM VALOR DO OBJETO JÁ INSTANCIADO
		System.out.println("AGORA VAMOS ALTERAR UM DOS DADOS DO OBJETO INTANCIADO");
		automovel.setNumeroRodas(2);
		automovel.visualizar();
		
		System.out.println("RECUPERANDO UM ÚNICO VALOR DO OBJETO");
		System.out.println(automovel.getVelocidade());

	}

}
