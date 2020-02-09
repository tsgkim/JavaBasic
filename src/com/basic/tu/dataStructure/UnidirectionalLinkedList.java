//package com.basic.tu.dataStructure;
//
//import me.andpay.ti.util.BeanUtil;
//import me.andpay.ti.util.JSON;
//
///**
// * 单向链表数据结构
// *
// * @author: shiguang.tu
// * @create: 2018/11/6 5:48 PM
// */
//public class UnidirectionalLinkedList {
//
//   int data;
//   String name;
//
//   UnidirectionalLinkedList next;
//
//    /**
//     * 反转单向链表
//     * @param node
//     * @return
//     */
//   static UnidirectionalLinkedList reverse(UnidirectionalLinkedList node) {
//
//       if (node == null) {
//           return null;
//       }
//
//       UnidirectionalLinkedList result = null;
//
//       UnidirectionalLinkedList temp = node;
//
//       while (temp != null) {
//
//           UnidirectionalLinkedList temp2 = new UnidirectionalLinkedList();
//           temp2.next = result;
//
//           // temp 基本属性都赋值给 temp2
//           BeanUtil.copyProperties(temp, temp2, "next");
//
//           result = temp2;
//
//           // 下一个 temp 就是此时 temp 的 next
//           temp = temp.next;
//       }
//
//       return result;
//   }
//
//   public static void main(String[] args) {
//
//       UnidirectionalLinkedList test1 = new UnidirectionalLinkedList();
//       test1.data = 1;
//       test1.name = "name1";
//
//       UnidirectionalLinkedList test2 = new UnidirectionalLinkedList();
//       test2.data = 2;
//       test2.name = "name2";
//
//       UnidirectionalLinkedList test3 = new UnidirectionalLinkedList();
//       test3.data = 3;
//       test3.name = "name3";
//
//       test1.next = test2;
//
//       test2.next = test3;
//
//       System.out.println(String.format("test1 = %s", JSON.getDefault().toJSONString(test1)));
//       System.out.println(String.format("test1 reverse = %s", JSON.getDefault().toJSONString(reverse(test1))));
//   }
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public UnidirectionalLinkedList getNext() {
//        return next;
//    }
//
//    public void setNext(UnidirectionalLinkedList next) {
//        this.next = next;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//
