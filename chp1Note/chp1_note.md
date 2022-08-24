<!-- Author: Sang One Jung -->
# Chapter1: Arrays and Strings
## $ Hash Tables
**Definition**: A Hash Table, also  known as Hash Map, is a data structure that implements an associateive array or dictionary, an abstract data type that stores a collection of **(Key, Value)** pairs. <br/>
* Insert: Inserting the *value* in the appropriate hash index <br/>
Time Complexity: $O(1)$ 
```java
public void insert(K key, V value){
    hashtable[hash(key)] = value; 
}
```
* Remove: Removing the *key* from the hashtable<br/>
Time Complexity: $O(1)$ 
```java
public void remove(K key){
    hashtable[hash(key)] = null;
}
```
* Look up: Looking up the *value* from the hashtable with the given *key*<br/>
Time Complexity: $O(1)$ 
```java
public V lookup(K key){
    return hashtable[hash(key)];
}
```
**Load Factor**: A Load Factor is the measure that decides when to increase the capacity of the Map/Table. The default load factor is 75% of the capacity. A Hash Table is considered "full" when LF > LF Threshold<br/>

**Naive Expansion Alogrithm**: 
1) Double the size of a hashtable
2) Rehash so that mapping is correct
    1) Double the size or 2*table_size + 1
    2) Rehash all the keys to new index
 

Time Complexity: Resize takes $O(1)$ but Rehash takes $O(n)$ <br/>

**Hash Function**: A hash function computes a valued hash index from a key (0 < index < array.length). Hash Index is a data item's location within a hashtable. Typically, the hash index is *key % table_size*
```java
public int hash(KeyType key):
    return key % table_size; 
    //or
    return key.hashCode() % table_size; 
```
* __hashCode()__: An Object class method used for built in data types
* __Collision__: A hash function may generate the same hash index for more than one key

**Rules For Creating a Hash Function**: Hash functions are imperfect due to *collision*. These are the four properties of designing a good hash function
* Hashing must be *deterministic*
* Uniform distribution of Keys across the table
* Minimal Collisions
* Fast and easy to compute

**Collision Handling**
* Open Hashing (Seperate Chaining)
    * Chaining
* Closed Hashing (Open Addressing)
    * Linear Probing
    * Quadratic Probing
    * Double Hashing

**Open Hashing-Chaining**
* Each element is a chain that holds multiple keys
* Linked List or Binary Search Tree

**Closed Hashing-Linear Probing**<br/>
Let $H_k$ where k = Key \% H. Suppose there is a collision at $H_k$, move to $H_{k+n}$ where $n\in\mathbb{N}$ is the index that does not cause any more collision. 
* Pros
    * Linear probing requires less memory.

* Cons
    * Cluster tend to generate a lot of collisions
    * It may not be the most efficent solutions since it may take $O(n)$

**Closed Hashing-Quadratic Probing** <br/>
Let $H_k$ where k = Key \% H. Suppose there is a collision at $H_k$, move to $H_{k} + n^2$ where $n\in\mathbb{N}$ is the index that does not cause any more collision. 
* Pros
    * Less likely to have the problem of primary clustering 
* Cons
    * Possible that such table could get stuck in an infinite loop

**Closed Hashing-Double Hashing**<br/>
Let $H_k$ where k = Key \% H and $H' = p -$ (key \% $H$) where $p$ is a prime number. In other words, we have two different hash functions. Suppose a collision occurs at $H_k$, move to $H_k + H' \cdot n$ where $n\in\mathbb{N}$ is the index that does not cause any more collision.
* Pros
    * Produces an uniform distribution of records throughout a hash table. It is one of the most effective method for resolving collisions
    * Does not yield any clusters
* Cons
    * As the table fills up, it may cause thrashing where the performance degrades

**Hash Table vs Hash Map vs Hash Set**<br/>
Java's _Set_ and _Map_ interfaces are two very different collection types.

_Set_: A collection of distinct (non-equal) objects, with no other structure.

_Map_: A mapping from a set of objects (the distinct keys) to a collection of objects (the values).

Hashtable and HashMap both implement Map. HashSet implements Set. They all use hash codes for keys/objects.

Hashtable is a legacy class that almost always should be avoided in favor of HashMap. They do essentially the same thing, except most methods in Hashtable are synchronized, making individual method calls thread-safe.1 You have to provide your own synchronization or other thread safety mechanism if you are using multiple threads and HashMap.
****
## $ ArrayList & Resizable Arrays
****
## $ StringBuilder