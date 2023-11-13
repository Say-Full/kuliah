public class Node
{
    private String ngrams;
    private int index;
    protected Node link;

    public Node()
    {
        ngrams = "";
        link = null;
    }

    public void setNgrams(String ngrams)
    {
        this.ngrams = ngrams;
    }

    public String getNgrams()
    {
        return this.ngrams;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }
    
    public int getIndex()
    {
        return this.index;
    }

    public void setLink(Node n)
    {
        this.link = n;
    }

    // Melihat node yang sedang ditunjuk (melihat node setelahnya)
    public Node getLink()
    {
        return this.link;
    }
}