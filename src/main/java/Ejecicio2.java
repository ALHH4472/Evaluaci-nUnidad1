
import java.util.Scanner;


public class Ejecicio2 {
    public static void main(String[] args){
      Scanner entrada=new Scanner(System.in);  
      
      System.out.println("Dime el primer parametro de la matriz");
     int i =entrada.nextInt();
     System.out.println("Dime el segundo parametro de la matriz");
     int j =entrada.nextInt();      
    
    int [][] M= new int [i][j];
    
    for(int x=0;x<i;x++){
     for(int y=0;y<j;y++){
     M[x][y]=(23*(int) Math.pow(x, 4))+(20*(int) Math.pow(y, 3)-3);
        }
    }
       for(int r=0;r<M.length;r++){
         System.out.println();
         for(int x=0;x<M.length;x++){
       System.out.print(M[r][x]);
       System.out.print(" ");
    }  
    
}
    }
}
    