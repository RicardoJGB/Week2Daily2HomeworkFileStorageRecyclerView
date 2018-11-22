package com.mobileapps.week2daily2homework_filestoragerecyclerview;

import android.widget.ImageView;

public class Animals {

    String CommonName;
    String Family;
    String Species;
    String AnimalPic;


    public Animals(String commonName, String family, String species, String animalPic) {
        this.CommonName = commonName;
        this.Family = family;
        this.Species = species;
        this.AnimalPic=animalPic;

    }

    public String getCommonName() {
        return CommonName;
    }

    public void setCommonName(String commonName) {
        CommonName = commonName;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getAnimalPic() {

        return AnimalPic;
    }

    public void setAnimalPic(String animalPic) {
        AnimalPic = animalPic;
    }


}
