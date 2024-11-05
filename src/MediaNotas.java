  import java.util.Scanner;

public class MediaNotas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double nota1, nota2, nota3, nota4, media;

    System.out.print("Digite a primeira nota: ");
    nota1 = scanner.nextDouble();

    System.out.print("digite a segunda nota: ");
    nota2 = scanner.nextDouble();

    System.out.print("Digite a terceira nota: ");
    nota3 = scanner.nextDouble();

    System.out.print("Digite a quarta nota ");
    nota4 = scanner.nextDouble();

    media = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.printf("A média das nota é: %.2fn", media);

    scanner.close();

  }   
}  