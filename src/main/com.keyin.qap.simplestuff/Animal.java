package src.main.com.keyin.qap.simplestuff;

public class Animal {
    private String nameOfAnimal;
    private String speciesOfAnimal;
    private int ageOfAnimal;

    public Animal(String newAnimalName, String newAnimalSpecies, int newAnimalAge) {
        if (newAnimalSpecies == "cat"){
            String animalNoise = "meow";
        }
        if (newAnimalSpecies == "dog") {
            String animalNoise = "woof";
        }
        this.nameOfAnimal = newAnimalName;
        this.speciesOfAnimal = newAnimalSpecies;
        this.ageOfAnimal = newAnimalAge;
        String animalNoise;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public String getSpeciesOfAnimal() {
        return speciesOfAnimal;
    }

    public void setSpeciesOfAnimal(String speciesOfAnimal) {
        this.speciesOfAnimal = speciesOfAnimal;
    }

    public int getAgeOfAnimal() {
        return ageOfAnimal;
    }

    public void setAgeOfAnimal(int ageOfAnimal) {
        this.ageOfAnimal = ageOfAnimal;
    }

    public String getAnimalNoise(){

        if(speciesOfAnimal == "cat"){
            return "maowww";
        } else if (speciesOfAnimal == "dog") {
            return "rruhhh";

        } else{
            return "some other noise";
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameOfAnimal='" + nameOfAnimal + '\'' +
                ", speciesOfAnimal='" + speciesOfAnimal + '\'' +
                ", ageOfAnimal=" + ageOfAnimal +
                '}'+ getAnimalNoise();
    }
}
