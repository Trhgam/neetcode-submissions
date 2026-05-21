class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }
        int i = 0;
        while(i < str.length()){
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            int length = Integer.parseInt(str.substring(i, j));
            
            i = j + 1;
            String originalStr = str.substring(i, i + length);
            result.add(originalStr);
            
            i += length;
        }
        return result;
    }
}
