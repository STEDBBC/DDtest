public class Main {
    public static void main(String[] args) {
        String s = "4[abc]2[ab]c";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                int j = i - 1;
                while (true) {
                    if (s.charAt(j) == '[') {
                        break;
                    }
                    j--;
                }
                int k = j - 1;
                while (true) {
                    if (k < 0) {
                        break;
                    }
                    int m =  s.charAt(k);
                    if (m < 48 || m > 57) {
                        break;
                    }
                    k--;
                }
                k++;
                int freq = Integer.parseInt(s.substring(k, j));
                String snippet = s.substring(j + 1, i);
                String temp = "";

                for (int l = 0; l < freq; l++) {
                    temp += snippet;
                }
                s = s.substring(0, k) + temp + s.substring(i + 1);
            }
        }
        System.out.println(s);
    }
}

