import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double valor1 = 0, valor2 = 0, resultado = 0;
        boolean invalido = true;

        while (invalido) {
            System.out.println("Insira dois valores: ");
            try {
                valor1 = entrada.nextDouble();
                valor2 = entrada.nextDouble();
                invalido = false;
            } catch (InputMismatchException ex) {
                invalido = true;
                System.out.println("Ocorreu um erro! Insira um valor numérico.");
                entrada.nextLine();
            }

            try{
                resultado = (int)valor1/(int)valor2;
                invalido = false;
            }catch(ArithmeticException ex){
                invalido = true;
                System.out.println("Impossível realizar divisão por 0.");
                entrada.nextLine();
            }finally{
                resultado = valor1/valor2;
            }
        }
        System.out.println("O resultado da divisão é: "+resultado);
        System.out.println("Programa Finalizado!");
    }
}
