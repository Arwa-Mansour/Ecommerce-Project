import java.util.LinkedList;

/**
 * Created by pc on 4/13/2021.
 */
public class Test {

    public static void main(String[] args) {
        LinkedList<Suppliers> list = new LinkedList<>();
        LinkedList<Orders> queue = new LinkedList<>() ;

        Suppliers supplier1 = new Suppliers("ss","1111","sss");
        addsupplier(list,supplier1);
        System.out.println(removesupplier(list,supplier1).toString());

        User user = new User();
        Orders order1 = new Orders("1",user,"d,m,y");
        addordertoqueue(queue,order1);
        System.out.println(removeorder(queue,order1).toString());
    }

    public static void addsupplier (LinkedList<Suppliers> list,Suppliers s){
        list.add(s);
    }

    public static Suppliers removesupplier (LinkedList<Suppliers> list,Suppliers s){
        Suppliers x = list.get(list.indexOf(s));
        list.remove(s);
        return x;
    }

    public static void addordertoqueue (LinkedList<Orders> list , Orders o){
        list.addLast(o);
    }

    public static Orders removeorder (LinkedList<Orders> list,Orders o){
        return list.removeFirst();
    }
}
