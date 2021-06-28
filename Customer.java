
package semester_project;

import java.util.Scanner;

public class Customer extends Member{
   
    private int fee;
    
    
    public Customer(){
        
    }

    public Customer(String name, String ID, String cellNumber,Adress adress, int fee) {
        super(name,ID,cellNumber,adress);
        
        this.fee = fee;
        
        
    }

    
    public int fee(){
    
    System.out.println("training bench [y/n] : ");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if (s.equals("y")){
        fee = fee + 200;
        
    }
    
    System.out.println("dumbell set [y/n] : ");
    Scanner Sc = new Scanner(System.in);
    String S = Sc.next();
    if (S.equals("y")){
        fee = fee + 200;
        
    }
    
    System.out.println("treadmill [y/n] : ");
    Scanner in = new Scanner(System.in);
    String In = in.next();
    if (In.equals("y")){
        fee = fee + 500;
        
    }
    
    System.out.println("stationary bicycle [y/n] : ");
    Scanner x = new Scanner(System.in);
    String y = x.next();
    if (y.equals("y")){
        fee = fee + 300;
        
    }
    
    System.out.println("rowing machine [y/n] : ");
    Scanner a = new Scanner(System.in);
    String b = a.next();
    if (b.equals("y")){
        fee = fee + 300;
        
    }
    
    
    System.out.println("your fee is :"+fee);
    
    
        
    return fee;
    
    }
    
    
    
    public String getName(){
        return super.getName();
    }
    
    
    @Override
    public void printinfo(){
        
        System.out.println("\ncustomer name : "+ getName()+"\ncustomer id :"+super.getID()
        +"\ncustomer cell number :"+super.getCell_Num()+"\ncustomer address :"+super.getAdress()
        +"\nfee : "+fee);
        
    }
    
    
    @Override
    public String toString() {
        return "customer  : " + super.toString()+ "\nfee :"+ fee;
    }
    
    
    
    
}
