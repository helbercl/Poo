
public class ClassesWrappers {

	/*
	 * Tipos Primitivos inteiros: byte(Byte) short (Short) long(Long) int(Integer) 
	 * Tipos Primitivos ponto flutuante : float(Float) e double(Double) 
	 * Tipo Primitivo string : char(Character)
	 */

	public static void main(String[] args) {
		int x = 5;
		// wrapper = envelope = envelopar um tipo primitivo em uma classe
		Integer i = new Integer(x);
		System.out.println(i.SIZE);
		
		String valor = "15.5";
		Float  valorConvertido = new Float(valor);		
		valorConvertido.floatValue();
		System.out.println(valorConvertido +3);
		
		int idade  = Integer.parseInt("27");
		System.out.println("Minha idade daqui a 5 anos será " + (idade + 5) +" anos!");
		
		try {
			
			double custo = Double.parseDouble("Vinte e três reais e quarenta centavos");
			System.out.println("Custo Total :" + custo);
			
		} catch (Exception e) {
			
			
			System.err.println("Erro :" +e.getMessage());
		}
		
		
	}
}
