
#include <stdio.h>
#include <stdlib.h>

struct node{
    int key;
    struct node *left , *right;
};

struct node * new_node(int data){

    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->key = data;
    temp->left = temp->right = NULL;
    return temp;
}

struct node * insert_node(struct node * temp, int data){
    if(temp == NULL)
        return new_node(data);
    else if(data < temp->key)
        temp->left = insert_node(temp->left, data);
    else if(data > temp->key)
        temp->right = insert_node(temp->right, data);
    return temp;
}

void display_inorder(struct node* temp){   
    if(temp != NULL){
        display_inorder(temp->left);
        printf("%d \t", temp->key);
        display_inorder(temp->right);
    }
}

void display_preorder(struct node* temp){
    if(temp != NULL){
        printf("%d \t", temp->key);
        display_preorder(temp->left);
        display_preorder(temp->right);
    }
}

void display_postorder(struct node* temp){
    if(temp != NULL){
        display_postorder(temp->left);
        display_postorder(temp->right);
        printf("%d \t", temp->key);
    }
}

int main(){
    int option, item, size;
    struct node *root = NULL;

    printf("Enter no of nodes to create BST : ");
    scanf("%d" , &size);
    printf("Insert node values : ");
    scanf("%d" , &item);
    root = insert_node(root, item);
    for(int i = 1 ; i < size ; i++){
        scanf("%d" , &item);
        insert_node(root, item);
    }
    fflush(stdin);
    
    
    printf("1 -> Insert a node in BST \n");
    printf("2 -> Display BST in Pre-order \n");
    printf("0 -> Exit \n");
    do{
        printf("Option : ");
        scanf("%d" , &option);

        switch(option){
            case 1 :    printf("Enter node value to insert : ");
                        scanf("%d" , &item);
                        insert_node(root, item);
                        printf("\n");
                        break;

            case 2 :    printf("Binary Tree in Pre-order  : ");
                        display_preorder(root);
                        printf("\n\n");
                        break;

            case 3:     printf("\e[1;1H\e[2J");
                        break;

            case 0 :    exit(1);

            default :   printf("Enter valid option , 0 - 3 \n");
        }
    }while(option != 0);
    
    return 0;
}

