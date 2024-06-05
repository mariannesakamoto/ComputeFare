import java.util.Scanner;

public class ComputeFare {
    public static void main(String[] args) {
        // declara variavel idade
        int age;

        //cria um scanner
        Scanner scanner = new Scanner(System.in);

        // pergunta a idade
        System.out.print("Digite sua idade: ");
        age = scanner.nextInt();

        double fare; 
        if (age < 11) {
            fare = 3.0; 
        } else if (age < 65) {
            fare = 5.0; 
        } else {
            fare = 3.0; 
        }

        System.out.println("Sua tarifa é: $" + fare);
        scanner.close();
    }
}