import java.util.ArrayList;



public class List {
    ArrayList<Integer> list=new ArrayList<Integer>();
    public List(){}

    public void ListAdd(int a)
    {
        list.add(a);
    }
    public void ListRemove()
    {
        list.remove(0);
    }
    public void ListInquiry()
    {
        for(int i :list)
        {
            System.out.println(i);
        }
    }
}
