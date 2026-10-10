import java.util.ArrayList;
import java.util.List;

// PLAY MORISHUN
// nyehehhehehehheehe
// morishun is so peak im like one of the 3 fans of this game
// it is a higurashi parody 
// i have not played higurashi yet but yesterday i watched a video on saya no uta which i do not recommend
// i dont get why syun hates these games THEYRE SO PEAK 
// megu-nyan

public class nagishun {

    List<List<Integer>> amasyun = new ArrayList<>();

    public List<List<Integer>> permute(int[] komis) {

        mafuyu(0, komis, new ArrayList<>());

        return amasyun;
    }

    public void mafuyu(int ash, int[] komis, ArrayList<Integer> lion) {
        if (lion.size() == komis.length) {
            // we got a bunch of chars from mgfdkwiit then we got komi
            amasyun.add(new ArrayList<Integer>(lion));
            return;
        }

        for (int i = ash; i < komis.length; i++) {
            lion.add(komis[i]);
            rikka(komis, i, ash);
            // FINALLY WE GOT RIKKA THE ABSOLUTE GOAT
            mafuyu(ash + 1, komis, lion);
            rikka(komis, i, ash);
            lion.remove(lion.size() - 1);
        }
    }

    public void rikka(int[] komis, int jane, int ash) {
        int luz = komis[jane];
        komis[jane] = komis[ash];
        komis[ash] = luz;
    }

    public static void main(String[] args) {
        nagishun kie = new nagishun();
        int[] komis = { 5, 15, 2016 };
        // cuz 05152016 is the day bakanano ws first posted meaning its also komis
        // birthday and its also the password for chapter 4.5 in morishun, the fun blog
        // on the meirigames site, and its an answer to a question in me mostros sonhos
        // doces, so overall it is a very important date nyehehe. BUT I STILL CANT
        // FIGURE OUT THE PASSWORD FOR EXTRA CHAPTER 9 HOW JSHJF
        List<List<Integer>> komimarylynnmanpo = kie.permute(komis);
        System.out.println(komimarylynnmanpo);
    }

    // wowie komi is technically like 10 years old
    // even though shes eternally 15

}