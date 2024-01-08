package org.fasttrackit.code;

import java.util.List;

public class TDD {
    public Integer find(List<Integer> list, Integer numberToFind) {
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) == null) {
                throw new NullValueInListException();
            }
            if (list.get(index).equals(numberToFind)) {
                return index;
            }
        }
        return -1;
    }
}
