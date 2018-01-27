package com.learn.programme;

public class SortTest {
//测试
public static void main(String[] args){
	int[] numbers={9,3,17,1,-1,108,6};
	System.out.println("排序前：");
	printArr(numbers);
	
	bubbleSort(numbers);//冒泡排序
	System.out.println("冒泡排序后：");
	printArr(numbers);
	
	quick(numbers);//快速排序
    System.out.println("快速排序后：");
    printArr(numbers);
  
	
}

//打印函数
public static void printArr(int[] numbers)
{
    for(int i = 0 ; i < numbers.length ; i++)
    {
    System.out.print(numbers[i] + ",");
    }
    System.out.println("");
}

//冒泡排序的算法实现如下:排序后，数组从小到大排列
public static void bubbleSort(int[] numbers){
	int temp=0;
	int size=numbers.length;
	for(int i=0;i<size-1;i++){
	for(int j=0;j<size-1-i;j++){
		if(numbers[j]>numbers[j+1]){
			temp=numbers[j];
			numbers[j]=numbers[j+1];
			numbers[j+1]=temp;
		}
	}
		
	}
	
}

//查找中轴（最低位作为中轴）所在位置
public static int getMiddle(int[] numbers, int low,int high)
{
    int temp = numbers[low]; //数组的第一个作为中轴
    while(low < high)
    {
    while(low < high && numbers[high] > temp)
    {
        high--;
    }
    numbers[low] = numbers[high];//比中轴小的记录移到低端
    while(low < high && numbers[low] < temp)
    {
        low++;
    }
    numbers[high] = numbers[low] ; //比中轴大的记录移到高端
    }
    numbers[low] = temp ; //中轴记录到尾
    return low ; // 返回中轴的位置
}

//递归形式的分治排序算法
public static void quickSort(int[] numbers,int low,int high)
{
    if(low < high)
    {
   int middle = getMiddle(numbers,low,high); //将numbers数组进行一分为二
   quickSort(numbers, low, middle-1);   //对低字段表进行递归排序
   quickSort(numbers, middle+1, high); //对高字段表进行递归排序
    }

}

//快速排序提供方法调用
public static void quick(int[] numbers)
{
    if(numbers.length > 0)   //查看数组是否为空
    {
    quickSort(numbers, 0, numbers.length-1);
    }
}

}
