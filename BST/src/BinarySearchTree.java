public class BinarySearchTree<E extends Comparable<E>>
{
	E key;
	public BinarySearchTree leftNode;
	public BinarySearchTree rightNode;
	public BinarySearchTree(E key) {
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}
	public int size() {
		if(this.key == null) {
			return 0;
		}
		else {
			return (1 + this.leftNode.size() + this.rightNode.size() );
		}
	}
}