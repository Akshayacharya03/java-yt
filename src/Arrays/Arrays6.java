package Arrays;

public class Arrays6 {

	public static void main(String[] args) {
		//2D Arrays
		int[][] a= {{10,20,30},{40,50,60}};  // declaration, creation, initialiazation all done in one line
		// print elements using for loop
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
