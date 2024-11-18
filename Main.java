/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

             // java encapsulation = shouldnt modify by other part of codes 
class Person {
    // Encapsulate name and age 
    // methode defined 
    private String name;  //declaring data structer
    private int age; 
    
    public String getName() {
        return name;
    }
    public void setName(String name ) {   // declaring behavior 
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age= age;
    }
}

// driver classes 
// La classe Main sert uniquement de point de départ pour exécuter le programme.
public class Main {
    // Main function 
    public static void main(String[] args){ // static apartient a la class meme , void montre que main sert uniquement à exécuter des actions, pas à renvoyer un résultat.
        // person object created 
        Person  person = new Person();
        person.setName("john");
        person.setAge(30);
        
        //using methode to get the value from 
        // variables 
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    
    }
}


