//Name:Shahroz Imtiaz
//Email ID:si6rf
//File Name:ListItr.cpp
//Date:9/9/2018

#include "ListItr.h"

ListItr::ListItr(){			//Constructor
  this->current = NULL;
}
ListItr::ListItr(ListNode* theNode){	// One parameter constructor
  this->current = theNode;
}
bool ListItr::isPastEnd() const{	//Returns true if past end position in list, else false
  if(current->next == NULL){
    return true;
  }
  else return false;
}
bool ListItr::isPastBeginning() const{//Returns true if past first position in list, else false
  if(current->previous == NULL){
    return true;
  }
  else  return false;
}
void ListItr::moveForward(){	//Advances current to next position in list
  if(current->next == NULL){
  }
  else current = current->next;
}
void ListItr::moveBackward(){	//Moves current back to previous position in list (unless already past beginning of list)
  if(current->previous == NULL){
  }
  else current = current->previous;
}
int ListItr:: retrieve() const{	//Returns item in current position
  ListNode* temp = this->current;
  return temp->value;
}

