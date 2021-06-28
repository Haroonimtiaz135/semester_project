package semester_project;

import java.util.Scanner;


public class runner {

    public static void main(String[] arg) {

        System.out.println("\t\t ~~~~~~~~~~~~~~~~~~~~~~~~~~GYM MANAGEMENT SYSTEM~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);

        trainer_management t = new trainer_management();

        t.read();

        Customer_management Cm = new Customer_management();

        Cm.read();
        
        boolean bool= true;
        
        while (bool){
        
        int in =0;  
        boolean correct = false;
        while(true)
        {
            try{
            System.out.println("----------------------------------------");    
            System.out.println(
                 "|" + "     press 1 to add customer          " +  "|"+
                 "\n|" + "     press 2 to delete customer       " +  "|"+   
                 "\n|" + "     press 3 to search customer       "+   "|"+
                 "\n|" + "     press 4 to add trainer           " +  "|"+
                 "\n|" + "     press 5 to delete trainer        "+   "|"+
                 "\n|" + "     press 6 to search trainer        "+   "|"+
                 "\n|" + "     press 7 to print customers list  "+   "|"+
                 "\n|" + "     press 8 to print trainers list   "+   "|"+
                 "\n|" + "     press 0 to exit                  "+   "|"
            
            );
                System.out.println("----------------------------------------");
                System.out.print("enter your choice : ");
                
            
            in = Integer.parseInt(sc.next());
            break;
            
            }
            
            catch(NumberFormatException e ){
                System.out.println("wrong input!!!!!!!!!");
                System.out.println("enter the interger value only");
                
                
            }
        }
        

        if (in == 1) {

            System.out.print("enter the name of customer :");
            Scanner a = new Scanner(System.in);
            String s = a.next();

            System.out.print("enter the id of customer :");
            Scanner id = new Scanner(System.in);
            String I = id.next();

            System.out.print("enter the cell number of customer :");
            Scanner cel = new Scanner(System.in);
            String Cell = cel.next();

            System.out.println("enter the address of customer :");
            System.out.print("enter the house number :");
            Scanner x = new Scanner(System.in);
            String scc = x.next();

            System.out.print("enter the street number :");
            Scanner y = new Scanner(System.in);
            String C = y.next();

            System.out.print("enter the city name :");
            Scanner z = new Scanner(System.in);
            String i = z.next();

            Adress ad = new Adress(scc, C, i);

            System.out.println("to chose a special package press p \nto chose regularprices press r : ");
            Scanner p = new Scanner(System.in);
            String pkg = p.next();

            int fees = 0;

            if (pkg.equals("r")) {

                Customer c = new Customer();
                fees = c.fee();

            }

            if (pkg.equals("p")) {
                Packages P = new Packages();
                P.package_1();
                P.package_2();
                P.package_3();
            
                
                int pac= 0;
                boolean corr = false;
                while(true){
                    try{
                        System.out.println("press 1 to chose package 1 , press 2 to chose package 2, press 3 to chose package 3");
                        Scanner pack = new Scanner(System.in);
                        pac = Integer.parseInt(pack.next());
                        break;
                    }
                
                    catch(NumberFormatException e){
                        System.out.println("wrong input!!!!!!!!!!");
                        System.out.println("enter a interger value");
                    }
                
                }
                if (pac == 1) {
                    fees = 600;
                }
                if (pac == 2) {
                    fees = 800;
                }
                if (pac == 3) {
                    fees = 900;
                }

            }

            Customer Cs = new Customer(s, I, Cell, ad, fees);

            Cm.add_Customer(Cs);
        
        }
        
        
        else if (in == 2) {
            System.out.print("enter the name of customer you want to delete : ");
            Scanner a = new Scanner(System.in);
            String n = a.next();

            boolean bo = Cm.delete_Customer(n);
            if (bo = false){
                System.out.println("no customer found with such name !");
            }
        } else if (in == 3) {
            System.out.print("enter the name of customer you want to search : ");
            Scanner a = new Scanner(System.in);
            String n = a.next();

            Cm.search(n);

        }

        if (in == 4) {

            System.out.print("enter the name of trainer :");
            Scanner a = new Scanner(System.in);
            String s = a.next();

            System.out.print("enter the id of trainer :");
            Scanner id = new Scanner(System.in);
            String I = id.next();

            System.out.print("enter the cell number of trainer :");
            Scanner cel = new Scanner(System.in);
            String Cell = cel.next();

            System.out.print("enter the address of trainer :");
            Scanner add = new Scanner(System.in);
            System.out.println("enter the address of tranier :");
            System.out.print("enter the house number :");
            Scanner x = new Scanner(System.in);
            String scc = x.next();

            System.out.print("enter the street number :");
            Scanner y = new Scanner(System.in);
            String C = y.next();

            System.out.print("enter the city name :");
            Scanner z = new Scanner(System.in);
            String i = z.next();

            Adress ad = new Adress(scc, C, i);

            System.out.print("enter the experiece of trainer :");
            Scanner ex = new Scanner(System.in);
            int exp = ex.nextInt();

            System.out.print("enter the designation of trainer :");
            Scanner de = new Scanner(System.in);
            String deg = de.next();

            Trainer T = new Trainer(s, I, Cell, ad, exp, deg);

            t.add_trainer(T);

        } else if (in == 5) {
            System.out.print("enter the name of trainer you want to delete : ");
            Scanner a = new Scanner(System.in);
            String n = a.next();

            boolean bo = t.delete_trainer(n);
            if (bo = false){
                System.out.println("no trainer found with this name !");
            }

        } else if (in == 6) {
            System.out.print("enter the name of trainer you want to search : ");
            Scanner a = new Scanner(System.in);
            String n = a.next();

            t.search(n);

        } else if (in == 7) {
             Cm.print();
            
        } else if (in == 8) {
             t.print();
            
        } else if (in == 0){
            bool = false;
        }
        
        
           
        }
        }
    }

