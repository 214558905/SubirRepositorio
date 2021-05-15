package ejemplo;

import java.util.Arrays;

public class ArraysEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {9,3,1,5,7};
		
		Matriz matriz= new Matriz(a);
		
		int result =matriz.getMinorNumber();
		
		System.out.println(result);
		
		
		int [] result2 = matriz.getdecentente();
		
		System.out.println(Arrays.toString(result2));
		
		int [] result3 = matriz.getaccendente();
		
		System.out.println(Arrays.toString(result3));


	}

}

class Matriz{
	
	public int[] array;
	

	public Matriz(int[] array) {
		super();
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
	public int getMinorNumber() {
		
		
		int temporal = array[0];
		for(int i=1; i<array.length;i++) {
			
			if(array[i] < temporal) {
				
				temporal = array[i];
				
			}
			
		}
		
		return temporal;
		
		
	}
	
	public int[] getdecentente() {
		int temporal = array[0];
		
		for(int i=0; i<array.length;i++) {
			
			for(int j=1; j<(array.length-i);j++) {
				
				if(array[j-1] < array[j]) {
					
					temporal = array[j-1];
					
					array[j-1] = array[j];
					
					array[j]=temporal;
				}
			}
			
			
		}
		
		return array;
	}
	
	public int[] getaccendente() {
		int temporal = array[0];
		
		for(int i=0; i<array.length;i++) {
			
			for(int j=1; j<(array.length-i);j++) {
				
				if(array[j-1] > array[j]) {
					
					temporal = array[j-1];
					
					array[j-1] = array[j];
					
					array[j]=temporal;
				}
			}
			
			
		}
		
		return array;
	}
	
	
}