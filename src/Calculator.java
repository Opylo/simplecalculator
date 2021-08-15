public class Calculator {
    private double firstValue;
    private double secondValue;

    public Calculator(){
        //This is left delebrately
    }

    public Calculator(double firstValue, double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double calculateAdd(double firstValue, double secondValue){
        return firstValue + secondValue;
    }
    public double calculateSub(double firstValue, double secondValue){
        return firstValue - secondValue;
    }
    public double calculateMul(double firstValue, double secondValue){
        return firstValue * secondValue;
    }
    public double calculateDiv(double firstValue, double secondValue){
        return firstValue / secondValue;
    }
    public double calculateMod(double firstValue, double secondValue){
        return firstValue % secondValue;
    }
}
