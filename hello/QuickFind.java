package com.complexityclass.algorithms.unionfind;

public class QuickFind {

	private int[] id;

	public QuickFind(int n) {
		id = new int[n];
		for(int i= 0; i < n; i++){
			id[i] = i;
		}
	}

	public boolean find(int p, int q){
		return id[p] == id[q];
	}

	public void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		for(int i = 0; i < id.length; i++){
			if(id[i] == pid) id[i] = qid;
		}
	}

	public void printIdArray(String log){
		System.out.println(log + ":");
		for(int i = 0; i < id.length; i++)
			System.out.print(id[i] + " ");
	}

	public static void main(String[] args) {
		QuickFind qf = new QuickFind(10);
		qf.printIdArray("Base id");
		qf.union(1,2);
		qf.union(9,0);
		qf.union(1,3);
		qf.union(6,0);
		qf.union(5,6);
		qf.union(9,4);
		qf.printIdArray("End array");

	}

}