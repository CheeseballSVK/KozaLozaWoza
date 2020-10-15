public class Main {
    public static void main(String[] args) {

        for(int counter= 1; counter<=110; counter++) {

            if(counter % 3==0 && counter % 7==0 && counter % 5==0) {
                System.out.print("KozaLozaWoza ");
            }else if(counter % 3==0 && counter % 5==0){
                System.out.print("KozaLoza ");
            }else if(counter % 3==0 && counter % 7==0){
                System.out.print("KozaWoza ");
            }else if(counter % 5==0 && counter % 7==0){
                System.out.print("LozaWoza ");
            }else if(counter % 3==0){
                System.out.print("Koza ");
            }else if(counter % 5==0){
                System.out.print("Loza ");
            }else if(counter % 7==0){
                System.out.print("Woza ");
            }else{System.out.print(counter+" ");}

            if(counter % 11==0 && counter !=110) {

                System.out.println(" ");
            }
        }
    }
}