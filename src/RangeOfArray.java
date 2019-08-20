public class RangeOfArray {

	public static void main (String args []){

			int[] list = new int[]{1, 6, 4, 3, 9, 55, -20, -5}; 
			int min = Integer.MAX_VALUE; 
			int max = Integer.MIN_VALUE; 
			int minIndex = -1; 
			int maxIndex = -1; 
			for(int i = 0; i < list.length; i++){ 
			int value = list[i]; 
			if(value < min){ 
			min = value;
			minIndex = i;
			} 
			if(value > max){ 
			max = value;
			maxIndex = i;
			} 
			}

		System.out.println("Minimum value Of Array :: " + min);
		System.out.println("Maximum value Of Array :: " + max);
	}
}


