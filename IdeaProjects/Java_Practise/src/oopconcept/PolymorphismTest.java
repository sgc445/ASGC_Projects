package oopconcept;

/**
 * Created by sgc on 2/18/16.
 */
public class PolymorphismTest {
    int num1;
    int num2;
    float value1;
    float value2;
    double number1;
    double number2;
    String name;
    String id;
    public PolymorphismTest(int n1,int n2){
        num1=n1;
        num2=n2;
    }
    public PolymorphismTest(int n1,int n2,float n3){
        num1=n1;
        num2=n2;
        value1=n3;
    }
    public PolymorphismTest(float n1 ,float n2,double n3)
    {
        value1=n1;
        value2=n2;
        number1=n3;
    }
    public PolymorphismTest(String nam,String idNo,Double num){
        name=nam;
        id=idNo;
        number2=num;
    }

    public void display(){
        System.out.println("name:" +name);
        System.out.println("id:" +id);
    }
    public void display(int n){
        System.out.println("sum with single int argument:" +(num1+num2+n));
    }
    public void display(float n){
        System.out.println("sum with single float argument: " +(number1+number2+n));
    }
    public double display(double n){
        return value1+value2+n;
    }
    public void display(String nam,String ids){
        System.out.println("name:" +nam);
        System.out.println("id:" +ids);
    }


}
