package ru.otus.example;

public class BackPack {
    String[] content = new String[5];

    int a;

    void put(String item) {
        System.out.print(a);
        for (int i = 0; i < content.length; i++) {
            if (content[i] == null) {
                System.out.println("Put " + item);
                content[i] = item;
                return;
            }
        }
    }

    String get(String item) {
        for (int i = 0; i < content.length; i++) {
            if (item.equals(content[i])) {
                content[i] = null;
                System.out.println("Got " + item);
                return item;
            }
        }

        return null;
    }

    int size() {
        int count = 0;
        for (int i = 0; i < content.length; i++) {
            if (content[i] != null) {
                count ++;
            }
        }
        return count;
    }

    void print() {
        System.out.print("[");
        for (int i = 0; i < content.length; i++) {
            if (content[i] != null) {
                System.out.print(content[i] + " ");
            }
        }
        System.out.println("]");
    }
}
