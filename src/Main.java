import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("===========1uzduotis=========");

        for (int i = 0; i < 4; i++) {
            System.out.println("labas");

        }

        System.out.println("=============2uzduotis=========");


        int skaic = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Skaiciai nuo: " + skaic);
            skaic++;

        }
        System.out.println("=========3uzduotis========");

        String[] augalai = {"aguona", "abrikosas", "bambukas", "bananas", "pele", "mele", "roze", "piene",
                "zalia", "raudona"};


        System.out.println("=========4uzduotis==========");

        String[] augalai2 = {"aguona", "abrikosas", "bambukas", "bananas", "pele", "mele", "roze", "piene",
                "zalia", "raudona"};

        for (int i = 0; i < augalai2.length; i++) {
            System.out.println(augalai2[i]);
        }

        System.out.println("==========5uzduotis==========");


        for (int a = augalai2.length - 1; a >= 0; a--) {
            System.out.println(augalai2[a]);
        }
        System.out.println("==========6uzduotis==========");

        for (int i = 10; i < 50; i += 2) {
            System.out.println(i);
        }
        System.out.println("=============7uzduotis==========");


        for (int i = 10; i <= 50; i += 2) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i + " ");

        }
        System.out.println("============8uzduotis================");


        int skaiciuokle = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                skaiciuokle++;
            }
        }
        System.out.println("poriniai skaiciai: " + skaiciuokle);

        System.out.println("============9uzduotis===========");

        //Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai,
        // ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)

        String[] augalai3 = {"aguona", "abrikosas", "bambukas", "bananas", "pele", "mele", "roze", "piene",
                "zalia", "raudona"};

        int trumpi = 0;
        int ilgi = 0;
//Skaiciuoja kiek zodziu yra iki 5 raidziu
        for (int i = 0; i < augalai3.length; i++) {
            if (augalai3[i].length() < 5) {
                trumpi++;
            }

        }
        System.out.println("trumpi " + trumpi);
//Suskaiciuoja kiek zodziu yra septyniu raidziu lygiai arba daugiau
        for (int i = 0; i < augalai3.length; i++) {
            if (augalai3[i].length() >= 7) {
                ilgi++;
            }

        }
        System.out.println("ilgi: " + ilgi);

        //Suskaičiuokite kiek 3čio uždavinio masyve
        // yra žodžių ilgesnių nei 5 simboliai bet trumpesnių
        // nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)

        System.out.println("=========uzdavinys10=========");

        String[] keturi = {"aguona", "abrikosas", "bambukas", "bananas", "pele", "mele", "roze", "piene",
                "zalia", "raudona"};

        int tarpas = 0;

        for (int i = 0; i < keturi.length; i++) {
            if (keturi[i].length() > 5 && keturi[i].length() < 10)
                tarpas++;

        }
        System.out.println("tame tarpe raidziu nuo 5 iki 10: " + tarpas);

        System.out.println("==============sunkesni1==========");

        System.out.println();

        //Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300,
        // atspausdinkite juos atskirtus tarpais ir suskaičiuokite kiek tarp jų yra didesnių už 150.
        // Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.


        int mazesnineivpo = 0;


//Kaip padaryti skaicius tarpais?

        for (int i = 0; i < 300; i++) {
            int randomi = 1 + (int) (Math.random() * 300);
            if (randomi > 150) {
                mazesnineivpo++;
            }
            if (randomi > 275) {
                System.out.print("[" + randomi + "]");
            } else {
                System.out.print(randomi + ",");
            }

        }


        System.out.println("randomi: " + mazesnineivpo);

        System.out.println("=================sunkesne2===========");

        System.out.println();
        String result = "";
        for (int j = 1; j < 3000; j++) {
            if (j % 77 == 0) {
                result += j + ",";
            }
        }
        System.out.println(result.substring(0, result.length() - 1));


        System.out.println("==============sunkesnis3==========");
        System.out.println();

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("============sunkesnis4============");

        String symbol = "*";

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                if (i == j || i + j == 24) {
                    System.out.print("0");
                } else {
                    System.out.print(symbol);
                }

            }
            System.out.println();
        }

        System.out.println("============sunkesnis5==========");
        //Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija,
        // kur 0 yra herbas, o 1 - skaičius.
        // Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje:
        // “S” jeigu iškrito skaičius ir “H” jeigu herbas.
        // Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
        //Iškritus herbui;
        //Tris kartus iškritus herbui;
        //Tris kartus iš eilės iškritus herbui;


        boolean gamble = true;
        while (gamble) {
            int matematika = (int) Math.floor(Math.random() * 2);
            if (matematika == 0) {
                System.out.println("H");
                gamble = false;
            } else {
                System.out.println("S");
            }
        }


        System.out.println("5b");
        int countsHerbs = 0;

        while (true) {
            int matematika = (int) Math.floor(Math.random() * 2);
            if (matematika == 0) {
                System.out.println("H");
                countsHerbs++;
            } else {
                System.out.println("S");
            }
            if (countsHerbs == 3) {
                break;
            }

        }

        System.out.println("5c");
        countsHerbs = 0;

        while (true) {
            int matematika = (int) Math.floor(Math.random() * 2);
            if (matematika == 0) {
                System.out.println("H");
                countsHerbs++;
            } else {
                System.out.println("S");
                countsHerbs = 0;
            }
            if (countsHerbs == 3){
                break;
            }
        }
        System.out.println("====================NAUJA TEMA==============");


git config --global user.name "D0D0Cat"
        git config --global user.email "tomaskatalinas@gmail.com"
















    }
}
