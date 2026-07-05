class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Handle edge case: empty array
        if (strs == null || strs.length == 0) return "";

        // FIX 1 & 4: Keep a reference to the first string to compare against
        String firstStr = strs[0]; 

        // FIX 2 & 3: Initialize 'min' with the length of the first string (an int)
        int min = firstStr.length(); 
        
        // Find the minimum length among all strings
        for (int i = 1; i < strs.length; i++) {
            // FIX: Use .length() for strings
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }

        // Compare characters up to the 'min' length
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < min; j++) {
                if (firstStr.charAt(j) != strs[i].charAt(j)) {
                    min = j; // Update min to the point where they stop matching
                    break;
                }             
            }
            if (min == 0) {
                break;
            }
        }

        // Build the final result string using Java's substring method
        // (It's much cleaner than creating a char array manually!)
        return firstStr.substring(0, min);
    }
}