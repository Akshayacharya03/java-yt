package patternPrograms;
  // program to increase incresing trangle from 1 to 5
/*      A
        A A
        A A A
        A A A A                                        */
    public class pattern1 {

	public static void main(String[] args) {
		//int n=4; // size of n declared
		for(int i=1;i<=4;i++)  // outer for loop. it prints rows
		{
			// for every row,run the columns
			for(int j=1;j<=i;j++)         
			{
				System.out.print(" A "); // we have to print trangle in 'A' alphabets.
		}
			//when one row is printed,we need to add a new line
		System.out.print("\n");

		}	
		}
    }
/* Every pattern you will see Rows & Columns. In this pattern you will see, 4 Rows
           1st row have 1 column
           2nd row have 2 columns
           3rd row have 3 columns
           4th row have 4 columns
   
         How to approach:
   
       1st step: Run the outer for loop the number of times you are having the lines.
        
         number of lines = number of rows = number of times = outer row will run
         
         for example, for(int i=0;i<=n;i++)
         
       2nd step: How many columns are there with each rows
       
         Identify for every row numbers:
         - how many columns are there
         - types of elements in the columns.
         
       3rd step: what you need to print
       
          so i want to print 'A' in this program.
          
       
         
*/
    