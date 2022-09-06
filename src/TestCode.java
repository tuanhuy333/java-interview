import java.util.HashMap;
import java.util.Map;

public class TestCode {
    public static void main(String[] args) {
        demDuplicateChu("abccab");
    }

    public static int tongChuSoCua1So(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // chia lay du de lay so hang don vi
            n /= 10; // giam xuong sau khi da lay o hang don vi
        }
        return sum;
    }

    public static int chuSoLonNhatCua1So(int n) {
        int max = n % 10;
        while (n != 0) {
            int chuso = n % 10;
            if (chuso > max) {
                max = chuso;
            }
            n /= 10;
        }
        return max;
    }

    public static int demSoLuongChuSoCua1So(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int demTanSoXuatHienCuaKyTuTrongChuoi(String s) {

        int[] freq = new int[26];
        for (char item : s.toCharArray()) {
            int a = item - 'a';
            freq[item - 'a']++;
        }
        return freq.length;
    }

    public static int[] sapXepGiamDan(int a[], int n) {

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (a[i] < a[j]) {
                    // swap
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;

    }

    public static int soLonNhi(int a[]) {
        int first = 0, second = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            }
            if (a[i] < first && a[i] < second) {
                second = a[i];
            }
        }
        return second;

    }

    public static int demDuplicate(int a[]) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : a) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        return 0;
    }
    public static int demDuplicateChu(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char i : s.toCharArray()) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        return 0;

    }
}