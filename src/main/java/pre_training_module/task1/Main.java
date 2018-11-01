package pre_training_module.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Calc calc = new Calc();
//        calc.sum();

        String[] array = {"aerhaerjaejr", "srhsrhjrj", "srgh", "esrhajrasetjaetjaetk", "sehrtaseraerhaerjaerjaerjaej"};
        SortStringArray sort = new SortStringArray();
        List<String> sortedList = sort.sortArrayByStrLength(array);
        for (String s : sortedList) {
            System.out.println(s);
        }
    }
}
