package collectionpackage;
//If we want to represent a group of individual objects as a single entity then we should go for collection.
//it is presented in the java.util. package
//collections are growable in nature, that is based on our requirement we can increase or decrease the size.
//collections can hold both homogeneous and heterogeneous elements.
//every collection class is implemented based on some standard data structure. hence for every requirement ready-made methods are available.
//--being a programmer, we are responsible to use those methods and we are not responsible to implement those methods.
//If we know the size of the data structure it is better to go for array, rather than collection.
//we can only use collection with objects. we cannot use then with primitive values.

//the key interfaces of collection framework.
/*
1.Collection.(1.2)
2.List(1.2)
3.Set(1.2)
4.SortedSet
5.navigableSet
6.queue
7.dequeue.
8.map
9.sortedMap.
10.navigableMap

In general collection interface is considered as root interface of collection framework.
collection interface defines the most common methods which are applicable for any collection object.
** there is no concrete class which implements collection interface directly.
 ***************************1.LIST(1.2)*********************

 1.It is the child interface of collection interface.
 2.If we want to represent a group of individual objects as a single entity where a duplicates are allowed and insertion order
   must be preserved, then we should go for lists.
 3.ArrayList(1.2) ans LinkedList(1.2) and Vector(1.0) and Stack(1.0) are the child classes are the list interfaces.
 4.vector and stack classes are considered as the legacy classes. But in 1.2 version vector and stack classes are modified to
   implement list interface.


*****************************2.Set(1.2) ********************

1.It is the child interface of collection.
2.If we want to represent a group of individual objects as a single entity. where duplicates are not allowed and insertion
  order not required then we should go for set interface.
3.HashSet(1.2) and LinkedHashSet(1.4) are the child classes of set interface.
4.SortedSet(1.2) is the interface that implements the set interface.
5.If we want the set objects to be inserted in some sorting order then we can go for SortedSet.
6.NavigableSet(1.6) is the child interface of sortedSet. It contains several methods for navigable purposes.
7.TreeSet(1.2) is the child class of Navigable interface.


****************************3.QUEUE(1.5) ***********************

1.It is the child interface of collection.
2.If we want to represent a group of individual objects prior to processing then we should go for queue.
3.usually queue follow first in first out order but bases  on our requirement. we can implement our own priority order also.
4.example : before sending a mail. all mail id's we have to store in some data structure. In which order we added mail id's
  In the same order only mail should be  delivered. for this requirement queue is best choice.
5.priorityQueue and BlockingQueue, PriorityBlockingQueue and LinkedBlockingQueue are the classes of the queue interface.


*****************************4.MAP(1.2) ******************************

1.If we want to represent a group of objects as key value pair then we should go for Map interface.
2.In Map interface duplicate Keys are not allowed but duplicate values can be allowed.
3.If we try to enter duplicate key then old one is replaced.
4.HashMap(1.2) is the child class of Map interface and LinkedHashMap(1.4) is the child class of HashMap.
5.WeakHashMap(1.2) and IdentityHashMap(1.4) are the direct classes of Map interface.
6.Hashtable(1.0) is a class that implements Map interface and Dictionary abstract class.
7.Properties(1.0) is the child class of hashtable.
8.sortedMap is the child interface of map. If we want to represent a group of key value pairs according to some **sorting order of
  keys** then we should go for sorted map.
9.In sorted map the sorting should be based on key but not based on value.
10.NavigableMap(1.6) is the child interface of sorted map. It is for navigation
11.TreeMap(1.2) is the child class of Navigable map.

 */
