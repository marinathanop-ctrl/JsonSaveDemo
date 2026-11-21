import java.io.FileWriter;
import java.io.IOException;

public class JsonSaveDemo
{
    public static void main(String[] args)
    {
        String name = "Marina";
        int age = 19;

        saveToJson(name, age);
    }

    public static void saveToJson(String name, int age)
    {
        String json = 
                "{\n" +
                "  \"name\": \"" + name + "\",\n" +
                " \"age\": " + age +"\n" +
                "}";
        
        try
        {
            FileWriter writer = new FileWriter("person.json");

            writer.write(json);
            writer.close();

            System.out.println("File saved succesfully!");
        }

        catch(IOException e)
        {
            System.out.println("Error saving the file.");
        }
    }
}