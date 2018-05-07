import java.util.*;
public class Main {

    public static void main(String[] args){
        SetSecB setSecB=new SetSecB();
        ListSecBPrac listSecBPrac=new ListSecBPrac();
        listSecBPrac.getListItems();
        System.out.println("\n\n\nHere LinkedList Item\n\n\n");
        LinkedListSecB linkedListSecB=new LinkedListSecB();
        linkedListSecB.getLinkedListItems();
        setSecB.getSetList();
       ArrayList<Integer> integerArrayList= setSecB.getInteger();
       for(Integer integer : integerArrayList){
           System.out.println(integer);
       }
    }


}
