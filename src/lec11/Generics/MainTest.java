package lec11.Generics;

public class MainTest {
    public static void main (String[] args){
        Test<Integer> t1 = new Test<>(5);
        System.out.println("Value="+t1._field+", type="+t1._field.getClass());

        Test<String> t2 = new Test<>("Hello");
            System.out.println("Value="+t2._field+", type="+t2._field.getClass());
    }
}
