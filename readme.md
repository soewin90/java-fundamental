##MyanmarFullStackDeveloper###
                                         
                                         
###Equals & Hash Code Contract 

##### If two Objects are equal according to the Equals(Object o) method then the hash code for both the object must be the same(integer value).

##### Its not necessary that if you have same hash code for 2 objects means those two object are equal. This is collision. Better hash function prevents this.

##### Whenever it is invoked on the same object more than once during an execution of a Java Application, the hashCode method must consistently return the same integer.