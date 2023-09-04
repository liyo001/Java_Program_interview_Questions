import java.util.Arrays;

public class ReverseStringButPostionSame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = "Tar unT iwa ri ";
        char[] ch = str.toCharArray();
        char[] bu = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ')
                bu[i] = ' ';
        }
        int j = bu.length - 1;
        for (int i = 0; i < bu.length; i++) {
            if (ch[i] != ' ') {
                if (bu[j] == ' ') {
                    j--;
                }
                bu[j] = ch[i];
                j--;
            }
        }
        System.out.print(String.valueOf(bu));

    }

}
