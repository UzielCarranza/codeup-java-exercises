package util;



public class InputTest {

    public static void main(String[] args) {
//        first case
        Input input = new Input();
        input.getString("no");
        input.yesNo();
        System.out.println(input.yesNo());

//        second case

        input.getString("yes");
        input.yesNo();
        System.out.println(input.yesNo());

    }
}
