public class conditionals {
    String question;
    public static void main(String[] args) {
        conditionals magiceightball = new conditionals();
    }
    public conditionals(){
        int randomint = (int)(Math.random()*11);
        question = "is kat skibidi?";
        System.out.println(question);
        if (randomint<3){
            System.out.println("WHAAAAAT!! OH HEEEEELL NAAAH!!");
        }
        if (randomint<5&& randomint >2 ){
            System.out.println("nerd alert");
        }
        if (randomint < 7 && randomint >4 ){
            System.out.println("Error 404: unclear");
        }
        if ( randomint < 9 && randomint > 6){
            System.out.println("i'd say so");
        }
        if (randomint <11 && randomint > 8){
            System.out.println("yes :thumbsupemoji: ;) ");
        }
    }
}
