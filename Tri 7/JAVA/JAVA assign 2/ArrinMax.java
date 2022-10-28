public class ArrinMax {
    
    void min(int num_arr[], int size){
        int i;
        min = num_arr[0];
        for(i = 1 ; i < size ; i++){
            if(num_arr[i] < min)
                min = num_arr[i];
        }
        System.out.println("The smallest element = "+min);
    }

    void max(int num_arr[], int size){
        int i;
        max = num_arr[0];
        for(i = 1 ; i < size ; i++){
            if(num_arr[i] > max)
                max = num_arr[i];
        }
        System.out.println("The largest element = "+max);
    }

    public static void main(Strinf[] args){

        int size, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        size = sc.nextInt();

        int num_array[] = new int[size];
        System.out.println("Enter the array elements");

        for(i = 0 ; i < size ; i++)
            num_array
    }
}
