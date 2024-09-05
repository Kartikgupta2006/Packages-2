package Abstraction;

public class Car extends Vehicle{
     private  int noOfDoor;

    public Car() {
        super(4);
    }
    @Override
    public void getSetGo() {
        System.out.println("going to place");
    }

    @Override
    public void MakeStartSound() {
        System.out.println("vormm........");
    }
}
