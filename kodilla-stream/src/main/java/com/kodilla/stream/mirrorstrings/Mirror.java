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

    public String getVowels(String string) {

        StringBuilder vowels = new StringBuilder();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'ó'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y' || c == 'Ó') {
                vowels.append(c);
            }
        }
        return vowels.toString();
    }
}
