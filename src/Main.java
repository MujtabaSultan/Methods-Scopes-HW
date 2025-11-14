//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int total_calculation=0;
    protected static int last_result=0;
    public static String calculator_name = "MyCalculator";

    public static int add(int a ,int b ){
        last_result=a+b;
        total_calculation++;
        return a+b;

    }
    protected static int sub(int a ,int b ){
        last_result=a-b;
        total_calculation++;
        return a-b;
    }
    private static void reset(){
        last_result=0;
    }
    public static void monthlyReset(){
        reset();
    }
    public static void showTotalCalc(){
        System.out.println(total_calculation);
    }
    public static void showLastResult(){
        int last_result = 0;

        System.out.println("the local is " + last_result + "the class oen is " + Main.last_result);
    }


    public static void main(String[] args) {

        System.out.println("result of this is "+add(10,20) + " total calcs : " +total_calculation + " ,last res : "+ last_result);
        System.out.println(sub(10,9)+ "total calcs : " +total_calculation + " ,last res : "+ last_result);
        showTotalCalc();
        showLastResult();
        monthlyReset();
        System.out.println("now its reset to " + last_result);
    }
}