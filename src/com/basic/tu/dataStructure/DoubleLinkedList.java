package com.basic.tu.dataStructure;

/**
 * 双向链表
 *
 * @author: shiguang.tu
 * @create: 2018/11/6 10:03 PM
 */
public class DoubleLinkedList<T> {

    /**
     * 大小
     */
    private int size;

    /**
     * 头
     */
    private Node<T> head;

    /**
     * 尾
     */
    private Node<T> tail;

    /**
     * 添加任意 index 处
     *
     * @param index 索引，0开始
     * @param data
     */
    public void add(int index, T data) {

        Node<T> addNode = new Node<>();


        // 空链表
        if (size == 0) {

            head = addNode;
            tail = addNode;

        // 超出当前索引
        } else if (index >= size) {

            Node<T> tmp = this.tail;

            tail = addNode;

            tmp.next = tail;

            tail.prev = tmp;

        } else {

        }



        
    }


    /**
     * 内部类
     * @param <T>
     */
    private static class Node<T> {

        /**
         * 节点数据
         */
        private T data;

        /**
         * 前一个节点
         */
        private Node prev;

        /**
         * 后一个节点
         */
        private Node next;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
