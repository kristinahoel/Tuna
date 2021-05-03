import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;


/**
 * Write a description of class FileHandler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileHandler
{
        public void WriteFile(){
            try{
                FileWriter writer = new FileWriter("filename.txt");
                writer.write("Det tar en time å gå ned til Ørsta rådhus");
                writer.close();
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
 
        }
        
        
        public void ReadFile()throws Exception{
            Path path = Paths.get("filename.txt");
            File file = path.toFile();

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String content = bufferedReader.readLine();

            System.out.println(content);
        }

}
