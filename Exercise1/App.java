public class App {
    static boolean iWillNotCheat = false;
   static boolean iWillWin = true;
   public static void main(String[] args) throws Exception {
       assert iWillNotCheat == true :"YANN MADUGAAA";
       enterCompetition();
       assert iWillWin == true:"GG BAWI KA NALANG NEXT TIME";


   }
   static void enterCompetition(){
       iWillWin = false;

   }
}
