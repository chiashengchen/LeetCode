package Design;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		char[] name = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '1', '1'};  
		String a = new String(name);
		System.out.println(a);
	}
}

class Codec {
	private List<TreeNode> tree;

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		tree = new ArrayList<TreeNode>();
		List<String> str = new ArrayList<String>();
		return null;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		tree = new ArrayList<TreeNode>();
		return null;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
