
public void addFirst(int val) {
      // write your code here
        Node node = new Node();
      node.data = val;
      node.next = head;
      if (size == 0)
      {
        tail = node;
      }
      head = node;
      size++;
}

// -------------------------------
public void addFirst(int val) {
    // write your code here
    Node node = new Node(val);
    if(this.size == 0){
        this.head = this.tail = node;
    } else {
      node.next = this.head;
      this.head = node;
    }

    this.size++;
  }
}