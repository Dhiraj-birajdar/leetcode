/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    int c=0,s,i;
    struct ListNode *r=NULL,*t;
    for(int i=1; l1!=NULL || l2!=NULL ;)
    {   
        s = c + (l1?l1->val:0)+(l2?l2->val:0);
        c = s/10, s%=10; 
        // printf("%d  ",s);

    // if(s==0)
    // {
    //     l1 = (struct ListNode*)malloc(sizeof(struct ListNode));
    //     l1->next = NULL;
    //     l1->val=s;
    //     return l1;
    // }
    // else
    // {
        if(r==NULL)
        {
        r = (struct ListNode*)malloc(sizeof(struct ListNode));
        r->next = NULL;
        r->val = s;
        t=r;
        // printf("%d",r->val);
        }
        else
        {
        t->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        t->next->next = NULL;
        t->next->val = s;
        t=t->next;
        // printf("%d ",t->val);
        }
    // }
    if(l1)
        l1=l1->next;
    if(l2)
        l2=l2->next;

    }
    if(c>0)
    {
        t->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        t->next->next = NULL;
        t->next->val = c;
    }
 
    return r;
}