[TOC]

# Regex Duplicated Words

```java
public static void main(String[] args) {

    String regex = "\\b(\\w+)(\\b\\W+\\1\\b)*";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());

    while (numSentences-- > 0) {
    String input = in.nextLine();

    Matcher m = p.matcher(input);

    // Check for subsequences of input that match the compiled pattern
    while (m.find()) {
    input = input.replaceAll(m.group(), m.group(1));
    }

    // Prints the modified sentence.
    System.out.println(input);
    }

    in.close();
    }

```

Regex:
```java
// ( : Grouping starts
// \b : Any word boundary
// \W+ : Any non-word character
// \1 : Select repeated words
// \b : Un select if it repeated word is joined with another word
// ) : Grouping ends

```
        
Match:
```java
// m.group  the entire matched
// m.group(1) the first matched

```
