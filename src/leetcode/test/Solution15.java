package leetcode.test;

public class Solution15 {
    //?
    /**
     * #include <iostream>
     * #include <stdio.h>
     * #include <stdio.h>
     * void swap_0126zcl(int a[],int i,int j){
     *     int temp;
     *     temp=a[i];
     *     a[i]=a[j];
     *     a[j]=temp;
     * }
     * int Partition_0126zcl(int a[],int bin ,int end){
     *     int x=a[end];
     *     int i=bin;
     *     int k;
     *     for(k=bin;k<=end-1;k++){
     *          if(x>=a[k]){
     *              swap_0126zcl(a,i,k);
     *              i=i+1;
     *          }
     *     }
     *         swap_0126zcl(a,end,i);
     *            return i;
     * }
     * void QuickSort_0126zcl(int a[],int bin,int end){
     *     if(bin<end){
     *        int Pos=Partition_0126zcl(a,bin,end);
     *         QuickSort_0126zcl(a,bin,Pos-1);
     *         QuickSort_0126zcl(a,Pos+1,end);
     *     }
     * }
     * int main(){
     *         int m;
     *        printf("请输入数组个数:");
     *        scanf("%d",&m);
     *         int a[m+1];
     *         for(int i=1;i<=m;i++){
     *            printf("[%d]:",i);
     *            scanf("%d",&a[i]);
     *         }
     *         printf("原始数组:");
     *         for(int i=1;i<=m;i++){
     *             printf("%d ",a[i]);
     *         }
     *         printf("\n");
     *         printf("0126董晨排序后的结果为:");
     *        QuickSort_0126zcl(a,1,m);
     *        for(int i=1;i<=m;i++){
     *           printf("%d ",a[i]);
     *        }
     * }
     */
}
