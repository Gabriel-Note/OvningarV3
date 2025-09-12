public class Exercise2_2 {

    public double calculateCircleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateRectangleArea(double length, double width){
        return length * width;
    }

    public double calculateTriangleArea(double base, double height){
        return base * height / 2;
    }
}
