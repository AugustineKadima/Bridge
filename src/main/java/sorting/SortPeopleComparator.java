package sorting;

import java.util.*;

public class SortPeopleComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLocation().compareTo(o2.getLocation());
    }
}


