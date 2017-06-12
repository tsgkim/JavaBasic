package com.basic.ta.algorithm.datastructure;

/** 
 * 基于堆的优先队列
 * 
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月12日 下午2:14:21 
*/
public class MaxPQ<Key extends Comparable<Key>> {
	private Key[] pq;
	private int nElems=0;
	public MaxPQ(int size){
		pq=(Key[]) new Comparable[size+1];
	}
	
	public boolean isEmpty(){
		return nElems==0;
	}
	
	public int size(){
		return nElems;
	}
	
	public void insert(Key v){
		pq[++nElems]=v;
		swim(nElems);
	}
	
	public Key max(){
		return pq[1];
	}
	
	public Key delMax(){
		Key temp=pq[1];
		exch(1,nElems);
		pq[nElems--]=null;
		sink(1);
		return temp;
	}
	
	//元素上浮的实现
	private void swim(int k){
		while(k>1 && less(k/2,k)){
			exch(k/2,k);
			k=k/2;
		}
	}
	
	//元素下沉的实现
	private void sink(int k){
		while(2*k<nElems){
			int j=2*k;
			if(less(2*k,2*k+1))
				j++;
			if(less(k,j)){
				exch(k,j);
				k=j;
			}
			else
				break;
		}
	}
	
	private boolean less(int i,int j){
		return pq[i].compareTo(pq[j])<0;
	}
	
	private void exch(int i,int j){
		Key t=pq[i];
		pq[i]=pq[j];
		pq[j]=t;
	}
}