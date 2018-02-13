package com.sixDelta.six_delta;

public class Fibonacci{
	
	public int calculaPara(int n)
	{
    	if (n>1){
       	return calculaPara(n-1) + calculaPara(n-2);
    	}
    	else if (n==1) {
        	return 1;
    	}
    	else if (n==0){
        	return 1;
    	}
    	else{
        	System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        	return -1; 
    	}
	}


    public long calculaSumaDeNNumeros(int n){
            long valor_fibonacci=0;
            long suma = 0;
            Fibonacci fibo = new Fibonacci();
            while(n>=0){
                valor_fibonacci = fibo.calculaPara(n);
                if(valor_fibonacci%2==0){
                    suma = suma + valor_fibonacci;
                }
                n--;
            }
            return suma;
        }
}