import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ManejoArchivosBinarios implements Serializable{

    public ManejoArchivosBinarios(){

    }

    // Write a single object to file
    public static void writeObjectToFile(Object obj, String filename)
            throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(obj);
        }
    }

    // Read a single object from file
    public static Object readObjectFromFile(String filename)
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            return ois.readObject();
        }
    }



}
