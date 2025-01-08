import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VersionSorter
{
    public static void main(String[] args)
    {
        List<String> result = new ArrayList<>();
        String filePath = "C:\\Users\\SuperHuma\\IdeaProjects\\leetcode\\src\\main\\resources\\version.txt";
        try
        {
            BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(filePath)));
            String line = br.readLine();
            while (line != null)
            {
                String[] split = line.split(".");
                

                line = br.readLine();
            }

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException("File not found");
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
