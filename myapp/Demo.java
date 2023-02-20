package myapp;

public class Demo {

 static   int  amount = 100;

    public static void main(String[] args) {
        
        String _city = "Hyderabad";

           
      


            System.out.println(_city);

       Demo d1 =     new  Demo();

            int  result =    d1.add(15,5);

            System.out.println("Result is : "+result);

    }


    public int add(int a, int b){  // a,b are local variables

            if(a>b){

              boolean flag = true;

                System.out.println("a is greater than "+flag);
            }


         
          
            return a+b;

    }

    
}
