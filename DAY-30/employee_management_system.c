#include <stdio.h>
#include <string.h>

struct Employee {
    int id;
    char name[50];
    char dept[50];
    float salary;
};


int main(){

    struct Employee e[50];

    int n,i,choice,id;


    printf("Enter employees:");
    scanf("%d",&n);


    for(i=0;i<n;i++){

        printf("\nID:");
        scanf("%d",&e[i].id);

        printf("Name:");
        scanf("%s",e[i].name);

        printf("Department:");
        scanf("%s",e[i].dept);

        printf("Salary:");
        scanf("%f",&e[i].salary);
    }


    do{

        printf("\n--- Employee Management ---");
        printf("\n1.Display");
        printf("\n2.Search");
        printf("\n3.Exit");

        scanf("%d",&choice);


        if(choice==1){

            for(i=0;i<n;i++)
            printf("\n%d %s %s %.2f",
            e[i].id,
            e[i].name,
            e[i].dept,
            e[i].salary);
        }


        else if(choice==2){

            printf("Enter ID:");
            scanf("%d",&id);

            for(i=0;i<n;i++)
            {
                if(e[i].id==id)
                {
                    printf("%s %.2f",
                    e[i].name,
                    e[i].salary);
                }
            }
        }


    }while(choice!=3);


    return 0;
}