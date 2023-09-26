public class TreeSearch {

    public static class Node{                //the node of binary tree
        int Data;
        Node left;
        Node right;
        public Node(int data){

            //Assigning the data to the new node

            this.Data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;      //Representing the root of binary tree
    public TreeSearch(){
        root = null;
    }

    public int factorial(int count) {                 //factorial() will calculate the factorial of given number
        int factorialNumber = 1;
        if(count == 0)
            return 1;
        else {
            while(count > 1) {
                factorialNumber = factorialNumber * count;
                count--;
            }
            return factorialNumber;
        }
    }
    //numOfBST() will calculate the total number of possible BST by calculating Catalan Number for given key
    public int numOfBinarySearchTree(int key) {
        int calculatorNumber = factorial(2 * key)/(factorial(key + 1) * factorial(key));
        return calculatorNumber;
    }
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();

        //Display total number of possible binary search tree with key 5
        System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBinarySearchTree(5));
    }
}