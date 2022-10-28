#include <stdio.h>

int main(){

    int size, ele_to_search, flag, choice, low = 0, high = 0, mid = 0;

    printf("Enter no of elements in array : ");
    scanf("%d" , &size);

    int array_num[size];
    
    printf("Enter array elements in sorted order \n");
    for(int i = 0 ; i < size ; i++){
        scanf("%d" , &array_num[i]);
    }
    fflush(stdin);

    printf("1 - > Search \n");
    printf("0 -> Exit \n");
    printf("Enter choice : ");
    scanf("%d", &choice);
    while(choice){
        flag = 0;
        printf("Enter an element to search : ");
        scanf("%d" , &ele_to_search);

        high = size-1;
        while( low <= high ){
                mid = (high + low)/2;
                if(array_num[mid] < ele_to_search){
                    low = mid + 1;
                }

                else if(array_num[mid] == ele_to_search){
                    printf("Element is found at %d index \n" , mid);
                    flag = 1;
                    break;
                }

                else{
                    high = mid - 1;
                }
        }

        
        if(flag == 0)
            printf("The element not found \n");

        printf("\n");
        printf("Enter choice : ");
        scanf("%d", &choice);

    }
    return 0;
}