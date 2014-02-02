package com.complexityclass.algorithms.unionfind;

public class WQuickUnion {

	private int[] id;
	private int[] size;

	public WQuickUnion(int n) {
		id = new int[n];
		size = new int[n];
		for(int i = 0; i < n; i++) {
			id[i] = i;
		}
	}

	private int root(int p){
		while(p != id[p])
			p = id[p];
		return p;
	}

	public boolean find(int p, int q){
		return root(p) == root(q);
	}

	public void union(int p, int q){
		
		int i = root(p);
		int j = root(q);

		if(i == j) return;

		if(size[i] < size[j]){
			id[i] = j;
			size[j] += size[i];
		}else{
			id[j] = i;
			size[i] += size[j];
		}
	}

	public void printIdArray(String log){
		System.out.println(log + ":");
		for(int i = 0; i < id.length; i++)
			System.out.print(id[i] + " ");
	}

	public static void main(String[] args){

		WQuickUnion qu = new WQuickUnion(10);
		qu.printIdArray("start :");
		qu.union(4,8);
		qu.union(3,9);
		qu.union(7,1);
		qu.union(0,3);
		qu.union(5,9);
		qu.union(3,2);
		qu.union(1,8);
		qu.union(7,2);
		qu.union(1,6);
		qu.printIdArray("end :");


	}

}