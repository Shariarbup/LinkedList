import java.util.*;
public class ListSecBPrac {

    public void getListItems(){
        List list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        getIteratedItems(list);
        System.out.println("---For each---");
        getForEach(list);
    }
    public void getIteratedItems(List list){
        Iterator iterator =list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void getForEach(List list){
        for(Object o : list){
            System.out.println(o);
        }
    }
}
