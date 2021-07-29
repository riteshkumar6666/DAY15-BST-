
// UC2...............//UC2
class BinarySearchTree2 {

    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree2()
    {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key)
    {
        root = insertRec(root, key);
    }


     //insert a new key in BST
    Node insertRec(Node root, int key)
    {

		//If the tree is empty return a new node

        if (root == null)
        {
            root = new Node(key);
            return root;
        }

       // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);


        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
    }


    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }


    public static void main(String[] args)
    {
        BinarySearchTree2 tree = new BinarySearchTree2();

		// create BST

        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        tree.insert(22);
        tree.insert(40);
        tree.insert(60);
        tree.insert(95);
        tree.insert(11);
        tree.insert(65);
        tree.insert(3);
        tree.insert(16);
        tree.insert(63);
        tree.insert(67);

        // print inorder traversal of the BST
        tree.inorder();
    }
}

