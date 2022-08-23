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
* Open Hashing
    * Chaining
* Closed Hashing
    * Linear Probing
    * Quadratic Probing
    * Double Hashing

**Open Hashing-Chaining**: <br/>
**Closed Hashing-Linear Probing**: <br/>
**Closed Hashing-Quadratic Probing**: <br/>
**Closed Hashing-Double Hashing**: <br/>
**Hash Table vs Hash Map vs Hash Set**:
****
## $ ArrayList & Resizable Arrays
****
## $ StringBuilder