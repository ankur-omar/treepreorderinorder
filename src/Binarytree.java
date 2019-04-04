class Node{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        data = val;
        left = null;
        right = null;

    }
}
class Binarytree {
    Node root;

    Binarytree() {
        root = null;
    }

    void preorder(Node n) {
        if (n == null)
            return;
        System.out.print(n.data + "");
        preorder(n.left);
        preorder(n.right);
    }

    void postorder(Node n) {
        if (n == null)
            return;
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.data + "");
    }

    void inorder(Node n) {
        if (n == null)
            return;
        inorder(n.left);
        System.out.print(n.data + "");
        inorder(n.right);

    }

    void preorder() {
        preorder(root);
    }

    void postorder() {
        postorder(root);
    }

    void inorder() {
        inorder(root);
    }

    public static void main(String[] args) {
        Binarytree obj = new Binarytree();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        System.out.println("Preorder traversal of binary tree is ");
        obj.preorder();

        System.out.println("\nInorder traversal of binary tree is ");
        obj.inorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        obj.postorder();

    }
}

