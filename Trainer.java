


package semester_project;




public class Trainer extends Member {
   
    private int experience;
    private String Designation;

    public Trainer(String name, String ID, String cellNumber,Adress adress, int experience, String Designation) {
        super(name,ID,cellNumber,adress);
        this.experience = experience;
        this.Designation = Designation;
    }
    
    public String getName(){
        return super.getName();
    }
    
    
    @Override
    public void printinfo(){
        
        System.out.println("\ntrainer name : "+ getName()+"\ntrainer id :"+super.getID()
        +"\ntrainer cell number :"+super.getCell_Num()+"\ntrainer address :"+super.getAdress()
        +"\nexperience : "+experience+"\ndesignation :"+Designation);
        
    }
    

    @Override
    public String toString() {
        return "Trainer " + super.toString()+ "\nExperience= " + experience+"years" + "\n Designation=" + Designation;
    }
    
    
    
    
}

