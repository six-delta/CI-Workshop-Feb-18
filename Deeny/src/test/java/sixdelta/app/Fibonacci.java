public class Fibonacci {

public static void main (String args[]){

int a=1,b=0,c;

for(int i=1;i<=10;i++){

    c=a+b;
    b=a;
    a=c;
    
    System.out.println(" "+ c);
}
return;
}

}