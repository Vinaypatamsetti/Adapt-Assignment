package assignment2;

 class Singleton{

private static Singleton singleton = new Singleton( );

private Singleton() { }

public static Singleton getInstance( ) {
    return singleton;
 }

protected static void print( ) {
   System.out.println("demoMethod for singleton");
}
}

public class Assignment2Q1 {

public static void main(String[] args) {
   Singleton obj = Singleton.getInstance( );
   obj.print( );
}
}