/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {
     public static void main(String[] args){
         
      int [][] M1= new int[4][4];
      boolean superior=true;
      
      M1[0][0]=5; 
      M1[0][1]=1;
      M1[0][2]=6;
      M1[0][3]=7;
      
      M1[1][0]=0; 
      M1[1][1]=4;
      M1[1][2]=9;
      M1[1][3]=7;
      
      M1[2][0]=-0; 
      M1[2][1]=0;
      M1[2][2]=8;
      M1[2][3]=7;
     
      M1[3][0]=0; 
      M1[3][1]=0;
      M1[3][2]=0;
      M1[3][3]=4;
      
      
      for(int y=0;y<3;y++){
          for(int j=3;(j>0+y)&&(superior);j--){
              
       if (M1[j][y]==0){
       superior=true;     
     } else{
       superior=false; 
       }
          } 
      } 
       if(superior==true){
          System.out.println("Tu matriz es tringular superior");
      }else{ 
        System.out.println("Esto no es una matriz tringular superior");
      }
                     for(int r=0;r<M1.length;r++){
          System.out.println();
          for(int x=0;x<M1.length;x++){
              System.out.print(M1[r][x]);
              System.out.print(" ");
}

  }
      }

     }

