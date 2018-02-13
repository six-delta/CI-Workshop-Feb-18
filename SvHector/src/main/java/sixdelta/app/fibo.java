
public class fibo {
	
public static void main(String args[])
{

	int numprevio=1;
	int numeroactual=1;
	int sumatotal=0;
	int temporal;
	
	while (numeroactual <= 4000000) {
		
		if (numeroactual%2==0){
			
			sumatotal +=numeroactual;
			

		}
			temporal = numeroactual;
			numeroactual = numeroactual + numprevio;
			numprevio = temporal;

		}
	System.out.println("La suma de los numeros pares es: " + sumatotal);
	}

}

