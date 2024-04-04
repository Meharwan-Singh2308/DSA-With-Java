public class basic {

    public static void main(String args[])
    {
        Pen p1 = new Pen();
        p1.changeColour("blue");
        System.out.println(p1.getColor());


    }

}

class Pen{
    private String colour;
    private int tip;
    
    String getColor()
    {
        return colour;
    }

    int getTip(){
        return tip;
    }

    void changeColour(String Colour)
    {
        this.colour = Colour;
    }

    void changeTip(int Tip){
        this.tip = Tip;
    }

}
