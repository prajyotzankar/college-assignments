#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct actor_details{
    int age , id , year;
    char name[20] , movie_name[20];
};

int main(){

    int i , j , option , no_of_actors , min_location;
    char min_str[20];

    printf("Enter no of actors : ");
    scanf("%d" , &no_of_actors);

    struct actor_details actor[no_of_actors] , temp;

    for(i = 0 ; i < no_of_actors ; i++){
        printf("Actor No. -> %d \n" , i+1);

        printf("Id : ");
        scanf("%d" , &actor[i].id);
        fflush(stdin);

        printf("Actor Name : ");
        fgets(actor[i].name , 20 , stdin);

        printf("Age : ");
        scanf("%d" , &actor[i].age);
        fflush(stdin);

        printf("Movie Name : ");
        fgets(actor[i].movie_name , 20 , stdin);

        printf("Year of release : ");
        scanf("%d" , &actor[i].year);
        fflush(stdin);

        printf("\n");
    }

    printf("1 -> Display details of all actors \n");
    printf("2 -> Display details sorted by name using selection sorting \n");
    printf("3 -> Display details sorted by releasing year using bubble sorting \n");
    printf("0 -> Exit \n");

    do{
        printf("Option : ");
        scanf("%d" , &option);

        switch(option){

            case 1 :    for(i = 0 ; i < no_of_actors ; i++){
                            printf("ID : %d \n" , actor[i].id);
                            printf("Actor Name : %s" , actor[i].name);
                            printf("Age : %d\n" , actor[i].age);
                            printf("Movie Name : %s" , actor[i].movie_name);
                            printf("Year of release : %d\n" , actor[i].year);
                            printf("\n");
                        }
                        break;

            case 2 :    for(i = 0 ; i < no_of_actors-1 ; i++){
                            min_location = i;
                            strcpy(min_str , actor[i].name);
                            for(j = i + 1 ; j < no_of_actors ; j++){
                                if(strcmp(min_str , actor[j].name) > 0){
                                    min_location = j;
                                    strcpy(min_str , actor[j].name);
                                } 
                            }
                            if(i != min_location){
                                temp = actor[i];
                                actor[i] = actor[min_location];
                                actor[min_location] = temp;
                            }
                        }

                        for(i = 0 ; i < no_of_actors ; i++){
                            printf("ID : %d \n" , actor[i].id);
                            printf("Actor Name : %s" , actor[i].name);
                            printf("Age : %d\n" , actor[i].age);
                            printf("Movie Name : %s" , actor[i].movie_name);
                            printf("Year of release : %d\n" , actor[i].year);
                            printf("\n");
                        }
                        break;

            case 3 :    for(i = 0 ; i < no_of_actors ; i++){
                            for(j = 0 ; j < no_of_actors - i - 1 ; j++){
                                if(actor[j+1].year < actor[j].year){
                                    temp = actor[i];
                                    actor[i] = actor[min_location];
                                    actor[min_location] = temp;
                                }
                            }
                        }

                        for(i = 0 ; i < no_of_actors ; i++){
                            printf("ID : %d \n" , actor[i].id);
                            printf("Actor Name : %s" , actor[i].name);
                            printf("Age : %d\n" , actor[i].age);
                            printf("Movie Name : %s" , actor[i].movie_name);
                            printf("Year of release : %d\n" , actor[i].year);
                            printf("\n");
                        }
                        break;
            case 0 :    exit(1);
            
            default :   printf("Enter valid option 1 , 2 , 3 or 0 \n");

        }

    }while(option != 0);


    return 0;
}