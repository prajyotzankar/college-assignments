// Selection Sort

#include <stdio.h>


int main(){

    int size , i , j , min ,min_location , temp , swaps = 0 , steps = 0 , comp = 0 ;
    printf("Enter the size of array : ");
    scanf("%d" , &size);

    int array_num[size];

    printf("Enter the array elements \n");
    for(i = 0 ; i < size ; i++)
        scanf("%d" , &array_num[i]);
    
    

    for(i = 0 ; i < size ; i++){
        min_location = i;
        for(j = i + 1 ; j < size ; j++){
            comp++;
            if( array_num[j] < array_num[min_location]){
                min_location = j;
            } 
        }
        if(i != min_location){
            temp = array_num[i];
            array_num[i] = array_num[min_location];
            array_num[min_location] = temp;
            swaps++;
            printf("in");
        }
       
        steps++;
        
    }

    printf("Sorted array elements are \n");
    for(i = 0 ; i < size ; i++)
        printf("%d " , array_num[i]);
    
    printf("\n");
    printf("No of ->\nSwaps : %d \nComparisions : %d \nSteps : %d \n", swaps , comp , steps);



    return 0;
}