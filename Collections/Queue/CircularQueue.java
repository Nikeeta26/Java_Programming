A Circular Queue in Java is a type of queue where the last
 position is connected back to the first position, 
 making the queue circular. This allows efficient use of space by 
 reusing previously occupied positions when elements are dequeued.

Key Points:
Fixed Size: Operates within a fixed capacity, ensuring no wasted space.

Efficient Use of Space: After the last position is reached,
 the queue wraps around to use the first position if available.

Two Pointers: It uses two pointers:
Front: Tracks the front element.
Rear: Tracks the last element added.

Full and Empty Conditions:
The queue is full when the next position of rear is front.
It is empty when front equals -1.

O(1) add
O(1) remove
O(1) peek