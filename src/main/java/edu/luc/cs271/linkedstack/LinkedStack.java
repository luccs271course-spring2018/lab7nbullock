package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  
  public int size = 0;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // DONE
    top = new Node<>(obj, top);
    size += 1;
    return obj;
    // return null;
  }

  @Override
  public E peek() {
   // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
    // return null;
  }

  @Override
  public E pop() {
     // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      size -= 1;
      return result;
    }
    // return null;
  }

  @Override
  public boolean isEmpty() {
     // DONE
    if (top != null) {
      return false;
    }
    return true;
  }

  @Override
  public List<E> asList() {
    // DONE implement using an ArrayList preallocated with the right size
    // DONE add any instance variable(s) required to support this
    //final ArrayList<E> list = new ArrayList<>(size);

    // Node<E> curr = top;

    // while (curr != null) {
    // list.add(curr.data);
    // curr = curr.next;
    final ArrayList<E> result = new ArrayList<>(size);
    populateList(top, result); // DONE replace null with the right reference
    return result;
    }
  }
  private void populateList(final Node<E> curr, final List<E> result) {
  // DONE recursively populate the list in the desired order
     if (curr == null) {
      return;
    } else {
      result.add(curr.data);
      populateList(curr.next, result);
    }
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateFifoList(top, result); // DONE replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
  // TODO recursively populate the list in the desired order
  }
}

