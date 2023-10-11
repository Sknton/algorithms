package methods;

import java.util.List;

public class MaxNumInList {
    public static Integer maxNumInList(List<Integer> list){
        if (list.size() == 1){
            return list.get(0);
        }else {
            return Math.max(list.get(0),maxNumInList(list.subList(1, list.size())));
        }

    }
}
