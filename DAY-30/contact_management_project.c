#include <stdio.h>
#include <string.h>

#define MAX 100


struct Contact {

    char name[50];
    char phone[20];

};


void addContact(struct Contact c[], int *n)
{
    printf("Name:");
    scanf("%s",c[*n].name);

    printf("Phone:");
    scanf("%s",c[*n].phone);

    (*n)++;

    printf("Contact Added\n");
}


void display(struct Contact c[], int n)
{
    int i;

    for(i=0;i<n;i++)
    {
        printf("\nName:%s",c[i].name);
        printf("\nPhone:%s\n",c[i].phone);
    }
}


void search(struct Contact c[], int n)
{
    char name[50];
    int i;

    printf("Enter name:");
    scanf("%s",name);


    for(i=0;i<n;i++)
    {
        if(strcmp(c[i].name,name)==0)
        {
            printf("Found %s %s",
            c[i].name,
            c[i].phone);
        }
    }
}



int main()
{

    struct Contact c[MAX];

    int n=0;
    int choice;


    do{

        printf("\n\n--- Contact Management ---");
        printf("\n1.Add Contact");
        printf("\n2.Display");
        printf("\n3.Search");
        printf("\n4.Exit");

        printf("\nChoice:");
        scanf("%d",&choice);


        switch(choice)
        {
            case 1:
            addContact(c,&n);
            break;


            case 2:
            display(c,n);
            break;


            case 3:
            search(c,n);
            break;


            case 4:
            printf("Exit");
        }


    }while(choice!=4);


    return 0;
}