//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:List.cpp
//Date:9/9/2018

#include "List.h"
using namespace std;

List::List(){ //Constructor
  head=new ListNode;
  tail=new ListNode;
  head->next=tail;
  tail->previous=head;
  count=0;
}
List::List(const List& source){ //Copy Constructor
  head=new ListNode;
  tail=new ListNode;
  head->next=tail;
  tail->previous=head;
  count=0;
  ListItr iter(source.head->next);
  while (!iter.isPastEnd()) {       // deep copy of the list
    insertAtTail(iter.retrieve());
    iter.moveForward();
  }
}
  
List::~List(){ //Destructor
  ListItr iter(head->next);
  
  while(!iter.isPastEnd()){
    ListNode *current = iter.current;
    iter.moveForward();
    delete current;

  }
  delete head;
  delete tail;
  
}
List& List::operator=(const List& source){	//Equals Operator;
  if (this == &source)
    return *this;
  else {
    makeEmpty();
    ListItr iter(source.head->next);
    while (!iter.isPastEnd()) {
      insertAtTail(iter.retrieve());
      iter.moveForward();
    }
  }
  return *this;
}
bool List::isEmpty() const{		//Returns true if empty; else false
  if(head->next == tail){
    return true;
  }
  else return false;
}
void List::makeEmpty(){	//Removes all items except blank head and tail
  ListItr iter(head->next);
  
  while(!iter.isPastEnd()){
    ListNode *current = iter.current;
    iter.moveForward();
    delete current;

  }
  head->next = tail;
  tail->previous = head;
}
ListItr List::first(){ 		//Returns an iterator that points to
  return head->next;
}
//the ListNode in the first position
ListItr List::last(){			//Returns an iterator that points to
                                        //the ListNode in the last position
  return tail->previous;
}
void List::insertAfter(int x, ListItr position){// need to revise
  ListNode *current = position.current;
  
  if(current->next == NULL){
    cout << "The ListItr is past the end. Move backward to insert after." << endl;
  }
  else{
    ListNode *temp = new ListNode;
    ListNode *temp2 = current->next;
  
    temp->value = x;
    temp->next = temp2;
    temp2->previous=temp;
    current->next = temp;
    temp->previous = current;
  }
}
void List::insertBefore(int x, ListItr position){//need to revise
  ListNode *current = position.current;

  if(current->previous == NULL){
    cout << "The ListItr is past the beginning. Move forward to insert before." << endl;
  }
  else{
    ListNode *temp = new ListNode;
    ListNode *temp2 = current->previous;

    temp->value = x;
    temp2->next = temp;
    temp->previous = current->previous;
    temp->next = current;
    current->previous = temp;
  }
}
void List::insertAtTail(int x){	//Insert x at tail of list
  ListNode *temp = new ListNode;
  temp->value = x;
  if(tail->previous != NULL){
    ListNode *temp2 = tail->previous;
    temp2->next = temp;
    temp->previous = temp2;
    temp->next=tail;
    tail->previous=temp;
  }
  else{
    tail->previous=temp;
    temp->next=tail;
  }
  
}
void List::remove(int x){	//Removes the first occurrence of x
  ListItr iter(first());
  while(!iter.isPastEnd()){
    if( iter.retrieve() == x){
      ListNode *temp1 = iter.current;
      ListNode *temp2 = temp1->previous;
      temp2->next = temp1->next;
      ListNode *temp3 = temp1->next;
      temp3->previous = temp1->previous;
      delete temp1;
      break;
    }
    iter.moveForward();
  }
}
ListItr List::find(int x){	//Returns an iterator that points to
  // the first occurrence of x, else return a iterator to the dummy tail node
  ListItr iter(head);
  while(!iter.isPastEnd()){
    if( iter.retrieve() == x){
      ListNode *current = iter.current;
      return current;
    }
    iter.moveForward();
  }
  cout << "Element is not in the list. ListItr is now at tail..." << endl;
  return tail;
}
int List::size() const{ //Returns the number of elements in the list
  int count = 0;
  if(isEmpty()){
    return count;
  }
  else{
    ListItr iter(head->next);
    while(!iter.isPastEnd()){
      count++ ;
      iter.moveForward();
    }
    return count;
  }
}
void printList(List& source, bool direction){

  if(source.isEmpty()){
    cout <<"List is empty"<<endl;
  }
  else if(!direction){
    ListItr iter(source.last());
    while(!iter.isPastBeginning()){
      cout << "value:" << iter.retrieve() << endl;
      iter.moveBackward();
    }
  }
  else{
    ListItr iter(source.first());
    while(!iter.isPastEnd()){
      cout << "value:" << iter.retrieve() << endl;
      iter.moveForward();
    }
  }
 
//prints list forwards when direction is true
//or backwards when direction is false
}
