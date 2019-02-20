package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] list;


    public ItemSorter(Item[] items) {
    this.list = items;

    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(list, comparator);
        return list;
    }
}
