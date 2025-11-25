// Une constante utilisable partout
static final int MAX = 4;
public static int fct_01b(int n) {
    int somme = 0;
    while(n < MAX) {
        somme += n;
        ++n;
    }
    return somme;
}
public static void main(String[] args) {
    for (int cpt = 1; cpt < MAX; ++cpt)
        System.out.println(fct_01b(cpt));
}

// cpt = 01 / 01 < MAX / somme = 01
//          / 02 < MAX / somme = 03
//          / 03 < MAX / somme = 06
//          / 04 < MAX => On sort de la boucle for de la fonction !
// sout => 6
// cpt = 02 / 02 < MAX / somme = 02
//          / 03 < MAX / somme = 05
//          / 04 < MAX => On sort de la boucle for de la fonction !
// sout => 5
// cpt = 03 / 03 < MAX / somme = 03
//          / 04 < MAX => On sort de la boucle for de la fonction !
// sout => 3
// cpt = 04 => On sort de la boucle for du main !
