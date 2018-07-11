#include<stdio.h>
#include<conio.h>

void insertAtBeginning();
void insertAtEnd();
void insertAfter(int);
void deleteBeginning();
void deleteEnd();
void deleteSpecific(int);
void display();


struct Node
{
   int data;
   struct Node *previous, *next;
};


struct Node *head = NULL;

int choice1, choice2, value,n, location;


void main()
{

   clrscr();

   while(1)
   {
      printf("\n__Main MENU__\n");
      printf("\n1. Insert\n2. Delete\n3. Display\n4. Exit\nEnter your choice: ");
      fflush(stdin);
      scanf("%d",&choice1);

      switch(choice1)
      {
	 case 1:
		 while(1)
		 {

	printf("\n\t\t\t **Insert SubMenu** ");
d	printf("\n\t\t1. At Beginning\n\t\t2. At End\n\t\t3. After a Node\n\t\t4. Return To Main Menu \n\tEnter your choice: ");
	fflush(stdin);
	scanf("%d",&choice2);

	switch(choice2)
	    {
	       case 1:  insertAtBeginning();
			break;
	       case 2: 	insertAtEnd();
			break;
	       case 3: 	printf("\nEnter the location after which you want to insert: ");
			fflush(stdin);
			scanf("%d",&location);
			insertAfter(location);
			break;
	       case 4: 	goto EndSwitch;
		       default: printf("\nPlease select correct Inserting option!!!\n");
	    }
	 }

    case 2: while(1)
		 {
	printf("\n **Delete SubMenu**\n");
	printf("\n1. At Beginning\n2. At End\n3. Specific Node\n4. Return to Main Menu\nEnter your choice: ");
	fflush(stdin);
	scanf("%d",&choice2);
	switch(choice2)
	    {
	      case 1: 	deleteBeginning();
			break;
	      case 2: 	deleteEnd();
			break;
	      case 3: 	printf("Enter the Node value to be deleted: ");
			fflush(stdin);
			scanf("%d",&location);
			deleteSpecific(location);
			break;
	      case 4:	goto EndSwitch;
	      default: printf("\nPlease select correct Deleting option!!!\n");
	    }
	 }

	  EndSwitch: break;

	 case 3: display();
		 break;

	 case 4: exit(1);

	 default: printf("\nPlease select correct option!!!");
      }
   }
}



void insertAtBeginning()
{
    struct Node *newNode;
    newNode = (struct Node*)malloc(sizeof(struct Node));
    printf("Enter the value to be inserted: ");
    fflush(stdin);
    scanf("%d",&value);

    newNode -> data = value;
    newNode -> previous = NULL;
    if(head == NULL)
    {
       newNode -> next = NULL;
       head = newNode;
    }
    else
    {
       newNode -> next = head;
       head = newNode;
    }
     printf("\n %d Value Inserted ",value);

}


void insertAtEnd()
{
   struct Node *newNode;
   newNode = (struct Node*)malloc(sizeof(struct Node));
   printf("Enter the value to be inserted: ");
   fflush(stdin);
   scanf("%d",&value);

   newNode -> data = value;
   newNode -> next = NULL;
   if(head == NULL)
   {
      newNode -> previous = NULL;
      head = newNode;
   }
   else
   {
      struct Node *temp = head;
      while(temp -> next != NULL)
	 temp = temp -> next;
      temp -> next = newNode;
      newNode -> previous = temp;
   }
   printf("\n %d Value Inserted ",value);
}



void insertAfter(int location)
{
   struct Node *newNode;

   newNode = (struct Node*)malloc(sizeof(struct Node));
   printf("Enter the value to be inserted: ");
   fflush(stdin);
   scanf("%d",&value);

   newNode -> data = value;

   if(head == NULL)
   {
      newNode -> previous = newNode -> next = NULL;
      head = newNode;
   }
   else
   {
      struct Node *temp1 = head, *temp2;

      while(temp1 -> data != location)
      {
	 if(temp1 -> next == NULL)
	 {
	    printf("Given node is not found ");
	    goto EndFunction;
	 }
	 else
	 {
	    temp1 = temp1 -> next;
	 }
      }

      temp2 = temp1 -> next;

      temp1 -> next = newNode;

      newNode -> previous = temp1;
      newNode -> next = temp2;

      temp2 -> previous = newNode;

      printf("\n %d Value Inserted ",value);

   }

   EndFunction:
}




void deleteBeginning()
{
   if(head == NULL)
      printf("List is Empty");
   else
   {
      struct Node *temp = head;

      n=temp->data;

      if(temp -> previous == temp -> next)
      {
	 head = NULL;
	 free(temp);
      }
      else{
	 head = temp -> next;
	 head -> previous = NULL;
	 free(temp);
      }
      printf("\n %d node Deleted ",n);
   }
}



void deleteEnd()
{
   if(head == NULL)
      printf("List is Empty.");
   else
   {
      struct Node *temp = head;

      if(temp -> previous == temp -> next)
      {
	 n=temp -> data;
	 head = NULL;
	 free(temp);
      }
      else{
	 while(temp -> next != NULL)
	    temp = temp -> next;

	    n=temp -> data;

	 temp -> previous -> next = NULL;
	 free(temp);
      }

      printf("\n %d node Deleted ",n);

   }
}


void deleteSpecific(int delValue)
{
   if(head == NULL)
      printf("List is Empty!!! Deletion not possible!!!");
   else
   {
      struct Node *temp = head;

      while(temp -> data != delValue)
      {
	 if(temp -> next == NULL)
	 {
	    printf("\nGiven node is not found in the list!!!");
	    goto FuctionEnd;
	 }
	 else
	 {
	    temp = temp -> next;
	 }

      }

      if(temp == head)
      {
	 head = NULL;
	 n=temp -> data;

	 free(temp);
      }
      else
      {
	 temp -> previous -> next = temp -> next;
	 n=temp -> data;

	 free(temp);
      }
      printf("\n %d node Deleted");
   }
   FuctionEnd:
}

void display()
{
   if(head == NULL)
      printf("\nList is Empty!!!");
   else
   {
      struct Node *temp = head;
      printf("\nList elements are: \n");
      printf("\n NULL <--- ");
      while(temp -> next != NULL)
      {
	 printf("%d <===> ",temp -> data);
	 temp=temp -> next;
      }
      printf("%d---> NULL\n",temp -> data);
   }
}