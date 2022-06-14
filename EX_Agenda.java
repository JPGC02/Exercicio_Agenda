import java.util.Scanner;

import java.util.Arrays;


public class EX_Agenda {


    public static void main(String[] args) {

        Scanner Agenda = new Scanner(System.in);


        // Declaracao das variaveis 
        int i = 0, j = 0, k = 0, linhas = 10, colunas = 5;

        // Declaracao da matriz 
        String m[][] = new String[linhas][colunas];

        String x;


        //numero de repeticoes da matriz linha
        for (i = 0; i < linhas; i++) {
            System.out.printf("Pessoa %d\n", (i + 1));

            // dados dos usuarios 
            System.out.print("Informe seu nome: ");
            m[i][0] = Agenda.nextLine();

            System.out.print("Informe seu endereco: ");

            m[i][1] = Agenda.nextLine();

            System.out.print("Informe seu codigo postal: ");

            m[i][2] = Agenda.nextLine();

            System.out.print("Informe seu bairro: ");

            m[i][3] = Agenda.nextLine();

            System.out.print("Informe seu telefone: ");

            m[i][4] = Agenda.nextLine();

            System.out.printf("\n");
        }
        for (i = 0; i < linhas; i++) {
            for (j = 0; j < linhas; j++) {
                // Estrutura para comparar ascoordenadas
                if (m[i][0].compareTo(m[j][0]) < 0) {
                    // numero de repeticoes da matriz
                    for (k = 0; k < colunas; k++) {
                        x = m[i][k];
                        m[i][k] = m[j][k];
                        m[j][k] = x;


                    }

                }

            }

        }
        for (i = 0; i < linhas; i++) {
            for (j = 0; j < 1; j++) {
                System.out.printf("Pessoa %d\n", (i + 1));

                // Exibir os dados em ordem alfabetica pelo nome 
                System.out.printf("Nome: %s\n", m[i][0]);

                System.out.printf("Endereco: %s\n", m[i][1]);

                System.out.printf("Codigo Postal: %s\n", m[i][2]);

                System.out.printf("Bairro: %s\n", m[i][3]);

                System.out.printf("Telefone: %s\n", m[i][4]);
                System.out.printf("\n");

            }

        }

    }

}
