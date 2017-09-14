package com.github.wang0109;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class Main {
    static boolean checkListString(List<String> a, List<String> b) {
        return CollectionUtils.isEqualCollection(a, b);
    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
}
