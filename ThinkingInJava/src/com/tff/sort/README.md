# JavaLearning
255的程序猿成长之路

## Java常用的八种排序算法
(原文链接：https://www.jianshu.com/p/5e171281a387)

**时间复杂度和空间复杂度比较：**

![Java类加载过程](https://github.com/M-255/JavaLearning/blob/master/ThinkingInJava/docs/8种排序算法对比.png)

**分析：**

1. 三大简单、慢速排序算法

| 算法 | 优点 | 缺点 |
| ----------- | ----------- | ----------- |
| 直接插入 | 简单 | 比较次数越少，移动次数越多；速度慢 |
| 直接选择 | 简单 | 速度慢 |
| 直接交换（冒泡） | 简单 | 每次只移动相邻两个元素；速度慢 |

2. 希尔排序

希尔排序中，算法的效率很大程度由增量决定，而一个合适的增量的选择需要大量的经验。

3. 堆排序

- 它比快速排序的优点：在最坏情况下它的性能很优越
- 它比归并排序的优点：使用的辅助存储少
- 它的缺点：不适合太小的待排序列（因为他需要建堆）
- 不稳定，不适合对象的排序

4. 快速排序、归并排序（最常用的排序算法）

| 算法 | 特点 |
| ----------- | ----------- |
| 快速排序 | 最快的排序算法，缺点是不稳定，不适合对象排序 |
| 归并排序 | 第二快的算法，缺点是辅存很大，适合对象排序 |

### 1.直接插入排序
**解决问题**：把新的数据插入到已经排好的数据列中。

**过程：**
- 将第一个数和第二个数排序，然后构成一个有序序列。
- 将第三个数插入进去，构成一个新的有序序列。
- 对第四个数、第五个数……直到最后一个数，重复第二步。

![Java类加载过程](https://github.com/M-255/JavaLearning/blob/master/ThinkingInJava/docs/直接插入排序.webp)

**如何写写成代码：**
- 首先设定插入次数，即循环次数，for(int i=1;i<length;i++)，1个数的那次不用插入。
- 设定插入数和得到已经排好序列的最后一个数的位数。insertNum和j=i-1。
- 从最后一个数开始向前循环，如果插入数小于当前数，就将当前数向后移动一位。
- 将当前数放置到空着的位置，即j+1。

**代码实现如下：**

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
**解决问题**：对于直接插入排序问题，数据量巨大时。

**过程：**
- 将数的个数设为n，取奇数k=n/2，将下标差值为k的书分为一组，构成有序序列。
- 再取k=k/2 ，将下标差值为k的书分为一组，构成有序序列。
- 重复第二步，直到k=1执行简单插入排序。

![Java类加载过程](https://github.com/M-255/JavaLearning/blob/master/ThinkingInJava/docs/希尔排序.webp)

**如何写写成代码：**
- 首先确定分的组数。
- 然后对组中元素进行插入排序。
- 然后将length/2，重复1,2步，直到length=0为止。

代码实现如下：

    public void sheelSort(int[] a){
            int d  = a.length;
            while (d!=0) {
                d=d/2;
                for (int x = 0; x < d; x++) {//分的组数
                    for (int i = x + d; i < a.length; i += d) {//组中的元素，从第二个数开始
                        int j = i - d;//j为有序序列最后一位的位数
                        int temp = a[i];//要插入的元素
                        for (; j >= 0 && temp < a[j]; j -= d) {//从后往前遍历。
                            a[j + d] = a[j];//向后移动d位
                        }
                        a[j + d] = temp;
                    }
                }
            }
        }

### 3.简单选择排序
**解决问题**：常用于取序列中最大最小的几个数时。

**过程：**
- 将数的个数设为n，取奇数k=n/2，将下标差值为k的书分为一组，构成有序序列。
- 再取k=k/2 ，将下标差值为k的书分为一组，构成有序序列。
- 重复第二步，直到k=1执行简单插入排序。

代码实现如下：

    public void selectSort(int[] a) {
            int length = a.length;
            for (int i = 0; i < length; i++) {//循环次数
                int key = a[i];
                int position=i;
                for (int j = i + 1; j < length; j++) {//选出最小的值和位置
                    if (a[j] < key) {
                        key = a[j];
                        position = j;
                    }
                }
                a[position]=a[i];//交换位置
                a[i]=key;
            }
        }
    
### 4.堆排序
**解决问题**：对简单选择排序的优化。

**过程：**
- 将序列构建成大顶堆。
- 将根节点与最后一个节点交换，然后断开最后一个节点。
- 重复第一、二步，直到所有节点断开。

代码实现如下：

    public  void heapSort(int[] a){
            System.out.println("开始排序");
            int arrayLength=a.length;
            //循环建堆  
            for(int i=0;i<arrayLength-1;i++){
                //建堆  
    
                buildMaxHeap(a,arrayLength-1-i);
                //交换堆顶和最后一个元素  
                swap(a,0,arrayLength-1-i);
                System.out.println(Arrays.toString(a));
            }
        }
        private  void swap(int[] data, int i, int j) {
            // TODO Auto-generated method stub  
            int tmp=data[i];
            data[i]=data[j];
            data[j]=tmp;
        }
        //对data数组从0到lastIndex建大顶堆  
        private void buildMaxHeap(int[] data, int lastIndex) {
            // TODO Auto-generated method stub  
            //从lastIndex处节点（最后一个节点）的父节点开始  
            for(int i=(lastIndex-1)/2;i>=0;i--){
                //k保存正在判断的节点  
                int k=i;
                //如果当前k节点的子节点存在  
                while(k*2+1<=lastIndex){
                    //k节点的左子节点的索引  
                    int biggerIndex=2*k+1;
                    //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在  
                    if(biggerIndex<lastIndex){
                        //若果右子节点的值较大  
                        if(data[biggerIndex]<data[biggerIndex+1]){
                            //biggerIndex总是记录较大子节点的索引  
                            biggerIndex++;
                        }
                    }
                    //如果k节点的值小于其较大的子节点的值  
                    if(data[k]<data[biggerIndex]){
                        //交换他们  
                        swap(data,k,biggerIndex);
                        //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
                        k=biggerIndex;
                    }else{
                        break;
                    }
                }
            }
        }
    
### 5.冒泡排序
**解决问题**：一般不用。

**过程：**
- 将序列中所有元素两两比较，将最大的放在最后面。
- 将剩余序列中所有元素两两比较，将最大的放在最后面。
- 重复第二步，直到只剩下一个数。

代码实现如下：

    public void bubbleSort(int[] a){
            int length=a.length;
            int temp;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length-i-1;j++){
                    if(a[j]>a[j+1]){
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
        }
    
### 6.快速排序
**解决问题**：要求时间最快时。

**过程：**
- 选择第一个数为p，小于p的数放在左边，大于p的数放在右边。
- 递归的将p左边和右边的数都按照第一步进行，直到不能递归。

代码实现如下：

    public static void quickSort(int[] numbers, int start, int end) {   
        if (start < end) {   
            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）   
            int temp; // 记录临时中间值   
            int i = start, j = end;   
            do {   
                while ((numbers[i] < base) && (i < end))   
                    i++;   
                while ((numbers[j] > base) && (j > start))   
                    j--;   
                if (i <= j) {   
                    temp = numbers[i];   
                    numbers[i] = numbers[j];   
                    numbers[j] = temp;   
                    i++;   
                    j--;   
                }   
            } while (i <= j);   
            if (start < j)   
                quickSort(numbers, start, j);   
            if (end > i)   
                quickSort(numbers, i, end);   
        }   
    }
    
### 7.归并排序
**解决问题**：速度仅次于快排，内存少的时候使用，可以进行并行计算的时候使用。

**过程：**
- 选择相邻两个数组成一个有序序列。
- 选择相邻的两个有序序列组成一个有序序列。
- 重复第二步，直到全部组成一个有序序列。

代码实现如下：

    public static void mergeSort(int[] numbers, int left, int right) {   
        int t = 1;// 每组元素个数   
        int size = right - left + 1;   
        while (t < size) {   
            int s = t;// 本次循环每组元素个数   
            t = 2 * s;   
            int i = left;   
            while (i + (t - 1) < size) {   
                merge(numbers, i, i + (s - 1), i + (t - 1));   
                i += t;   
            }   
            if (i + (s - 1) < right)   
                merge(numbers, i, i + (s - 1), right);   
        }   
    }   
    private static void merge(int[] data, int p, int q, int r) {   
        int[] B = new int[data.length];   
        int s = p;   
        int t = q + 1;   
        int k = p;   
        while (s <= q && t <= r) {   
            if (data[s] <= data[t]) {   
                B[k] = data[s];   
                s++;   
            } else {   
                B[k] = data[t];   
                t++;   
            }   
            k++;   
        }   
        if (s == q + 1)   
            B[k++] = data[t++];   
        else  
            B[k++] = data[s++];   
        for (int i = p; i <= r; i++)   
            data[i] = B[i];   
    }
    
### 8.基数排序
**解决问题**：用于大量数，很长的数进行排序时。

**过程：**
- 将所有的数的个位数取出，按照个位数进行排序，构成一个序列。
- 将新构成的所有的数的十位数取出，按照十位数进行排序，构成一个序列。

代码实现如下：

    public void sort(int[] array) {
            //首先确定排序的趟数;     
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            int time = 0;
            //判断位数;     
            while (max > 0) {
                max /= 10;
                time++;
            }
            //建立10个队列;     
            List<ArrayList> queue = new ArrayList<ArrayList>();
            for (int i = 0; i < 10; i++) {
                ArrayList<Integer> queue1 = new ArrayList<Integer>();
                queue.add(queue1);
            }
            //进行time次分配和收集;     
            for (int i = 0; i < time; i++) {
                //分配数组元素;     
                for (int j = 0; j < array.length; j++) {
                    //得到数字的第time+1位数;   
                    int x = array[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
                    ArrayList<Integer> queue2 = queue.get(x);
                    queue2.add(array[j]);
                    queue.set(x, queue2);
                }
                int count = 0;//元素计数器;     
                //收集队列元素;     
                for (int k = 0; k < 10; k++) {
                    while (queue.get(k).size() > 0) {
                        ArrayList<Integer> queue3 = queue.get(k);
                        array[count] = queue3.get(0);
                        queue3.remove(0);
                        count++;
                    }
                }
            }
        }