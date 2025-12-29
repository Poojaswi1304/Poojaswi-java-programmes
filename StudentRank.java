import java.util.Scanner;
class StudentRank{
    public static void main(String[] args){
        String[] names={"ABC","DEF","GHI","JKL"};
        int[] marks={50,65,70,85};
        int n=marks.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(marks[i]<marks[j]){
                    int temp=marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                    String tempnames=names[i];
                    names[i]=names[j];
                    names[j]=tempnames;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Rank "+(i+1)+": "+names[i]+"-"+marks[i]);
        }
        System.out.print("Enter student name to find rank:");
        Scanner sc=new Scanner(System.in);
        String searchName=sc.next();
        boolean found=false;
        for(int i=0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(searchName)){
                System.out.println(searchName+"s rank is:"+(i+1));
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Student not found");
        }
    }
}