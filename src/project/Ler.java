package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ler {
        String path = "C:\\Users\\Lenovo\\Desktop\\legendas\\numero.srt";
        
        FileReader fr = null;
        BufferedReader br = null;
        public String line;
        
        public void ler(){
            try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            
            line = br.readLine();
            System.out.println(line);
        }
        catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
        finally{
            try{
            if(br != null){
                br.close();
            }
            if(fr != null){
                fr.close();
            }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        }
        
    
    
}
