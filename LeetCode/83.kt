class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        var ptr = head
        var cur = head.next
        while (cur != null) {
            if (ptr!!.`val` != cur!!.`val`) {
                ptr.next = cur
                ptr = cur
            }

            cur = cur.next
        }

        ptr!!.next = null

        return head
    }
}