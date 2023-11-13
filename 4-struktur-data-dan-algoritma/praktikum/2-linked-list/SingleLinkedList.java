public class SingleLinkedList
{
    protected Node first;
    protected Node last;
    private int size;

    public SingleLinkedList()
    {
        first = new Node();
        last = new Node();
        size = 0;
        first.setLink(last);
    }

    public int getSize()
    {
        return size;
    }

    public void insertNode(Node n)
    {
        // Node yg baru masuk (node n) hrs tunjuk last, baru first tunjuk n
        // Supaya linked list nya tdk putus (memori leak) krn ada memori yg gk terpakai
        if(first.getLink() == last) {
            n.setLink(last);
            n.setIndex(size); size++;
            first.setLink(n);
        }
        else {
            // Klo linked list nya dh ada data, maka swap
            n.setLink(first.getLink());
            n.setIndex(size); size++;   // n.setIndex(size++);
            first.setLink(n);
        }
    }

    public void deleteNode(int index)
    {
        // nodeDepan = Node yg sedang ditunjuk oleh first
        /// nodeBelakang = node setelah nodeDepan
        Node nodeDepan = first;
        Node nodeBelakang = nodeDepan.getLink();

        while(nodeBelakang != last) {
            if(nodeBelakang.getIndex() != index) {
                // nodeDepan menjadi nodeBelakang
                // nodeBelakang menunjuk node yang ditunjuk oleh nodeDepan
                nodeDepan = nodeBelakang;
                nodeBelakang = nodeDepan.getLink();
            }
            else {
                Node temp = nodeBelakang;
                nodeBelakang = nodeBelakang.getLink();
                nodeDepan.setLink(nodeBelakang);
                temp.setLink(last);
            }
        }
    }

    public void display()
    {
        Node nodeDepan = first;
        Node nodeBelakang = nodeDepan.getLink();

        while(nodeBelakang != last) {
            System.out.println(nodeBelakang.getNgrams());
            nodeDepan = nodeBelakang;
            nodeBelakang = nodeDepan.getLink();
        }
    }
}