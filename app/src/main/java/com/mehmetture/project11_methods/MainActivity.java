package com.mehmetture.project11_methods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");

        testMethod();

        System.out.println(math(3,6));

        System.out.println(newMethod("taycan"));

        username = "parzi";

        System.out.println("oncreate username: " + username);

        makeMusicians();
        makeSimpsons();
    }

    public void makeMusicians(){

     Musicians james = new Musicians("james","guitar",47);
        System.out.println(james.instrument);
        System.out.println(james.age);
        System.out.println(james.name);

    }

    public void makeSimpsons(){

        Simpsons homer = new Simpsons("Homer", 50, "Nuclear");

        System.out.println(homer.getAge());

        homer.setAge(55);
        System.out.println(homer.getAge());

        homer.setName("Homer Simpson");
        System.out.println(homer.getName());

    }






    public void testMethod(){
        int x = 4 + 4 ;
        System.out.println("value of x: " + x);
    }

    public int math(int a , int b){

        return a + b;
    }

    public String newMethod(String string){

        return string + " new Method";
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("on resume called");

        username = "alcatraz";

        System.out.println("onresume username: " + username);
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");

        username = "lazarus";

        System.out.println("onstop username: " + username);







    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("on pause called");

        username = "kalibre";

        System.out.println("onpause username: " + username);
    }
}