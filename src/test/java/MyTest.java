import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MyTest {

    public static final int ELEMENT = 1;
    MyStack myStack;

    @Before
    public void setUp() throws Exception {
         myStack = new MyStack(10);

    }

    @Test
    public void IfEmptySize0() throws Exception {

        assertThat(myStack.size()).isEqualTo(0);
    }

    @Test
    public void IfAddElementSize1() throws Exception {

        myStack.push(ELEMENT);
        assertThat(myStack.size()).isEqualTo(1);

    }

    @Test
    public void IfPushAndPopSize0() throws Exception {

        myStack.push(ELEMENT);
        myStack.pop();
        assertThat(myStack.size()).isEqualTo(0);

    }

    @Test
    public void IfPushAndPopReturnTheSame() throws Exception {

        myStack.push(ELEMENT);

        assertThat(myStack.pop()).isEqualTo(ELEMENT);
    }

    @Test (expected = UnderflowException.class)
    public void shouldThrowExceptionForEmptyStack() throws Exception {
        myStack.push(ELEMENT);
        myStack.pop();
        myStack.pop();

    }

    @Test (expected = OverflowException.class)
    public void shouldThrowExceptionForOverflowStack() throws Exception {
        MyStack mys = new MyStack(1);
        mys.push(ELEMENT);
        mys.push(ELEMENT);

    }

    @Test
    public void whenPushAndPopElementsAreInReverseOrder() throws Exception {
        myStack.push(ELEMENT);
        myStack.push(2);
        assertThat(myStack.pop()).isEqualTo(2);
        assertThat(myStack.pop()).isEqualTo(ELEMENT);

    }
}
