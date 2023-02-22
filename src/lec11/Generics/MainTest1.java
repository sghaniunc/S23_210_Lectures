package lec11.Generics;

public class MainTest1 {
    public static void main (String[] args){
        Test1 t1 = new Test1(5);
        System.out.println("Value="+t1._field+", type="+t1._field.getClass());

        Test1 t2 = new Test1("Hello");
            System.out.println("Value="+t2._field+", type="+t2._field.getClass());
    }
}
