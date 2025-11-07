import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    str[i] = "0000";
                    break;
                case 1:
                    str[i] = "0001";
                    break;
                case 2:
                    str[i] = "0010";
                    break;
                case 3:
                    str[i] = "0011";
                    break;
                case 4:
                    str[i] = "0100";
                    break;
                case 5:
                    str[i] = "0101";
                    break;
                case 6:
                    str[i] = "0110";
                    break;
                case 7:
                    str[i] = "0111";
                    break;
                case 8:
                    str[i] = "1000";
                    break;
                case 9:
                    str[i] = "1001";
                    break;
                case 10:
                    str[i] = "1010";
                    break;
                case 11:
                    str[i] = "1011";
                    break;
                case 12:
                    str[i] = "1100";
                    break;
                case 13:
                    str[i] = "1101";
                    break;
                case 14:
                    str[i] = "1110";
                    break;
                case 15:
                    str[i] = "1111";
                    break;
            }
        }
        f(str);
    }

    public static void f(String[] str) {
        int p = -1;
        LinkedList list = new LinkedList<>();
        boolean[] b = new boolean[str.length];
        for (int i = 0; i < str.length; i++) {
            b[i] = false;
        }
        for (int i = 0; i < str.length; i++) {
            char[] ci = str[i].toCharArray();
            for (int j = i + 1; j < str.length; j++) {
                int same = 0;
                char[] cj = str[j].toCharArray();
                for (int k = 0; k < 4; k++) {
                    if (ci[k] == cj[k]) {
                        same++;
                    } else {
                        p = k;
                    }
                }
                if (same == 3) {
                    b[i] = true;
                    b[j] = true;
                    String sr = "";
                    for (int l = 0; l < 4; l++) {
                        if (l == p) {
                            sr += "-";
                        } else {
                            sr += ci[l];
                        }
                    }

                    if (!again(sr, list)) {
                        list.add(sr);
                    }
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (b[i] == false) {
                System.out.println(str[i]);
            }
        }
        String[] sn = new String[list.size()];

        if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                sn[i] = (String) list.get(i);
            }

            f(sn);
        }
        else {
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }

    public static boolean again(String str, LinkedList list) {
        if(list.size()==0){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            String a = (String) list.get(i);
            if (a.compareTo(str) == 0) {
                return true;
            }
        }
        return false;
    }
}