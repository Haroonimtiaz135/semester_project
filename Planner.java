

package semester_project;

import java.util.Scanner;

public class Planner {

    private int training_bench_price;
    private int Dumbbell_set_price;
    private int Treadmill_price;
    private int Stationary_Bicycle_price;
    private int rowing_machine_price;
    public static Scanner input = new Scanner(System.in);

    public Planner() {
        initialize();
    }

    public void initialize() {
        training_bench_price = 200;
        Dumbbell_set_price = 200;
        Treadmill_price = 500;
        Stationary_Bicycle_price = 300;
        rowing_machine_price = 300;

    }

    public int getTraining_bench_price() {
        return 700;
    }

    public int getDumbbell_set_price() {
        return 400;
    }

    public int getTreadmill_price() {
        return 800;
    }

    public int getStationary_Bicycle_price() {
        return 500;
    }

    public int getRowing_machine_price() {
        return 600;
    }
    
}

