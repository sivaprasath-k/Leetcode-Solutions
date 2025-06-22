class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int parts = (n + k - 1) / k; // ceil(n/k)

        String[] result = new String[parts];

        int index = 0;
        for (int i = 0; i < parts; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++) {
                if (index < n) {
                    sb.append(s.charAt(index));
                    index++;
                } else {
                    sb.append(fill); // fill the rest
                }
            }
            result[i] = sb.toString();
        }

        return result;
    }
}