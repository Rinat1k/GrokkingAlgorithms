import alghorithms.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    public void elementExistTest() {
        int[] data = {0, 24, 26, 34, 35, 41, 41, 42, 42, 51, 60, 66, 67, 67, 70, 72, 73, 75, 84, 84, 86, 89, 95};
        int target = 73;

        Assert.assertEquals("Algorithm not working", 16, binarySearch.run(data, target));
    }

}
