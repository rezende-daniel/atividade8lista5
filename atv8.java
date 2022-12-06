//Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado.



import java.util.Scanner;

public class atv8 {

    static void num(String numero){
        int tamanho=numero.length();
        System.out.println(tamanho);

    }
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o  número ");
        String numero  = entrada.next();
        entrada.close();
        num (numero);
        
        

    }}
