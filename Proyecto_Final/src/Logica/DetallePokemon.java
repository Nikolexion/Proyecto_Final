package Logica;

import javax.swing.*;
import java.awt.*;
/**
 * Enum que abarca todos los pokemones usados en el pokezoo, encapsulando su nombre, precio (el cual no pudo ser utilizado por falta
 * de tiempo), el enum relacionado al tipo de habitat y la direccion de su imagen respectiva
 * */
public enum DetallePokemon {
    SQUIRTLE("Squirtle", 100, Tipo.AGUA, "resources/Pokemones/Agua/Squirtle/Squirtle007.png"),
    WARTORTLE("Wartortle",200, Tipo.AGUA, "resources/Pokemones/Agua/Squirtle/Wartortle.png"),
    BLASTOISE("Blastoise",300, Tipo.AGUA, "resources/Pokemones/Agua/Squirtle/Blastoise009.png"),
    MAGIKARP("Magikarp",100, Tipo.AGUA, "resources/Pokemones/Agua/Magikarp/Magikarp129.png"),
    GYARADOS("Gyarados",300, Tipo.AGUA, "resources/Pokemones/Agua/Magikarp/Gyarados130.png"),
    LAPRAS("Lapras",200, Tipo.AGUA, "resources/Pokemones/Agua/Lapras/Lapras131.png"),
    OMANYTE("Omanyte",100, Tipo.AGUA, "resources/Pokemones/Agua/Omanyte/Omanyte138.png"),
    OMASTAR("Omastar",200, Tipo.AGUA, "resources/Pokemones/Agua/Omanyte/Omastar139.png"),
    TOTODILE("Totodile",100, Tipo.AGUA, "resources/Pokemones/Agua/Totodile/Totodile158.png"),
    CROCONAW("Croconaw",200, Tipo.AGUA, "resources/Pokemones/Agua/Totodile/Croconaw159.png"),
    FERALIGATR("Feraligatr",300, Tipo.AGUA, "resources/Pokemones/Agua/Totodile/Feraligatr160.png"),
    SUICUNE("Suicune",300, Tipo.AGUA, "resources/Pokemones/Agua/Suicune/Suicune245.png"),
    KYOGRE("Kyogre",300, Tipo.AGUA, "resources/Pokemones/Agua/Kyogre/Kyogre382.png"),
    BULBASAUR("Bulbasaur",100, Tipo.BOSQUE, "resources/Pokemones/Bosque/Bulbasaur/Bulbasaur001.png"),
    IVYSAUR("Ivysaur",200, Tipo.BOSQUE, "resources/Pokemones/Bosque/Bulbasaur/Ivysaur002.png"),
    VENUSAUR("Venusaur",300, Tipo.BOSQUE, "resources/Pokemones/Bosque/Bulbasaur/Venusaur003.png"),
    ODDISH("Oddish",100, Tipo.BOSQUE, "resources/Pokemones/Bosque/Oddish/Oddish043.png"),
    GLOOM("Gloom",100, Tipo.BOSQUE, "resources/Pokemones/Bosque/Oddish/Gloom044.png"),
    BELLOSSOM("Bellossom",300, Tipo.BOSQUE, "resources/Pokemones/Bosque/Oddish/Bellossom182.png"),
    VILEPLUME("Villeplume",400, Tipo.BOSQUE, "resources/Pokemones/Bosque/Oddish/Vileplume045.png"),
    BONSLY("Bonsly",100, Tipo.BOSQUE, "resources/Pokemones/Bosque/Bonsly/Bonsly438.png"),
    SUDOWOODO("Sudowoodo",200, Tipo.BOSQUE, "resources/Pokemones/Bosque/Bonsly/Sudowoodo185.png"),
    CHIKORITA("Chikorita",100, Tipo.BOSQUE, "resources/Pokemones/Bosque/Chikorita/Chikorita152.png"),
    BAYLEEF("Bayleef",200, Tipo.BOSQUE, "resources/Pokemones/Bosque/Chikorita/Bayleef153.png"),
    MEGANIUM("Meganium",300, Tipo.BOSQUE, "resources/Pokemones/Bosque/Chikorita/Meganium154.png"),
    TREECKO("Treecko",100, Tipo.BOSQUE, "resources/Pokemones/Bosque/Treecko/Treecko252.png"),
    GROVYLE("Grovyle",200, Tipo.BOSQUE, "resources/Pokemones/Bosque/Treecko/Grovyle253.png"),
    SCEPTILE("Sceptile",300, Tipo.BOSQUE, "resources/Pokemones/Bosque/Treecko/Sceptile254.png"),
    SNIVY("Snivy",100, Tipo.BOSQUE, "resources/Pokemones/Bosque/Snivy/Snivy495.png"),
    SERVINE("Servine", 200, Tipo.BOSQUE, "resources/Pokemones/Bosque/Snivy/Servine496.png"),
    SERPERIOR("Serperior",300, Tipo.BOSQUE, "resources/Pokemones/Bosque/Snivy/Serperior497.png"),
    PIDGEY("Pidgey",100, Tipo.CIELO, "resources/Pokemones/Cielo/Pidgey/Pidgey016.png"),
    PIDGEOTTO("Pidgeotto",200, Tipo.CIELO, "resources/Pokemones/Cielo/Pidgey/Pidgeotto017.png"),
    PIDGEOT("Pidgeot",300, Tipo.CIELO, "resources/Pokemones/Cielo/Pidgey/Pidgeot018.png"),
    DRATINI("Dratini",100, Tipo.CIELO, "resources/Pokemones/Cielo/Dratini/Dratini147.png"),
    DRAGONAIR("Dragonair",200, Tipo.CIELO, "resources/Pokemones/Cielo/Dratini/Dragonair148.png"),
    DRAGONITE("Dragonite",300, Tipo.CIELO, "resources/Pokemones/Cielo/Dratini/Dragonite149.png"),
    LUGIA("Lugia",300, Tipo.CIELO, "resources/Pokemones/Cielo/Lugia/Lugia249.png"),
    HO_OH("Ho-Oh",300, Tipo.CIELO, "resources/Pokemones/Cielo/Ho-Oh/Ho-Oh250.png"),
    SWABLU("Swablu",100, Tipo.CIELO, "resources/Pokemones/Cielo/Swablu/Swablu333.png"),
    ALTARIA("Altaria",200, Tipo.CIELO, "resources/Pokemones/Cielo/Swablu/Altaria334.png"),
    BAGON("Bagon",100, Tipo.CIELO, "resources/Pokemones/Cielo/Bagon/Bagon371.png"),
    SHELGON("Shelgon",200, Tipo.CIELO, "resources/Pokemones/Cielo/Bagon/Shelgon372.png"),
    SALAMENCE("Salamence",300, Tipo.CIELO, "resources/Pokemones/Cielo/Bagon/Salamence373.png"),
    RAYQUAZA("Rayquaza",300, Tipo.CIELO, "resources/Pokemones/Cielo/Rayquaza/Rayquaza384.png"),
    DIGLETT("Diglett",100, Tipo.CUEVA, "resources/Pokemones/Cueva/Diglett/Diglett050.png"),
    DUGTRIO("Dugtrio",200, Tipo.CUEVA, "resources/Pokemones/Cueva/Diglett/Dugtrio051.png"),
    GEODUDE("Geodude",100, Tipo.CUEVA, "resources/Pokemones/Cueva/Geodude/Geodude074.png"),
    GRAVELER("Graveler",200, Tipo.CUEVA, "resources/Pokemones/Cueva/Geodude/Graveler075.png"),
    GOLEM("Golem",300, Tipo.CUEVA, "resources/Pokemones/Cueva/Geodude/Golem076.png"),
    NOSEPASS("Nosepass",100, Tipo.CUEVA, "resources/Pokemones/Cueva/Nosepass/Nosepass299.png"),
    PROBOPASS("Probopass",200, Tipo.CUEVA, "resources/Pokemones/Cueva/Nosepass/Probopass476.png"),
    ARON("Aron",100, Tipo.CUEVA, "resources/Pokemones/Cueva/Aron/Aron304.png"),
    LAIRON("Lairon",200, Tipo.CUEVA, "resources/Pokemones/Cueva/Aron/Lairon305.png"),
    AGGRON("Aggron",300, Tipo.CUEVA, "resources/Pokemones/Cueva/Aron/Aggron306.png"),
    REGIROCK("Regirock",300, Tipo.CUEVA, "resources/Pokemones/Cueva/Regirock/Regirock377.png"),
    REGISTEEL("Registeel",300, Tipo.CUEVA, "resources/Pokemones/Cueva/Registeel/Registeel379.png"),
    GROUDON("Groudon",300, Tipo.CUEVA, "resources/Pokemones/Cueva/Groudon/Groudon383.png"),
    MAGNEMITE("Magnemite",100, Tipo.ELECTRICO, "resources/Pokemones/Electrico/Magnemite/Magnemite081.png"),
    MAGNETON("Magneton",200,Tipo.ELECTRICO,"resources/Pokemones/Electrico/Magnemite/Magneton082.png"),
    MAGNEZONE("Magnezone",300,Tipo.ELECTRICO,"resources/Pokemones/Electrico/Magnemite/Magnezone462.png"),
    VOLTORB("Voltorb",100, Tipo.ELECTRICO, "resources/Pokemones/Electrico/Voltorb/Voltorb100.png"),
    ELECTRODE("Electrode",200, Tipo.ELECTRICO, "resources/Pokemones/Electrico/Voltorb/Electrode101.png"),
    RAIKOU("Raikou",300,Tipo.ELECTRICO,"resources/Pokemones/Electrico/Raikou/Raikou243.png"),
    ZAPDOS("Zapdos",300, Tipo.ELECTRICO, "resources/Pokemones/Electrico/Zapdos/Zapdos145.png"),
    PICHU("Pichu",100, Tipo.ELECTRICO, "resources/Pokemones/Electrico/Pikachu/Pichu172.png"),
    PIKACHU("Pikachu",200, Tipo.ELECTRICO, "resources/Pokemones/Electrico/Pikachu/Pikachu025.png"),
    RAICHU("Raichu",300, Tipo.ELECTRICO, "resources/Pokemones/Electrico/Pikachu/Raichu026.png"),
    ARTICUNO("Articuno",300, Tipo.HIELO, "resources/Pokemones/Hielo/Articuno/Articuno144.png"),
    SNORUNT("Snorunt",100, Tipo.HIELO, "resources/Pokemones/Hielo/Snorunt/Snorunt361.png"),
    GLALIE("Glalie",200, Tipo.HIELO, "resources/Pokemones/Hielo/Snorunt/Glalie362.png"),
    FROSLASS("Froslass",300, Tipo.HIELO, "resources/Pokemones/Hielo/Snorunt/Froslass478.png"),
    SPHEAL("Spheal",100, Tipo.HIELO, "resources/Pokemones/Hielo/Spheal/Spheal363.png"),
    SEALEO("Sealeo",200, Tipo.HIELO, "resources/Pokemones/Hielo/Spheal/Sealeo364.png"),
    WALREIN("Walrein",300, Tipo.HIELO, "resources/Pokemones/Hielo/Spheal/Walrein365.png"),
    REGICE("Regice",300, Tipo.HIELO, "resources/Pokemones/Hielo/Regice/Regice378.png"),
    VANILLITE("Vanillite",100, Tipo.HIELO, "resources/Pokemones/Hielo/Vanillite/Vanillite582.png"),
    VANILLISH("Vanillish",200, Tipo.HIELO, "resources/Pokemones/Hielo/Vanillite/Vanillish583.png"),
    VANILLUXE("Vanilluxe",300, Tipo.HIELO, "resources/Pokemones/Hielo/Vanillite/Vanilluxe584.png"),
    PSYDUCK("Psyduck",100, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Psyduck/Psyduck054.png"),
    GOLDUCK("Golduck",200, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Psyduck/Golduck055.png"),
    WOOPER("Wooper",100, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Wooper/Wooper194.png"),
    QUAGSIRE("Quagsire",200, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Wooper/Quagsire195.png"),
    MUDKIP("Mudkip",100, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Mudkip/Mudkip258.png"),
    MARSHTOMP("Marshtomp",200, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Mudkip/Marshtomp259.png"),
    SWAMPERT("Swampert",300, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Mudkip/Swampert260.png"),
    LOTAD("Lotad",100, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Lotad/Lotad270.png"),
    LOMBRE("Lombre",200, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Lotad/Lombre271.png"),
    LUDICOLO("Ludicolo",300, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Lotad/Ludicolo272.png"),
    RELICANTH("Relicanth",100, Tipo.HUMEDAL, "resources/Pokemones/Humedal/Relicanth/Relicanth369.png"),
    CHARMANDER("Charmander",100, Tipo.LAVA, "resources/Pokemones/Lava/Charmander/Charmander004.png"),
    CHARMELEON("Charmeleon",200, Tipo.LAVA, "resources/Pokemones/Lava/Charmander/Charmeleon005.png"),
    CHARIZARD("Charizard",300, Tipo.LAVA, "resources/Pokemones/Lava/Charmander/Charizard006.png"),
    VULPIX("Vulpix",100, Tipo.LAVA, "resources/Pokemones/Lava/Vulpix/Vulpix037.png"),
    NINETALES("Ninetales",200, Tipo.LAVA, "resources/Pokemones/Lava/Vulpix/Ninetales038.png"),
    MOLTRES("Moltres",300, Tipo.LAVA, "resources/Pokemones/Lava/Moltres/Moltres146.png"),
    CYNDAQUIL("Cyndaquil",100, Tipo.LAVA, "resources/Pokemones/Lava/Cyndaquil/Cyndaquil155.png"),
    QUILAVA("Quilava",200, Tipo.LAVA, "resources/Pokemones/Lava/Cyndaquil/Quilava156.png"),
    TYPHLOSION("Typhlosion",300, Tipo.LAVA, "resources/Pokemones/Lava/Cyndaquil/Typhlosion157.png"),
    ENTEI("Entei",300, Tipo.LAVA, "resources/Pokemones/Lava/Entei/Entei244.png"),
    TORCHIC("Torchic",100, Tipo.LAVA, "resources/Pokemones/Lava/Torchic/Torchic255.png"),
    COMBUSKEN("Combusken",200, Tipo.LAVA, "resources/Pokemones/Lava/Torchic/Combusken256.png"),
    BLAZIKEN("Blaziken",300, Tipo.LAVA, "resources/Pokemones/Lava/Torchic/Blaziken257.png"),
    MACHOP("Machop",100, Tipo.LUCHA, "resources/Pokemones/Lucha/Machop/Machop066.png"),
    MANKEY("Mankey",100, Tipo.LUCHA, "resources/Pokemones/Lucha/Mankey/Mankey056.png"),
    PRIMEAPE("Primeape",200, Tipo.LUCHA, "resources/Pokemones/Lucha/Mankey/Primeape057.png"),
    ANNIHILAPE("Annihilape",300, Tipo.LUCHA, "resources/Pokemones/Lucha/Mankey/Annihilape979.png"),
    MACHOKE("Machoke",200, Tipo.LUCHA, "resources/Pokemones/Lucha/Machop/Machoke067.png"),
    MACHAMP("Machamp",300, Tipo.LUCHA, "resources/Pokemones/Lucha/Machop/Machamp068.png"),
    HITMONLEE("Hitmonlee",100, Tipo.LUCHA, "resources/Pokemones/Lucha/Hitmonlee/Hitmonlee106.png"),
    HITMONCHAN("Hitmonchamn",100, Tipo.LUCHA, "resources/Pokemones/Lucha/Hitmonchan/Hitmonchan107.png"),
    MAKUHITA("Makuhita",100, Tipo.LUCHA, "resources/Pokemones/Lucha/Makuhita/Makuhita296.png"),
    HARIYAMA("Hariyama",200, Tipo.LUCHA, "resources/Pokemones/Lucha/Makuhita/Hariyama297.png"),
    SNORLAX("Snorlax",100, Tipo.PRADO, "resources/Pokemones/Prado/Snorlax/Snorlax143.png"),
    MEWTWO("Mewtwo",300, Tipo.PRADO, "resources/Pokemones/Prado/Mewtwo/Mewtwo150.png"),
    MEW("Mew",300, Tipo.PRADO, "resources/Pokemones/Prado/Mew/Mew151.png"),
    CELEBI("Celebi",300, Tipo.PRADO, "resources/Pokemones/Prado/Celebi/Celebi251.png"),
    ZIGZAGOON("Zigzagoon",100, Tipo.PRADO, "resources/Pokemones/Prado/Zigzagoon/Zigzagoon263.png"),
    LINOONE("Linoone",200, Tipo.PRADO, "resources/Pokemones/Prado/Zigzagoon/Linoone264.png"),
    RALTS("Ralts",100, Tipo.PRADO, "resources/Pokemones/Prado/Ralts/Ralts280.png"),
    KIRLIA("Kirlia",200, Tipo.PRADO, "resources/Pokemones/Prado/Ralts/Kirlia281.png"),
    GALLADE("Gallade",300, Tipo.PRADO, "resources/Pokemones/Prado/Ralts/Gallade475.png"),
    GARDEVOIR("Gardevoir",300, Tipo.PRADO, "resources/Pokemones/Prado/Ralts/Gardevoir282.png"),
    EKANS("Ekans",100, Tipo.SETAS, "resources/Pokemones/Setas/Ekans/Ekans023.png"),
    ARBOK("Arbok",200, Tipo.SETAS, "resources/Pokemones/Setas/Ekans/Arbok024.png"),
    PARAS("Paras",100, Tipo.SETAS, "resources/Pokemones/Setas/Paras/Paras046.png"),
    PARASECT("Parasect",200, Tipo.SETAS, "resources/Pokemones/Setas/Paras/Parasect047.png"),
    KOFFING("Koffing",100, Tipo.SETAS, "resources/Pokemones/Setas/Koffing/Koffing109.png"),
    WEEZING("Weezing",200, Tipo.SETAS, "resources/Pokemones/Setas/Koffing/Weezing110.png"),
    IGGLYBUFF("Igglybuff",100, Tipo.SETAS, "resources/Pokemones/Setas/Igglybuff/Igglybuff174.png"),
    JIGGLYPUFF("Jigglypuff",200, Tipo.SETAS, "resources/Pokemones/Setas/Igglybuff/Jigglypuff039.png"),
    WIGGLYTUFF("Wigglytuff",300, Tipo.SETAS, "resources/Pokemones/Setas/Igglybuff/Wigglytuff040.png"),
    SHROOMISH("Shroomish",100, Tipo.SETAS, "resources/Pokemones/Setas/Shroomish/Shroomish285.png"),
    BRELOOM("Breloom",200, Tipo.SETAS, "resources/Pokemones/Setas/Shroomish/Breloom286.png"),
    GASTLY("Gastly",100, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Gastly/Gastly092.png"),
    HAUNTER("Haunter",200, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Gastly/Haunter093.png"),
    GENGAR("Gengar",300, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Gastly/Gengar094.png"),
    CUBONE("Cubone",100, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Cubone/Cubone104.png"),
    MAROWAK("Marowak",200, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Cubone/Marowak105.png"),
    EXEGGCUTE("Exeggcute",100, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Exeggcute/Exeggcute102.png"),
    EXEGGCUTOR("Exeggcutor",200, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Exeggcute/Exeggutor103.png"),
    MISDREAVUS("Misdreavus",100, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Misdreavus/Misdreavus200.png"),
    MISMAGIUS("Mismagius",200, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Misdreavus/Mismagius429.png"),
    SHUPPET("Shuppet",100, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Shuppet/Shuppet353.png"),
    BANETTE("Banette",200, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Shuppet/Banette354.png"),
    DUSKULL("Duskull",100, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Duskull/Duskull355.png"),
    DUSCLOPS("Dusclops",200, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Duskull/Dusclops356.png"),
    DUSKNOIR("Dusknoir",300, Tipo.SINIESTRO, "resources/Pokemones/Siniestro/Duskull/Dusknoir477.png");
    

    private String nombre;
    private int precio;
    private Image imagen;
    private Tipo tipo;

    DetallePokemon(String nombre, int precio, Tipo tipo, String path){
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = new ImageIcon(path).getImage();
        this.tipo = tipo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public Image getImagen() {
        return imagen;
    }
    public Tipo getTipo(){
        return tipo;
    }
}
