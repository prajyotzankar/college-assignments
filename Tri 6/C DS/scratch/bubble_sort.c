//Bubble Sort 

#include <stdio.h>

int main(){

    int size , swaps = 0 , steps = 0 , comp = 0 , swapped = 0;
    printf("Enter the size of array : ");
    scanf("%d" , &size);

    int array_num[size];

    printf("Enter the array elements \n");
    for(int i = 0 ; i < size ; i++)
        scanf("%d" , &array_num[i]);
    
    for(int i = 0 ; i < size ; i++){
        for(int j = 0 ; j < size - i -1 ; j++){
            swapped = 0;
            if(array_num[j+1] < array_num[j]){
                array_num[j+1] = array_num[j+1] + array_num[j];
                array_num[j] = array_num[j+1] - array_num[j];
                array_num[j+1] = array_num[j+1] - array_num[j];
                swaps++;
                swapped = 1;
            }
            comp++;
            
        }
	steps++;
        if(swapped == 0)
                break;        
    }

    printf("Sorted array elements are \n");
    for(int i = 0 ; i < size ; i++)
        printf("%d " , array_num[i]);
    printf("\n");
    printf("No of ->\nSwaps : %d \nComparisions : %d \nSteps : %d \n", swaps , comp , steps);


    return 0;
}