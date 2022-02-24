import java.util.Scanner;
public class lab_6 {
  
  public static void distanciaMinima (int arreglo[][],int vertice) 
  { 
      
      int i, j, contador=0; 
   
  while( contador < vertice) 
      { 
          for (i = 0; i < vertice; i++) 
          { 
              for (j = 0; j < vertice; j++) 
              { 
                  if (arreglo[i][contador] + arreglo[contador][j] < arreglo[i][j]) 
                      arreglo[i][j] = arreglo[i][contador] + arreglo[contador][j]; 
              } 
          } 
          contador++;
      } 
    mostrar(arreglo,vertice); 
  } 
  public static void mostrar(int arreglo[][],int vertice) 
  { 
      System.out.print ("La siguiente matriz muestra las distancias más cortas entre cada par de vértices \n"); 
      for (int i = 0; i < vertice; i++) 
      { 
      	System.out.print("\t"+(i+1));
      }
      System.out.print("\n");
      for (int i = 0; i < vertice; i++) 
      { 
      	System.out.print((i+1)+"\t");
          for (int j = 0; j < vertice; j++) 
          { 
             
              	System.out.print (arreglo[i][j]+"\t"); 
          } 
          System.out.print("\n"); 
      }
      System.out.println("\n  Nota: si la distancia entre dos vértices es 9999, entonces no hay camino entre ellos.");
  } 

  public static void main(String[] args) {
	  
    Scanner sc=new Scanner(System.in);
    System.out.print("Introduzca el número total de vértices en el gráfico: ");
    int vertice=sc.nextInt();
    
    int arreglo[][]=new int[vertice][vertice],i,j;
    for(i=0;i<vertice;i++) {
      
      for(j=0;j<vertice;j++) {
        System.out.print("Ingrese arreglo["+i+"]["+j+"]:");
        arreglo[i][j]=sc.nextInt();
      }
    }
    distanciaMinima (arreglo,vertice);

  }

}
