public class PurgatoryRPG
{
   public static void main( String[] args)
   {
      int playerScore = 0;
      
      StdDraw.filledSquare(.5, .5, .5);
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.text(.5, .8, "Welcome...to purgatory");
      StdDraw.text(.5, .75, "Attempt to enter Heaven or Hell");
      StdDraw.text(.5, .7, "Your decisions will decide...");
      StdDraw.text(.5, .65, "Would you like to begin?");
      StdDraw.text(.5, .5, "START");
   }
}