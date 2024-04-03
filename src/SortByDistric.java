package src;

import java.util.Comparator;

public class SortByDistric implements Comparator<City> {
    @Override
    public int compare(City a, City b) {
        if(a.getDistrist().compareTo(b.getDistrist())==0){
            return a.getName().compareTo(b.getName());
        } else if (a.getDistrist().compareTo(b.getDistrist())>0) {
            return 1;
        }else
            return -1;
    }
}
