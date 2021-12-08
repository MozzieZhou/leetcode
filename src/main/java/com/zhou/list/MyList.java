package com.zhou.list;

/**
 * Copyright (C), 2020, 上海昌投网络科技有限公司
 * FileName: MyList
 *
 * @author zhouzhijun
 * @date 2021/1/14 18:09
 * @Description TODO
 */
public interface MyList<E> {

    int getSize();

    boolean isEmpty();

    void addFirst(E e);

    void addLast(E e);

    E get(int index);

    E getFirst();

    E getLast();

    void set(int index, E e);

    boolean contains(E e);

    E remove(int index);

    E removeFirst();

    E removeLast();

    void removeElement(E e);

}
