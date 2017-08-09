package datastructure.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by George Fouche on 8/8/17.
 */
public class ArrayStructuresTest {

    @Test
    public void testInsertValueMethod() {
        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.insertValue(5);
        assertEquals(5, arrayStructures.getValueAtIndex(10));
    }

    @Test
    public void testDeleteValueMethod() {
        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.insertValue(5);
        arrayStructures.deleteIndex(10);
        assertEquals(0, arrayStructures.getValueAtIndex(10));
    }

    @Test
    public void testDoesArrayContainThisValueMethod() {
        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.insertValue(10);
        assertTrue(arrayStructures.doesArrayContainThisValue(10));
    }

}