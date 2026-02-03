import java.util.*;

public class MatrixAddition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int rows,cols,i,j;
        
        rows= sc.nextInt();
        cols= sc.nextInt();
        
        int[][] matrixA=new int[rows][cols];
        int[][] matrixB=new int[rows][cols];
        int[][] result=new int[rows][cols];
        
        for(i=0;i<rows;i++){                                        //get the matrix a value
            for(j=0;j<cols;j++){
                matrixA[i][j]=sc.nextInt();
            }
        }
        
        for(i=0;i<rows;i++){                                         //get the matrix b value
            for(j=0;j<cols;j++){
                matrixB[i][j]=sc.nextInt();
            }
        }
        
        for(i=0;i<rows;i++){                                          //adding a and b for res value
            for(j=0;j<cols;j++){
                result[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        
        for(i=0;i<rows;i++){                                        //print the result
            for(j=0;j<cols;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}