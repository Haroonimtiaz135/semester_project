


package semester_project;
import java.io.*;


public class Adress implements Serializable{
    private String streetNumber;
    private String houseNumber;
    private String city;
     

public Adress(){
    
    }

public Adress(String s,String h,String c){
     streetNumber=s;
     houseNumber=h;
     city=c;
 
         }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

   

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }
    
    

    @Override
    public String toString() {
        return "\n"+"streetNumber: " + streetNumber +"\n"+ "houseNumber:" + houseNumber +"\n"+
                "city=" + city;
        
    }
    
}

