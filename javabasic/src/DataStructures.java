//import javax.swing.tree.TreeNode;
//import java.util.*;
//
//public class DataStructures {
//    public static void ArrayExample()
//    {
//        System.out.println("Array");
//        int[] tree = {10, 20, 30, 40, 50}; // Initialize an array of integers
//        System.out.println("Element at index 0:" + tree[0]);
//        System.out.println("Element at index 2:" + tree[2]);
//        System.out.println("Element at index 4:" + tree[4]);
//
//        int sum = 0;
//        // length represents the total size of the array
//        for (int j : tree) {
//            sum = sum + j;
//        }
//        System.out.println("Sum of array elements:" + sum); // Adding all elements in an array
//        tree[2] = 35; // Update an element in the array
//        System.out.println("Updated element at index 2:" + tree[2]);
//        System.out.println("Elements in the array:");
////      for (int number:tree)// using for each loop printing the elements of the array
////            {
////                System.out.println(number);
////            }
//        // using for loop printing the elements of the array
//        for (int number : tree) {
//            System.out.println(number);
//        }
//
//    }
//
//    public static void ArrayListExample() {
//        System.out.println("Array list");
//        ArrayList<Integer> Arraylist= new ArrayList<>();//creating an instance of ArrayList
//        Arraylist.add(10);// Adding an element to the Arraylist
//        Arraylist.add(20);
//        Arraylist.add(30);
//        Arraylist.add(40);
//        Arraylist.add(50);
//        System.out.println(Arraylist);//Printing the Arraylist
//
//        Arraylist.set(3,100);// changing value in list using index
//        System.out.println(Arraylist);
//
//        //Removing an element in a list once we remove an element index will be varied for other elements
//         Arraylist.remove(3);
//        System.out.println(Arraylist);
//
//        // Sum of Arraylist
//        boolean sum = false;
//        System.out.println(sum);
//    }
//
//    public static void LinkedList1(){
//
//        // Create a LinkedList to store integers
//        LinkedList<Integer> linkedList1 = new LinkedList<>();
//
//        // Add elements to the LinkedList
//        linkedList1.add(10);
//        linkedList1.add(20);
//        linkedList1.add(30);
//
//        // Print the LinkedList
//        System.out.println("LinkedList:"+linkedList1);
//
//        // Remove an element from the LinkedList
//        linkedList1.removeFirst();
//        System.out.println("LinkedList after removing first element:"+linkedList1);
//
//        // Check if an element exists in the LinkedList Boolean will return true if the element is present
//        boolean containsElement=linkedList1.contains(300);
//        System.out.println("LinkedList contains element 30?"+containsElement);
//
//        // Get the first and last elements of the LinkedList
//        int firstElement=linkedList1.getFirst();
//        int lastElement=linkedList1.getLast();
//        System.out.println("First element:"+firstElement);
//        System.out.println("Last element:"+lastElement);
//
//        // Clear the LinkedList
//        linkedList1.clear();
//        System.out.println("LinkedList after clearing:"+linkedList1);
//    }
//
//    public static void stack(){
//
//        // Create a stack
//        Stack<Integer> stack=new Stack<>();
//
//        // Push elements onto the stack
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        // Print the top element of the stack
//        System.out.println("Top element:"+stack.peek());
//
//        // Pop elements from the stack
//        int poppedElement=stack.pop();
//        System.out.println("Popped element:"+poppedElement);
//
//        // Check if the stack is empty
//        System.out.println("Is stack empty?"+stack.isEmpty());
//
//        // Get the size of the stack
//        System.out.println("Stack size:"+stack.size());
//
//        // Iterate over the stack
//        System.out.println("Stack elements:");
//        for (Integer element:stack)
//        {
//            System.out.println(element);
//        }
//    }
//    @SuppressWarnings("DataFlowIssue")
//    public static void queue(){
//
//        // Create a queue
//        Queue<Integer> Q= new LinkedList<>();
//
//        // Enqueue elements (add to the queue)
//        Q.add(10);
//        Q.add(20);
//        Q.add(30);
//        Q.add(40);
//
//        // Dequeue elements (remove from the queue)
//        int removedElement = Q.poll();
//        System.out.println("Removed element: " + removedElement);
//
//        // Peek (view the front element without removing it)
//        int frontElement = Q.peek();
//        System.out.println("Front element: " + frontElement);
//
//        // Display the queue after dequeue
//        System.out.println("Queue after removal: " + Q);
//
//    }
//    public static void hashmap(){
//
//        // Create a HashMap to store String keys and Integer values
//        HashMap<String,Integer> hash= new HashMap<>();
//
//        // Add key-value pairs to the HashMap
//        hash.put("Naveen",100);
//        hash.put("Akash",50);
//        hash.put("kiran",40);
//
//        //Access and print values based on keys
//        System.out.println("Age of Naveen:"+hash.get("Naveen"));
//        System.out.println("Age of Akash:"+hash.get("Akash"));
//
//        // Check if a key exists in the HashMap
//        System.out.println("Is Naveen present?"+hash.containsKey("Naveen"));
//
//        // Update the value associated with a key
//        hash.put("Naveen",32);
//
//        // Remove a key-value pair from the HashMap
//        hash.remove("Naveen");
//
////      Returns a Set containing all the keys in the HashMap.
//        System.out.println("key values :"+hash.keySet());
//
//        //Print all key-value pairs in the HashMap
//        System.out.println("Key-Value pairs in the HashMap:");
//        for (String key : hash.keySet())
//        {
//            System.out.println(key+":"+hash.get(key));
//        }
//
//        // Check the size of the HashMap
//        System.out.println("Size of the HashMap:"+hash.size());
//    }
//
//    public static void hashset(){
//
//        // Create a HashSet
//        HashSet<String> set=new HashSet<>();
//
//        // Add elements to the HashSet
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Orange");
//        set.add("Grapes");
//        set.add("Mango");
//
//        // Print the HashSet
//        System.out.println("HashSet:"+set);
//
//        // Check if an element exists
//        System.out.println("Contains 'Apple':"+set.contains("Apple"));
//
//        // Remove an element
//        set.remove("Banana");
//
//        // Print the updated HashSet
//        System.out.println("Updated HashSet:"+set);
//
//        // Get the size of the HashSet
//        System.out.println("Size of HashSet:"+set.size());
//
//        // Clear the HashSet
//        set.clear();
//
//        // Check if the HashSet is empty
//        System.out.println("Is HashSet empty?"+set.isEmpty());
//    }
//
//    public static void treeset(){
//        // Create a TreeSet
//        TreeSet<Integer> tree=new TreeSet<>();
//
//        // Add elements to the TreeSet
//        tree.add(5);
//        tree.add(2);
//        tree.add(8);
//        tree.add(1);
//        tree.add(4);
//
//        // Print the TreeSet
//        System.out.println("Elements in the TreeSet:"+tree);
//
//        // Check if an element exists
//        System.out.println("Does TreeSet contain 4?"+tree.contains(4));
//
//        // Remove an element
//        tree.remove(2);
//
//        // Print the TreeSet after removal
//        System.out.println("Elements in the TreeSet after removal:"+tree);
//
//        // Get the size of the TreeSet
//        System.out.println("Size of the TreeSet:"+tree.size());
//
//        // Get the first and last element
//        System.out.println("First element:"+tree.first());
//        System.out.println("Last element:"+tree.last());
//
//        // Iterate over the TreeSet
//        System.out.println("Iterating over the TreeSet:");
//        for (int number:tree)
//        {
//            System.out.println(number);
//        }
//    }
//
//    public static void treemap() {
//        // Create a TreeMap
//        TreeMap<String,Integer> scores=new TreeMap<>();
//
//        // Insert key-value pairs into the TreeMap
//        scores.put("Alice",90);
//        scores.put("Bob",80);
//        scores.put("Charlie",95);
//        scores.put("David",87);
//        scores.put("Eve",92);
//
//        //Access and print values from the TreeMap
//        System.out.println("Score of Alice:"+scores.get("Alice"));
//        System.out.println("Score of Charlie:"+scores.get("Charlie"));
//        System.out.println("Score of David:"+scores.get("David"));
//
//        // Update a value in the TreeMap
//        scores.put("Bob",85);
//
//        // Remove a key-value pair from the TreeMap
//        scores.remove("Eve");
//
//        // Iterate through the TreeMap using a for-each loop
//        System.out.println("Scores in the TreeMap:");
//        for (String name:scores.keySet())
//        {
//            int score=scores.get(name);
//            System.out.println(name+":"+score);
//        }
//        // Entry set will return key and value
//        scores.entrySet();
//        System.out.println(scores);
//    }
//
//
//    // Definition for a Binary Tree Node
//    class TreeNode {
//        int value;        // The value of the node
//        TreeNode left;    // Reference to the left child
//        TreeNode right;   // Reference to the right child
//        // Constructor to initialize the node with a value
//        public TreeNode(int value) {
//            this.value = value;
//            this.left = null;   // Initially, no left child
//            this.right = null;  // Initially, no right child
//        }
//    }
//    public void tree() {
//        // Create a binary search tree
//        TreeNode root = new TreeNode(100);
//        root.left = new TreeNode(30);
//        root.right = new TreeNode(70);
//        root.left.left = new TreeNode(20);
//        root.left.right = new TreeNode(40);
//        root.right.left = new TreeNode(60);
//        root.right.right = new TreeNode(80);
//        // Perform common operations
//        System.out.println("In-order Traversal:");
//        inOrderTraversal(root);
//
//        System.out.println("\nSearch for value 40: "+search(root, 40));
//        System.out.println("Search for value 90: "+search(root, 90));
//
//        int minValue = findMinValue(root);
//        System.out.println("Minimum value in the tree: "+minValue);
//
//        int maxValue = findMaxValue(root);
//        System.out.println("Maximum value in the tree: "+maxValue);
//    }
//
//    // In-order traversal: left subtree, root, right subtree
//    public static void inOrderTraversal(TreeNode node) {
//        if (node != null) {
//            inOrderTraversal(node.left);
//            System.out.print(node.value + " ");
//            inOrderTraversal(node.right);
//        }
//    }
//
//    // Search for a value in the tree
//    public static boolean search(TreeNode node, int value) {
//        if (node == null)
//            return false;
//        if (node.value == value)
//            return true;
//        if (value < node.value)
//            return search(node.left, value);
//        else
//            return search(node.right, value);
//    }
//
//    // Find the minimum value in the tree
//    public static int findMinValue(TreeNode node) {
//        if (node.left == null)
//            return node.value;
//        return findMinValue(node.left);
//    }
//
//    // Find the maximum value in the tree
//    @org.jetbrains.annotations.Contract(pure = true)
//    public static int findMaxValue(TreeNode node) {
//        if (node.right == null)
//            return node.value;
//        return findMaxValue(node.right);
//    }
//}
//
//
//
//
//
//
