class ChainNode
{
    //declaring the variables
    Object element;
    ChainNode next;

    //constructor to initialize the variables
    ChainNode(Object element,ChainNode next)
    {
        this.element=element;
        this.next=next;
    }

    //a method to display the node
    public void displayNode()
    {
        System.out.println("{"+element+"}");
    }
}