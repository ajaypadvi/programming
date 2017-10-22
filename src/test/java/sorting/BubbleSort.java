package sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * for i between 0 and (array length – 2):
 * if (array(i + 1) < array(i)):
 * switch array(i) and array(i + 1)
 * repeat until a complete iteration where no elements are switched.
 */
public class BubbleSort {
    public void bubbleSort(int[] numbers) {
        boolean numbersSwitched;
        do {
            numbersSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                    numbersSwitched = true;
                }
            }
        } while (numbersSwitched);
    }

    @Test
    public void testBubble() {
        final int[] numbers = {6, 4, 9, 5};
        final int[] expected = {4, 5, 6, 9};

        bubbleSort(numbers);
        assertArrayEquals(expected, numbers);
    }

}
