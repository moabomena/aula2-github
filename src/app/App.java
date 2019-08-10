package app;

import java.util.Scanner;

/**
 * 
 * https://www.urionlinejudge.com.br/judge/pt/problems/view/1149 Faça um
 * algoritmo para ler um valor A e um valor N. Imprimir a soma de A para cada i
 * com os valores (0 <= i <= N-1). Enquanto N for negativo ou ZERO, um novo
 * N(apenas N) deve ser lido.
 * 
 * Entrada A entrada contém somente valores inteiros, podendo ser positivos ou
 * negativos. Todos os valores estão na mesma linha.
 * 
 * Saída A saída contém apenas um valor inteiro.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, n,b=0;
        a = sc.nextInt();
        while((n=sc.nextInt())<=0);
        for (int i = 1; i <= n; i++) {
            b+=a;
            a++;
        }
        System.out.println(b);
sc.close();
    }
}