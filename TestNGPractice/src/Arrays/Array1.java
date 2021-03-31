package Arrays;

public class Array1 {

	public void displayarray() {
	int[] a = new int[3];
	a[0] = 10;
	a[1]=20;
	a[2]=30;
	
		/*
		 * for(int i:a) { System.out.println(i); }
		 */
	
	for(int i =0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
}
	
	public void doublearraydisplay() {
		int[][] b = new int[2][3];
		b[0][0]= 10;
	    b[0][1]= 20;
	    b[0][2]= 30;
	    b[1][0]= 50;
	    b[1][1]= 60;
	    b[1][2]= 70;
	    
	    System.out.println(b);
	    System.out.println(b[0]);
	    System.out.println(b[0][2]);
	    System.out.println(b.length);
	    System.out.println(b[0].length);
	    
	    
	    for(int i=0;i<b.length;i++) {
	    	for(int j=0;j<b[i].length;j++) {
	    		System.out.println(b[i][j]);
	    	}
	    	System.out.println(); //to give one line gap for another rows values.
	    }
	    
	}
	
	public void ThreeDimensionalarray() {
		int[][][] c = {{{20,30},{20,30,45,89},{10}}};
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println(c[0][0]);
		System.out.println(c[0][0][0]);
		System.out.println(c.length);
		System.out.println(c[0].length);
		System.out.println(c[0][0].length);
		
		for(int i=0;i<c.length;i++) {
			for(int j =0;j<c[i].length;j++) {
				for(int k =0;k<c[i][j].length;k++) {
					System.out.println(c[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	
	public static void sum(int[] numb) {
		int total = 0;
		for(int i: numb) {
			total = total+i;
			}
		System.out.println("Sum of: "+ total);
	}
}



















































