import java.io.*;

public class FileCopyUtil {


    public static void copyFile() throws IOException {
        File file = new File("C:\\Users\\felipem.medeiros\\Documents\\02-cursos\\java\\escrita-leitura\\recomendacoes.txt");
        String fileName = file.getName();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();

        String fileNameCopy = fileName.substring(0, fileName.indexOf(".")).concat("-copy.txt");
        File fileCopy = new File(fileNameCopy);

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileCopy.getName()));

        do {
            writer.write(line);
            writer.newLine();
            writer.flush();
            line = reader.readLine();

        } while (!(line == null));


        System.out.println("Arquivo " + file.getName() + ", copiado com sucesso!");
        System.out.println("Arquivo " + fileCopy.getName() + ", criado com sucesso!");

        System.out.println("Escreva 3 títulos de livros.");


        inputData(fileCopy.getName());


        reader.close();
        writer.close();

    }

    public static void inputData(String file) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

        do {
            writer.write(line);
            writer.newLine();
            line = reader.readLine();

        } while (!(line.equalsIgnoreCase("fim")));
        reader.close();
        writer.close();

    }


    public static void main(String[] args) throws IOException {
        copyFile();


    }


}
