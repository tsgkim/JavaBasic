package com.basic.tu.dataStructure;

/**
 * 线性表接口
 */
public interface List {

    /**
     * 获得线性表长度
     *
     * @return
     */
    int size();

    /**
     * 判断线性表是否为空
     *
     * @return
     */
    boolean hasEmpty();

    /**
     * 插入元素，在 index 之前插入
     *
     * @param index
     * @param obj
     * @throws Exception
     */
    void insert(int index, Object obj);

    /**
     * 删除元素
     *
     * @param index
     * @throws Exception
     */
    void delete(int index);

    /**
     * 获取指定位置的元素
     *
     * @param index
     * @return
     * @throws Exception
     */
    Object get(int index);

}
