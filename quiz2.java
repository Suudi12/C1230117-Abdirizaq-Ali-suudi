import java.util.Arrays;
import java.util.EmptyStackException;

public class quiz_stack {
    public static void main(String[] args) {
        // Create a stack of integers
        example_stack<Integer> numbers = new example_stack<>();

        // Push some elements
        numbers.push_method(10);
        numbers.push_method(20);
        numbers.push_method(30);

        // Display the stack
        numbers.display();

        // Peek at the top element
        System.out.println("Top element (peek): " + numbers.peek());

        // Pop an element
        System.out.println("Popped element: " + numbers.pop_method());

        // Display again after popping
        numbers.display();

        // Push another element
        numbers.push_method(40);
        numbers.push_method(50);

        // Display final stack
        numbers.display();

        // Show size
        System.out.println("Current stack size: " + numbers.size());

        // Check if empty
        System.out.println("Is the stack empty? " + numbers.isEmpty());
    }
}

class example_stacks<T> {
    private static final int constant_value = 2;
    private int Hore;
    private T[] stack_variable;

    // No-arg constructor
    example_stacks() {
        this(constant_value);
    }

    example_stacks(int inzial_value) {
        Hore = 0;
        stack_variable = (T[]) (new Object[inzial_value]);
    }

    // size
    public int size() {
        return Hore;
    }

    // push method
    public void push_method(T element) {
        if (size() == stack_variable.length)
            Expand();
        stack_variable[Hore] = element;
        Hore++;
    }

    // pop method
    public T pop_method() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            T natiijo = stack_variable[--Hore];
            stack_variable[Hore] = null;
            return natiijo;
        }
    }

    // peek method
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return stack_variable[Hore - 1];
    }

    // isEmpty method
    public boolean isEmpty() {
        return Hore == 0;
    }

    // expand method
    public void Expand() {
        stack_variable = Arrays.copyOf(stack_variable, stack_variable.length * 2);
    }

    // display method
    public void display() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            System.out.println("Elements of the stack:");
            for (int x = 0; x < Hore; x++)
                System.out.print(stack_variable[x] + " ");
            System.out.println();
        }
    }
}

