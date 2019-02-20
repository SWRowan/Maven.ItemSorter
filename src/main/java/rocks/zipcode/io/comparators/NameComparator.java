package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item o1, Item o2) {

        if(o1.getName().compareTo(o2.getName()) > 0){
            return 1;
        }else if(o1.getName().compareTo(o2.getName()) < 0){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
