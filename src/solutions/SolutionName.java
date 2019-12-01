package src.solutions;

public class SolutionName implements Solution {
    @Override
    public boolean solve(String name, String typed) {
        if (name == null || typed == null) {
            return false;
        } else if (name.equals(typed)) {
            return true;
        } else if (name.length() > typed.length()) {
            return false;
        }

        for (int i = 0, j = 0; i < name.length(); j++) {
            if (j >= typed.length()) {
                return false;
            }
            if (name.charAt(i) != typed.charAt(j) && (i == 0 || typed.charAt(j) != typed.charAt(j - 1))) {
                return false;
            } else if (name.charAt(i) == typed.charAt(j)) {
                i++;
            }
        }
        return true;
    }
}
