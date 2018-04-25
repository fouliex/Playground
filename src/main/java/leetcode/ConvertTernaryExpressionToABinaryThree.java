package leetcode;
 class Node{
    char data;
    Node left, right;

    Node(char data){
        this.data = data;
    }
}
public class ConvertTernaryExpressionToABinaryThree {
     Node convertExpression(String str){
         return  convertExpression(str.toCharArray(),0);
     }

     Node convertExpression(char expression[], int start){
         // Base case
         if (start >= expression.length)
             return null;

         // store current character of expression_string
         // [ 'a' to 'z']
         Node root = new Node(expression[start]);

         // Move ahead in str
         ++start;

         // if current character of ternary expression is '?'
         // then we add next character as a left child of
         // current node
         if (start < expression.length && expression[start]=='?')
             root.left = convertExpression(expression, start+1);

             // else we have to add it as a right child of
             // current node expression.at(0) == ':'
         else if (start < expression.length)
             root.right = convertExpression(expression, start+1);

         return root;
     }

     void preOrder(Node root){
         if(root == null) return;
         System.out.print(root.data + " ");
         preOrder(root.left);
         preOrder(root.right);
     }


    public static void main(String[] args) {
        String exp =  "a?b?c:d:e";
        ConvertTernaryExpressionToABinaryThree convert = new ConvertTernaryExpressionToABinaryThree();
        Node root = convert.convertExpression(exp);
        convert.preOrder(root);
    }

}
