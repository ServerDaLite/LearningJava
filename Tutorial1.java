// These double forward slashes (//) are commends
/*
* This is a multiline comment
* They start with a (/*) and ends with */

/*
What is a programming language?
    - The developer gives the computer instructions on what it does. It reads from top to bottom, left to right. Like you reading a book.

    - Imagine all of the world languages. We have German, English, Spanish, Italian, etc.... They all say things differently but they all mean the same thing. Like for instance English and Spanish have different sayings for apple but they both are realating to the item 'Apple'. So we can think of this has programming languages. There are different programming languages but they all are doing the same thing, giving the computer instructions.

What is a syntax?
    - A syntax is a word that is accepted by the programming language
    
What is an error?
    - an error is when something is wrong within your code and the computer is having a hard time understanding this concept that you have written.
    
What is a header?
    - a header is a sentence that defines what code is put within curly braces ({}).
    
What is a method?
    - it is a block of code that runs when called. A block of code contains a header (sentence) and the body ({}).
*/

/*
Some basic syntax:
    public:
        - basically making that sentence public to other pieces of code.
    class:
        - The basic building block of all java scripts. You need this to consider a code a java runnable file.
    
    static:
        - used for running code without calling the class that has that code.
        
    void:
        - nothing is returning to that block of code.
    
    {}:
        - Basically allows you to group things together that falls under that header catagory.
*/

// The way that you would create a class is by making it public, adding the class keyword, then name the class by putting the file name as the name. If your classname and your filename is not exactly the same. it would give you an error. EXAMPLE: 'public class Main'
public class Main {
    // If you are running a file, you must have a main method. This allows the program know where to start.
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    };
};
