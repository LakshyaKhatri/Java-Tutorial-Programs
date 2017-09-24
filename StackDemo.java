class Stack
{
    int[] stck = new int[10];
    int top;
    
    Stack()
    {
        top = -1;
    }
    
    void push(int item)
    {
        if(top == 9)
            System.out.println("Stack Overflow");
        else
            stck[++top] = item;
    }
    
    int pop()
    {
        int item = 0;
        if(top < 0)
            System.out.println("Stack Underflow");
        else
            item = stck[top--];
        
        return item;
    }
}
public class StackDemo {
     
    public static void main(String[] args) {
        
        Stack s1 = new Stack();     //creates two new stack
        Stack s2 = new Stack();
        
        System.out.println("For Stack s1 :-");
        for(int i=0;i<12;i++)   //pushes some item in the stck s1 & s2
        {
            System.out.println("Pushing : " + i);
            s1.push(i);
        }
        System.out.println("\nFor Stack s2 :-");
        for(int i=20;i<30;i++)
        {
            System.out.println("Pushing : " + i);
            s2.push(i);
        }
        
        
        System.out.println("\nFor Stack s1 :-");
        for(int i=0;i<10;i++)
            System.out.println("Popped : " + s1.pop());
        
        System.out.println("\nFor Stack s2 :-");
        for(int i=0;i<10;i++)
            System.out.println("Popped : " + s2.pop());
    }
    
}
