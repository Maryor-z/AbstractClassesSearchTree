package com.maryor;

public class Main {
    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
//        create a string data array to avoid typing loads of addItem instructions
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
//            create new item with value set to the string s
            tree.addItem(new Node(s));
        }


        tree.removeItem(new Node("Darwin"));
        tree.traverse(tree.getRoot());

//        String value = "1 4 5 3 2 6 8 7 9";
//        String[] data = value.split(" ");
//        for (String s : data) {
//            tree.addItem(new Node(s));
//        }
//
//        tree.traverse(tree.getRoot());
    }
}
