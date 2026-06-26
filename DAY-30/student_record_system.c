#include <stdio.h>
#include <string.h>

#define MAX 100

struct Student {
    int roll;
    char name[50];
    char course[50];
    float marks;
};

int main() {
    struct Student s[MAX];
    int n, i, choice, roll;

    printf("Enter number of students: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++) {
        printf("\nEnter Roll No: ");
        scanf("%d", &s[i].roll);

        printf("Enter Name: ");
        scanf("%s", s[i].name);

        printf("Enter Course: ");
        scanf("%s", s[i].course);

        printf("Enter Marks: ");
        scanf("%f", &s[i].marks);
    }

    do {
        printf("\n--- Student Record System ---");
        printf("\n1. Display All");
        printf("\n2. Search Student");
        printf("\n3. Exit");
        printf("\nEnter choice: ");
        scanf("%d", &choice);

        switch(choice) {

        case 1:
            for(i = 0; i < n; i++) {
                printf("\nRoll: %d", s[i].roll);
                printf("\nName: %s", s[i].name);
                printf("\nCourse: %s", s[i].course);
                printf("\nMarks: %.2f\n", s[i].marks);
            }
            break;

        case 2:
            printf("Enter Roll No: ");
            scanf("%d",&roll);

            for(i=0;i<n;i++) {
                if(s[i].roll == roll) {
                    printf("Found: %s %.2f",s[i].name,s[i].marks);
                }
            }
            break;

        case 3:
            printf("Exit");
            break;
        }

    } while(choice != 3);

    return 0;
}