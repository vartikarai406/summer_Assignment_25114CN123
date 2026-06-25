#include <stdio.h>

int main() {

    int arr[100], n, choice, i, value, pos;

    printf("Enter size of array: ");
    scanf("%d",&n);

    printf("Enter elements:\n");
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);

    do {
        printf("\n--- Array Menu ---\n");
        printf("1. Display\n");
        printf("2. Insert\n");
        printf("3. Delete\n");
        printf("4. Search\n");
        printf("5. Exit\n");

        printf("Enter choice: ");
        scanf("%d",&choice);

        switch(choice) {

        case 1:
            for(i=0;i<n;i++)
                printf("%d ",arr[i]);
            break;

        case 2:
            printf("Enter position and value: ");
            scanf("%d%d",&pos,&value);

            for(i=n;i>pos;i--)
                arr[i]=arr[i-1];

            arr[pos]=value;
            n++;
            break;

        case 3:
            printf("Enter position: ");
            scanf("%d",&pos);

            for(i=pos;i<n-1;i++)
                arr[i]=arr[i+1];

            n--;
            break;

        case 4:
            printf("Enter value: ");
            scanf("%d",&value);

            for(i=0;i<n;i++) {
                if(arr[i]==value)
                    printf("Found at index %d",i);
            }
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