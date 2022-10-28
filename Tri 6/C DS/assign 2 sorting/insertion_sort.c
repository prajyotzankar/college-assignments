// Insertion Sort

#include <stdio.h>


int main(){

    int size , i , j , element ,swaps = 0 , steps = 0 , comp = 0 ;
    printf("Enter the size of array : ");
    scanf("%d" , &size);

    int array_num[size];

    printf("Enter the array elements \n");
    for(int i = 0 ; i < size ; i++)
        scanf("%d" , &array_num[i]);
    
    for(i = 1 ; i < size ; i++){
        element = array_num[i];
        j = i - 1;
        while(element < array_num[j] && j >= 0){
            array_num[j+1] = array_num[j];
            j--;
            swaps++;
            comp++;
        }
        array_num[j+1] = element;
        swaps++;
        steps++;
    }

    printf("Sorted array elements are \n");
    for(int i = 0 ; i < size ; i++)
        printf("%d " , array_num[i]);

    printf("\n");
    printf("No of ->\nSwaps : %d \nComparisions : %d \nSteps : %d \n", swaps , comp , steps);



    return 0;
}