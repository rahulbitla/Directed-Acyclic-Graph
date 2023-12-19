# Directed-Acyclic-Graph
Steps of Execution :-
1) Install any java ide like intellijIdea or Eclipse. Extract the zip file and open
the folder in that ide. Now you can create whatever the graph you wanted
by simply changing the vertex objects in lines from 37 to 54 in Solution.java
class;
2) In my case I took the graph as :-
![image](https://github.com/rahulbitla/Directed-Acyclic-Graph/assets/97371332/c895e3c4-2bac-43fd-bfd7-cfd22c926950)

And I took the source as 2 .
For your own source you should change in the line number 67 in
solution.java.
4) If you see my graph by eye longest path count will be 6 and my code output
is :-
(I have printed graph as well, you can neglect that).
Answers :-
1. Yes, the solution works for all the cases perfectly.
2. We can’t escape the fact that we must travel till the end of all possible
directions from the source to get maximum path count. So exactly this fact
has been coded and you can’t optimize further.
3. Let’s say there are m nodes connected to a source and E is the maximum
edges in all of the directions then worst case time complexity will be
O(m*E)
Space complexity will be O(E) for edges storing in list and O(N) total nodes
for map for building graph.
4) Every case is handled perfectly if your graph is restricted to your constraints
or else if you give cyclic or undirected you need to implemented by extra
visited set.
Additional Questions :-
1) Only feature I don’t like about java is that there is no single function or
single data structure that can store different data types. For example in
python we can return multiple values with different data types or in
tuples we can store different data types. But in Java to work like that we
must create a separate class and return or store as a object of it which I
feel writing a extra boiler plate code.
2) If I could choose a technology stack to work I will definitely prefer Java
because , Though there are many object oriented programming
languages now, I personally feel Java is the best because from childhood
onwards with my experience I can say if anyone learnt Java Object
Oriented Techniques perfectly they can perfectly code any real life
entities with these properties. And also I prefer Java due to it’s security.
