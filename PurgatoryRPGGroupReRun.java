public class PurgatoryRPGGroupReRun
{
   public static void main( String[] args)
   {
      int playerScore = 0;// Keep track of the player's score
      int question = 0; // this is to know what question they are on
      int optionSub = 0;// sub option between the real questions
      int[] questRepeat = new int[5];
      int instaDeath = 0; // it is as bad as it sounds
      int option = 0;
      int playerScoreValue = 0;

      double x = StdDraw.mouseX(); // mouse tracking to begin game or anything to do
      double y = StdDraw.mouseY();// with the mouse
      
      boolean done = false;
      
      
      StdDraw.filledSquare(.5, .5, .5);
      StdDraw.setPenColor(StdDraw.WHITE); // Nice weird opening
      StdDraw.text(.5, .8, "Welcome...to purgatory");
      StdDraw.text(.5, .75, "Attempt to enter Heaven or Hell");
      StdDraw.text(.5, .7, "Your decisions will decide...");
      StdDraw.text(.5, .65, "Would you like to begin?");
      StdDraw.text(.5, .5, "Click anywhere to begin");
      
      while(!StdDraw.mousePressed())
      {
      }
      
      StdDraw.clear();
      
      SetUp();
      
      //Opening question to being the game so this is not inside a method.
      StdDraw.text(.5, .95, "You open your eyes, you are in a dark place.");
      StdDraw.text(.5, .9, "There is a heavy mist surrounding everything.");
      StdDraw.text(.5, .85, "You don't remember how you got here. What do you do?");
      
      StdDraw.text(.2, .26, "Get up and"); // option 1
      StdDraw.text(.2, .2, "look around.");
      
      StdDraw.text(.5, .26, "Continue to"); // option 2
      StdDraw.text(.5, .2, "lay there");
      
      StdDraw.text(.8, .26, "Curse your"); // option 3
      StdDraw.text(.8, .2, "unfortunate");
      StdDraw.text(.8, .14, "circumstances");
            
      while( !done) // This is for all of the questions may end up making this a method
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 2;
                  done = true;
               }
      
            else if ( .68 < n && n < .92 && .08 < m && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 3;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement

      done = false;
            
      if(optionSub == 1)
      {
         StdDraw.text(.5, .5, "You get up");
         StdDraw.text(.5, .4, "Next");
      }
      else if( optionSub == 2)
      {       
         StdDraw.text(.5, .5, "But eventually you get bored of this and have to get up");
         StdDraw.text(.5, .4, "Next");
      }
      else if( optionSub == 3)
      {
         StdDraw.text(.5, .5, "You eventually run out of angry energy");
         StdDraw.text(.5, .4, "Next");
      }
      
      PageClear();
      StdDraw.show(300);
      StdDraw.show();
      SetUp();
      
      StdDraw.text(.5, .9, "Looking around, the dark mist seems to go on forever.");

      StdDraw.text(.2, .26, "Sit and wait"); // option 1
      StdDraw.text(.2, .21, "for something");
      StdDraw.text(.2, .16, "to happen.");
      
      StdDraw.text(.5, .26, "Begin walking"); // option 2
      StdDraw.text(.5, .2, "in a direction");
      
      while( !done) // This is for all of the questions may end up making this a method
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 2;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement
         
      if(optionSub == 1)
      {
         StdDraw.text(.5, .65, "You sit for an eternity but nothing happens, you");
         StdDraw.text(.5, .6, "decided to get up");
         StdDraw.text(.5, .55, "You wander into the mist.");
         StdDraw.text(.5, .5, "It flows around you and a shape appears in the darkness");
         StdDraw.text(.5, .4, "Next");
      }// end optionSub 1
      else if( optionSub == 2)
      {       
         StdDraw.text(.5, .55, "You wander into the mist.");
         StdDraw.text(.5, .5, "It flows around you and a shape appears in the darkness");
         StdDraw.text(.5, .4, "Next");
      }// end optionSub 2
      
      PageClear();
      StdDraw.show(300);
      StdDraw.show();
      SetUp();
      
      for(int i = 0; i < 6; i++)
      {
         question = (int)(Math.random() * 6 + 1);
         for(int j = 0; j < questRepeat.length; j ++)
         {
            if(question == questRepeat[j])
            {
               question = (int)(Math.random() * 6 + 1);
               j = -1;
            }// if to check to make sure no repeats
            else
            {
               questRepeat[j] = question;
               break;
            }
         }// end while loop, questRepea2 end*/
         
         playerScoreValue = Questions(playerScore, question);
         
         instaDeath = (int)(Math.random() * 34);
         
         if(instaDeath == 5)
         {
            playerScoreValue = 101;
            Endings(playerScoreValue);
            break;
         }// Instant death 1
         else if(instaDeath == 10)
         {
            playerScoreValue = 102;
            option = Endings(playerScoreValue);
            if(option == 1)
            {
               StdDraw.clear();
               break;
            }
         }// instant death 2
         else if(instaDeath == 15)
         {
            playerScoreValue = 103;
            Endings(playerScoreValue);
            if(option == 2)
            {
               StdDraw.clear();
               break;
            }
         }//instant death 3
         else if(instaDeath == 20)
         {
            playerScoreValue = 104;
            Endings(playerScoreValue);
            if(option == 2)
            {
               StdDraw.clear();
               break;
            }
         }//instant death 4
         else if(instaDeath == 25)
         {
            playerScoreValue = 105;
            Endings(playerScoreValue);
            if(option == 1)
            {
               StdDraw.clear();
               break;
            }
         }//instand death 5
         
      }// for loop, questRepeat end
      if( (-90 < playerScoreValue) && (playerScoreValue < 90))
         Endings(playerScoreValue);
      
      Credits();                
   }// End main method
 
    
   public static void SetUp()
   {
      StdDraw.setPenColor(StdDraw.BLACK);      
      StdDraw.square(.2,.2,.12);
      StdDraw.square(.5,.2,.12);
      StdDraw.square(.8,.2,.12);
      double [] a={.05,.05,.95,.95};
      double [] b={.75,.99,.99,.75};
      StdDraw.polygon(a,b);
   } // End SetUp Method
   
   
   public static void PageClear()
   {
      boolean done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.45 < n && n < .55 && .35 < m && m < .55)
               {
                  done = true;
               }
          }
      }
      
      StdDraw.clear();
   }// End PageClear Method
   
   
   public static int Questions(int playerScore, int question)//change to return playerScore
   {
      boolean done = false;
      int optionSub = 0;
      
      if ( question == 1)
      {
      StdDraw.text(.5 , .96, "You see two people sitting across from each other on a");
      StdDraw.text(.5 , .92, "long table. They have bountiful bowls of food in front ");
      StdDraw.text(.5 , .88, "of them, but with long spoons chained to their wrists");
      StdDraw.text(.5, .84, "so they can not reach into their own bowls. They beg");
      StdDraw.text(.5, .8, "for your help, they are starving.");
      
      StdDraw.text(.2, .26, "You agree to"); // option 1
      StdDraw.text(.2, .2, "help them.");
      
      StdDraw.text(.5, .28, "You don't know"); // option 2
      StdDraw.text(.5, .24, "how to help,");
      StdDraw.text(.5, .20, "you back away");
      StdDraw.text(.5, .16, "into the mist");
      
      StdDraw.text(.8, .26, "You let"); // option 3
      StdDraw.text(.8, .2, "them starve");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 2;
                  done = true;
               }
      
            else if ( .68 < n && n < .92 && .08 < m && m < .32)
               {
                  playerScore = playerScore - 2;
                  optionSub = 3;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement
      
      if(optionSub == 1)
      {
         StdDraw.text(.5, .5, "They profess their gratitude");
         StdDraw.text(.5, .4, "Next");
      }
      else if( optionSub == 2)
      {       
         StdDraw.text(.5, .55, "You hear their screams for help fade into the");
         StdDraw.text(.5, .5, "distance as you race into the mist.");
         StdDraw.text(.5, .4, "Next");
      }
      else if( optionSub == 3)
      {
         StdDraw.text(.5, .55, "You watch them weep before they fade away into");
         StdDraw.text(.5, .5, "the mists.");
         StdDraw.text(.5, .4, "Next");
      }

      PageClear();
      StdDraw.show(300);
      StdDraw.show();
      SetUp();
      
      if(optionSub == 1)
      {
         StdDraw.text(.5 , .85, "How do you assist them?? ");
         
         StdDraw.text(.2, .28, "Tell them to"); // option 1
         StdDraw.text(.2, .24, "feed each other");
         StdDraw.text(.2, .20, "with their long");
         StdDraw.text(.2, .16, "spoons");
      
         StdDraw.text(.5, .28, "Tell them to"); //option 2
         StdDraw.text(.5, .24, "eat with their");
         StdDraw.text(.5, .20, "with their other");
         StdDraw.text(.5, .16, "hand or shove");
         StdDraw.text(.5, .13, "their faces");
         StdDraw.text(.5, .10, "in the food");
         
      done = false;
     
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 2;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement
      
      if( optionSub == 1)
      {
         StdDraw.text(.5, .55, "You still hear them singing about");
         StdDraw.text(.5, .5, "your kindness as you disappear into");
         StdDraw.text(.5, .45, "the mist");
         StdDraw.text(.5, .4, "Next");
      }  
      
      if( optionSub == 2)
      {  
         StdDraw.text(.5, .5, "They show their thanks with a nod");
         StdDraw.text(.5, .45, "and you walk back into the mists");
         StdDraw.text(.5, .4, "Next");
      }
      
      PageClear();
      StdDraw.show(300);
      StdDraw.show();
      SetUp();
      }//End option1 Sup sequence.
      }// Question 1 if
      
      else if ( question == 2)
      {
      StdDraw.text(.5, .9,"You come across a person in a cloak begging for change,");
      StdDraw.text(.5, .85, "at least you think they are begging for something.");
      
      StdDraw.text(.2, .26, "Just ignore"); // option 1
      StdDraw.text(.2, .2, "them and");
      StdDraw.text(.2, .16, "keep walking");
      
      StdDraw.text(.5, .26, "Stop and see"); // option 2
      StdDraw.text(.5, .2, "what they want");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 2;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement
      
      if( optionSub == 1)
      {
         StdDraw.text(.5, .55, "You continue to hear the figure muttering as");
         StdDraw.text(.5, .5, "you walk past them and back into the mist.");
         StdDraw.text(.5, .4, "Next");
      
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
      }
      
      if( optionSub == 2)
      {  
         StdDraw.text(.5, .5, "You ask what they want");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
         StdDraw.text(.5, .85, "They ask for any spare bones.");
         
         StdDraw.text(.2, .28, "What kind of"); // option 1
         StdDraw.text(.2, .24, "question is");
         StdDraw.text(.2, .20, "that? Turn");
         StdDraw.text(.2, .16, "around and run");
      
         StdDraw.text(.5, .28, "Tell them you"); //option 2
         StdDraw.text(.5, .24, "don't have any");
         StdDraw.text(.5, .20, "bones to spare");
         StdDraw.text(.5, .16, "and walk away");
      
         done = false;
         
         while( !done)
         {
            if( StdDraw.mousePressed() )
            {
               double n, m;
               n = StdDraw.mouseX();
               m = StdDraw.mouseY();
         
               if(.08 < n && n < .32 && .08 < m && m < .32)
                  {
                     playerScore = playerScore + 0;
                     optionSub = 1;
                     done = true;
                  }
               else if ( .38 < n && n< .62 && .08 < m  && m < .32)
                  {
                     playerScore = playerScore + 1;
                     optionSub = 2;
                     done = true;
                  }
            }// End mousePressed if
         }// End while statement
         
         if(optionSub == 1)
         {
            StdDraw.text(.5, .55, "You say this as you");
            StdDraw.text(.5, .5, "beat a hasty retreat into the mist");
            StdDraw.text(.5, .4, "Next");   
         }
         else if(optionSub == 2)
         {
           StdDraw.text(.5, .6, "You inform them of this and then");
           StdDraw.text(.5, .55, "you leisurely pass the hooded figure and ");
           StdDraw.text(.5, .5,  "enter the mist.");
           StdDraw.text(.5, .4, "Next");
         }
         
           PageClear();
           StdDraw.show(300);
           StdDraw.show();
           SetUp();

      }//End alternate route   
      }//End Question 2 if
      
      else if ( question == 3 )
      {
      StdDraw.text(.5, .9, "You come across someone trying to cross a river, and they");
      StdDraw.text(.5, .85, "ask for your help.");
      
      StdDraw.text(.2, .26, "Sure why not,"); // option 1
      StdDraw.text(.2, .2, "you agree to");
      StdDraw.text(.2, .16, "help them");
      
      StdDraw.text(.5, .26, "Um, no that's"); // option 2
      StdDraw.text(.5, .2, "not my problem");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore - 2;
                  optionSub = 2;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement
      
      if( optionSub == 2)
      {
         StdDraw.text(.5, .55, "The figure becomes a spec in the distance");
         StdDraw.text(.5, .5, "as you make a hard left back into the mist.");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
      }// question 3 option end
      
      if( optionSub == 1)
      {
         StdDraw.text(.5, .55, "You continue to get closer and closer");
         StdDraw.text(.5, .5, "ready to offer you services.");
         StdDraw.text(.5, .4, "Next");
      
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      StdDraw.text(.5, .95,"As you get closer you discover that they are actually");
      StdDraw.text(.5, .90, "very small and the river they are trying to cross");
      StdDraw.text(.5, .85, "is just a small creek. You could easily walk");
      StdDraw.text(.5, .8, "across it.");
      
      StdDraw.text(.2, .28, "Carry them"); // option 1
      StdDraw.text(.2, .25, "them in your");
      StdDraw.text(.2, .21, "arms and just");
      StdDraw.text(.2, .18, "wade across");
      StdDraw.text(.2, .15, "the creek.");
      
      StdDraw.text(.5, .28, "Nothing personal"); // option 2
      StdDraw.text(.5, .25, "to the small");
      StdDraw.text(.5, .21, "person but you");
      StdDraw.text(.5, .18, "really don't");
      StdDraw.text(.5, .15, "want to do");
      StdDraw.text(.5, .12, "that.");
      
      done = false;
         
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 2;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement
      
      if(optionSub == 2)
      {
         StdDraw.text(.5, .55, "You watch their face drop as you turn and leave");
         StdDraw.text(.5, .5, "walking ever deeper into the mist.");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
      }
      
      if(optionSub == 1)
      {
         StdDraw.text(.5, .55, "You scoop them up into your arms and");
         StdDraw.text(.5, .5, "and begin to take the first steps into the creek.");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      StdDraw.text(.5, .9,"You don't encounter any problems during the crossing.");
      StdDraw.text(.5, .85, "Once on the other side, however, they ask if you");
      StdDraw.text(.5, .8, "could also carry their boat house over as well.");
     
      StdDraw.text(.2, .26, "What the"); // option 1
      StdDraw.text(.2, .21, "heck?");
      
      StdDraw.text(.5, .28, "Begrudgingly"); // option 2
      StdDraw.text(.5, .23, "walk back");
      StdDraw.text(.5, .20, "and get said");
      StdDraw.text(.5, .16, "boat house.");
      
      StdDraw.text(.8, .28, "Go back"); // option 3
      StdDraw.text(.8, .25, "happily");
      StdDraw.text(.8, .2, "and get the");
      StdDraw.text(.8, .16, "boat house.");
      
      done = false;
         
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 2;
                  done = true;
               }
            else if ( .68 < n && n < .92 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 2;
                  optionSub = 3;
                  done = true;
               }

         }// End mousePressed if
      }// End while statement
      
      if( optionSub == 1)
      {
         StdDraw.text(.5, .6, "You drop them onto the opposite bank with a loud, NO,");
         StdDraw.text(.5, .57, "escaping your lips as you turn and head into");
         StdDraw.text(.5, .54, "the mist. You hear a small voice crying behind you.");
         StdDraw.text(.5, .5, "You ignore it and missed the tears that they shed.");
         StdDraw.text(.5, .4, "Next");
      }
      
      if( optionSub == 2)
      {
         StdDraw.text(.5, .7, "You put them down before going back and retrieving their");
         StdDraw.text(.5, .66, "houseboat, wondering if they actually know how to");
         StdDraw.text(.5, .61, "use it. Once that is done, you waste no time");
         StdDraw.text(.5, .56, "in leaving but you manage to catch them saying");
         StdDraw.text(.5, .5, "thank you as you disappear back into the mist.");
         StdDraw.text(.5, .4, "Next");

      }
      
      if( optionSub == 3)
      {
         StdDraw.text(.5, .7, "You put them down gently before heading for the other");
         StdDraw.text(.5, .66, "bank and picking up their little house boat.");
         StdDraw.text(.5, .61, "On the trip back you explain how the creek and the");
         StdDraw.text(.5, .56, "house can be used together in order to prevent other");
         StdDraw.text(.5, .52, "incidents like this. They offer great thanks before");
         StdDraw.text(.5, .46, "you leave and you enter the mist with a smile on your face.");
         StdDraw.text(.5, .4, "Next");
      }

         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
              
      }// optionSub continue
         
      }// question 3 option continue
      
      }//End Question 3 if
      
      else if ( question == 4 )
      {
      StdDraw.text(.5,.85 ,"You come across two children arguing over a loaf of bread.");
      
      StdDraw.text(.2, .26, "Ignore them"); // option 1
      StdDraw.text(.2, .2, "and keep");
      StdDraw.text(.2, .16, "walking");
      
      StdDraw.text(.5, .28, "Take the bread"); // option 2
      StdDraw.text(.5, .24, "and run,");
      StdDraw.text(.5, .20, "you're as hungry");
      StdDraw.text(.5, .16, "as they are.");
      
      StdDraw.text(.8, .26, "Try to"); // option 3
      StdDraw.text(.8, .2, "help them");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore - 2;
                  optionSub = 2;
                  done = true;
               }
      
            else if ( .68 < n && n < .92 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 3;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement
      
      if(optionSub == 1)
      {
         StdDraw.text(.5, .55, "You walk right past them and you hear what sounds");
         StdDraw.text(.5, .5, "an awful like growling as you continue into the mist");
         StdDraw.text(.5, .4, "Next");
         
      }// optionSub 1. Ends and totally new question
      else if( optionSub == 2)
      {       
         StdDraw.text(.5, .55, "You grab the bread then run like a bat out of hell.");
         StdDraw.text(.5, .5, "the kids yell after you as you re enter the mist.");
         StdDraw.text(.5, .4, "Next");
         
      }// optionSub 2. Evil end and totally new question
      else if( optionSub == 3)
      {
         StdDraw.text(.5, .55, "You tell them that you can give both of them");
         StdDraw.text(.5, .5, "some bread.");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      StdDraw.text(.5,.85 ,"How would you like to divide the bread?");
      
      StdDraw.text(.2, .26, "Divide in"); // option 1
      StdDraw.text(.2, .2, "half, one for");
      StdDraw.text(.2, .16, "each child.");
      
      StdDraw.text(.5, .28, "Divide it"); // option 2
      StdDraw.text(.5, .24, "with a section,");
      StdDraw.text(.5, .20, "for you. Cause");
      StdDraw.text(.5, .16, "you're hungry too.");
      
      done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 2;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement
      
      if(optionSub == 1)
      {
         StdDraw.text(.5, .65, "You split the bread in half and give each of them");
         StdDraw.text(.5, .6, "a piece. They smile up at you and as they begin to fade");
         StdDraw.text(.5, .55, "into the mist but not before your hear them say,");
         StdDraw.text(.5, .5, "\"Thank you\"");
         StdDraw.text(.5, .4, "Next");
         
      }// optionSub 1. Ends and totally new question
      else if( optionSub == 2)
      {       
         StdDraw.text(.5, .65, "You split the bread, giving yourself a small piece");
         StdDraw.text(.5, .6, "for your troubles, giving to equally small pieces to");
         StdDraw.text(.5, .55, "the starving children. They give you a curt nod in");
         StdDraw.text(.5, .5, "place of a thanks and they fade into the mist.");
         StdDraw.text(.5, .4, "Next");
      }   

      }//OptionSub 3. This makes it long.

      PageClear();
      StdDraw.show(300);
      StdDraw.show();
      SetUp();


      }// end question 4
      
      else if ( question == 5 )
      {
      StdDraw.text(.5, .95,"You come across a strange door, standing in the");
      StdDraw.text(.5, .9, "middle of nowhere with nothing around it. You hear");
      StdDraw.text(.5, .85, "a knock coming from the other side, but when you go");
      StdDraw.text(.5, .8, "around to look there is no one there.");
      
      StdDraw.text(.2, .24, "Ignore it"); // option 1
      StdDraw.text(.2, .2, "and keep");
      StdDraw.text(.2, .16, "walking");
      
      StdDraw.text(.5, .24, "Ask who's"); // option 2
      StdDraw.text(.5, .20, "there.");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement
      
      if(optionSub == 1)
      {
         StdDraw.text(.5, .6, "You back away from the door and regard it with great");
         StdDraw.text(.5, .55, "suspicion until it and you are engulfed by the mist.");
         StdDraw.text(.5, .4, "Next");
         
      }// optionSub 1. Ends and totally new question
      else if( optionSub == 2)
      {       
         StdDraw.text(.5, .6, "For a few moments nothing happens. Then without any");
         StdDraw.text(.5, .55, "preamble you hear a low, gravely voice yell,");
         StdDraw.text(.5, .5, "\"YOUR MOM!!!\"");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
      
      StdDraw.text(.5, .9, "You are only slightly startled by this declaration but");
      StdDraw.text(.5, .85,"you realize that you are at an impasse.");   
      StdDraw.text(.5, .8,"Do you want to open the door?");
      
      StdDraw.text(.2, .2, "No"); // option 1
      
      StdDraw.text(.5, .2, "Yes"); // option 2
      
      done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore - 2;
                  optionSub = 2;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement
               
      if(optionSub == 1)
      {
         StdDraw.text(.5, .6, "Your self preservation instincts kick in and you");
         StdDraw.text(.5, .55, "turn your back on the weird multidimensional door.");
         StdDraw.text(.5, .5, "and wander back into the mist.");
         StdDraw.text(.5, .4, "Next");
         
      }// optionSub 1. Ends and this is the "good" one
      else if( optionSub == 2)
      {       
         StdDraw.text(.5, .7, "You reach for the doorknob, and throw the door open!");
         StdDraw.text(.5, .66, "A black shape lunges at you from the other side and");
         StdDraw.text(.5, .62, "you quickly shut the door in hopes of keeping the thing");
         StdDraw.text(.5, .58, "on the other side. As you turn to run, the black shape");
         StdDraw.text(.5, .54, "passes THROUGH the door and pursues you. After what feels");
         StdDraw.text(.5, .5, "like an eternity of running it disappears and leaves you");
         StdDraw.text(.5, .46, "alone, and lost in the mist.");

         StdDraw.text(.5, .4, "Next");
      }
     
      }// End OptionSub 2. The long one.

         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
      
      }//End of Question 5
      
      else if ( question == 6 )
      {
      StdDraw.text(.5, .95, "After a while you come across an interesting feature.");
      StdDraw.text(.5, .9, "There is a deep puddle on the ground and a small");
      StdDraw.text(.5, .85, "child crying over it, he says that he dropped his");
      StdDraw.text(.5, .8, "toy into it.");
      
      StdDraw.text(.2, .26, "Reach into"); // option 1
      StdDraw.text(.2, .2, "the puddle");
      StdDraw.text(.2, .16, "to retrieve");
      StdDraw.text(.2, .12, "the toy.");
      
      StdDraw.text(.5, .28, "Ask the boy"); // option 2
      StdDraw.text(.5, .24, "why he has");
      StdDraw.text(.5, .20, "not tried");
      StdDraw.text(.5, .16, "to get the");
      StdDraw.text(.5, .12, "toy himself.");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement
      
      if(optionSub == 1)
      {
         StdDraw.text(.5, .66, "You quickly realize that the puddle is a lot deeper");
         StdDraw.text(.5, .62, "than you previously judged and your arm is now in deep.");
         StdDraw.text(.5, .58, "It is also at this time that you notice that you");
         StdDraw.text(.5, .54, "are unable to remove your arm as if some unknown");
         StdDraw.text(.5, .5, "force keeps it trapped.");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
      
      StdDraw.text(.5, .85, "You are feeling really confused right about now.");
      
      StdDraw.text(.2, .26, "Keep reaching"); // option 1
      StdDraw.text(.2, .2, "into the puddle");
      StdDraw.text(.2, .16, "to retrieve");
      StdDraw.text(.2, .12, "the toy.");
      
      StdDraw.text(.5, .28, "Ask the boy"); // option 2
      StdDraw.text(.5, .24, "why you can't");
      StdDraw.text(.5, .20, "move your arm.");
      
      done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement
      
      if( optionSub == 1)
      {
         StdDraw.text(.5, .66, "You feel your hand wrap around the toy but you are");
         StdDraw.text(.5, .62, "still unable to pull your arm out of the puddle.");
         StdDraw.text(.5, .58, "You ask the kid why you are unable to do so. He says");
         StdDraw.text(.5, .54, "for everything that is taken out something of equal");
         StdDraw.text(.5, .5, "value must be put back in and he has nothing.");
         StdDraw.text(.5, .4, "Next");
         
         
      }// This is OptionSub 1 section b
      
      if( optionSub == 2)
      {
         StdDraw.text(.5, .55, "He says that for everything that is taken out something");
         StdDraw.text(.5, .5, "of equal value must be put back in and he has nothing.");
         StdDraw.text(.5, .4, "Next");

      }

         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      StdDraw.text(.5, .9, "That would have been a nice to know a moment or two");
      StdDraw.text(.5, .85, "ago. When you ask what you can trade now he says");
      StdDraw.text(.5, .8, "you can risk your chances of getting into heaven.");
      
      StdDraw.text(.2, .26, "Give up"); // option 1
      StdDraw.text(.2, .2, "enough for");
      StdDraw.text(.2, .16, "your arm");
      
      StdDraw.text(.5, .28, "Give up"); // option 2
      StdDraw.text(.5, .24, "enough for");
      StdDraw.text(.5, .20, "your arm");
      StdDraw.text(.5, .16, "and the toy.");
      
      StdDraw.text(.8, .26, "Don't give"); // option 3
      StdDraw.text(.8, .23, "up anything.");
      StdDraw.text(.8, .20, "Forget your");
      StdDraw.text(.8, .16, "arm and the");
      StdDraw.text(.8, .12, "toy.");
       
      done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore - 2;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 2;
                  done = true;
               }
      
            else if ( .68 < n && n < .92 && .08 < m && m < .32)
               {
                  playerScore = playerScore - 3;
                  optionSub = 3;
                  done = true;
               }
         }// End mousePressed if
      }// End while statement


      if( optionSub == 1)
      {
         StdDraw.text(.5, .66, "Your arm feels a little tingly but not worse for");
         StdDraw.text(.5, .62, "wear. You apologize to the boy and your turn to");
         StdDraw.text(.5, .58, "leave. You briskly walk into the mist never");
         StdDraw.text(.5, .54, "bothering to look back.");
         StdDraw.text(.5, .4, "Next");    
         
      }
            
      if( optionSub == 2)
      {
         StdDraw.text(.5, .55, "You hand the boy his toy and shake out your arm.");
         StdDraw.text(.5, .5, "the boy smiles and thanks you before you are both");
         StdDraw.text(.5, .46, "swallowed by the mist.");
         StdDraw.text(.5, .4, "Next");

      }
      
      if( optionSub == 3)
      {
         StdDraw.text(.5, .66, "You scream in agony as your arm is cleaved from");
         StdDraw.text(.5, .62, "your body and you fall to your knees grasping at");
         StdDraw.text(.5, .58, "the stump. The boy looks at you with pity. Suddenly,");
         StdDraw.text(.5, .54, "everything is engulfed by the mist and when you");
         StdDraw.text(.5, .5, "look you realize that you arm actually still there");
         StdDraw.text(.5, .46, "You stand and run into the mist.");
         StdDraw.text(.5, .4, "Next");
      }
          
      }// optionSub 1 section a. It is only going to end badly
      else if( optionSub == 2)
      {       
         StdDraw.text(.5, .55, "He says that for everything that is taken out something");
         StdDraw.text(.5, .5, "of equal value must be put back in and he has nothing.");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      StdDraw.text(.5, .85, "How do you proceed?");
      
      StdDraw.text(.2, .26, "You have"); // option 1
      StdDraw.text(.2, .2, "nothing to");
      StdDraw.text(.2, .16, "give. Leave.");
      
      StdDraw.text(.5, .28, "Check your"); // option 2
      StdDraw.text(.5, .24, "pockets for");
      StdDraw.text(.5, .20, "something to");
      StdDraw.text(.5, .16, "give him.");

      done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement
   
      if( optionSub == 1)
      {
         StdDraw.text(.5, .58, "You turn and leave. You do feel bad that you");
         StdDraw.text(.5, .54, "were unable to help. But those thoughts don't last");
         StdDraw.text(.5, .5, "as you meander into the mist.");
         StdDraw.text(.5, .4, "Next");    
         
      }
            
      if( optionSub == 2)
      {
         StdDraw.text(.5, .58, "You don't have anything to offer unless...");
         StdDraw.text(.5, .54, "The kid speaks up, you could risk your chances");
         StdDraw.text(.5, .5, "of getting into heaven to help him.");
         StdDraw.text(.5, .4, "Next");

      }

         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      StdDraw.text(.5, .85, "How do you proceed?");
      
      StdDraw.text(.2, .26, "You'll pass."); // option 1
      StdDraw.text(.2, .2, "Sorry.");
      
      StdDraw.text(.5, .26, "Okay, you'll"); // option 2
      StdDraw.text(.5, .2, "do it.");

      done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement

      if( optionSub == 1)
      {
         StdDraw.text(.5, .58, "You turn and leave. You do feel bad that you");
         StdDraw.text(.5, .54, "were unable to help. But those thoughts don't last");
         StdDraw.text(.5, .5, "as you meander into the mist.");
         StdDraw.text(.5, .4, "Next");    
         
      }
            
      if( optionSub == 2)
      {
         StdDraw.text(.5, .58, "You reach into the (surprisingly deep) puddle and");
         StdDraw.text(.5, .54, "pull the toy from its depths. You give it to the");
         StdDraw.text(.5, .5, "boy whose face lights up like the 4th of July and");
         StdDraw.text(.5, .46, "hurries off into the mist and you continue on your way.");
         StdDraw.text(.5, .4, "Next");

      }

      
      } // End option 2
        
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();

      
      }// End of Question 6
      
      else if ( question == 7 )
      {
      StdDraw.text(.5, .9,"Two dogs are fighting over a bone.");
      
      StdDraw.text(.2, .24, "You leave"); // option 1
      StdDraw.text(.2, .2, "them to their");
      StdDraw.text(.2, .16, "business and");
      StdDraw.text(.2, .12, "move on.");
    
      StdDraw.text(.5, .28, "Investigate"); // option 2
      StdDraw.text(.5, .24, "to see if");
      StdDraw.text(.5, .20, "they are fighting");
      StdDraw.text(.5, .16, "or just playing");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 1;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement
      
      if(optionSub == 1)
      {
         StdDraw.text(.5, .58, "You leave the dogs to their business and");
         StdDraw.text(.5, .54, "walk into the mist the dog's growls still");
         StdDraw.text(.5, .5, "fresh in your ears.");
         StdDraw.text(.5, .4, "Next");
      }
      
      if(optionSub == 2)
      {
         StdDraw.text(.5, .58, "You approach with caution and grace");
         StdDraw.text(.5, .54, "hoping the dogs don't turn on you.");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      StdDraw.text(.5, .9, "They are each holding onto the bone in their mouths,");
      StdDraw.text(.5, .85, "spinning around in a circle, growling at each other");
      
      StdDraw.text(.2, .26, "It doesn't look"); // option 1
      StdDraw.text(.2, .2, "like their fighting");
      StdDraw.text(.2, .16, "you move on.");
    
      StdDraw.text(.5, .28, "You decide to"); // option 2
      StdDraw.text(.5, .24, "get involved.");

      done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement
      
      if(optionSub == 1)
      {
         StdDraw.text(.5, .58, "You leave  the dogs to their business and");
         StdDraw.text(.5, .54, "walk into the mist the dog's growls still");
         StdDraw.text(.5, .5, "fresh in your ears.");
         StdDraw.text(.5, .4, "Next");
      }
      
      if(optionSub == 2)
      {
         StdDraw.text(.5, .58, "You grab the the bone from the two dogs");
         StdDraw.text(.5, .54, "with surprising agility.");
         StdDraw.text(.5, .4, "Next");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      StdDraw.text(.5, .85, "They are both begging for the bone back.");
      
      StdDraw.text(.2,.26,"You guess your");
      StdDraw.text(.2,.23,"going to have" );
      StdDraw.text(.2,.20,"to give it to" );
      StdDraw.text(.2,.16,"one dog over" );
      StdDraw.text(.2,.12,"the other");
    
      StdDraw.text(.5,.26, "Toss the bone") ;
      StdDraw.text(.5,.23,"away so no");
      StdDraw.text(.5,.20,"one will");
      StdDraw.text(.5,.16,"have it now");
    
      StdDraw.text(.8,.26, "You offer it");
      StdDraw.text(.8,.23, "back to");
      StdDraw.text(.8,.20,"the dogs");
       
      done = false;
    
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
    
            if(.08 < n && n < .32 && .08 < m && m < .32)
            {
               playerScore = playerScore - 2;
               optionSub = 1;
               done = true;
            }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
            {
               playerScore = playerScore - 1;
               optionSub = 2;
               done = true;
            }
            else if ( .68 < n && n < .92 && .08 < m && m < .32)
            {
                  playerScore = playerScore + 0;
                  optionSub = 3;
                  done = true;
            }
    
         }// End mousePressed if
      }// End while statement
      
        if( optionSub == 1)
        {
        StdDraw.text(.5,.58,"Before you can decide a dog lunges at you");
        StdDraw.text(.5,.54,"and rips the bone from you hand,");
        StdDraw.text(.5,.5,"then both run off into the mist");
        StdDraw.text(.5, .4, "Next");    
        }
        if (optionSub == 2)
        {
        StdDraw.text(.5,.5,"The dogs both bolt off after it into the mist");
        StdDraw.text(.5, .4, "Next");    
        }
        if( optionSub == 3)
        {
        StdDraw.text(.5,.58,"They both grab it at the same time");
        StdDraw.text(.5,.54,"and get stuck in the same");
        StdDraw.text(.5,.5,"situation they were in before");
        StdDraw.text(.5, .4, "Next");
        }
        
      }//option continuation of the first

      }// long option 2, first

         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
      }//end question 7
   
      else if ( question == 8 )
      {
      StdDraw.text(.5, .9, "A strange lumpy creature in a cloak offers you");
      StdDraw.text(.5, .85, "to roll a special dice that can increase your chances");
      StdDraw.text(.5, .8, "of getting into heaven.");
      
      StdDraw.text(.2,.26,"No, you won't");
      StdDraw.text(.2,.21,"That doesn't seem");
      StdDraw.text(.2,.16,"like the right way");
      StdDraw.text(.2,.11,"to get to heaven.");
      
      StdDraw.text(.5,.26,"Hey it's worth");
      StdDraw.text(.5,.21,"a shot. You");
      StdDraw.text(.5,.16,"agree to roll" );// add random number generator

      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 2;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement

      if( optionSub == 1)
      {
        StdDraw.text(.5,.58, "You want to get into the heaven the right way.");
        StdDraw.text(.5,.54 ,"You bid the figure ado and stroll back ");
        StdDraw.text(.5,.5, "into the waiting arms of the mist.");
        StdDraw.text(.5, .4, "Next");  
      }   
      if(optionSub == 2)
      {
         int chanceBad = (int)(Math.random()* 2);
         if(chanceBad == 0)
         {
            int chanceHeaven = (int)(Math.random()* 2 + 1);
            playerScore = playerScore + chanceHeaven;
         }
         else
         {
            int chanceHell = (int)(Math.random()* 2 + 1);
            playerScore = playerScore + chanceHell;
         }
        StdDraw.text(.5, .58, "The figure rolls the dice but before you");
        StdDraw.text(.5, .54, "see what happens the figure sweep up the");
        StdDraw.text(.5, .5, "dice and dissapears. You don't waste any time");
        StdDraw.text(.5, .46, "in running away.");
        StdDraw.text(.5, .4, "Next");
      }   
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
      }// End Question
      
      else if ( question == 9 )
      {
      StdDraw.text(.5, .85, "A cat is sitting on a stump, eating a ton of fish,");
      StdDraw.text(.5, .8, "while a squirrel runs around chittering.");
      
      StdDraw.text(.2,.26,"You decide to");
      StdDraw.text(.2,.21,"ignore this");
   
      StdDraw.text(.5,.26,"Give the fish");
      StdDraw.text(.5,.21,"to the squirrel");
      
      StdDraw.text(.8,.26,"Figure out why");
      StdDraw.text(.8,.21,"the squirrel");
      StdDraw.text(.8,.16,"is upset");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
    
            if(.08 < n && n < .32 && .08 < m && m < .32)
            {
               playerScore = playerScore + 0;
               optionSub = 1;
               done = true;
            }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
            {
               playerScore = playerScore - 2;
               optionSub = 2;
               done = true;
            }
            else if ( .68 < n && n < .92 && .08 < m && m < .32)
            {
                  playerScore = playerScore + 1;
                  optionSub = 3;
                  done = true;
            }
    
         }// End mousePressed if
      }// End while statement
      
      if( optionSub == 1)
      {
       StdDraw.text(.5, .6, "You walk away from the two squabbling creatures caring");
       StdDraw.text(.5, .55, "less than you started. You think the mist may be laughing");
       StdDraw.text(.5, .5, "at you.");
       StdDraw.text(.5, .4, "Next");
      }
      
      if( optionSub == 2)
      {
       StdDraw.text(.5, .6, "You manage to get some of the fish to the squirrel but");
       StdDraw.text(.5, .55, "the cat is not pleased with this. You turn to leave");
       StdDraw.text(.5, .5, "and the animals sound like they are going on with their lives.");
       StdDraw.text(.5, .4, "Next");
      }
      
      if( optionSub == 3)
      {
       StdDraw.text(.5, .55, "You get closer to the stump and quickly spot what");
       StdDraw.text(.5, .5, "has the squirrel in a tizzy.");
       StdDraw.text(.5, .4, "Next");
       
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
       
       StdDraw.text(.5, .85, "The cat appears to be sitting on the squirrel's");
       StdDraw.text(.5, .8, "food.");
       
       StdDraw.text(.2,.26,"Try to move");
       StdDraw.text(.2,.21,"the cat");
   
       StdDraw.text(.5,.26,"Don't move");
       StdDraw.text(.5,.21,"the cat");
      
      done = false;
       
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 0;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement
       
       if( optionSub == 1)
       {
       StdDraw.text(.5, .55, "You decide to move the cat.");
       StdDraw.text(.5, .5, "When you reach for the cat...");
       StdDraw.text(.5, .4, "Next");
       
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();
         
       StdDraw.text(.5, .85, "The cat swipes at you hands breaking skin");
       StdDraw.text(.5, .8, "and drawing blood.");
       
       StdDraw.text(.2,.28,"You give up,");
       StdDraw.text(.2,.26,"the safety");
       StdDraw.text(.2,.21,"of your hands");
       StdDraw.text(.3,.13,"is more important");
      
       StdDraw.text(.5,.28,"You try to");
       StdDraw.text(.5,.26,"move some of");
       StdDraw.text(.5,.21,"the fish");
      
      done = false;
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  playerScore = playerScore - 1;
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  playerScore = playerScore + 2;
                  optionSub = 2;
                  done = true;
               }
      
         }// End mousePressed if
      }// End while statement

       if( optionSub == 1)
       {
         StdDraw.text(.5, .55, "You feel bad that you couldn't help");
         StdDraw.text(.5, .5, "but your self preservation instincts are too strong.");
         StdDraw.text(.5, .4, "Next");

       }
       
       if( optionSub == 2)
       {
         StdDraw.text(.5, .6, "Some of the fish falls off the stump and the cat");
         StdDraw.text(.5, .55, "follows it to the ground. This allows the squirrel to jump");
         StdDraw.text(.5, .5, "up and get at the food. All is well and fed.");
         StdDraw.text(.5, .4, "Next");

       }
       
       }
       
       if( optionSub == 2)
       {
         StdDraw.text(.5, .6, "That cat's claws look really sharp. You can not do anything.");
         StdDraw.text(.5, .55, "You begin to walk away but cast a look back to see that ");
         StdDraw.text(.5, .5, "the cat and squirrel still squabbling before they disappear in the mist.");
         StdDraw.text(.5, .4, "Next");
       }
       
      }
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         SetUp();

      }// End question 9!!!!
      
      return playerScore;
   }//End of questions method
   
   
   public static int Endings(int playerScore)
   {
      int optionSub = 0;
      
      boolean done = false;
      
      if(playerScore == 101)
      {
         StdDraw.clear();
         StdDraw.text(.5, .65, "You aren't paying attention and suddenly fall into");
         StdDraw.text(.5, .6, "a hole. You fall down into hell.");
         StdDraw.text(.5, .55, "GAME OVER");
         StdDraw.text(.5, .4, "End");
         
         PageClear();
         Credits();
         return optionSub;
      }
      else if(playerScore == 102)
      {
         StdDraw.text(.5, .9, "As you walk along you find a glimmering staircase");
         StdDraw.text(.5, .85, "leading up and out of the mist.");
         
      StdDraw.text(.2, .26, "Climb up"); // option 1
      StdDraw.text(.2, .2, "cause, why");
      StdDraw.text(.2, .16, "not?");
      
      StdDraw.text(.5, .28, "Ignore it"); // option 2
      StdDraw.text(.5, .24, "and keep");
      StdDraw.text(.5, .20, "walking.");
      
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  optionSub = 2;
                  done = true;
               }
          }// End mousePressed if
      }// End while statement

               
      if( optionSub == 1)
      {
         StdDraw.setPenColor(StdDraw.BLUE);
         StdDraw.text(.5, .65, "As you advance up the stairs and you hear what");
         StdDraw.text(.5, .6, "sounds suspiciously like Led Zeppelin's Stairway to");
         StdDraw.text(.5, .55, "Heaven. And low and behold you see the pearly");
         StdDraw.text(.5, .5, "gates. You have made it into heaven.");
         StdDraw.text(.5, .46, "Congrats!!!!");
         StdDraw.text(.5, .4, "End");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         Credits();
            
         return optionSub;
      }// This is the good ending
      else
         return optionSub;      
      
      }// End (possible) insta death 2
    
      else if(playerScore == 102)
      {
         StdDraw.text(.5, .9, "As you walk along you find a person with giant wings");
         StdDraw.text(.5, .85, "and a face with too many eyes.");
         
      StdDraw.text(.2, .28, "Ignore it"); // option 2
      StdDraw.text(.2, .24, "and keep");
      StdDraw.text(.2, .20, "walking.");
      
      StdDraw.text(.5, .28, "Stop and"); // option 2
      StdDraw.text(.5, .24, "talk with");
      StdDraw.text(.5, .20, "the creature");
               
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  optionSub = 2;
                  done = true;
               }
          }// End mousePressed if
      }// End while statement

               
      if( optionSub == 2)
      {
         StdDraw.setPenColor(StdDraw.BLUE);
         StdDraw.text(.5, .65, "You address the creature directly, stepping closer");
         StdDraw.text(.5, .6, "to them. Suddenly, they transform and before you stands");
         StdDraw.text(.5, .55, "an angel in all of their glory. They swoop down and");
         StdDraw.text(.5, .5, "grab you before headed skywards. You are going to heaven.");
         StdDraw.text(.5, .46, "Congrats!!!!");
         StdDraw.text(.5, .4, "End");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         Credits();
            
         return optionSub;
      }// This is the good ending
      else
         return optionSub;      
      
      }// End (possible) insta death 3
      
      else if( playerScore == 104)
      {
         StdDraw.text(.5, .9, "As you walk along you find a person with giant wings");
         StdDraw.text(.5, .85, "and a face with too many eyes.");
         
      StdDraw.text(.2, .28, "Ignore it"); // option 2
      StdDraw.text(.2, .24, "and keep");
      StdDraw.text(.2, .20, "walking.");
      
      StdDraw.text(.5, .28, "Stop and"); // option 2
      StdDraw.text(.5, .24, "talk with");
      StdDraw.text(.5, .20, "the creature");
               
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  optionSub = 2;
                  done = true;
               }
          }// End mousePressed if
      }// End while statement

               
      if( optionSub == 2)
      {
         StdDraw.setPenColor(StdDraw.RED);
         StdDraw.text(.5, .68, "You address the creature directly, stepping closer");
         StdDraw.text(.5, .64, "to them. Suddenly, they transform and before you stands");
         StdDraw.text(.5, .6, "what appears to be an angel. They swoop down to you and");
         StdDraw.text(.5, .56, "and at the very last second transforms into a horrifying");
         StdDraw.text(.5, .52, "demon. You are swept up and and on your way to hell.");
         StdDraw.text(.5, .48, "GAME OVER");
         StdDraw.text(.5, .4, "End");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         Credits();
            
         return optionSub;
      }// This is the bad ending
      else
         return optionSub;      
      
      }// End (possible) insta death 4
      
      else if( playerScore == 105)
      {
         StdDraw.text(.5, .9, "As you continue walking you come across a long strip of");
         StdDraw.text(.5, .85, "hard ground leading off into a glow in the distance.");
         
      StdDraw.text(.2, .28, "Follow the"); // option 2
      StdDraw.text(.2, .24, "hard ground");
      StdDraw.text(.2, .20, "to its end.");
             
      StdDraw.text(.5, .28, "Ignore it"); // option 2
      StdDraw.text(.5, .24, "and keep");
      StdDraw.text(.5, .20, "walking.");
                  
      while( !done)
      {
         if( StdDraw.mousePressed() )
         {
            double n, m;
            n = StdDraw.mouseX();
            m = StdDraw.mouseY();
      
            if(.08 < n && n < .32 && .08 < m && m < .32)
               {
                  optionSub = 1;
                  done = true;
               }
            else if ( .38 < n && n< .62 && .08 < m  && m < .32)
               {
                  optionSub = 2;
                  done = true;
               }
          }// End mousePressed if
      }// End while statement

               
      if( optionSub == 1)
      {
         StdDraw.text(.5, .68, "You walk for a long period of time when you start");
         StdDraw.text(.5, .64, "hearing a noise. Its faint at first but grows the");
         StdDraw.text(.5, .6, "the closer you get to the glow. When you are almost");
         StdDraw.text(.5, .56, "on top of the glow you realize that the song is AC/DC's");
         StdDraw.text(.5, .52, "Highway to Hell. You are going/in Hell.");
         StdDraw.text(.5, .48, "GAME OVER");
         StdDraw.text(.5, .4, "End");
         
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         Credits();
         
         return optionSub;
      }// This is the bad ending
      else
         return optionSub;      
      
      }// End (possible) insta death 5
      
      else if ((playerScore < -5) || (playerScore > 90)) //to hell
      {
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.filledSquare(.5, .5, .5);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.text(.5, .8, "Suddenly the ground cracks open beneath you.");
      StdDraw.text(.5, .75,"You fall down into the deep abyss.");
      StdDraw.text(.5, .65, "Your fate has been decided,");
      StdDraw.text(.5, .6, "You're a sinner on your way to Hell.");
      StdDraw.text(.5, .5, "GAME OVER");
      StdDraw.text(.5, .4, "End");
      
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         Credits();
         return optionSub;
      }
   else if ((playerScore > 5) || (playerScore < 90)) //to heaven
      {
      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.filledSquare(.5, .5, .5);
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.text(.5, .8, "The mist begins to change.");
      StdDraw.text(.5, .75,"It condenses around you in a thick fluffy cloud");
      StdDraw.text(.5, .7,  "It begins to rise up, taking you with it,");
      StdDraw.text(.5, .6,"You have redeemed yourself");
      StdDraw.text(.5, .55, "You're going to Heaven.");
      StdDraw.text(.5, .5, "GAME OVER");
      StdDraw.text(.5, .4, "End");
      
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         Credits();
         return optionSub;
      }
   else //to purgatory forever
      {
      StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
      StdDraw.filledSquare(.5, .5, .5);
      StdDraw.setPenColor(StdDraw.DARK_GRAY);
      StdDraw.text(.5, .8, "You continue to walk, and walk, and walk,");
      StdDraw.text(.5, .75, "but the mist never changes.");
      StdDraw.text(.5, .65, "You will wonder there for an eternity,");
      StdDraw.text(.5, .6, "forever trapped in Purgatory.");
      StdDraw.text(.5, .5, "GAME OVER");
      StdDraw.text(.5, .4, "End");
      
         PageClear();
         StdDraw.show(300);
         StdDraw.show();
         Credits();
         return optionSub;
      }
            
   }// end Endings method
   
   
   public static void Credits()
   {
     StdDraw.setPenColor(StdDraw.BLACK);
     StdDraw.filledSquare(.5, .5, .5);
     StdDraw.setPenColor(StdDraw.WHITE);
     
     StdDraw.text(.5, .9, "Thanks for playing!!!");
     StdDraw.text(.5, .7, "Created by: ");
     StdDraw.text(.5, .6, "Natalie Jacobson");
     StdDraw.text(.5, .5, "Lyndisty Littell");
     StdDraw.text(.5, .4, "Rome Hamm");
     
     StdDraw.text(.5, .2, "CS 114H 2015");
   }

}// End class PurgatoryRPG



  

