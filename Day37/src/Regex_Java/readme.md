### Regex in Java.
* Regular Expressions or Regex (in short) in Java is an API for defining String patterns that can be used for searching, manipulating, and editing a string in Java. Email validation and passwords are a few areas of strings where Regex is widely used to define the constraints. Regular Expressions are provided under java.util.regex package. This consists of 3 classes and 1 interface. The java.util.regex package primarily consists of the following three classes as depicted below in tabular format as follows:

| Class/Interface              | Description                                                      |
|------------------------------|------------------------------------------------------------------|
| Pattern Class                | Used for defining patterns                                       |
| Matcher Class	               | Used for performing match operations on text using patterns      |
| PatternSyntaxException Class | Used for indicating syntax error in a regular expression pattern |
| MatchResult Interface	       | Used for representing the result of a match operation            |

#### Class 1: Pattern Class
* This class is a compilation of regular expressions that can be used to define various types of patterns, providing no public constructors. This can be created by invoking the compile() method which accepts a regular expression as the first argument, thus returns a pattern after execution.

| Method                                    | Description                                                                                                                                           |
|-------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| compile(String regex)                     | It is used to compile the given regular expression into a pattern.                                                                                    |
| compile(String regex, int flags)          | It is used to compile the given regular expression into a pattern with the given flags.                                                               |
| flags()                                   | It is used to return this pattern’s match flags.                                                                                                      |
| matcher(CharSequence input)               | It is used to create a matcher that will match the given input against this pattern.                                                                  |
| matches(String regex, CharSequence input) | It is used to compile the given regular expression and attempts to match the given input against it.                                                  |
| pattern()                                 | It is used to return the regular expression from which this pattern was compiled.                                                                     |
| quote(String s)                           | It is used to return a literal pattern String for the specified String.                                                                               |
| split(CharSequence input)                 | It is used to split the given input sequence around matches of this pattern.                                                                          |
| split(CharSequence input, int limit)      | It is used to split the given input sequence around matches of this pattern. The limit parameter controls the number of times the pattern is applied. |
| toString()                                | 	It is used to return the string representation of this pattern.                                                                                      |

```bash
// Main class
class Main {
    // Main driver method
    public static void main(String args[])
    {
 
        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern
        // "geeksforge*ks"
        System.out.println(Pattern.matches(
            "geeksforge*ks", "geeksforgeeks"));
 
        // Following line prints "false" because the whole
        // text "geeksfor" doesn't match pattern "g*geeks*"
        System.out.println(
        Pattern.matches("g*geeks*", "geeksfor"));
    }
}
```

#### Class 2: Matcher class
* This object is used to perform match operations for an input string in java, thus interpreting the previously explained patterns. This too defines no public constructors. This can be implemented by invoking a matcher() on any pattern object.

| Method          | Description                                                                                                                                                          |
|-----------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| find()          | 	It is mainly used for searching multiple occurrences of the regular expressions in the text.                                                                        |
| find(int start) | 	It is used for searching occurrences of the regular expressions in the text starting from the given index.                                                          |
| start()         | It is used for getting the start index of a match that is being found using find() method.                                                                           |
| end()           | 	It is used for getting the end index of a match that is being found using find() method. It returns the index of the character next to the last matching character. |
| groupCount()    | It is used to find the total number of the matched subsequence.                                                                                                      |
| group()         | 	It is used to find the matched subsequence.                                                                                                                         |
| matches()       | It is used to test whether the regular expression matches the pattern.                                                                                               |

* **Note:** T Pattern.matches() checks if the whole text matches with a pattern or not. Other methods (demonstrated below) are mainly used to find multiple occurrences of patterns in the text.

####  Pattern searching 
```bash
// Main class
class GFG {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Create a pattern to be searched
        // Custom pattern
        Pattern pattern = Pattern.compile("geeks");
 
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeksforgeeks.org");
 
        // Finding string using find() method
        while (m.find())
 
            // Print starting and ending indexes
            // of the pattern in the text
            // using this functionality of this class
            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
    }
}
```

#### split() method to split a text based on a delimiter pattern.
* The string split() method breaks a given string around matches of the given regular expression. There exist two variations of this method so do go through it prior to moving onto the implementation of this method.
```bash
// Main class
class GFG {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Custom string
        String text = "geeks1for2geeks3";
 
        // Specifies the string pattern
        // which is to be searched
        String delimiter = "\\d";
        Pattern pattern = Pattern.compile(
            delimiter, Pattern.CASE_INSENSITIVE);
 
        // Used to perform case insensitive search of the
        // string
        String[] result = pattern.split(text);
 
        // Iterating using for each loop
        for (String temp : result)
            System.out.println(temp);
    }
} 
```

####  PatternSyntaxException Class
* This is an object of Regex which is used to indicate a syntax error in a regular expression pattern and is an unchecked exception. Following are the methods been there up in the PatternSyntaxException class as provided below in tabular format as follows.

| Method            | Description                                                                                                                                                                                                     |
|-------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| getDescription()	 | It is used to retrieve the description of the error.                                                                                                                                                            |
| getIndex()        | It is used to retrieve the error index.                                                                                                                                                                         |
| getMessage()      | It is used to return a multi-line string containing the description of the syntax error and its index, the erroneous regular-expression pattern, and a visual indication of the error index within the pattern. |
| getPattern()      | It is used to retrieve the erroneous regular-expression pattern.                                                                                                                                                |


####  MatchResult Interface
* This interface is used to determine the result of a match operation for a regular expression. It must be noted that although the match boundaries, groups, and group boundaries can be seen, the modification is not allowed through a MatchResult. Following are the methods been there up here in this interface as provided below in tabular format as follows:

| Method           | Description                                                                                                                |
|------------------|----------------------------------------------------------------------------------------------------------------------------|
| end()            | It is used to return the offset after the last character is matched.                                                       |
| end(int group)   | 	It is used to return the offset after the last character of the subsequence captured by the given group during this match. |
| 	group()         | It is used to return the input subsequence matched by the previous match.                                                  |
| group(int group) | It is used to return the input subsequence captured by the given group during the previous match operation.                |
| groupCount()     | 	It is used to return the number of capturing groups in this match result’s pattern.                                       |
|  groupCount()                | It is used to return the number of capturing groups in this match result’s patter                                                                                                                           |
|  start()                            |It is used to return the start index of the match.|
|  start(int group)                            | It is used to return the start index of the subsequence captured by the given group during this match.                                                                                                                                                                                                            |


### Flags
* Flags in the compile() method change how the search is performed. Here are a few of them:
  * Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
  * Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
  * Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet


### Regular Expression Patterns
* The first parameter of the Pattern.compile() method is the pattern. It describes what is being searched for.
* Brackets are used to find a range of characters:

| Expression | Description                                              |
|------------|----------------------------------------------------------|
| [abc]      | Find one character from the options between the brackets |
| [^abc]     | Find one character NOT between the brackets              |
| [0-9]      | Find one character from the range 0 to 9                 |


### Metacharacters
* Metacharacters are characters with a special meaning:

| Metacharacter | Description                                                                                        |
|---------------|----------------------------------------------------------------------------------------------------|
| &#124;        | Find a match for any one of the patterns separated by &#124; as in: cat&#124;dog&#124;fish         |
| .             | Find just one instance of any character                                                            |            
| ^             | 	Finds a match as the beginning of a string as in: ^Hello                                          |
| $             | Finds a match at the end of the string as in: World$                                               |
| \d            | 	Find a digit                                                                                      |
| \s            | Find a whitespace character                                                                        |
| \b            | Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD |
| \uxxxx        | Find the Unicode character specified by the hexadecimal number xxxx                                |

### Quantifiers
* Quantifiers define quantities:

| Quantifier | Description                                                    |
|------------|----------------------------------------------------------------|
| n+         | Matches any string that contains at least one n                |
| n*         | Matches any string that contains zero or more occurrences of n |
| n?         | Matches any string that contains zero or one occurrences of n  |
| n{x}       | Matches any string that contains a sequence of X n's           |
| n{x,y}     | Matches any string that contains a sequence of X to Y n's      |
| n{x,}      | Matches any string that contains a sequence of at least X n's  |


### Important notes.
* We create a pattern object by calling Pattern.compile(), there is no constructor. compile() is a static method in Pattern class.
* Pattern.matches() is also a static method that is used to check if given text as a whole matches pattern or not.
* find() is used to find multiple occurrences of patterns in the text.
* We can split a text based on a delimiter pattern using the split() method

### Important resources.
* [Regex in Java - geeks for geeks](https://www.geeksforgeeks.org/regular-expressions-in-java/)
* [Regex in Java - w3Schools](https://www.w3schools.com/java/java_regex.asp)
