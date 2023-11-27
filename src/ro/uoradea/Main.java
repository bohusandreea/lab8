package ro.uoradea;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            String FILE_NAME="fisier.txt";
            File newFile = new File(FILE_NAME);
            boolean success = newFile.createNewFile();

            FileWriter fileWriter = new FileWriter(FILE_NAME);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print("Hello java files");
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        String file = "C:\\Users\cti22a109\IdeaProjects\lab8\";
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(new FileInputStream(file), "UTF-8"));
        String currentLine = reader.readLine();
        reader.close();
    }


}
