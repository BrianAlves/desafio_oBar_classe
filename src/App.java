import java.util.Locale;
import java.util.Scanner;

import entity.Bill;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bill b = new Bill();

        System.out.print("Sexo: ");
        b.setGender(sc.next().charAt(0));

        System.out.print("Quantidade de cervejas: ");
        b.setBeer(sc.nextInt());

        System.out.print("Quantidade de refrigerantes: ");
        b.setSoftDrink(sc.nextInt());

        System.out.print("Quantidade de espetinhos: ");
        b.setBarbecue(sc.nextInt());

        System.out.println();
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", b.feeding());

        if (b.cover() > 0.00)
            System.out.printf("Couvert = R$ %.2f%n", b.cover());
        else
            System.out.println("Isento de Couvert");
            
        System.out.printf("Ingresso = R$ %.2f%n", b.ticket());

        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f%n", b.total());

        sc.close();
    }
}
