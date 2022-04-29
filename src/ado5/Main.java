package ado5;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMenuOpen = true;
        int escolhaUsuario = 0;

        do {
            System.out.println("Digite: \n1 - Instrucoes\n2 - Jogar\n3 - Creditos\n4 - Sair");
            escolhaUsuario = scanner.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    System.out.println("INSTRUCOES");
                    break;

                case 2:
                    System.out.println("Jogar");
                    break;

                case 3:
                    System.out.println("CREDITOS");
                    break;

                case 4:
                    System.out.println("ATE MAIS");
                    isMenuOpen = false;
                    break;

                default:
                    System.out.println("Operacao invalida");
                    break;
            }
        } while(isMenuOpen);
    }
}
