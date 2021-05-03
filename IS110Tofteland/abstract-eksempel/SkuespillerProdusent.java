/**
 * Siden vi bruker interface istedenfor abstrakte klasser kan vi implementere
 * både Skuespiller og Produsent. Her defineres en ny SkuespillerProdusent
 * interface som extender begge for å illustrere en skuespiller som produserer
 * egene filmer.
 */

public interface SkuespillerProdusent extends Skuespiller, Produsent
{

}