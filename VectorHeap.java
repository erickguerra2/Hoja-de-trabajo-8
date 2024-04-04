import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> {
    private ArrayList<E> data;

    public VectorHeap() {
        data = new ArrayList<>();
    }

    
    /** 
     * @param leaf
     */
    protected void percolateUp(int leaf) {
        int parent = (leaf - 1) / 2;
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = (parent - 1) / 2;
        }
        data.set(leaf, value);
    }

    
    /** 
     * @param root
     */
    protected void pushDownRoot(int root) {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize / 2) { // Solo necesita correr para nodos no hojas
            int childPos = leftChild(root);
            if (childPos < heapSize - 1 && data.get(childPos).compareTo(data.get(childPos + 1)) > 0) {
                childPos++;
            }
            if (value.compareTo(data.get(childPos)) <= 0) break;
            data.set(root, data.get(childPos));
            root = childPos;
        }
        data.set(root, value);
    }

    
    /** 
     * @param pos
     * @return int
     */
    private int leftChild(int pos) {
        return 2 * pos + 1;
    }

    
    /** 
     * @param item
     */
    public void add(E item) {
        data.add(item);
        percolateUp(data.size() - 1);
    }

    
    /** 
     * @return E
     */
    public E remove() {
        if (data.size() == 0) return null;
        E minVal = data.get(0);
        data.set(0, data.get(data.size() - 1));
        data.remove(data.size() - 1);
        if (data.size() > 0) pushDownRoot(0);
        return minVal;
    }
}
