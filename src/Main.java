//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] name = new String[3];
        String name1 = "Hello World";
        String name2 = "Hello";
        String name3 = "Hello javajavajava";
        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.println(name3.length());

        int[] num = {11, 5, 18};
        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if(num[i] <min) {
                min = num[i];
            }
            if(num[i] >max){
                max= num[i];
                System.out.println("Короткая"+min);
                System.out.println("Длинная"+max);
            }
            }


        }
    }