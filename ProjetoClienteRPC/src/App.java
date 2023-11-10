import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	//DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ);

        // Criando o menu e as váriaveis que serão usadas pela calculadora
        Scanner sc = new Scanner (System.in);
        double numero1,numero2 = 0;

        while (true) {
        System.out.print("##-- Menu --##\n");
        System.out.print(" Opção 1 - Calcular área de um quadrado.\n");
        System.out.print(" Opção 2 - Calcular área de um triângulo retângulo.\n");
        System.out.print(" Opção 3 - Calcular área de uma circunferência.\n");
        System.out.print(" Opção 4 - Calcular área de uma esfera.\n");
        System.out.print(" Opção 5 - Calcular volume de uma esfera.\n");
        System.out.print(" Opção 6 - Calcular área de um cilindro.\n");
        System.out.print(" Opção 7 - Calcular volume de um cilindro.\n");
        System.out.print(" Opção 8 - Calcular área de superficie de um cubo.\n");
        System.out.print(" Opção 9 - Calcular volume de um cubo.\n");
        System.out.print(" Opção 0 - Sair.\n");
        System.out.print("\n");
        System.out.print("Digite uma opção: ");
        
        //Criando uma váriavel para setar uma opção 
        int opcao = sc.nextInt();
        
        //Exit Point
        if (opcao == 0) {
            System.out.println("\nAté logo!");
            break;
        }
        

        //Switch case para cada operação do menu
        switch(opcao) {
            //Operação de calculo da área de um quadrado.
            case 1:
                System.out.println("Digite o valor do lado");
                numero1 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.areaQuadrado(numero1));
            break;

            //Operação de calculo da área de um triângulo retângulo.
            case 2:
                System.out.println("Digite o valor da base");
                numero1 = sc.nextDouble();
                System.out.println("Digite o valor da altura");
                numero2 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.areaTrianguloRetangulo(numero1,numero2));
                break;

            //Operação de calculo da área de uma circunferencia.
            case 3:
                System.out.println("Digite o valor do raio");
                numero1 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.areaCircunferencia(numero1));
                break;

            //Operação de calculo da área de uma esfera.
            case 4:
                System.out.println("Digite o valor do raio");
                numero1 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.areaEsfera(numero1));
                break;

            //Operação de calculo do volume de uma esfera.
            case 5:
                System.out.println("Digite o valor do raio");
                numero1 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.volumeEsfera(numero1));
                break;

            //Operação de calculo da área de um cilindro.
            case 6:
                System.out.println("Digite o valor do raio");
                numero1 = sc.nextDouble();
                System.out.println("Digite o valor da altura");
                numero2 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.areaCilindro(numero1, numero2));
                break;

            //Operação de calculo do volume de um cilindro.
            case 7:
                System.out.println("Digite o valor do raio");
                numero1 = sc.nextDouble();
                System.out.println("Digite o valor da altura");
                numero2 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.volumeCilindro(numero1, numero2));
                break;
                
            //Operação de calculo da área de superfície de um cubo.
            case 8:
                System.out.println("Digite o valor da aresta");
                numero1 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.areaCubo(numero1));
                break;
                        
            //Operação de calculo do volume de um cubo.
            case 9:
                System.out.println("Digite o valor da aresta");
                numero1 = sc.nextDouble();
                System.out.println("\nO resultado foi: " + rpc.volumeCubo(numero1));
                break;
                
                    
            default:
                System.out.println("A opção é invalida!");
                break;
            }
        }
    }
}
