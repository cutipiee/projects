package com.bdd.jbehave;


import com.bdd.linklist.MyLinkList;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.bdd.linklist.Node;



public class MyLinkListSteps {

	private int numOfNodes;
	private String nodeVal;
	private MyLinkList linkList;
	
	@Given("$nnum nodes")
	public void numOfNodes(int num) {
		this.numOfNodes=num;
		linkList =new MyLinkList();
		System.out.println("Number of nodes going to add in List==>"+num);
	}
	@When("node value is $val")
	public void addNodeValues(String val) {
		System.out.println(">>>>> adding the values in the list as --"+val);
		this.nodeVal=val;
	}
	@When("add them in list")
	public void addThemInList() {
		System.out.println(">>>>> Adding into list...");
		linkList.addNodeInLast(new Node(this.nodeVal,null));
		
	}
	@Then("get the size as $size")
	public void getTheListSize(int size) {
		System.out.println(">>>Expected link list size is"+size);
		Assert.assertTrue(size==linkList.getSize());
		
	}
}
