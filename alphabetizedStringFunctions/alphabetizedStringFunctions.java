//alphabetizedStringFunctions
public class alphabetizedStringFunctions {

//
public static String alphabet = "  The  quick  brown fox jumps  over the  lazy dog.";

public static void main (String[] args)
{
  System.out.println(alphabet);
  String remainingPhrase = alphabet.toLowerCase();
  remainingPhrase = remainingPhrase.trim();
  int periodPositionI = remainingPhrase.indexOf(".");
  String periodPositionS = remainingPhrase.substring(periodPositionI, periodPositionI+1);
  Boolean periodPositionB = periodPositionS.equals(".");
  //System.out.println(periodPositionB);
  remainingPhrase = remainingPhrase.substring(0, periodPositionI);
  int word1space = remainingPhrase.indexOf(" ");
  String word1 = remainingPhrase.substring(0, word1space);
  //Boolean word1True;
  /*if ( word1space == word1.length() ) {
    word1True = true;
  } else {
    word1True = false; //Problem if false
  }*/
  System.out.println(word1);
  remainingPhrase = remainingPhrase.substring(word1space, periodPositionI);
  remainingPhrase = remainingPhrase.trim();
  periodPositionI = remainingPhrase.length();
  int word2space = remainingPhrase.indexOf(" ");
  String word2 = remainingPhrase.substring(0, word2space);
  System.out.println(word2);
  //Third Word
  remainingPhrase = remainingPhrase.substring(word2space, periodPositionI);
  remainingPhrase = remainingPhrase.trim();
  periodPositionI = remainingPhrase.length();
  int word3space = remainingPhrase.indexOf(" ");
  String word3 = remainingPhrase.substring(0, word3space);
  System.out.println(word3);
  //
  remainingPhrase = remainingPhrase.substring(word3space, periodPositionI);
  remainingPhrase = remainingPhrase.trim();
  periodPositionI = remainingPhrase.length();
  int word4space = remainingPhrase.indexOf(" ");
  String word4 = remainingPhrase.substring(0, word4space);
  System.out.println(word4);
  //
  remainingPhrase = remainingPhrase.substring(word4space, periodPositionI);
  remainingPhrase = remainingPhrase.trim();
  periodPositionI = remainingPhrase.length();
  int word5space = remainingPhrase.indexOf(" ");
  String word5 = remainingPhrase.substring(0, word5space);
  System.out.println(word5);
  //
  remainingPhrase = remainingPhrase.substring(word5space, periodPositionI);
  remainingPhrase = remainingPhrase.trim();
  periodPositionI = remainingPhrase.length();
  int word6space = remainingPhrase.indexOf(" ");
  String word6 = remainingPhrase.substring(0, word6space);
  System.out.println(word6);
  //
  remainingPhrase = remainingPhrase.substring(word6space, periodPositionI);
  remainingPhrase = remainingPhrase.trim();
  periodPositionI = remainingPhrase.length();
  int word7space = remainingPhrase.indexOf(" ");
  String word7 = remainingPhrase.substring(0, word7space);
  System.out.println(word7);
  //
  remainingPhrase = remainingPhrase.substring(word7space, periodPositionI);
  remainingPhrase = remainingPhrase.trim();
  periodPositionI = remainingPhrase.length();
  int word8space = remainingPhrase.indexOf(" ");
  String word8 = remainingPhrase.substring(0, word8space);
  System.out.println(word8);
  //
  remainingPhrase = remainingPhrase.substring(word8space, periodPositionI);
  remainingPhrase = remainingPhrase.trim();
  periodPositionI = remainingPhrase.length();
  int word9space = remainingPhrase.indexOf(" ");
  String word9 = remainingPhrase.substring(0, periodPositionI);
  System.out.println(word9);
  }
}
