package src.main.com.keyin.qap.simplestuff;

public class SimpleClass {
//    private String animal;

    public String outputNoise(String animal){
        String animalNoise;
        if (animal == "pig"){
            animalNoise = "oink oink";
            return animalNoise;
        } else if (animal == "cow"){
            animalNoise = "moOOoo";
            return animalNoise;
        } else{
            String errorMessage = "incorrect value; please choose cow or pig"
            System.out.println(errorMessage);
        }
    }
}
