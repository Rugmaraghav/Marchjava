package oopspkg;

import java.util.Scanner;

interface petshop{

    public void name();

    public void price();

}

interface birds extends petshop {

    public void colour();

    public void lifespan();

}



interface animals extends petshop{

    public void breed();

    public void food();



}

    class dogs implements animals{



    String name="dog";

    String b="Goldenretriever";

    String x="GermanShepherd";

    String z="FrenchBulldog";

    String food="dog food";

    String q;

    Scanner sc=new Scanner(System.in);

   

   @Override

    public void name() {

System.out.println("The animal is "+name);

    }

    public void breed() {

    System.out.println("Enter the breed of the animal(withoutspace): ");

           q=sc.next();

    if(q.equalsIgnoreCase(b) ) {

    System.out.println(b);}

          else if(q.equalsIgnoreCase(x)) {

          System.out.println("The breed is "+x);

          }

          else if(q.equalsIgnoreCase(z)) {

          System.out.println("The breed is "+z);

          }else {

          System.out.println("The breed is not available");

          }

    }

   @Override

    public void price() {

    if(q.equalsIgnoreCase(b)) {

          System.out.println("The price is Rs.23,000/-");  

          }else if(q.equalsIgnoreCase(x)) {

          System.out.println("The price is Rs.45,000/-");

          }else if(q.equalsIgnoreCase(z)) {

          System.out.println("The price is Rs.56,000/-");

          }else {

    System.out.println("The price is not available");

         

    }

         

    }



    public void food() {

System.out.println("The food to be given is pedigree");

         

    }

   

   

}



    class sh implements birds{

          String n="sparrow";

          int p=1200;

          String c="grey";

          int x=12;

          String a="years";

          String m="parrot";

          int q=3000;

          String d="green";

          int y=60;

          String b="years";

          String o;

          Scanner e=new Scanner(System.in);

          public void name() {

          System.out.println("Enter the bird's name: ");

             o=e.next();

          if(o.equalsIgnoreCase(n)) {

          System.out.println("The name of the bird is "+n);}

                else if(o.equalsIgnoreCase(m)) {

                System.out.println("The name of the bird is "+m);

                }else {

                System.out.println("The bird is unavailable");

                }

    }

         @Override

          public void price() {

          if(o.equalsIgnoreCase(n)) {

                System.out.println("The price of the bird is Rs."+p);}

                      else if(o.equalsIgnoreCase(m)) {

                      System.out.println("The price of the bird is Rs."+q);

                      }else {

                      System.out.println("The bird is unavailable");

                      }     

               

          }

         @Override

          public void colour() {

          if(o.equalsIgnoreCase(n)) {

                System.out.println("The colour of the bird is Rs."+c);}

                      else if(o.equalsIgnoreCase(m)) {

                      System.out.println("The colour of the bird is Rs."+d);

                      }else {

                      System.out.println("The bird is unavailable");

                      }

               

          }

         @Override

          public void lifespan() {

          if(o.equalsIgnoreCase(n)) {

                System.out.println("The lifespan of the bird is "+x);}

                      else if(o.equalsIgnoreCase(m)) {

                      System.out.println("The lifespan of the bird is Rs."+y);

                      }else {

                      System.out.println("The bird is unavailable");

                      }

               

          }

    }

    class fish implements animals,petshop{

          String a="Goldfish";

          String b="piranha";

          String c;

          Scanner d=new Scanner(System.in);

         @Override

          public void name() {

          System.out.println("These are the fishes available:");

               

          }

         @Override

          public void breed() {

          System.out.println("Enter the name of the fish: ");

             c=d.next();

          if(c.equalsIgnoreCase(a)) {

                System.out.println(a);

                }else if(c.equalsIgnoreCase(b)) {

                System.out.println(b);

                }else {

                System.out.println("Not available");

                }

          }

         @Override

          public void price() {

          if(c.equalsIgnoreCase(a)) {

                System.out.println("Price is Rs.100/-");

                }else if(c.equalsIgnoreCase(b)) {

                System.out.println("Price is Rs.1249/-");

                }else {

                System.out.println("Not available");

                }

          }



         @Override

          public void food() {

          if(c.equalsIgnoreCase(a)) {

          System.out.println("Food is fish food");

                }else if(c.equalsIgnoreCase(b)) {

                System.out.println("Food is fish food");

                }else {

                System.out.println("Not Available");

                }

         

    }

    }


public class Petshoppgm {

	public static void main(String[] args) {
		dogs o=new dogs();

	     o.name();

	    o.breed();

	     o.food();

	    o.price();

	      sh w=new sh();

	     w.name();

	    w.price();

	   w.colour();

	w.lifespan();

	      fish f=new fish();

	    f.breed();

	     f.food();

	    f.price();

	}

}
