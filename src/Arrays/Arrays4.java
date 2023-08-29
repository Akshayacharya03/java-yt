package Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		// 2D Array
		int[][] a;  // declaration 
		a=new int[2][3];  // creation
		// initialization
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[0][1]+","+a[1][1]);
		System.out.println(a[0][0]+" "+a[0][1]+" "+a[0][2]);
		System.out.println(a[1][0]+" "+a[1][1]+" "+a[1][2]);

	}

}
