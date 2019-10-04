import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class AppPaciente {

	//private static XMLGregorianCalendar dataNomeacao;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Paciente paciente = new Paciente();
//		Scanner entrada = new Scanner(System.in);
//
//		System.out.print("Informe o peso :");
//		paciente.peso = entrada.nextDouble();
//
//		System.out.print("Informe a altura:");
//		paciente.altura = entrada.nextDouble();
//
//		Imc imcCalculado = paciente.calcularIndiceMassaCorporal();
//		System.out.println("Flag Abaixo do Peso :" + imcCalculado.abaixoDoPesoIdeal);
//		System.out.println("Flag Peso Ideal :" + imcCalculado.pesoIdeal);
//		System.out.println("Flag Obeso :" + imcCalculado.obeso);
//		System.out.println("IMC : " + imcCalculado.grauObesidade);
//        entrada.close();
//        
       // dataNomeacao =null;
        //System.out.println("XMLGregorianCalendar " + dataNomeacao.getDay());
        
        XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
          String date = simpleDateFormat.format(xmlGregorianCalendar.toGregorianCalendar().getTime());
          System.out.println(date);
        
        
        
	}

}
