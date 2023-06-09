public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	
	public static int sumOfAllNode(TreeNode<Integer> root){

		if(root == null){
			return 0;
		}


		int count = root.data;
		for(int i = 0; i<root.children.size(); i++){
			int sum = sumOfAllNode(root.children.get(i));
			count += sum;
		}
		return count;
	
	}
}
