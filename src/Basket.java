import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Basket {
    private String fruit;
    private List<String> basket;

    public Basket(String fruit) {
        this.fruit = fruit;
    }

    public Boolean find(String fruit) {
        if (basket.contains(fruit)) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean remove(String fruit) {
        if (find(fruit)) {
            basket.remove(fruit);
            return true;
        } else {
            return false;
        }
    }

    public int position(String fruit) {
        if (find(fruit)) {
            return basket.indexOf(fruit);
        } else {
            return 0;
        }
    }

    public String distinct(HashSet allFruits) {
        allFruits = (HashSet) basket;
        return allFruits.toString();
    }

    public void add(String fruit) {
        basket.add(fruit);
    }

    public int count() {
        return basket.size();
    }

    public int costumCount() {
        int counter = 0;
        Iterator<String> itr = basket.iterator();
        while (itr.hasNext()) {
            counter++;
        }
        return counter;
    }


}
