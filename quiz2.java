import java.util.Arrays;
import java.util.EmptyStackException;
public class stackjava<T> {
    private static final int constant_value = 2;
    private int Hore;
    private T[] stack_variable;
    //No Arg Constructor
    stackjava() {
        this(constant_value);
    }
    stackjava(int inzial_value) {
        Hore = 0;
        stack_variable = (T[]) (new Object[inzial_value]);
    }
    //size
    public int size() {
        return Hore;
    }
    //push method
    public void push_method(T element) {
        if (size() == stack_variable.length)
            Expand();
        stack_variable[Hore] = element;
        Hore++;
    }
    //pop method
    public T pop_method() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            //top--;
            T natiijo = stack_variable[--Hore];
            stack_variable[Hore] = null;
            return natiijo;
        }
    }
    //peek MEthod
    public T peek(){
        if (isEmpty())
            throw new EmptyStackException();
        else
            return stack_variable[Hore-1];
    }
    //isEmpty method
    public boolean isEmpty(){
        return Hore ==0;
    }
    //expand method
    public void Expand(){
        stack_variable = Arrays.copyOf(stack_variable,stack_variable.length*2);
    }
    //display
    public void display(){
        if (isEmpty())
            throw new EmptyStackException();
        else
            System.out.println("Elements of an array: ");
        for (int x = 0; x<Hore;x++)
            System.out.println(stack_variable[x] + " ");
        System.out.println();
    }
}
