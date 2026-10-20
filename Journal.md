# Phase 1

I created a Song class and a SinglyLinkedList that stores songs in connected nodes. Unlike an array, a linked list connects elements using references, allowing it to grow dynamically without needing a fixed size.

# Phase 2

I implemented an iterator to loop through the playlist and remove songs. Removing a node changes the previous node's next reference to skip the removed node. The iterator tracks its position to continue traversing the list correctly.

# Phase 3

I added methods to retrieve and insert songs by index. A linked list must traverse nodes to reach a position, while an array can access an index directly. Inserting into a linked list requires updating references, while an array may need to shift elements.