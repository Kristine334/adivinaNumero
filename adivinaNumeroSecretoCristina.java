import java.util.Scanner;

public class adivinaNumeroSecretoCristina {

	public static void main(String[] args) {
								
		int numSecreto = (int)Math.floor(Math.random()* 100)+ 1;//calculamos un numero secreto			
		
		int numA=-1; //para que entre en el bucle la primera vez al menos, porque es distinto de un número del 1 al 100
		int numIntentos=0;		
		while (numA != numSecreto) {
			Scanner scanner = new Scanner( System.in );
			System.out.println("Escribe un número");		
			numA = scanner.nextInt();
			numIntentos++;
			if(numA>numSecreto)
				System.out.println ("Tú número es mayor");
			else
				System.out.println ("Tú número es menor");
			
		}
		System.out.println("Has acertado,lo has intentado"+ numIntentos + "veces");
}}
