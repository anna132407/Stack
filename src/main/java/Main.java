import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        Iterator<Integer> intIterator = intStack.iterator();
        while ( intIterator.hasNext() )
            System.out.println(intIterator.next().toString());

        Stack<String> strStack = new Stack<String>();
        strStack.push("any");
        strStack.push("many");
        strStack.push("money");
        strStack.push("more");

        Iterator<String> strIterator = strStack.iterator();
        while ( strIterator.hasNext() )
            System.out.println(strIterator.next());
    }
}
