package com.basic.tu.jvm;

public class Test3 {

    /**

     -XX:NewSize=100m                   新生代初始 100m
     -XX:MaxNewSize=100m                新生代最大 100m
     -XX:SurvivorRatio=8                eden(80m) : s1(10m) : s2(10m) = 8 : 1 : 1
     -XX:InitialHeapSize=200m           堆初始 200m
     -XX:MaxHeapSize=200m               堆最大 200m  ---> 老年代 100m
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

        // 触发 young gc，30m 必须存活，S 区放不下，直接进入老年代

        Thread.sleep(1000);

    }


}
