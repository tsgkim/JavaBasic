package com.basic.tu.dataStructure;

import me.andpay.ti.util.JSON;

/**
 * 线性表实现类
 *
 * @author: shiguang.tu
 * @create: 2018/11/8 11:33 AM
 */
public class LinkList implements List {

    /**
     * 头指针
     */
    Node head;

    /**
     * 当前结点对象
     */
    Node current;

    /**
     * 结点个数
     */
    int size;

    public static void main(String[] args) {

        LinkList linkList = new LinkList();

        System.out.println(String.format("linkList=%s", JSON.getDefault().toJSONString(linkList)));

        linkList.get(-1);

        System.out.println(String.format("linkList=%s", JSON.getDefault().toJSONString(linkList)));

        linkList.insert(0, 0);
        linkList.insert(1, 1);
        linkList.insert(2, 2);
        linkList.insert(2, 1.5);

        System.out.println(String.format("linkList=%s", JSON.getDefault().toJSONString(linkList)));

        linkList.delete(1);

        System.out.println(String.format("linkList=%s", JSON.getDefault().toJSONString(linkList)));

        System.out.println(String.format("linkList=%s", JSON.getDefault().toJSONString(linkList.get(1))));

    }

    public LinkList() {
        head = current = new Node();
        size = 0;
    }

    void index(int index) throws IndexOutOfBoundsException {

        if (index == -1) {
            current = head;
        }

        if ((index < -1) || (index > (size - 1))) {
            throw new IndexOutOfBoundsException();
        }

        current = head;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }

    }

    @Override
    public void insert(int index, Object obj) {

        index(index - 1);

        current.next = new Node(obj, current.next);

        size ++;

    }

    @Override
    public void delete(int index) {

        index(index - 1);

        current.next = current.next.next;

    }

    @Override
    public Object get(int index) {

        index(index);

        return current;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean hasEmpty() {
        return size == 0;
    }

    /**
     * 单链表
     * 静态内部类使用场景一般是当外部类需要使用内部类，而内部类无需外部类资源，并且内部类可以单独创建的时候会考虑采用静态内部类的设计
     */
    private static class Node {

        /**
         * 数据域
         */
        Object object;

        /**
         * 指针域
         */
        Node next;

        Node() {
        }

        Node(Object object, Node nexNode) {
            this.object = object;
            this.next = nexNode;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
