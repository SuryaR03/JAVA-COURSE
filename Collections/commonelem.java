import java.util.*;


public class commonelem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> set1=new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }

        int m=sc.nextInt();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<m;i++){
            set2.add(sc.nextInt());
        }

        set1.retainAll(set2);
        System.out.println("Common Elements");
        if(set1.isEmpty()){
            System.out.println("contains no elements");
        }else{
            for(int num : set1){
                System.out.print(num + " ");
            }
        }
    }
}