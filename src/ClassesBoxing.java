
public class ClassesBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer i = new Integer(10);
		Integer i = 10; // Boxing -Conversão automatica tipos primitivos e objetos
		int a = i; // Unboxing - Converter o tipo primitivo em objeto

		Integer i1 = 127;
		Integer i2 = 127;
		Integer i3 = 128;
		Integer i4 = 128;
		// alguns intervalos de numeros a maquina virtual considera como mesmo local de
		// memoria
		System.out.println("SemEquals i1i2= " + (i1 == i2));
		System.out.println("Sem Equals i3i4= " + (i3 == i4));

		System.out.println("Equals i1i2= " + i1.equals(i2));
		System.out.println("Equals i3i4= " + i3.equals(i4));

	}

}
