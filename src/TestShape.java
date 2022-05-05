public class TestShape {
    public static void main(String[] args) {
        Shape s1=new Rectangle("red",5,7);
        System.out.println(s1);
        System.out.println("Area is : "+s1.getArea());
        System.out.println("--------------------------");
        Shape s2 = new Triangle("green",5,3);
        System.out.println(s2);
        System.out.println("Area of Tringale is :"+s2.getArea());
    }
}
