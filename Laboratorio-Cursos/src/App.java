import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite os dados do curso " + (i+1) +": ");
            Curso curso = new Curso();
            System.out.print("Nome: ");
            curso.name = input.nextLine();
            System.out.print("Duração: ");
            curso.duration = input.nextInt();
            input.nextLine();
            System.out.print("Instituição: ");
            curso.institute = input.nextLine();
            System.out.print("Modalidade: ");
            curso.modality = input.nextLine();
            System.out.println("Curso: " + curso.name + "\nDuração: " + curso.duration + " anos" + "\nInstituição: " + curso.institute + "\nModalidade: " + curso.modality);
        }
        input.close();
    }
}
