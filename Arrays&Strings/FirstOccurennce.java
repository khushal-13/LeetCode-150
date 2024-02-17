public class FirstOccurennce {

    public static int Method1(String haystack, String needle) {

        int h = haystack.length() - 1;
        int n = needle.length();

        for (int i = 0; i <= h; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int ans = i;
                if (i + n <= h) {
                    String str = haystack.substring(i, (i + n + 1));
                    System.out.println(str);
                    if (str.equals(needle)) {
                        return ans;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(Method1(haystack, needle));
        // System.out.println(haystack.substring(6, 9).equals(needle));

    }
}