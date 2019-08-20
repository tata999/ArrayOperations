import java.util.Arrays;

public class ArrayDividing {
	
	public static void main(String[] args) {
		int x = 0, y = 0,c = 0, l = 0, p = 0, z = 0,total = 0,	a1total=0,a2total=0;
		int a[] = { 1,2,3,6};
		int k = a.length;
		int[] b = new int[k];
		for (int basecheck=0; basecheck<a.length; basecheck++){
        total=total+a[basecheck]; 
		}
		if (total%2!=0)
		{System.out.println("this array portion is not possible");
		}
		else{
		for (int i = k; i > 0; i--) {
			int r = a[i - 1];
			b[p] = r;
			p++;
		}
		
		x = x + a[c];
		y = y + b[l];
		
		
		for (int e = 0; e < k - 2; e++) {

			if (x > y) {
				l++;
				y = y + b[l];
			} else if (x < y) {
				c++;
				x = a[c] + x;
			} else {
				if (a[c + 1] >= b[l + 1]) {
					l++;
					y = y + b[l];
				}

				else if (a[c + 1] <= b[l + 1]) {
					c++;
					x = a[c] + x;
				}
			}
		}
		int[] array1 = new int[c + 1];
		int[] array2 = new int[l + 1];

		for (int j = 0; j <= c; j++) {
			array1[j] = a[j];	
		}
		for (int s =l ; s >= 0; s--) {
			array2[z] = b[s];
              z++;
		}
		for (int array1total=0; array1total<c+1; array1total++){
	        a1total=a1total+array1[array1total];
	        
		}
		for (int array2total=0; array2total<l+1; array2total++){
	        a2total=a2total+array2[array2total];
	        
		}
		
		if (a1total==a2total){
		System.out.println(Arrays.toString(array1) + "" + Arrays.toString(array2));
		}
		else{
			System.out.println("Sum of both arrays is not equal");
		}
	}
	}
}

