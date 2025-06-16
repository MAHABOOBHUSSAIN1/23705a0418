public class Main {
    public static void main(String[] args) {
    printRange(1,5);
    }
    public static void printRange(int start,int End){
    if(start>End){
        return;
    }
     System.out.println(start);
    int newstart = start+1;
    printRange(newstart,End);

    }
}