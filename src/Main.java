import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double num1,num2,num3,num4, media;
        String calcularMedia;
        String nomeAluno;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Qual nome do aluno? ");
            nomeAluno = sc.nextLine();

            System.out.println("Digite o valor da nota 1: ");
            num1 = sc.nextDouble();
            System.out.println("Digite o valor da nota 2: ");
            num2 = sc.nextDouble();
            System.out.println("Digite o valor da nota 3: ");
            num3 = sc.nextDouble();
            System.out.println("Digite o valor da nota 4: ");
            num4 = sc.nextDouble();

            media = (num1 + num2 + num3 + num4) / 4;

            System.out.println("A média do aluno " + nomeAluno + " é: " + media);

            if(media >= 7){
                System.out.println("APROVADO");
            } else if (media >= 5 && media < 7){
                System.out.println("RECUPERAÇÃO");
            } else {
                System.out.println("REPROVADO");
            }

            sc.nextLine();
            System.out.println("Deseja calcular a média de outro aluno? ");
            calcularMedia = sc.nextLine();
        }while(calcularMedia.equalsIgnoreCase("sim"));


        sc.close();
    }
}