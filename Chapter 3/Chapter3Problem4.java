/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 3,4
 * @author Matthew S Montoya
 * 
 */
public class Chapter3Problem4{
	class Queue{
		/*Implement a queue class
		 */

		public Stack firstIn = new Stack();
		public Stack firstOut = new Stack();



		public Queue(){
		}

		public void enqueue(int value){
			firstIn.add(value);
		}

		public int dequeue(){
			if(firstIn.isEmpty()){
				return -1;
			}
			if(firstIn.size() == 1){
				return firstIn.peek();
			}
			else{
				firstOut = reverse(firstIn);
				return firstOut.pop();
			}
		}

		public Stack reverse(Stack s){
			Stack temp = new Stack();
			while(!firstIn.isEmpty()){
				temp.push(firstIn.pop());
			}
			return temp;
		}

		public void display(){
			while(!firstIn.isEmpty()){
				firstOut.push(firstIn.pop());
			}
			while(!firstOut.isEmpty()){
				System.out.println(firstOut.pop());
			}

		}
	}
}