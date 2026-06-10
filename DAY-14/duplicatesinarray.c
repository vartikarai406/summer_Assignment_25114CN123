#include <stdio.h>

int main() {
    int n;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter array elements: ");
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Duplicate elements are: ");

    int found = 0;

    for(int i = 0; i < n; i++) {
        int duplicate = 0;

        for(int k = 0; k < i; k++) {
            if(arr[i] == arr[k]) {
                duplicate = 1;
                break;
            }
        }

        if(duplicate)
            continue;

        int count = 1;

        for(int j = i + 1; j < n; j++) {
            if(arr[i] == arr[j])
                count++;
        }

        if(count > 1) {
            printf("%d ", arr[i]);
            found = 1;
        }
    }

    if(!found)
        printf("No duplicates");

    printf("\n");

    return 0;
}