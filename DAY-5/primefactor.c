#include <stdio.h>

int main() {
    int n, largestPrime = -1;

    printf("Enter a number: ");
    scanf("%d", &n);

    while(n % 2 == 0) {
        largestPrime = 2;
        n /= 2;
    }

    for(int i = 3; i * i <= n; i += 2) {
        while(n % i == 0) {
            largestPrime = i;
            n /= i;
        }
    }

    if(n > 2)
        largestPrime = n;

    printf("Largest Prime Factor = %d", largestPrime);

    return 0;
}