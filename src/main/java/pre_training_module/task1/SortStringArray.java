package pre_training_module.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStringArray {

    public List<String> sortArrayByStrLength(String[] arr) {
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(arr));
        list.sort((o1, o2) -> o1.length() >= o2.length() ? 1 : -1);
        return list;
    }
}
