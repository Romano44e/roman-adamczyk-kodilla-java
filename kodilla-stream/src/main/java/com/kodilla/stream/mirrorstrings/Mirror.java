package com.kodilla.stream.mirrorstrings;

public class Mirror {

    public String mirrorText(String string) {

        char[] charArray = string.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[charArray.length - 1 - i];
            result.append(c);
        }
        return result.toString();
    }
}
