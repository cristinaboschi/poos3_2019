package poo2019;

import java.util.Random;

public class diagnóstica1 {
	 public static void main(String[] args) {
	    	int array[] = new int[10];
	    	Random r = new Random();
	    	for (int i = 0; i < 10; i++) {
	    	   array[i] = r.nextInt();
	    	   System.out.println(array[i]);
	    	   if (array[0]==array[i]) {
	    		   System.out.println(array[i]);
	    	   }
	    	   System.out.println("Chave não encontrada");
	    	}
	    }
}
