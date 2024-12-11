import java.util.*;

//linked list node
class Node {
    String data;
    Node left, right;
    Node(String item) {
        data = item;
        left = right = null;
    }
}


public class Expressiontree {

    public static void inorder(Node root){
        if (root.left != null){ inorder(root.left);}
        System.out.print(root.data);
        if (root.right != null){ inorder(root.right);}
    }
    public static String postfix(String infnixString){

        String postfix = "";
        System.out.println(infnixString);
        if (infnixString.length() == 1) {
        return infnixString;
        }
        return infnixString.charAt(0) + postfix(infnixString.substring(2)) + infnixString.charAt(1);
    }

    
    public static void postfix(Node root){
        if (root.left != null){ postfix(root.left);}
        if (root.right != null){ postfix(root.right);}
        System.out.print(root.data);
    }
    public static void main(String[] args) {

        String infnixString = new Scanner(System.in).nextLine();
        String postfixString = postfix(infnixString);
        Stack<Node> stack = new Stack<Node>();
        for (int i = 0; i < postfixString.length(); i++) {
            String current = postfixString.charAt(i) + "";
            Node root = new Node(current);
            if (current.equals("+") || current.equals("-") || current.equals("=")) {
                Node right = stack.pop();
                Node left = stack.pop();
                root.left = left;
                root.right = right;
            }
            stack.push(root);
        }
        System.out.println("validating");
        inorder(stack.pop());

        // postfix(stack.pop());
    }
}