import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Test t = new Test();
        t.table(a);
    }
    void table(int a){
       for(int i=1;i<=10;i++){
        System.out.println(a+"x"+i+"="+(a*i));
       }
    }
}