class OverloadingTest1{

//addition method of parameter a and b

void addition(int a,int b){

int sum=a+b;

System.out.println("Sum of two numbers is "+sum);

}

//addition method of parameter a, b and c

void addition(int a,int b,int c){

int sum=a+b+c;

System.out.println("Sum of three numbers is "+sum);

}
void addition(float a, float b){
	float sum=a+b;
	System.out.println("Sum of float number is "+sum);
}

public static void main(String args[]){

OverloadingTest1 obj=new OverloadingTest1();

obj.addition(2,5,10);

obj.addition(15,10);
obj.addition(2.3f,2.4f);

}

}