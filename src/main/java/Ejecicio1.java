
public class Ejecicio1 {
    
    public static void main(String[] args){
      
      int [][] M1= new int[3][3];
      
      M1[0][0]=-5; 
      M1[0][1]=10;
      M1[0][2]=0;        
      
      M1[1][0]=2; 
      M1[1][1]=-14;
      M1[1][2]=9;
      
      M1[2][0]=-6; 
      M1[2][1]=3;
      M1[2][2]=8;
      
      int [][] M2= new int[3][3];
      
      M2[0][0]=-8; 
      M2[0][1]=3;
      M2[0][2]=4;        
      
      M2[1][0]=-9; 
      M2[1][1]=7;
      M2[1][2]=-5;
      
      M2[2][0]=15; 
      M2[2][1]=-3;
      M2[2][2]=0;
      
      int [][] M3= new int[3][3];
      
      M3[0][0]=-4; 
      M3[0][1]=3;
      M3[0][2]=2;        
      
      M3[1][0]=-3; 
      M3[1][1]=5;
      M3[1][2]=-2;
      
      M3[2][0]=6; 
      M3[2][1]=-3;
      M3[2][2]=0;
      
      int [][] MResultado= new int [3][3];
       
      for(int i=0;i<3;i++){
          
          for(int z=0;z<3;z++){
            M2[i][z]=(M2[i][z])+(M1[i][z]);  
          }
       }
                
          for(int f=0;f<3;f++){
             for(int r=0;r<3;r++){
                 for(int g=0;g<3;g++){
                MResultado[r][f]+= M2[g][f]* M3[r][g];     
                 }
             }
             
         }     
      
      for(int j=0;j<3;j++){
          System.out.println();
          for(int x=0;x<3;x++){
              System.out.print(MResultado[j][x]);
              System.out.print(" ");
          }
      }
    }
  }
