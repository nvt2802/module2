package ss12_search_algorythms.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

//        System.out.print("Nhập chuỗi: ");
        String string = "abcabcbascbsbacbascbsacbabs";
        int index = 0;
        char charFirst = string.charAt(index);

        // Tìm chuỗi liên tiếp có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {        //1 Vòng lặp
            if (charFirst == string.charAt(i)) {
                max.add(string.substring(index, i));
                index = i;
            }
        }
        max.add(string.substring(index));
        String strNew = "";
        for (int i = 0; i < max.size(); i++) {
            if (max.get(i).length() > strNew.length()) {
                strNew = max.get(i);
            }
        }
        System.out.println(strNew);
    }
}