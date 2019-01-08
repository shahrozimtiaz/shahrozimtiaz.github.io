//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name: linkedlist.c
//Date:11/29/2018
#include <stdio.h>
#include <stdlib.h>
struct listNode{
	struct listNode *next;
	int datum;
} *listNode_input;
struct list {
	struct listNode *head, *tail;
};
void printList(struct listNode* head, int size){
	listNode_input=head; //itr, will now be used for printing
	for(int i=1;i<=size;i++){
		listNode_input=listNode_input->next;
		printf("%d\n",listNode_input->datum);
	}
}
int main(){
	int size;
	printf("How many items would you like to input: ");
	scanf("%d", &size);
	struct list* myList = (struct list*) malloc(sizeof(struct list*));
	myList->head = (struct listNode*) malloc(sizeof(struct listNode));
	myList->tail = myList->head;
	for(int i=1;i<=size;i++){
		int value;
		printf("Enter value %d : ",i);
		scanf("%d",&value);
		listNode_input = (struct listNode*) malloc(sizeof(struct listNode));
		listNode_input->datum=value;
		myList->tail->next = (struct listNode*) malloc(sizeof(struct listNode));
		myList->tail->next = listNode_input;
		myList->tail=myList->tail->next;
	}
	printList(myList->head, size);
	free(myList);
	return 0;
}