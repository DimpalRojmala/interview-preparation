package leetcode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String prefix = strs[0];

        for (int index = 1; index < strs.length; index++) {
            while (strs[index].indexOf(prefix) != 0) {
                if (prefix.equals("")) {
                    break;

                }
                prefix = prefix.substring(0, prefix.length() - 1);
            }


        }
        return prefix;
    }

        public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix()
                .longestCommonPrefix(new String[]
                        {"flower","flow","flight"}));
    }
}
