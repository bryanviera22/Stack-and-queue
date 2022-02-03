class Stack:
    data=[]

    def is_empty(self):
        return self.data==[]

    def push(self, node):
        self.data.append(node)

    def pop(self):
        if not self.is_empty():
            value=self.data[-1]
            del self.data[-1]
            return value
        else:
            print("Nothing to pop")

    def print_stack(self):
        print('not implemented yet')
        print('print the stack vertical so that the top is printed first')



fruit = Stack()
fruit.pop()
fruit.push("Apple")
fruit.push("Banana")
fruit.pop()
fruit.push("Canned Yams")
fruit.push("Durian")
fruit.print_stack()
fruit.pop()
fruit.pop()
fruit.print_stack()

"""
Finish the Stack Class so that the print_stack method prints the stack vertically so that for instance ['a','b','c'] is printed 
a
b
c
"""

class Queue:
    data=[]

"""
Write Queue functions for enqueue, dequeue, is_empty and print_queue
"""

q=Queue()

q.enqueue('Job 1')
q.enqueue('Job 2')
q.enqueue('Job 3')
q.print_queue()
q.dequeue()
q.dequeue()
q.print_queue()