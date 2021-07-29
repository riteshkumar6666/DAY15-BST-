
class BinarySearchTree3
{
    int data;
    BinarySearchTree3 left = null, right = null;

    BinarySearchTree3(int data) {
        this.data = data;
    }
}

class Main
{
    // Recursive function to insert a key into a BST
    public static BinarySearchTree3 insert(BinarySearchTree3 root, int key)
    {
        // if the root is null, create a new node and return it
        if (root == null) {
            return new BinarySearchTree3(key);
        }

        // if the given key is less than the root node, recur for the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        // if the given key is more than the root node, recur for the right subtree
        else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Recursive function to search in a given BST
    public static void search(BinarySearchTree3 root, int key, BinarySearchTree3 parent)
    {
        // if the key is not present in the key
        if (root == null)
        {
            System.out.print("Key Not found");
            return;
        }

        // if the key is found
        if (root.data == key)
        {
            if (parent == null) {
                System.out.print("The node with key " + key + " is root node");
            }

            else if (key < parent.data)
            {
                System.out.print("The given key is the left node of the node " +
                        "with key " + parent.data);
            }
            else {
                System.out.print("The given key is the right node of the node " +
                        "with key " + parent.data);
            }

            return;
        }

        // if the given key is less than the root node, recur for the left subtree;
        // otherwise, recur for the right subtree

        if (key < root.data) {
            search(root.left, key, root);
        }
        else {
            search(root.right, key, root);
        }
    }

    public static void main(String[] args)
    {
        int[] keys = { 56,30,70,22,40,60,95,11,65,3,16,63,67};

        BinarySearchTree3 root = null;
        for (int key: keys) {
            root = insert(root, key);
        }

        search(root, 63, null);
    }
}


