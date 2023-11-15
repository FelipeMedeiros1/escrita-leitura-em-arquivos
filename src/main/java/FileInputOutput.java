import java.io.*;

public class FileInputOutput {
    private static BufferedReader reader;

    public static void inputData() {

        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static String readLine() throws IOException {
        return reader.readLine();
    }

    public static void output() {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String line;
            while ((line = readLine()) != null && !line.isEmpty()) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Digite 3 nomes de filme: ");

        FileInputOutput.inputData();
        FileInputOutput.output();
    }
}
