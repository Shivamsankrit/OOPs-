public class Session1 {
    int a ;
    int b ;
    public void display()
    {
        int c = a+b;
    System.out.println("This is display method !");
    }
    Session1()
    {
        //super();
        this(7,9,10);
        a = 5;
        b = 6;
        int sum = a+b;
        System.out.println(sum);
    }
    Session1(int a, int b)
    {
        this();
        this.a = a;
        this.b = b;
        int sum = a+b;
        System.out.println(sum);
    }
    Session1(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {

        System.out.println("Hello world !");
        Session1 s1 = new Session1(4,8);
        //Session1 s2 = new Session1(9,6);
        //Session1 s3 = new Session1(6,8,3);
//        s2.a = 4;
//        s2.b = 7;
//        System.out.println(s1.a);
//        System.out.println(s1.b);
//        System.out.println(s2.a);
 //     s1.display();

        int num = 23;

    }
}
