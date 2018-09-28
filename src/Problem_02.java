// 编写一个类，用两个栈实现队列，支持队列的基本操作（add/poll/peek）


import java.util.Stack;

public class Problem_02 {
    public static class MyQueue{
        private Stack<Integer> stackHead;
        private Stack<Integer> stackTail;

        public MyQueue(){
            this.stackHead = new Stack<Integer>();
            this.stackTail = new Stack<Integer>();
        }

        public void add(int newValue){
            this.stackTail.push(newValue);
        }

        public int poll(){
            if(this.stackTail.isEmpty() && this.stackHead.isEmpty()){
                throw new RuntimeException("Queue is empty.");
            }
            
            return 0;
        }

        public int peek(){
            return 0;
        }
    }
}
