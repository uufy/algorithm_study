import java.util.ArrayList;
import java.util.Arrays;

public class question49 {
    public question49() {
    }

    public static void main(String[] args) {
        int index = 0;
        int index1 = 1;
        String[] strs = new String[0];
        ArrayList<String> strings = new ArrayList();
        ArrayList<ArrayList<String>> result = new ArrayList();
        if (strs.length == 0) {
            System.out.println(result.toString());
        } else if (strs.length == 1) {
            result.add(new ArrayList());
            ((ArrayList)result.get(0)).add(strs[0]);
            System.out.println(result.toString());
        }

        for(int i = 0; i < strs.length; ++i) {
            strings.add(strs[i]);
        }

        do {
            result.add(new ArrayList());
            ((ArrayList)result.get(index)).add((String)strings.get(0));
            char[] charArray = ((String)strings.get(0)).toCharArray();

            do {
                char[] charArray1 = ((String)strings.get(index1)).toCharArray();
                if (isEqual(charArray, charArray1)) {
                    ((ArrayList)result.get(index)).add((String)strings.get(index1));
                    strings.remove(index1);
                } else {
                    ++index1;
                }
            } while(index1 <= strings.size() - 1);

            strings.remove(0);
            ++index;
            index1 = 1;
            if (strings.size() == 1) {
                result.add(new ArrayList());
                ((ArrayList)result.get(index)).add((String)strings.get(0));
                break;
            }
        } while(!strings.isEmpty());

        System.out.println(result.toString());
    }

    public static boolean isEqual(char[] charArray, char[] charArray1) {
        if (charArray.length != charArray1.length) {
            return false;
        } else {
            Arrays.sort(charArray);
            Arrays.sort(charArray1);

            for(int i = 0; i < charArray.length; ++i) {
                if (charArray[i] != charArray1[i]) {
                    return false;
                }
            }

            return true;
        }
    }
}