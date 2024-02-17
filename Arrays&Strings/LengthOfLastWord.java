public class LengthOfLastWord {

    public static int Method2(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            length++;
        }
        return length;
    }

    public static int Method1(String str) {
        int length = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                length++;
            } else {
                if (length > 0) {
                    return length;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {

        // System.out.println(Method1(" fly me to the moon "));
        // System.out.println(Method1("luffy is still joyboy"));
        System.out.println(Method1("a"));

    }
}
