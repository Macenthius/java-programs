import java.io.FileReader;

public class FileReading {
    public static void main(String[] args){
        char[] array = new char[100];
        try{
            FileReader input = new FileReader("ExFile.txt");

            input.read(array);
            System.out.println("Data in the file :" );
            System.out.println(array);

            input.close();
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("Something went wrong, Sir.");
        }
    }
}
