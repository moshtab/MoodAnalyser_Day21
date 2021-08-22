# MoodAnalyser_ExceptionHandling_Day21

uc1 :- Given a Message, ability to analyse and respond Happy or Sad Mood 

 - Create MoodAnalyser Object 

 - Call analyseMood function with message as parameter and return Happy or Sad Mood
 
uc1.1 :-  Given “I am in Sad Mood” message Should Return SAD analyseMood method can just return SAD to pass this Test Case (TC)

uc1. :- Given “I am in Any Mood” message Should Return HAPPY To make the Test case pass analyseMood method need to check for Sad else return HAPPY

Refactor :- Refactor the code to take the mood message in Constructor

- Note:

- MoodAnalyser will have a message Field

- MoodAnalyser will have 2 Constructors – Default - MoodAnalyser() and with Parameters – MoodAnalyser(message)

- analyseMood method will change to support no parameters and use message Field defined for the Class

uc2 :- Handle Exception if User Provides Invalid Mood

 - Like NULL
 
uc2.1 :- Given Null Mood Should Return Happy

 To make this Test Case pass Handle NULL Scenario using try catch and return Happy  
 
uc3 :- Inform user if entered Invalid Mood

- In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException

- Use Enum to differentiate the Mood Analysis Errors

u3.1 :- Given NULL Mood Should Throw MoodAnalysisException

To pass this Test Case in try catch block throw MoodAnalysisException

uc3.2 :- Given Empty Mood Should Throw MoodAnalysisException indicating Empty Mood Handle Empty Mood Scenario throw MoodAnalysisException and inform user of the EmptyMood

HINT: Use Enum to EMPTY or NULL
