package com.zhou.list;

/**
 * 我就是我，那不一样的烟火～
 * FileName: MyBaseList
 *
 * @author Mozzie
 * @date 2021/1/17 11:43 下午
 * @Description
 */
public class MyBaseList<E> implements MyList<E> {

    public class Node {
        public Node next;
        public E val;

        public Node(E e, Node next) {
            this.next = next;
            this.val = e;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }
    }

    public Node dummyHead;
    public int size;

    public MyBaseList() {
        this.dummyHead = new Node();
        size = 0;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void add(int index, E e) {
        // 索引失效
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index illegal, add fail...");
        }
        Node prev = dummyHead;
    }

    public E get(int index) {
        return null;
    }

    public E getFirst() {
        return null;
    }

    public E getLast() {
        return null;
    }

    public void set(int index, E e) {

    }

    public boolean contains(E e) {
        return false;
    }

    public E remove(int index) {
        return null;
    }

    public E removeFirst() {
        return null;
    }

    public E removeLast() {
        return null;
    }

    public void removeElement(E e) {

    }
}
