#include <stdio.h>
#include <stdlib.h>

struct node{
    int vertex;
    struct node * next;
};

struct Graph{
    int num_vertices;
    int * visited;
    struct node ** adj_lists;
};

struct node * create_node(int v){
    struct node * new_node = malloc(sizeof(struct node));
    new_node->vertex = v;
    new_node->next = NULL;
    return new_node;
}

struct Graph * create_graph(int vertices){
    struct Graph * graph = malloc(sizeof(struct Graph));
    graph->num_vertices = vertices;
    graph->adj_lists = malloc(vertices * sizeof(struct node *));
    graph->visited = malloc(vertices * sizeof(int));

    int i;
    for(i = 0 ; i < vertices ; i++){
        graph->adj_lists[i] = NULL;
        graph->visited = 0;
    }
    return graph;
}

void add_edge(struct Graph * graph, int src, int dest){

    struct node * new_node = create_node(dest);
    new_node->next = graph->adj_lists[src];
    graph->adj_lists[src] = new_node;

    new_node = create_node(src);
    new_node->next = graph->adj_lists[dest];
    graph->adj_lists[dest] = new_node;
}

void print_graph(struct Graph * graph){
    int v;
    for(v = 0 ; v < graph->num_vertices ; v++){
        struct node * temp = graph->adj_lists[v];
        printf("\n Adjacency list of vertex %d\n ", v);
        while (temp) {
            printf("%d -> ", temp->vertex);
            temp = temp->next;
        }
        printf("\n");
    }
}

void dfs(struct Graph * graph, int vertex){
    struct node* adj_list = graph->adj_lists[vertex];
    struct node* temp = adj_list;

    graph->visited[vertex] = 1;
    printf("Visited %d \n", vertex);

    while (temp != NULL) {
        int connected_vertex = temp->vertex;

        if (graph->visited[connected_vertex] == 0) {
            dfs(graph, connected_vertex);
        }
        temp = temp->next;
    }
}


int main(){

    int no_of_vertex, i, j;

    printf("Enter number of vetices in the graph : ");
    scanf("%d", &no_of_vertex);

    struct Graph* graph = create_graph(no_of_vertex);
    int adj_matrix[no_of_vertex][no_of_vertex];
    printf("Enter the Adjecency Matrix of the Graph -> \n");

    for(i = 0 ; i < no_of_vertex ; i++){
        for(j = 0 ; j < no_of_vertex ; j++){
            scanf("%d", &adj_matrix[i][j]);
        }

    }

    for(i = 0 ; i < no_of_vertex ; i++){
        for(j = 0 ; j < no_of_vertex ; j++){
            add_edge(graph, i, j);
        }

    }

    print_graph(graph);
    dfs(graph, 2);



    return 0;
}