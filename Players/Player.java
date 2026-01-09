import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Player {

    String name;
    int valore;

    public Player( String name) {
        this.name = name;
        valore = 0;
    }

    public void setValore (int valore){
        this.valore = valore;
    }
    
    public void load() {
        File f = new File("data/" + name + ".dat");
        try{
            Scanner sc = new Scanner(f);
            valore = sc.nextInt();
            sc.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
    
    public void save(){
        File f = new File("data/" + name + ".dat");
        PrintWriter pw;
        try{
            pw = new PrintWriter(f);
            pw.print(valore);
            pw.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        } 
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", valore=" + valore + "]";
    }

    

}