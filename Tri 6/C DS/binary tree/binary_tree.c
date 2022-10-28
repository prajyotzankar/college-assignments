
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

struct node * search_element(struct node * temp, int item){
    while(temp != NULL){
        if(item < temp->key)
            temp = temp->left;
        else if(item == temp->key)
            return temp;
        else
            temp = temp->right;
    }
    return NULL;
}
struct node* minValueNode(struct node* node){
    struct node* current = node;
    while(current && current->left != NULL)
        current = current->left;
    return current;
}

struct node * delete_element(struct node* root, int item){

    if(root == NULL)
        return root;
 
    if(item < root->key)
        root->left = delete_element(root->left, item);
 
    else if(item > root->key)
        root->right = delete_element(root->right, item);
 
    else{
        if(root->left == NULL){
            struct node* temp = root->right;
            free(root);
            return temp;
        }
        else if(root->right == NULL){
            struct node* temp = root->left;
            free(root);
            return temp;
        }
 
        struct node* temp = minValueNode(root->right);
        root->key = temp->key;
        root->right = delete_element(root->right, temp->key);
    }
    return root;

}

void min_max_values(struct node * node){
    struct node *prev , *temp;
    temp = node;
    while(temp != NULL ){
        prev = temp;
        temp = temp->left;
    }
    printf("Min value is : %d \n" , prev->key);
    temp = node;
    while(temp != NULL ){
        prev = temp;
        temp = temp->right;
    }
    printf("Max value is : %d \n" , prev->key);

}

int count_leaf_node(struct node * temp){
    if(temp == NULL)
        return 0;
    if(temp->left == NULL && temp->right == NULL)
        return 1;
    else
        return count_leaf_node(temp->left) + count_leaf_node(temp->right);
}

int count_non_leaf_node(struct node * temp){
    if(temp == NULL || (temp->left == NULL && temp->right == NULL))
        return 0;
    
    return 1 + count_non_leaf_node(temp->left) + count_non_leaf_node(temp->right);
}

int max_depth(struct node * temp){
    int left_depth, right_depth;
    if(temp == NULL)
        return 0;
    else{
        left_depth = max_depth(temp->left);
        right_depth = max_depth(temp->right);

        if(right_depth > left_depth)
            return right_depth + 1;
        else
            return left_depth + 1;
    }
}


int main(){
    int option, item, size, nodes, leaf, non_leaf;
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
    printf("2 -> Delete an element from th BST \n");//not coded
    printf("3 -> Serach for element in BST \n");
    printf("4 -> Display Max and Min values of BST \n");
    printf("5 -> Display number of Nodes , leaf_node and non_leaf_nodes in BST  \n");
    printf("6 -> Display Max Depth of BST \n");
    printf("7 -> Display BST in In-order, Pre-order and Post-order \n");// error in diplaying after inserting elements
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

            case 2 :    printf("Enter the element to delete : ");
                        scanf("%d" , &item);
                        if(search_element(root, item))
                            delete_element(root, item);
                        else
                            printf("Cant delete, Item %d not found in the BST \n" , item);
                        printf("\n");
                        break;

            case 3 :    printf("Enter Element to search for : ");
                        scanf("%d" , &item);
                        if(search_element(root, item))
                            printf("Item %d found in the BST \n" , item);
                        else
                            printf("Element not found \n");
                        printf("\n");
                        break;

            case 4 :    min_max_values(root);
                        printf("\n");
                        break;
            
            case 5 :    printf("Nodes = %d \n", size);
                        printf("Leaf Nodes = %d \n", count_leaf_node(root));
                        printf("Non Leaf Nodes = %d \n", count_non_leaf_node(root));
                        printf("\n");
                        break;

            case 6:     printf("Max Depth of BST = %d \n", max_depth(root));
                        printf("\n");
                        break;

            case 7 :    printf("Binary Tree in In-order   : ");
                        display_inorder(root);
                        printf("\n");

                        printf("Binary Tree in Pre-order  : ");
                        display_preorder(root);
                        printf("\n");

                        printf("Binary Tree in Post-order : ");
                        display_postorder(root);
                        printf("\n\n");
                        break;

            case 8:     printf("\e[1;1H\e[2J");
                        break;

            case 0 :    exit(1);

            default :   printf("Enter valid option , 0 - 7 \n");
        }
    }while(option != 0);
    
    return 0;
}

