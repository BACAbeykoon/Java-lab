package practical01;
 public class Monster extends Item implements paysalary
{
      int Id;
      String Name;
    public void Monster (int Y,String X)
    {
        Id=Y;
        Name=X;
    }
    public void display()
    {
        System.out.println("Name="+Name+" Id="+Id);
        System.out.println("locTION "+location);
        System.out.println(""+bird);
        
        
    }
}
