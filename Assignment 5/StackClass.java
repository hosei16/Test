/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdrivers;

/**
 *
 * @author dewbabyo
 */

    public class StackClass {
   
	private int elements[]; //elements of the stack
	private int size;   //current size of the stack
	private int capacity = 50; //total capacity
	private int top = -1; //top position
   
	/** default constructor */
	public StackClass() {
    	size=0;
	}
	//constructor that takes an array as elements of the satck
	public StackClass(int ele[]){
    	size=ele.length;
    	elements =new int[size];
    	top=size-1;
       
    	for(int i=0;i<ele.length;i++)
        	elements[i]=ele[i];
	}
	//constructor that takes an array as elements of the satck
	//and capacity if the stack
	public StackClass(int ele[],int capacity){
    	this(ele);       
    	this.capacity=capacity;
	}
	//return size of the stack
	public int Size(){
    	return size;
	}
	//tells the stack is empty or not
	public boolean isEmpty(){
    	return top==-1;
	}
	//pushes an element into the stack
	public void push(int data){
    	if(top == size)
        	System.out.println("Stack is overflow");
    	else{
        	top++;
        	elements[top]=data;
    	}           
	}
	//pops an element from the stack
	public int pop(){
    	int data=0;
    	if(isEmpty())
        	System.out.println("Stack is underflow");
    	else
        	data=elements[top--];
    	return data;
	}
   
	//compares two stacks and tells whether they are equal or not
	public boolean equalStack(StackClass otherStack){
    	if(this.size != otherStack.size)
        	return false;
    	else{
        	while(!this.isEmpty()){
            	if(this.pop() != otherStack.pop())
                	return false;
        	}          
    	}
    	return true;
	}
	//displays the stack elements
	public void display(){
    	for(int i=0;i<size;i++){
        	System.out.print(elements[i]+" ");
    	}
	}
}//end of the StackClass


