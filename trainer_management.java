
package semester_project;
import java.io.*;
import java.util.ArrayList;



    public class trainer_management  {
         
        
        private ArrayList<Trainer> Trainers;
        
        public trainer_management(){
            
            Trainers = new ArrayList<Trainer>();
            
        }
        public void add_trainer(Trainer member) {
            if(Trainers.size()<= 20){
                Trainers.add(member);
              
             
                try{
                save();   
                }
                catch(Exception e){
                    System.out.println("error in save function");
                }
            }    
            else{
                System.out.println("no free sapace avaible");
            }
            System.out.println("Trainer Filled seats: "+Trainers.size());
            System.out.println("Trainer available seats: "+(20-Trainers.size()));
            
        }
        public void save(){
            
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("trainers.txt")); 
                
                oos.writeObject(Trainers);
                oos.close();
          }
            
            
           catch(Exception e){
               System.out.println("error in save method");
           }
            
        }
        public boolean delete_trainer(String name){
            for(Trainer T : Trainers){
                if(T.getName().equalsIgnoreCase(name)) {
                    Trainers.remove(T);
                    System.out.println("Trainer with name: " + name + "Successfully Deleted");
                    System.out.println("Trainer Filled seats: " + Trainers.size());
                    System.out.println("Trainer available seats: "+(20-Trainers.size()));
                    save();
                    return true;
        }
            }
          return false;
        }
        public void print() {
            for(Trainer T : Trainers){
                T.printinfo();
            }
        }
        public boolean search(String name) {
            System.out.println("The Searched result: ");
           
            for(Trainer T : Trainers){
                if(T.getName().equalsIgnoreCase(name)){
                    T.printinfo();
                    return true;
                }
}
            System.out.println("not found");
            return false;
           

        }
        public void read(){
            
            
            try {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream("trainers.txt"));
                Trainers = (ArrayList<Trainer>) obj.readObject();
                obj.close();
              }
           
            catch(Exception e){
                System.out.println("there was no data to retrieve");
            }
       }
        
  

    }


