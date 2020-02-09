package com.basic.tu.jvm;

public class Test4 {

    /**

     -XX:NewSize=200m                   新生代初始 200m
     -XX:MaxNewSize=200m                新生代最大 200m
     -XX:SurvivorRatio=2                eden(100m) : s1(50m) : s2(50m) = 2 : 1 : 1
     -XX:InitialHeapSize=300m           堆初始 300m
     -XX:MaxHeapSize=300m               堆最大 300m  ---> 老年代 100m
     -XX:MaxTenuringThreshold=15
     -XX:PretenureSizeThreshold=20m      超过 20m 大对象直接进入老年代
     -XX:+UseParNewGC                   年轻代使用 ParNew 垃圾回收器
     -XX:+UseConcMarkSweepGC            老年代使用 CMS 垃圾回收器
     -XX:+PrintGCDetails                打印详细 GC 日志
     -XX:+PrintGCTimeStamps             打印每次 GC 发生时间
     -Xloggc:gc.log                     将 GC 日志写入 gc.log 文件

     */
    public static void main(String[] args) throws Exception {

        Thread.sleep(30000);

        while (true) {
            loadData();
        }

    }

    private static void loadData() throws Exception {

        byte[] data = null;

        for (int i = 0; i < 4; i ++) {

            data = new byte[10 * 1024 * 1024]; // 每次分配 10m 数组

            // 对接上一次 80m 垃圾，这里执行到第二次时，eden 100m 填满，10m 必须存活

        }
        data = null;

        // 40m 垃圾

        byte[] data1 = new byte[10 * 1024 * 1024];
        byte[] data2 = new byte[10 * 1024 * 1024];

        // 20m 必须存活，eden 总共使用了 60m

        byte[] data3 = new byte[10 * 1024 * 1024];

        // 30m 必须存活，eden 总共使用了 70m

        data3 = new byte[10 * 1024 * 1024];

        // 30m 必须存活，eden 总共使用了 80m

        Thread.sleep(1000);

        // 出栈帧，80m 全为垃圾对象

    }


}
