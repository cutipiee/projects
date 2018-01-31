package com.bdd.linklist;

import com.bdd.linklist.Node;

public class MyLinkList {

	Node head;
	Node tail;
	
	public void addNodeInLast(Node node) {
		if(null==tail) {
			head=node;
			tail=node;
		}else {
			tail.setNext(node);
			tail=node;
		}
	}
	public int getSize() {
		return traverse();
		
	}
	private int traverse() {
		int listSize =0;
		if(head==null) {
			return listSize;
		}else {
			Node tempHead=head;
			while(tempHead!=null) {
				System.out.print("Node:"+tempHead.toString());
				System.out.println(" , ");
				tempHead=tempHead.getNext();
				listSize++;
			}
			System.out.println();
		}
		return listSize;
	}
	
}
