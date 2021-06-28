

package semester_project;
import java.io.*;


public abstract class Member implements Serializable {
    private String name;
    private String ID;
    private String Cell_Num;
    private Adress adress;
    
    public abstract void printinfo();
    
    public Member(){
        
    }
    
    
    public Member(String name, String ID, String Cell_Num,Adress adress) {
        this.name = name;
        this.ID = ID;
        this.Cell_Num = Cell_Num;
        this.adress=adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCell_Num() {
        return Cell_Num;
    }

    public void setCell_Num(String Cell_Num) {
        this.Cell_Num = Cell_Num;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "\nname=" + name + "\nID= " + ID + "\nCell_Num= " + Cell_Num +"\n -Adress- "+adress;
    }
    
    
    
    
}
