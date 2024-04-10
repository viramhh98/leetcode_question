function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val);
    this.next = (next === undefined ? null : next);
}

var reverseList = function(head) {
    return reverseListRecursive(head, null);
};

function reverseListRecursive(current, prev) {
    if (current === null) {
        return prev;
    }
    
    const nextNode = current.next;
    current.next = prev;
    return reverseListRecursive(nextNode, current);
}