#include <stdio.h>

struct Product {
    int id;
    char name[50];
    int quantity;
    float price;
};

int main() {

    struct Product p[100];
    int choice, n=0, i, id;

    do {

        printf("\n--- Inventory Menu ---\n");
        printf("1. Add Product\n");
        printf("2. Display Products\n");
        printf("3. Search Product\n");
        printf("4. Exit\n");

        printf("Enter choice: ");
        scanf("%d",&choice);

        switch(choice) {

        case 1:
            printf("Enter ID: ");
            scanf("%d",&p[n].id);

            printf("Enter Name: ");
            scanf("%s",p[n].name);

            printf("Enter Quantity: ");
            scanf("%d",&p[n].quantity);

            printf("Enter Price: ");
            scanf("%f",&p[n].price);

            n++;

            printf("Product Added");
            break;


        case 2:
            for(i=0;i<n;i++) {
                printf("\nID: %d",p[i].id);
                printf("\nName: %s",p[i].name);
                printf("\nQuantity: %d",p[i].quantity);
                printf("\nPrice: %.2f\n",p[i].price);
            }
            break;


        case 3:
            printf("Enter ID: ");
            scanf("%d",&id);

            for(i=0;i<n;i++) {

                if(p[i].id==id) {
                    printf("Product Found\n");
                    printf("Name: %s\n",p[i].name);
                    printf("Quantity: %d\n",p[i].quantity);
                    printf("Price: %.2f\n",p[i].price);
                }
            }
            break;


        case 4:
            printf("Exit");
            break;


        default:
            printf("Invalid choice");
        }

    } while(choice!=4);


    return 0;
}