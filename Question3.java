// 520. Detect Capital
// https://leetcode.com/problems/detect-capital/
public class Question3 {
  public boolean detectCapitalUse(String word) {
    return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
      /* first: all uppercase letters, one or more; + is GREEDY
        -it causes the regex engite to repeat the preceding token
         as often as possible. Only if it causes the regex engine
         to fail, the regex engine will backtrack.
         second: all lowercase letters, one or more;
         third: first character class matches one token (uppercase beggining of a word)
         second character class matches 1 or more token of lowercase letters!
      */
  }
}

/* Could've also done it using the ASCII table instead of the Regex engine, but it's far
    more*/