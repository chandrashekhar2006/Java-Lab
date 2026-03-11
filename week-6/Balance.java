package MyPack;
public class Balance 
{
String name;
double bal;
public Balance(String n, double b)      //VJIT     100000
{
name = n;//VJIT
bal = b;//100000
}
public void show()
{
if(bal<0)       //100000<0
System.out.print("--> ");
System.out.println(name + ": $" + bal);
}
}