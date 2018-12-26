# JavaLearning
255的程序猿成长之路

## Java常用的八种排序算法
(原文链接：https://www.jianshu.com/p/5e171281a387)

时间复杂度和空间复杂度比较：

![Java类加载过程](https://github.com/M-255/JavaLearning/blob/master/ThinkingInJava/docs/8种排序算法对比.png)

分析：

1.三大简单、慢速排序算法：直接插入、直接选择、直接交换（冒泡）

| 算法 | 优点 | 缺点 |
| ----------- | ----------- | ----------- |
| 直接插入 | 简单 | 比较次数越少，移动次数越多 |
| 直接选择 | 简单 | 中等文本 |
| 直接交换（冒泡） | 简单 | 每次只移动相邻两个元素 |


### 1.直接插入排序
解决问题：把新的数据插入到已经排好的数据列中。

过程：
- 将第一个数和第二个数排序，然后构成一个有序序列。
- 将第三个数插入进去，构成一个新的有序序列。
- 对第四个数、第五个数……直到最后一个数，重复第二步。
![Java类加载过程](https://github.com/M-255/JavaLearning/blob/master/ThinkingInJava/docs/直接插入排序.webp)

如何写写成代码：
- 首先设定插入次数，即循环次数，for(int i=1;i<length;i++)，1个数的那次不用插入。
- 设定插入数和得到已经排好序列的最后一个数的位数。insertNum和j=i-1。
- 从最后一个数开始向前循环，如果插入数小于当前数，就将当前数向后移动一位。
- 将当前数放置到空着的位置，即j+1。

代码实现如下：

    public void insertSort(int[] a){
            int length=a.length;//数组长度，将这个提取出来是为了提高速度。
            int insertNum;//要插入的数
            for(int i=1;i<length;i++){//插入的次数
                insertNum=a[i];//要插入的数
                int j=i-1;//已经排序好的序列元素个数
                while(j>=0&&a[j]>insertNum){//序列从后到前循环，将大于insertNum的数向后移动一格
                    a[j+1]=a[j];//元素移动一格
                    j--;
                }
                a[j+1]=insertNum;//将需要插入的数放在要插入的位置。
            }
        }

### 2.希尔排序
解决问题：对于直接插入排序问题，数据量巨大时。

过程：
- 将第一个数和第二个数排序，然后构成一个有序序列。
- 将第三个数插入进去，构成一个新的有序序列。
- 对第四个数、第五个数……直到最后一个数，重复第二步。
![Java类加载过程](https://github.com/M-255/JavaLearning/blob/master/ThinkingInJava/docs/直接插入排序.webp)

如何写写成代码：
- 首先设定插入次数，即循环次数，for(int i=1;i<length;i++)，1个数的那次不用插入。
- 设定插入数和得到已经排好序列的最后一个数的位数。insertNum和j=i-1。
- 从最后一个数开始向前循环，如果插入数小于当前数，就将当前数向后移动一位。
- 将当前数放置到空着的位置，即j+1。

代码实现如下：

    public void insertSort(int[] a){
            int length=a.length;//数组长度，将这个提取出来是为了提高速度。
            int insertNum;//要插入的数
            for(int i=1;i<length;i++){//插入的次数
                insertNum=a[i];//要插入的数
                int j=i-1;//已经排序好的序列元素个数
                while(j>=0&&a[j]>insertNum){//序列从后到前循环，将大于insertNum的数向后移动一格
                    a[j+1]=a[j];//元素移动一格
                    j--;
                }
                a[j+1]=insertNum;//将需要插入的数放在要插入的位置。
            }
        }
