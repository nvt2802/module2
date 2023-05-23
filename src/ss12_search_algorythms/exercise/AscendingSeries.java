package ss12_search_algorythms.exercise;

import java.util.LinkedList;
import java.util.List;

public class AscendingSeries {
    public static void main(String[] args) {
        String str = "zWelcomeabcxyz";
        List<Character> max = new LinkedList<>();
        int count = 0;
        max.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {//1 vong lap
            if (str.charAt(i) > max.get(count)) {//1 cau lenh
                max.add(str.charAt(i));
                count++;
            }
        }

        for (Character ch : max) {//1 vong lap
            System.out.print(ch);
        }

    }
}
/*********************************************************************************
 * 	Tính toán độ phức tạp của bài toán:                                          *
 * 	1 vòng lặp * 1 câu lệnh = n * 1;                                             *
 * 	T(n) = O(n);                                                                 *
 * 	=> Độ phức tạp bài toán này là O(n)                                          *
 *********************************************************************************/

