import java.io.File;
import java.io.IOException;


public class FileCreator {
    public static void main(String[] args){
        try {
        File tFile = new File("ExFile.txt");
        if(tFile.createNewFile()){
            System.out.println("File has been created, Sir : " + tFile.getName());
        }else{
            System.out.println("File already exists");
        }
    } catch (IOException e) {
        System.out.println("An error has occured");
        e.printStackTrace();
        }
    }
}
