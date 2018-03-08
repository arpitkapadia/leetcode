#Binary Search Tree
from collections import deque
class Node:
	def __init__(self, val):
		self.val = val
		self.left = None
		self.right = None

class BinarySearchTree:
	def __init__(self, root):
		self.root = None

	def search(self, val):
		if(self.root):
			if(self.root.val == val):
				return self.root
			elif(self.root.val > val):
				return self.search2(self.root, val)
			else:
				return self.search2(self.root, val)
		return self.root

	def search2(self, root, val):
		if(root):
			if(root.val == val):
				return root
			elif(root.val > val):
				if(root.left):
					return self.search2(root.left, val)
				else:
					return root
			else:
				if(root.right):
					return self.search2(root.right, val)
				else:
					return root
		return root

	def insert(self, val):
		temp = self.search(val)
		if(not temp):
			self.root = Node(val)
			return self.root

		if(temp.val > val):
			print(temp, self.root, val)
			temp.left = Node(val)


		else:
			temp.right = Node(val)
		return self.root


	def display(self):
		root = self.root
		stack = deque()
		if(not root):
			return root
		stack.append(root)
		while(len(stack) > 0):
			node = stack.popleft()
			if(node):
				print(node.val)
			#if(node.left):
				stack.append(node.left)
				stack.append(node.right)
			else:
				print(node)

if __name__ == '__main__':
	bst = BinarySearchTree(None)
	bst.insert(5)

	#tmp = bst.root.left = Node(90)

	#print("bst " , bst.root.left)
	bst.insert(6)
	bst.insert(1)
	print(bst.root.val)

	bst.insert(100)

	bst.display()
	



