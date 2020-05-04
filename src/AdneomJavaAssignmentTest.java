import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class AdneomJavaAssignmentTest {
    @Test
    public void givenValidInput_whenPartition_thenOk() {
        Integer size = 2;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList(Arrays.asList(1, 2)));
        expectedResult.add(new ArrayList(Arrays.asList(3, 4)));
        expectedResult.add(new ArrayList(Arrays.asList(5, 6)));
        expectedResult.add(new ArrayList(Arrays.asList(7)));
        assertEquals(expectedResult, AdneomJavaAssignment.partition(numbers, size));
    }

    @Test
    public void givenLargerSize_whenPartition_thenOk() {
        Integer size = 8;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        assertEquals(expectedResult, AdneomJavaAssignment.partition(numbers, size));
    }

    @Test
    public void givenNonValidInput_whenPartition_thenNok() {
        Integer size = 2;
        List<Integer> numbers = null;
        List<List<Integer>> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, AdneomJavaAssignment.partition(numbers, size));
    }

    @Test
    public void givenNegativeSize_whenPartition_thenNok() {
        Integer size = 2;
        List<Integer> numbers = null;
        List<List<Integer>> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, AdneomJavaAssignment.partition(numbers, size));
    }
}