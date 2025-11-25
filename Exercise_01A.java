public static void fct_01a(int a, int b) {
    System.out.println(a + b);
}
public static void main(String[] args) {
    int x = 1;
    for (int cpt = 1; cpt < 4; ++cpt) {
        fct_01a(cpt, x);
        x += 2;
    }
}

// cpt = 01 / x = 01 / sout => 02 / x = 03
// cpt = 02 / x = 03 / sout => 05 / x = 05
// cpt = 03 / x = 05 / sout => 08 / x = 07
// cpt = 04 => Sortie de la boucle for !
