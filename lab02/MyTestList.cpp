#include <iostream>
#include <string>
#include <ctype.h>
#include <stdlib.h>
using namespace std;

//Make sure your own files for the List and ListItr
//classes are included here.  These are the names I used.
#include "List.h"
#include "ListItr.h"

int   main ()
/*
**  This main driver program interactively exercises a
**   list package.
**  It assumes a linked list implementation, and its real
**   purpose is to exercise the underlying list manipulation
**   procedures.
**  It uses a menu to accept commands from the terminal,
**   then performs the indicated command.
*/
{
  int      command;
  string   response;
  List     *list = NULL;
  ListItr  *itr = NULL;
  
  if (list != NULL) delete list;
  list = new List;

  cout << "\tYou have created an empty list\n";
  cout << "\tDo you want to initialize it with elements? (y/n) > ";
  cin  >> response;

  if (response[0] != 'y' && response[0] != 'Y'){
    cout << "invalid input" <<endl;
    return 1;
  }
  // accept elements
  cout << "\t\tEnter elements one by one as integers.\n";
  cout << "\t\tAny non-numeric character, e.g. #, ";
  cout << "will terminate input\n";

  cout << "\tEnter first element: ";
  cin >> response;

  while (isdigit(response[0])) {
    int element = atoi(response.c_str());
    list->insertAtTail(element);

    cout << "\tEnter next element: ";
    cin >> response;
  }

  cout << endl << "The elements in forward order: " << endl;
  printList(*list, true);
  
}