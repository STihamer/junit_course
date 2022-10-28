package com.junit.junitProject;

import java.util.List;

public class DemoUtils {

    private String academy = "Luv2Code Academy";
    private String academyDuplicate = academy;
    private String[] firstThreeLettersOfAlphabet = {"A", "B", "C"};
    private List<String> academyInLst = List.of("luv", "2", "code");

    public String getAcademy() {
        return academy;
    }

    public String getAcademyDuplicate() {
        return academyDuplicate;
    }

    public String[] getFirstThreeLettersOfAlphabet() {
        return firstThreeLettersOfAlphabet;
    }

    public List<String> getAcademyInLst() {
        return academyInLst;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public Object checkNull(Object obj) {
        if (obj != null) {
            return obj;
        }
        return null;
    }

    public Boolean isGreater(int n1, int n2) {
        if (n1 > n2) {
            return true;
        }
        return false;
    }
}
