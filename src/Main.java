import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> checkList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            checkList.addFirst(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j)> checkList.getLast()){
                    checkList.add(str.charAt(j));
                }
            }
            if (checkList.size()> list.size()){
                list.clear();
                list.addAll(checkList);
            }
            checkList.clear();
        }
        for (Character ch:
                list) {
            System.out.print(ch);
        }
    }
}