public class Modules {
    int num1;
    int num2;

    public  Modules(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }
    public int doModuleNums(){
        return this.num1 % this.num2;
    }
}
