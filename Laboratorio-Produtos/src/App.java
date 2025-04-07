import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int code;
        String name;
        int quantity;
        String type;
        double price;

        System.out.println("Digite o código do produto1: ");
        code = input.nextInt();
        input.nextLine();
        Produto produto1 = new Produto(code);
        System.out.println("Digite o nome do produto1: ");
        name = input.nextLine();
        System.out.println("Digite a quantidade do produto1: ");
        quantity = input.nextInt();
        input.nextLine();
        System.out.println("Digite o tipo do produto1: ");
        type = input.nextLine();
        System.out.println("Digite o preço do produto1: ");
        price = input.nextDouble();
        input.nextLine();

        produto1.update(name, quantity, type, price);
        System.out.println("Produto1 atualizado com sucesso.");
        produto1.toStringProduct();

        System.out.println("Digite a quantidade a ser vendida do produto1: ");
        produto1.sell(input.nextInt());
        produto1.toStringProduct();

        System.out.println("Digite o código do produto2: ");
        code = input.nextInt();
        input.nextLine();
        System.out.println("Digite o nome do produto2: ");
        name = input.nextLine();

        Produto produto2 = new Produto(code, name);

        System.out.println("Digite a quantidade e o preço a serem reabastecidos do produto2 ");
        produto2.restock(input.nextInt(), input.nextDouble());
        produto2.toStringProduct();

        System.out.println("Digite a quantidade a ser reabastecida do produto1: ");
        produto1.restock(input.nextInt());
        produto1.toStringProduct();

        System.out.println("Comparando produtos 1 e 2: ");
        if (produto1.equals(produto2)) {
            System.out.println("Os produtos são iguais.");
        } else {
            System.out.println("Os produtos são diferentes.");
        }

        input.close();
    }
}
