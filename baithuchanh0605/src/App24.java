import java.util.ArrayList;
import java.util.Scanner;
public class App24 {
    public static void main(String[] args){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;// phần tử của mảng
        System.out.println("Nhập số phần tử của ArrayList: ");
        int n = scanner.nextInt();
        for(int i=0;i < n;i++){
            System.out.println("Nhập phần tử thứ " + i + " : ");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);
for (int i = 1;i < arrListInteger.size(); i++){
    // nếu kết quả của phép so sánh này lớn hơn 0
    // tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
    // thì gán max = phần tử tại vị trí thứ i 
    // và đó chính là phần tử lớn nhất 
    if (arrListInteger.get(i).compareTo(max) > 0)
    {
        max = arrListInteger.get(i);

    }
           }
            System.out.println("phần tử lớn nhất trong arrListInteger = " + max);   
     }
}
// tìm phần tử lớn nhất trong mảng sử dụng phương thức compareTo()
// giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList

