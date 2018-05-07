import java.util.*;
public class SetSecB {
    public void getSetList() {
        Set set = new TreeSet();
        set.add("A");
        set.add("A");
        set.add("C");
        System.out.println("\n---SetSecB-----\n");
        System.out.println(set);
        System.out.println("---print vertically-----");
        getForEach(set);
    }

    public void getForEach(Set set) {
        for (Object o : set) {
            System.out.println(o);

        }

    }
}
