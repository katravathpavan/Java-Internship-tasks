import java.io.*;
public class FileCopyUpperCase
{
    public static void main(String[] args)
    {
        try{
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt");
            int ch;
            while((ch=fr.read())!= -1)
            {
                fw.write(Character.toUpperCase((char)ch));
            }
            fr.close();
            fw.close();
            System.out.println("File copied successfully in uppercase.");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Input file not found.");
        }
        catch(IOException e)
        {
            System.out.println("Error while reading or writing the file.");
        }
    }
}