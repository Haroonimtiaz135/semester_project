package semester_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author g
 */
public class Customer_management {

    private List<Customer> Customers = new ArrayList<Customer>();

    public void add_Customer(Customer member) {
        if (Customers.size() < 150) {
            Customers.add(member);

            save();

        } else {
            System.out.println("no free sapace avaible");
        }
        System.out.println("Customer Filled seats: " + Customers.size());
        System.out.println("Customer available seats: " + (150 - Customers.size()));
    }

    public boolean delete_Customer(String name) {
        for (Customer C : Customers) {
            if (C.getName().equalsIgnoreCase(name)) {
                Customers.remove(C);
                System.out.println("Customer with name: " + name + "Successfully Deleted");
                System.out.println("Customer Filled seats: " + Customers.size());
                System.out.println("Customer available seats: " + (150 - Customers.size()));
                save();
                break;
            }
            
           
        }
        return true;
    }

    public void save() {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Customers.txt"));

            oos.writeObject(Customers);
            oos.close();
        } catch (Exception e) {
            System.out.println("error in save method");
        }

    }

    public void print() {
        for (Customer C : Customers) {
            C.printinfo();
        }
    }

    public void read() {

        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("customers.txt"));
            Customers = (ArrayList<Customer>) obj.readObject();
            obj.close();

        } catch (Exception e) {
            System.out.println("there was no data to retrieve");
        }
    }

    public boolean search(String name) {
        System.out.println("The Searched result: ");
        for (Customer C : Customers) {
            if (C.getName().equalsIgnoreCase(name)) {
                C.printinfo();
                return true;
            }
        }
        System.out.println("not found");
        return false;
    }

}
