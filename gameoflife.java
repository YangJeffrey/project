import java.util.Scanner;

public class gameoflife
{ 
 public static void main(String[] args) 
 { 
     int length = 5, width = 5; 

     int[][] matrix = {
         {0, 0, 0, 0, 0}, 
         {0, 0, 1, 0, 0}, 
         {0, 1, 1, 1, 0}, 
         {0, 0, 1, 0, 0}, 
         {0, 0, 0, 0, 0} 
     }; 

     System.out.println("Genesis"); 
     genesis(matrix, length, width);
     
     Scanner input = new Scanner(System.in);
 	System.out.println("How many Generations? Input integer");
 	int numgen = input.nextInt();
     
for (int x = 1; x <= numgen; x++) {
	System.out.println();
	System.out.println("Generation" + x);
	nextgen(matrix, length, width);
}
 }
 /** Display the original generation */
 static void genesis(int matrix[][], int length, int width) {
     for (int i = 0; i < length; i++) 
     { 
         for (int j = 0; j < width; j++) 
         { 
             if (matrix[i][j] == 0) 
                 System.out.print("["+0+"]"); 
             else
                 System.out.print("["+1+"]"); 
         } 
         System.out.println(); 
     }
 }

 /** Display the next generation */
 static void nextgen(int matrix[][], int length, int width) 
 { 
     int[][] nextmatrix = new int[length][width]; 

     for (int l = 1; l < length - 1; l++) 
     { 
         for (int m = 1; m < width - 1; m++) 
         { 
             int aliveNeighbors = 0; 
             for (int i = -1; i <= 1; i++) 
                 for (int j = -1; j <= 1; j++) 
                     aliveNeighbors += matrix[l + i][m + j]; 

             aliveNeighbors -= matrix[l][m]; 

             if ((matrix[l][m] == 1) && (aliveNeighbors < 2)) {
            	 nextmatrix[l][m] = 0;}

             else if ((matrix[l][m] == 1) && (aliveNeighbors > 3)) {
            	 nextmatrix[l][m] = 0;}

             else if ((matrix[l][m] == 0) && (aliveNeighbors == 3)) {
            	 nextmatrix[l][m] = 1; }

             else {
            	 nextmatrix[l][m] = matrix[l][m]; 
             }
         } 
     } 

     for (int i = 0; i < length; i++) 
     { 
         for (int j = 0; j < width; j++) 
         { 
             if (nextmatrix[i][j] == 0) {
                 System.out.print("["+0+"]"); 
             matrix[i][j] = 0;}
             else {
                 System.out.print("["+1+"]");
                 matrix[i][j] = 1;}
             }
         System.out.println();
         }
         } 
     }
