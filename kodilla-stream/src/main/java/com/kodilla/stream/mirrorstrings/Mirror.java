package com.kodilla.stream.mirrorstrings;

public class Mirror {

    public String mirror;
    public String mirror1;
    public String mirror2;

    public Mirror(String mirror) {
        this.mirror = mirror;
    }

    public String mirrorText() {
        mirror2 = mirror;
        for (int n = 0; n < mirror.length() / 2; n++) {
            mirror = mirror.replace(mirror.charAt(n), mirror.charAt(mirror.length() - 1 - n));
        }

        mirror1 = mirror;

        for (int n = 0; n < mirror1.length() / 2; n++) {
            mirror1 = mirror1.replace(mirror1.charAt(mirror1.length() - 1 - n), mirror2.charAt(n));
        }
        return mirror1;
    }
}
