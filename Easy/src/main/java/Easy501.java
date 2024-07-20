import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Easy501 {

    public int[] findMode(TreeNode root) {
        int[] arr = new int[100];
        Map<Integer,Integer> visitedNode = new HashMap();
        findMode(visitedNode, root);

        return arr;
    }

    public void findMode(Map<Integer, Integer> visitedNodes, TreeNode treeNode){
        if(treeNode.right == null || treeNode.left == null){
            return;
        }
        if(visitedNodes.containsKey(treeNode.val)){
            visitedNodes.put(treeNode.val, visitedNodes.get(treeNode.val)+1);
        }else{
            visitedNodes.put(treeNode.val,1);
        }
        findMode(visitedNodes, treeNode.right);
        findMode(visitedNodes, treeNode.left);
    }

    public static void main(String[] args) {
        Integer[] arr = {1,null,2,2};
        TreeNode tree = new TreeNode(arr[0]);
        TreeNode root = tree;
        for(int i =1;i<arr.length;i++){
            if(arr[i] != null) {
                if (arr[i - 1] <= tree.val) {
                    tree.left = new TreeNode(arr[i]);
                } else {
                    tree.right = new TreeNode(arr[i]);
                }
                tree = tree.left;
            }

        }
        Easy501 easy501 = new Easy501();

        System.out.println(Arrays.toString(easy501.findMode(root)));


    }


}
