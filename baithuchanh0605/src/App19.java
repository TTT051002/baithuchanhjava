import java.util.ArrayList;
import java.util.ListIterator;

public class App19{ 
    public static void main (String[] args){// khai báo 1 ArrayList có tên là arrListChar
        // có kiểu là Character
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');
        // khai báo một ListIterator có kiểu là Character
        ListIterator<Character> ListIterator = arrListChar.listIterator();
        // hiển thị các phần tử trong arrListChar 
        // bằng cách sử dụng ListIterator 
    System.out.println("Các phần tử có trong arrListChar là: ");
    while (ListIterator.hasNext())
    { System.out.print(ListIterator.next() + "\t");
}
}
}
