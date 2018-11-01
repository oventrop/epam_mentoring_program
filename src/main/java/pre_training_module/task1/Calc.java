package pre_training_module.task1;

import java.util.Scanner;

public class Calc {

    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int x2 = sc.nextInt();

    public void sum() {
        System.out.println(x1 + x2);
    }

    public void mult() {
        System.out.println(x1 * x2);
    }

    public void min() {
        System.out.println(x1 - x2);
    }

    public void div() {
        System.out.println(x1 / x2);
    }

}
