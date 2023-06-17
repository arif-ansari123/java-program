//Java Program to Read The Number From Standard Input
import java.util.Scanner;
class Arif{
    public static void main(String[] args){
        int n;
        System.out.println("Enter a number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.println("the number is : "+n);
    }
}
//Java Program to Multiply Two Floating-Point Numbers
import java.util.Scanner;
class Float{
    public static void main(String[] args){
        float a;
        float b;
        System.out.println("enter two float point");
        Scanner re = new Scanner(System.in);
        a=re.nextFloat();
        b=re.nextFloat();
        float c = a*b;
        System.out.println("the multiplication of two number is : "+c);
    }
}
//Java Program to Swap Two Numbers
import java.util.Scanner;
class Swap{
    public static void main(String[] args){
        int a;
        int b;
        int temp;
        System.out.println("Enter two number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("number before swap is : "+a+ "and" +b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("number after swap is : "+a+"and"+b);
    }
}
//Java Program to Add Two Binary Strings
class Addtwobinarystriing{
    static String addtwo(String x,String y){
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum); 
        return result;
        
    }
    public static void main(String[] args){
        String x ="011011",y="1010111";
        System.out.println(addtwo(x,y));
    }
}
//Java Program to Add two Complex Numbers
//this keyword:-refer the current object inside method or constructor.
public class Addcomplexnumber{
    int real,imginary;
    public void Complexnumber(int r,int i){
        this.real=r;
        this.imginary=i;
    }
    public void show(){
        System.out.println(this.real +"i"+this.imginary);
    }
    public static Complexnumber add(Complexnumber n1,Complexnumber n2)
    {
        Complexnumber result = new Complexnumber(0,0);
        result.real=n1.real+n2.real;
        result.imginary=n1.imginary+n2.imginary;
        return result;
    }
    
    
    public static void main(String[] args){
        Complexnumber c1=new Complexnumber(10,20);
        Complexnumber c2=new Complexnumber(10,30);
        System.out.println("first complex number");
        c1.show();
        System.out.println("second complex number");
        c2.show();
        Complexnumber result=add(c1,c2);
        System.out.println("the addition is : ");
        result.show();
        
    }
}
//Java Program to Check if a Given Integer is Odd or Even
import java.util.Scanner;
class Evenodd{
    public static  void main(String[] args){
        System.out.println("Enter a number");
        Scanner re = new Scanner(System.in);
        int num=re.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
       else{
          System.out.println("odd"); 
       }
    }
}
//Java Program to Find the Largest of three Numbers:
import java.util.Scanner;
class Largestofthreenumber{
    public static void main(String[] args){
        int m,n,p;
        System.out.println("Enter three number");
        Scanner sc = new Scanner(System.in); 
        m=sc.nextInt();
        n=sc.nextInt();
        p=sc.nextInt();
        if(m>n){
            System.out.println(m+" is greatest");
        }
        else if(n>p){
            System.out.println(n+" is greatest");
        }
        else{
            System.out.println(p+" is greatest");
        }
    }
}
