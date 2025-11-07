class ChainNode
{
    private ChainNode firstNode;
    private int size;

    //complete the constructor
    public Chain(ChainNode firstNode,int size)
    {
        this.firstNode=firstNode;
        this.size=size;
    }

    //method to check whether the list is empty
    public boolean isEmpty()
    {
        return size==0;
    }

    //method to return the current number of elements in the list
    public int size()
    {
        return size;
    }


    public object get(int index)
    {
        ChainNode p = firstNode;
            for(int i=0 ; i<index ; i++)
            p=p.next;
        return p.element;
    }

}