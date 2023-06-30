//which object has the most reference variables referring to it?

class Bees {
    Honey[] beeHoney;
}

class Raccoon {
    Kit rk;
    Honey rh;
}

class Kit {
    Honey honey;
}

class Bear {
    Honey hunny;
}

public class Honey {
    public static void main(String[] args) {
        Honey honeyPot = new Honey();
        Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot};
        Bees bees = new Bees();
        bees.beeHoney
        Bear[] bears = new Bear[5];
        for (int x = 0; x < 5; x++) {
            bears[x] = new Bear();
            bears[x].hunny = honeyPot;
        }
        Kit kit = new Kit();
        kit.honey = honeyPot;
        Raccoon raccoon = new Raccoon();

        raccoon.rh = honeyPot;
        raccoon.rk = kit;
        kit = null;
    }
}

//which object has the most reference variables referring to it?

//raccoon tem 2 variáveis de referência referindo-se a ele: rk e rh