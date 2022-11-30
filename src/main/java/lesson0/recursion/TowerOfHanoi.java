package lesson0.recursion;

public class TowerOfHanoi {
    // source https://www.youtube.com/watch?v=q6RicK1FCUs
    // n is number of discs
    // A is point 1 (left point)
    // B is point 2 (middle point)
    // C is point 3 (right point)

    public void TOH(int n, int A, int B, int C){
        if(n>0){
            TOH(n-1, A, C, B);
            System.out.printf("Move a disc from %d to %d\n", A, C);
            TOH(n-1, B, A, C);
        }
    }
}
