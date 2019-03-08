package project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Gravar {
    private String fala;
    public String path;
    BufferedWriter bw;
    FileWriter fw;
    public int n;

    public Gravar(String path){
        this.n = 0;
        this.bw = null;
        this.fw = null;
        this.path = path;
    }

    public FileWriter getFw() {
        return fw;
    }

    public void setFw(FileWriter fw) {
        this.fw = fw;
    }
    
    public void gravar(){
        try{
            fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            bw.write(fala);
            bw.newLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
        try{
            if(bw != null){
                bw.close();
            }
            if(fw != null){
                fw.close();
            }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        
}
    }
        public void gravarSem(){
        try{
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write(fala);
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
        try{
            if(bw != null){
                bw.close();
            }
            if(fw != null){
                fw.close();
            }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        
}
    }
    public void fala(String fala){
        this.fala = fala;
    }
    public void numero(){
        this.n = this.n + 1;
    }
    
    
    
    
    
}
