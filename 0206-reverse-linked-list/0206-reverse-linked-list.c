/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
    if(head == NULL)
        return head;
    if(head->next == NULL)
        return head;
    
    struct ListNode *t, *r;
    r = (struct ListNode*)malloc(sizeof(struct ListNode));
    r->next = NULL;
    r->val=head->val;
    head = head->next;
    for(;head!=NULL;head=head->next)
    {
    t = (struct ListNode*)malloc(sizeof(struct ListNode));
    t->next = r;
    t->val=head->val;
    r=t;
    

    }
    return r;
}