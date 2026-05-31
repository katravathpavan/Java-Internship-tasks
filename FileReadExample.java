import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReadExample{
    public static void main(String[] args)
    {
        try{
            FileReader reader = new FileReader("sample.txt");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error: File does not exist.");
        }
        catch(IOException e){
            System.out.println("Error: Problem reading the file.");
        }
    }
}