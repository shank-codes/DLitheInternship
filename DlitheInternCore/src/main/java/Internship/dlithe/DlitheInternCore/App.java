package Internship.dlithe.DlitheInternCore;


public class App 
{
    public static void main( String[] args )
    {
        Bike bikeOne=new Bike();
        bikeOne.setModel("Avenger220");
        bikeOne.setCc(220);
        bikeOne.setYear(2016);
        bikeOne.setCost(102000.00);
        bikeOne.setMilage(45);
        //System.out.println(bikeOne.getModel()+" "+bikeOne.getCc());
        
        System.out.println(bikeOne.toString());
    }
}
