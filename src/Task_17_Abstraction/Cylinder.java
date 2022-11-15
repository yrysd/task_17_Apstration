package Task_17_Abstraction;

public class Cylinder extends Shape{



    @Override
    public void getPerimeter(int height, int radius, int Long) {
        
        System.out.println("Volume cylinder : "+Math.PI * height * Math.pow(2, radius));

    }
}
