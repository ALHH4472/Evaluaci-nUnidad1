
import java.util.Scanner;

public class Ejercicio3 {
      public static void main(String[] args){
      Scanner entrada=new Scanner(System.in);  
      
      int identidad=0;
      int identidad2=0;
      int [][] M1= new int[3][3];
      
      M1[0][0]=1; 
      M1[0][1]=0;
      M1[0][2]=0;        
      
      M1[1][0]=0; 
      M1[1][1]=1;
      M1[1][2]=0;
      
      M1[2][0]=-0; 
      M1[2][1]=0;
      M1[2][2]=1;
     
      
         for (int r=0;r<3;r++){
            for(int t=0;t<3;t++){         
                
         if(r==t){
         if(M1[r][t]!=1){  
         identidad++; 
         }
        }        
         if(r!=t){
         if(M1[r][t]!=0){
         identidad2++;    
          }                  
        }
      }
    }  
         if(identidad==0 && identidad2==0){
          System.out.println("Tu matriz es identidad:");
      }else{ 
        System.out.println("Esto no es una matriz identidad:");
      }
     
         for(int j=0;j<3;j++){
          System.out.println();
          for(int x=0;x<3;x++){
              System.out.print(M1[j][x]);
              System.out.print(" ");
          }
      }

    }
}
