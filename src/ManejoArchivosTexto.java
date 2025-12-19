import java.io.*;

public class ManejoArchivosTexto {


    public ManejoArchivosTexto() {
    }


    public void leerArchivo(String fileName)  {
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
            for(String line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.err.println("ha ocurrido un error al leer from the file: " + e.getMessage());
        }
    }

    public void escribirArchivo(String fileName, String content) {
        // Using try-with-resources to ensure the writer is closed properly
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File written successfully.");
         }
         catch (IOException e) {
             System.err.println("An error occurred while writing to the file: " + e.getMessage());
         }
    }
}



