import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double classA = 50.0;
        double classB = 30.0;
        double classC = 20.0;

        System.out.print("Quantos ingressos do Estádio A foram vendidos? ");
        int quantitySeatsClassA = scanner.nextInt();
        System.out.print("Quantos ingressos do Estádio A foram vendidos? ");
        int quantitySeatsClassB = scanner.nextInt();
        System.out.print("Quantos ingressos do Estádio A foram vendidos? ");
        int quantitySeatsClassC = scanner.nextInt();

        double incomeClassA = Activity1.calculeOfIncome(classA, quantitySeatsClassA);
        double incomeClassB = Activity1.calculeOfIncome(classB, quantitySeatsClassB);
        double incomeClassC = Activity1.calculeOfIncome(classC, quantitySeatsClassC);

        double totalIncome = incomeClassA + incomeClassB + incomeClassC;

        System.out.printf("Rendimento total: R$ %.2f", totalIncome);

        scanner.close();
    }

    public static double calculeOfIncome(double value, int quantity) {
        return value * quantity;
    }
}
