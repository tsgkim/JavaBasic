package com.basic.tu.jvm;

/**
 *
 * @author: shiguang.tu
 * @create: 2020/2/5 2:16 PM
 */
public class Test1 {

    /**
     *
     -XX:NewSize=5m                     新生代初始 5m
     -XX:MaxNewSize=5m                  新生代最大 5m
     -XX:SurvivorRatio=8                eden(4m) : s1(0.5m) : s2(0.5m) = 8 : 1 : 1
     -XX:InitialHeapSize=10m            堆初始 10m
     -XX:MaxHeapSize=10m                堆最大 10m  ---> 老年代 5m
     -XX:PretenureSizeThreshold=10m     超过 10m 大对象直接进入老年代
     -XX:+UseParNewGC                   年轻代使用 ParNew 垃圾回收器
     -XX:+UseConcMarkSweepGC            老年代使用 CMS 垃圾回收器
     -XX:+PrintGCDetails                打印详细 GC 日志
     -XX:+PrintGCTimeStamps             打印每次 GC 发生时间
     -Xloggc:gc.log                     将 GC 日志写入 gc.log 文件

     43 讲

     Java HotSpot(TM) 64-Bit Server VM (25.181-b13) for bsd-amd64 JRE (1.8.0_181-b13), built on Jul  7 2018 01:02:31 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
     Memory: 4k page, physical 16777216k(1663996k free)

     /proc/meminfo:

     CommandLine flags: -XX:InitialHeapSize=10485760 -XX:MaxHeapSize=10485760 -XX:MaxNewSize=5242880 -XX:NewSize=5242880 -XX:OldPLABSize=16 -XX:PretenureSizeThreshold=10485760 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:SurvivorRatio=8 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:+UseParNewGC
     0.276: [GC (Allocation Failure) 0.276: [ParNew: 3938K->511K(4608K), 0.0023114 secs] 3938K->1541K(9728K), 0.0024782 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
     Heap
     par new generation   total 4608K, used 3746K [0x00000007bf600000, 0x00000007bfb00000, 0x00000007bfb00000)
     eden space 4096K,  78% used [0x00000007bf600000, 0x00000007bf9289f8, 0x00000007bfa00000)
     from space 512K,  99% used [0x00000007bfa80000, 0x00000007bfafffb8, 0x00000007bfb00000)
     to   space 512K,   0% used [0x00000007bfa00000, 0x00000007bfa00000, 0x00000007bfa80000)
     concurrent mark-sweep generation total 5120K, used 1029K [0x00000007bfb00000, 0x00000007c0000000, 0x00000007c0000000)
     Metaspace       used 3167K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 347K, capacity 388K, committed 512K, reserved 1048576K

     0.276: 运行 0.276s 发生 GC
     ParNew: 3938K->511K(4608K): 对年轻代执行一次 GC，GC 前使用了 3938K，GC 后只有 511K 存活，年轻代可用空间 4.5m(eden 4m + s1 0.5m)
     0.0023114 secs: 本次 GC 耗费时间
     3938K->1541K(9728K): 整个堆内存可用 9.5m(eden 4m + s1 0.5m + 老年代 5m)，GC 前整个堆内存使用了 3938K，GC 后堆内存使用了 1541K
     [Times: user=0.01 sys=0.00, real=0.01 secs]: 本次 GC 消耗时间

     par new generation   total 4608K, used 3746K [0x00000007bf600000, 0x00000007bfb00000, 0x00000007bfb00000):
        ParNew 垃圾回收器负责的年轻代总共有 4608K（4.5m），目前使用了 3746K（3.6m）

     */
    public static void main(String[] args) {

        // ①：栈帧局部变量 array1 指向 eden 区 1m 数组
        byte[] array1 = new byte[1024 * 1024];

        // ②：① 中 1m 数组成为垃圾对象，栈帧局部变量 array1 指向 eden 区 1m 数组
        array1 = new byte[1024 * 1024];

        // ③：② 中 1m 数组成为垃圾对象，栈帧局部变量 array1 指向 eden 区 1m 数组
        array1 = new byte[1024 * 1024];

        // ④：③ 中 1m 数组成为垃圾对象
        array1  = null;

        // 此时 eden 使用了 3m，新生代剩余 1m

        // ⑤：栈帧局部变量 array2 指向 eden 区 2m 数组，无法创建，产生 GC
        byte[] array2 = new byte[2 * 1024 * 1024];

    }


}
