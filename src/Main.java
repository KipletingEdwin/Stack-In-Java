import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();


        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

//        stack.pop();

//        String myFavGame = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("Minecraft"));


//        System.out.println(myFavGame);

    }
}