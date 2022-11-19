class increment{
public static void main(String v[]){
int a=5;
//a++;//post increment(use & increment)
//++a;//pre increment(increment&use)
//System.out.println(a);

int b=(a++)+(a--)+(a++)-(++a)+a;
        //5(IN 6)+6(5)+5(6)-7(7)+7=16
System.out.println(a);
System.out.println(b);

}

}