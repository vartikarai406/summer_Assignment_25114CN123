#include <stdio.h>
#include <string.h>

struct Book {
    int id;
    char name[50];
    char author[50];
    int issued;
};

int main() {

    struct Book b[50];
    int n,i,choice,id;

    printf("Enter number of books: ");
    scanf("%d",&n);

    for(i=0;i<n;i++) {
        printf("\nBook ID: ");
        scanf("%d",&b[i].id);

        printf("Book Name: ");
        scanf("%s",b[i].name);

        printf("Author: ");
        scanf("%s",b[i].author);

        b[i].issued=0;
    }


    do {

        printf("\n\n--- Library System ---");
        printf("\n1.Display Books");
        printf("\n2.Issue Book");
        printf("\n3.Return Book");
        printf("\n4.Exit");

        printf("\nChoice:");
        scanf("%d",&choice);


        if(choice==1) {

            for(i=0;i<n;i++)
            printf("\n%d %s %s %s",
            b[i].id,
            b[i].name,
            b[i].author,
            b[i].issued?"Issued":"Available");
        }


        else if(choice==2) {

            printf("Book ID:");
            scanf("%d",&id);

            for(i=0;i<n;i++)
            if(b[i].id==id)
                b[i].issued=1;
        }


        else if(choice==3) {

            printf("Book ID:");
            scanf("%d",&id);

            for(i=0;i<n;i++)
            if(b[i].id==id)
                b[i].issued=0;
        }

    }while(choice!=4);


    return 0;
}