package korzin.io.structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneDirLListTest {

  @Test
  public void testLL() {

    OneDirLList<Integer> ll = new OneDirLList<>();

    assertTrue(ll.empty());
    assertEquals(0, ll.size());

    ll.pushFront(22);
    ll.pushFront(11);
    ll.pushBack(33);
    assertEquals(3, ll.size());

    assertEquals(new Integer(22), ll.getByIndex(1).getValue());
    assertFalse(ll.empty());

    assertEquals(new Integer(33), ll.topBack().getValue());
    assertEquals(3, ll.size());

    ll.popBack();
    assertEquals(new Integer(22), ll.topBack().getValue());
    ll.popFront();
    assertEquals(1, ll.size());

    ll.pushBack(33);
    ll.pushBack(44);
    ll.pushFront(11);

    assertEquals(4, ll.size());

    OneDirLList.Node<Integer> _22 = ll.getByIndex(2);

    ll.addAfter(_22, 333);

    ll.popBack();

    assertEquals(new Integer(333), ll.topBack().getValue());

    ll.addBefore(ll.getByIndex(3), 222);

    assertEquals(new Integer(222), ll.getByIndex(3).getValue());

    ll.erase(11);

    ll.erase(222);

    ll.erase(333);

    assertEquals(2, ll.size());

    ll.addBefore(ll.getByIndex(0), 11);

    assertEquals(new Integer(11), ll.topFront().getValue());

    assertTrue(ll.find(22));
    assertFalse(ll.find(222));
  }
}
