🚀 Graph Theory – Data Structures & Algorithms

This repository contains clean and scalable implementations of core Graph Theory concepts in Java. Each problem is solved with clear logic, optimized time/space complexity, and proper modular structure.

🧠 Concepts Covered
Topic	Description
Graph Representation	Using Adjacency List
BFS / DFS	Traversal of graphs using Breadth-First and Depth-First Search
Cycle Detection	For both directed and undirected graphs
Topological Sort	Using Kahn’s algorithm (BFS-based)
Dijkstra’s Algorithm	Shortest path in a weighted graph
🔧 Technologies

Language: Java

Compiler: JDK 17+

✅ How to Run
# Compile
javac FileName.java

# Run
java FileName


Each file has a main method with sample input for quick testing.

📌 Contribution Goals

Master graph traversal techniques
Build reusable utility functions
Write clean, maintainable, and testable code
Improve algorithmic problem-solving using real-world scenarios

📖 Sample Intuition

To build the adjacency list, initialize an array of empty ArrayLists of size equal to number of nodes.
Use a function addEdge(src, dest) to insert connections.
Traversal (BFS/DFS) uses a visited array and recursion/queue.
