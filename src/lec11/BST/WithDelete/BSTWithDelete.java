package lec11.BST.WithDelete;

/**
 * ExampleC : Binary Search Tree example using interface LListInt
 *              with delete
 */
class Node {
    int _value;
    Node _leftChild;
    Node _rightChild;
    Node _parent;

    Node(int val){          // Constructor
        _value = val;
        _leftChild = null;
        _rightChild = null;
        _parent = null;
    }
}

public class BSTWithDelete {
    public static void main(String[] args){
        testA();
        testMt1Q3();
    }

    static void testA(){
        BstList list = new BstList(10);
        list.insertNode(20);
        list.insertNode(15);

        System.out.println(list.search(list._root,10));
        System.out.println(list.search(list._root,15));
        System.out.println(list.search(list._root,18));
        System.out.println(list.search(list._root,20));

        System.out.println(list.deleteNode(list._root, 10));
        System.out.println(list.deleteNode(list._root, 15));
        System.out.println(list.deleteNode(list._root, 20));
        System.out.println(list.deleteNode(list._root, 15));
        System.out.println(list.deleteNode(list._root, 10));
    }

    static void testMt1Q3(){
        BstList list = new BstList(35);
        list.insertNode(23);
        list.insertNode(67);
        list.insertNode(19);
        list.insertNode(93);

        System.out.println(list.deleteNode(list._root, 35));

    }
}

