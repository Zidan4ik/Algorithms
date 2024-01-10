package task.task7;


public class Main {
    public static void main(String[] args) {
        Vertex rivne = new Vertex("Rivne");
        Vertex lviv = new Vertex("Lviv");
        Vertex ternopil = new Vertex("Ternopil");
        Vertex zhytomyr = new Vertex("Zhytomyr");
        Vertex khmelnytskyi = new Vertex("Khmelnytskyi");
        Vertex vinnitsa = new Vertex("Vinnitsa");
        Vertex uman = new Vertex("Uman");
        Vertex kyiv = new Vertex("Kyiv");
        Vertex kropyvnytskyi = new Vertex("Kropyvnytskyi");
        Vertex odesa = new Vertex("Odesa");
        Vertex mykolaiv = new Vertex("Mykolaiv");
        Vertex kherson = new Vertex("Kherson");
        Vertex kryvyiRih = new Vertex("KryvyiRih");
        Vertex dnipro = new Vertex("Dnipro");
        Vertex poltava = new Vertex("Poltava");
        Vertex sumy = new Vertex("Sumy");
        Vertex kharkiv = new Vertex("Kharkiv");


        lviv.addNeighbour(new Edge(lviv, rivne, 121));
        lviv.addNeighbour(new Edge(lviv, ternopil, 127));

        kyiv.addNeighbour(new Edge(kyiv, zhytomyr, 140));
        kyiv.addNeighbour(new Edge(kyiv, uman, 212));

        rivne.addNeighbour(new Edge(rivne, lviv, 121));
        rivne.addNeighbour(new Edge(rivne, zhytomyr, 188));
        rivne.addNeighbour(new Edge(rivne, ternopil, 159));

        ternopil.addNeighbour(new Edge(ternopil, rivne, 127));
        ternopil.addNeighbour(new Edge(ternopil, lviv, 159));
        ternopil.addNeighbour(new Edge(ternopil, khmelnytskyi, 111));

        khmelnytskyi.addNeighbour(new Edge(khmelnytskyi, ternopil, 111));
        khmelnytskyi.addNeighbour(new Edge(khmelnytskyi, vinnitsa, 122));

        vinnitsa.addNeighbour(new Edge(vinnitsa, khmelnytskyi, 122));
        vinnitsa.addNeighbour(new Edge(vinnitsa, uman, 160));

        uman.addNeighbour(new Edge(uman, vinnitsa, 160));
        uman.addNeighbour(new Edge(uman, kyiv, 212));
        uman.addNeighbour(new Edge(uman, kropyvnytskyi, 167));


        zhytomyr.addNeighbour(new Edge(zhytomyr, rivne, 188));
        zhytomyr.addNeighbour(new Edge(zhytomyr, kyiv, 140));

        odesa.addNeighbour(new Edge(odesa,uman,271));
        odesa.addNeighbour(new Edge(odesa,mykolaiv,132));

        mykolaiv.addNeighbour(new Edge(mykolaiv,kherson,71));
        mykolaiv.addNeighbour(new Edge(mykolaiv,odesa,132));
        mykolaiv.addNeighbour(new Edge(mykolaiv,kryvyiRih,204));

        kryvyiRih.addNeighbour(new Edge(kryvyiRih,mykolaiv,204));
        kryvyiRih.addNeighbour(new Edge(kryvyiRih,dnipro,146));
        kryvyiRih.addNeighbour(new Edge(kryvyiRih,kropyvnytskyi,119));

        kropyvnytskyi.addNeighbour(new Edge(kropyvnytskyi,kryvyiRih,119));
        kropyvnytskyi.addNeighbour(new Edge(kropyvnytskyi,uman,167));
        kropyvnytskyi.addNeighbour(new Edge(kropyvnytskyi,dnipro,245));

        dnipro.addNeighbour(new Edge(dnipro,kryvyiRih,146));
        dnipro.addNeighbour(new Edge(dnipro,kropyvnytskyi,245));
        dnipro.addNeighbour(new Edge(dnipro,kharkiv,216));


        kharkiv.addNeighbour(new Edge(kharkiv,dnipro,216));
        kharkiv.addNeighbour(new Edge(kharkiv,poltava,143));
        kharkiv.addNeighbour(new Edge(kharkiv,sumy,183));


        poltava.addNeighbour(new Edge(poltava,kyiv,342));
        poltava.addNeighbour(new Edge(poltava,kharkiv,143));

        sumy.addNeighbour(new Edge(sumy,kharkiv,183));

        kherson.addNeighbour(new Edge(kharkiv,mykolaiv,71));



        Dijkstra dijkstra = new Dijkstra();

        dijkstra.compute(lviv);

        dijkstra.showPath(kyiv);
    }
}
