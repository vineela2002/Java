abstract class Shape1

{   

    abstract void Printarea();

    int a=10,b=2;;

}

class Rectangle1 extends Shape1

{

    void Printarea()

    {       

       System.out.println("area of rectangle is "+(a*b));

    }

}     

class Triangle1 extends Shape1

{

    void Printarea()

    {       

        System.out.println("area of triangle is "+(0.5*a*b));

    }

}   



class Circle1 extends Shape1

{       

    void Printarea()

   {       

        System.out.println("area of circle is "+(3.14*a*a));

   }  

}   

class Main

{

    public static void main(String []args)       

    {     

       Shape1 b=new Circle1();      

       b.Printarea();

       b=new Rectangle1();

       b.Printarea();    

       b=new Triangle1();

       b.Printarea();

   }

}

