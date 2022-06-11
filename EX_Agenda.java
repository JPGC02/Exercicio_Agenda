import java.util.Scanner;

import java.util.Arrays;

 
public class EX_Agenda
{
  
 
public static void main (String[]args)
  {
    
Scanner Agenda = new Scanner (System.in);
    
 
      // Declaracao de variaveis 
    int i = 0, j = 0, k = 0, linhas = 10, colunas = 5;
    
      // Declaracao da variavel de matriz com modulos definidos 
      String m[][] = new String[linhas][colunas];
    
String x;
    
 
      // Estrutura de repeticao numero de linhas da matriz
      for (i = 0; i < linhas; i++)
      {
	
	  // Exibir 'Pessoa' + a contagem de pessoa 
	  System.out.printf ("Pessoa %d\n", (i + 1));
	
	  // Pedir dados ao usuario 
	  System.out.print ("Informe seu nome: ");
	
	  // Ler e guardar dados (string) na matriz 
	  m[i][0] = Agenda.nextLine ();
	
System.out.print ("Informe seu endereco: ");
	
m[i][1] = Agenda.nextLine ();
	
System.out.print ("Informe seu codigo postal: ");
	
m[i][2] = Agenda.nextLine ();
	
System.out.print ("Informe seu bairro: ");
	
m[i][3] = Agenda.nextLine ();
	
System.out.print ("Informe seu telefone: ");
	
m[i][4] = Agenda.nextLine ();
	
	  // Pular linha
	  System.out.printf ("\n");
      
}
    
 
      // Estrutura de repeticao numero de linhas da matriz
      for (i = 0; i < linhas; i++)
      {
	
	  // Estrutura de repeticao numero de linhas da matriz 
	  for (j = 0; j < linhas; j++)
	  {
	    
 
	      // Estrutura de decisao para comparar coordenadas da matriz
	      if (m[i][0].compareTo (m[j][0]) < 0)
	      {
		
 
		  // Estrutura de repeticao numero de colunas da matriz
		  for (k = 0; k < colunas; k++)
		  {
		    
		      // Estrutura de ordenacao das strings de uma coordenada da matriz 
		      x = m[i][k];
		    
m[i][k] = m[j][k];
		    
m[j][k] = x;
		  
 
}
	      
}
	  
}
      
}
    
 
      // Estrutura de repeticao numero de linhas da matriz
      for (i = 0; i < linhas; i++)
      {
	
	  // Estrutura de repeticao para repitir uma vez
	  for (j = 0; j < 1; j++)
	  {
	    
	      // Exibir o numero da pessoa + contagem 
	      System.out.printf ("Pessoa %d\n", (i + 1));
	    
	      // Exibir os dados inseridos alocados em cada coordenada da matriz, em ordem alfabetica (nome) 
	      System.out.printf ("Nome: %s\n", m[i][0]);
	    
System.out.printf ("Endereco: %s\n", m[i][1]);
	    
System.out.printf ("Codigo Postal: %s\n", m[i][2]);
	    
System.out.printf ("Bairro: %s\n", m[i][3]);
	    
System.out.printf ("Telefone: %s\n", m[i][4]);
	    
	      // Pular linha
	      System.out.printf ("\n");
	  
}
      
}
  
}

}
