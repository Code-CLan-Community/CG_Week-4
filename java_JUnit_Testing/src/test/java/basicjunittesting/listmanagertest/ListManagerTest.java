package basicjunittesting.calculatortest.listmanagertest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import basicJunitproblems.calculator.listmanager.ListManager;

public class ListManagerTest {
    private final ListManager listManager = new ListManager();

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        listManager.removeElement(list, 5);
        assertFalse(list.contains(5));
        assertEquals(0, list.size());
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        listManager.addElement(list, 10);
        assertEquals(2, listManager.getSize(list));
    }
}