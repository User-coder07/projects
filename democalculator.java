package projects;

public class democalculator implements calculator{
    public void add(){
        System.out.println("Addition is: ");
    }
    public void sub(){
        System.out.println("Substracion is: ");
    }
    public void mul(){
        System.out.println("multiplication is: ");
    }
    public void div(){
        System.out.println("division is: ");
    }

    public static void main (String[] args){
        democalculator dc=new democalculator();
        dc.add();
        dc.sub();
        dc.mul();
        dc.div();
    }
}