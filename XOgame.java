import java.util.Scanner;
class Xorgame {
    public void Playboard(int l[]) {
      
        int index =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (l[index]==0){
                System.out.print("| ");
                }else if (l[index]==1) {
                    System.out.print("x | ");
                }else if (l[index]==2) {
                    System.out.print("o | ");
                }
                index++;
            }
            System.out.println();
        }
       
    }
    public boolean  checkwin(int l[]){

        if(l[0]==1 && l[1]==1 && l[2]==1){
            return true;
        }else if(l[0]==2 && l[1]==2 && l[2]==2){
            return true;
        }else if(l[3]==1 && l[4]==1 && l[5]==1){
            return true;
        }else if(l[3]==2 && l[4]==2 && l[5]==2){
            return true;
        }else if(l[6]==1 && l[7]==1 && l[8]==1){
            return true;
        }else if(l[6]==2 && l[7]==2 && l[8]==2){
            return true;
        }else if(l[0]==1 && l[4]==1 && l[8]==1){
            return true;
        }else if(l[0]==2 && l[4]==2 && l[8]==2){
            return true;
        }else if(l[2]==1 && l[4]==1 && l[6]==1){
            return true;
        }else if(l[2]==2 && l[4]==2 && l[6]==2){
            return true;
        }else if(l[0]==1 && l[3]==1 && l[6]==1){
            return true;
        }else if(l[0]==2 && l[3]==2 && l[6]==2){
            return true;
        }else if(l[1]==1 && l[4]==1 && l[2]==1){
            return true;
        }else if(l[0]==2 && l[4]==2 && l[2]==2){
            return true;
        }else if(l[2]==1 && l[5]==1 && l[8]==1){
            return true;
        }else if(l[2]==2 && l[5]==2 && l[8]==2){
            return true;
        }
        return false;
    }
}

public class game{
    public static void main(String[] args) {
        String user = "x";
    Xorgame obj=new Xorgame();
    Scanner add = new Scanner(System.in);
    int lst[]=new int[9];
    while (true) {   
      obj.Playboard(lst);
      System.out.println("Enter A Number Between 1 to 9: ");
      int choice=add.nextInt();


      if (lst[choice-1]==0){
      if (user=="x"){
        
        lst[choice-1]=1;
        if (obj.checkwin(lst)) {
            obj.Playboard(lst);
            System.out.println(user+" win");
            break;
        }
        user="o";
    
     }else{
        lst[choice-1]=2;
        if (obj.checkwin(lst)) {
            obj.Playboard(lst);
            System.out.println(user+" win");
            break;
        }
         user="x";
         }
     }

    }
  }
}