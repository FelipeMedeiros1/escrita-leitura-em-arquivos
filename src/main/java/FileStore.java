import java.io.*;
import java.util.Scanner;

public class FileStore {
    public static void documentInput() throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Digite 3 nomes de filme:");
        printWriter.flush();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        File file = new File("recomendacoes.txt");

        BufferedWriter writer = new BufferedWriter(new FileWriter(file.getName()));

        do {
            writer.write(line);
            writer.newLine();
            writer.flush();
            line = scanner.nextLine();

        }while (!line.equalsIgnoreCase("fim"));

        printWriter.printf("Arquivo \"%s\" criado com sucesso", file.getName());
        printWriter.close();
        scanner.close();
        writer.close();

    }

    public static void main(String[] args) throws IOException {
        documentInput();
    }
}
