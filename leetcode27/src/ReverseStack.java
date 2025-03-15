//********************** Reverse a Stack **************************//

//gfglink : https://www.geeksforgeeks.org/problems/reverse-a-stack/1

public class ReverseStack {
        static void reverse(Stack<Integer> s)
        {
            Stack<Integer> temp = new Stack<>();
            // add your code here
            if(s.isEmpty()){
                return ;
            }
            int top = s.pop();
            reverse(s);
            while(!s.isEmpty()){
                temp.push(s.pop());
            }
            temp.push(top);
            while(!temp.isEmpty()){
                s.push(temp.pop());
            }
        }

}
