
# Regex Extract Content 


```java
public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        
        // group1: (.+) 任意字符，1到多次
        // group2: ([^<]+) 除了<外的任意字符，1到多次
        // \1:  重复group1，在enclosed tag的解析中非常有用
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        
		while(testCases>0){
			String line = in.nextLine();
			
          	List<String> contents = extractContents(line, pattern);
            if (contents != null && !contents.isEmpty()) {
                contents.forEach(c -> System.out.println(c));
            } else {
                System.out.println("None");
            }
            
			
			testCases--;
		}
        in.close();
	}
    
    private static List<String> extractContents(String text, Pattern pattern) {
        Matcher matcher = pattern.matcher(text);
        List<String> contents = new ArrayList<>();
        while (matcher.find()) {
            contents.add(matcher.group(2)); // group 1 is tag
        }
        return contents;
    }
}

```


References:
- https://www.thepoorcoder.com/hackerrank-tag-content-extractor-solution/

