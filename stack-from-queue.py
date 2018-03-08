from collections import deque
class MyStack:
    

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.queue1 = deque()
        self.queue2 = deque()
        

    def push(self, x):
        """
        Push element x onto stack.
        :type x: int
        :rtype: void
        """
        if(len(self.queue1) == 0):
            self.queue1.append(x)
        else:
            while(len(self.queue1) > 0):
                self.queue2.append(self.queue1.popleft())
                
            self.queue1.append(x)
                
        

    def pop(self):
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """
        if(len(self.queue1) == 0):
                
            while(len(self.queue2) > 1):
                self.queue1.append(self.queue2.popleft())
            tmp = self.queue2.popleft()

            while(len(self.queue1) > 1):
                self.queue2.append(self.queue1.popleft())
            return tmp
        else:
            tmp = self.queue1.popleft()
            while(len(self.queue2) > 0):
                self.queue1.append(self.queue2.popleft())

            while(len(self.queue1) > 1):
                self.queue2.append(self.queue1.popleft())
            return tmp
        
         
        

    def top(self):
        """
        Get the top element.
        :rtype: int
        """
        tmp = self.queue1.popleft()
        self.queue1.append(tmp)
        return tmp
        
        

    def empty(self):
        """
        Returns whether the stack is empty.
        :rtype: bool
        """
        return len(self.queue1) == 0 and len(self.queue2) == 0
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()