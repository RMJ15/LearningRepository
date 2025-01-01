import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Считывает с консоли имя текстового файла.
        Scanner input = new Scanner(System.in);
        String filePath = input.nextLine();


        try{
            Path path = Paths.get(filePath);
            List<String> text = Files.readAllLines(path);


            for(String contentFile: text){
                for(Character symbolText: contentFile.toCharArray()){
                    if(symbolText == '.' || symbolText == ',' || symbolText == ' ') {
                        continue;
                    }
                    System.out.print(symbolText + "");
                }
            }
            




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}