class Temp {
    public String name;
    public Temp() {
        this.name = "ak";
    }
    public void display() {
        System.out.println("Displaying shit " + this.name);
    }
}

public class TempSub extends Temp {

    public void display2() {
        this.display();
        super.display();
    }
    public static void main(String args[]) {
        TempSub tb = new TempSub();
        tb.display2();
        
    }
}