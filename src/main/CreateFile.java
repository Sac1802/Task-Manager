package src.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreateFile {
    File fileJson = new File("tasks.json");

    public CreateFile(){
        CreateFileMethod();
    }
    public void CreateFileMethod(){
        try{
            if(!fileJson.exists()){
                fileJson.createNewFile();
                return;
            }else{
                return;
            }
        }catch(IOException e){
            System.out.println("Error create a file");
            e.printStackTrace();
        }
    }

    public File getFile(){
        if(fileJson.exists()){
            return fileJson;
        }
        return null;
    }
}
