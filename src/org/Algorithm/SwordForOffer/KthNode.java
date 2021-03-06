package org.Algorithm.SwordForOffer;

import org.Algorithm.SwordForOffer.HelperClass.TreeNode;

import java.util.ArrayList;


/**
 * Created by Ellen on 2017/5/25. 给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4
 */
public class KthNode {
	ArrayList<TreeNode> list = new ArrayList<>();

	TreeNode KthNode(TreeNode pRoot, int k) {
	    if (k <= 0) {
	        return null;
        }
		getNodeVal(pRoot);
	    if (k >= list.size()) {
	        return null;
        }
		return list.get(k - 1);
	}

	private void getNodeVal(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.left != null) {
			getNodeVal(root.left);
		}
		list.add(root);
		if (root.right != null) {
			getNodeVal(root.right);
		}
	}
}
