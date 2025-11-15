//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int total_calculation=0;
    protected  int last_result=0;
    public  String calculator_name = "MyCalculator";

    public  int add(int a ,int b ){
        last_result=a+b;
        total_calculation++;
        return a+b;

    }
    protected  int sub(int a ,int b ){
        last_result=a-b;
        total_calculation++;
        return a-b;
    }
    private  void reset(){
        last_result=0;
    }
    public  void monthlyReset(){
        reset();
    }
    public static void showTotalCalc(){
        System.out.println(total_calculation);
    }
    public void showLastResult(){
        int last_result = 0;

        System.out.println("the local is " + last_result + "the class oen is " + this.last_result);
    }


    public static void main(String[] args) {

        Main main = new Main();

        System.out.println("result of this is "+main.add(10,20) + " total calcs : " +total_calculation + " ,last res : "+ main.last_result);
        System.out.println(main.sub(10,9)+ "total calcs : " +total_calculation + " ,last res : "+ main.last_result);
        showTotalCalc();
        main.showLastResult();
        main.monthlyReset();
        System.out.println("now its reset to " + main.last_result);
    }
}