#include <stdio.h>
#include <string.h>

int main() {

    char str[100], rev[100];
    int choice, i, len;

    printf("Enter string: ");
    gets(str);

    do {

        printf("\n--- String Menu ---\n");
        printf("1. Length\n");
        printf("2. Reverse\n");
        printf("3. Copy\n");
        printf("4. Compare\n");
        printf("5. Exit\n");

        printf("Enter choice: ");
        scanf("%d",&choice);

        switch(choice) {

        case 1:
            printf("Length = %lu", strlen(str));
            break;

        case 2:
            len=strlen(str);

            for(i=0;i<len;i++)
                rev[i]=str[len-i-1];

            rev[len]='\0';

            printf("Reverse = %s",rev);
            break;

        case 3:
            strcpy(rev,str);
            printf("Copied string = %s",rev);
            break;

        case 4:
            if(strcmp(str,rev)==0)
                printf("Same string");
            else
                printf("Different string");
            break;

        case 5:
            printf("Exit");
            break;

        default:
            printf("Invalid choice");
        }

    } while(choice!=5);

    return 0;
}