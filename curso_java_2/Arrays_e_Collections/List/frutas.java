package Arrays_e_collections;

public class frutas {
    String nome_fruta;

    public String toString()
    {
        return "O nome da fruta e " + this.nome_fruta + ".";
    }
    frutas(String nome_fruta)
    {
        this.nome_fruta = nome_fruta;
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;

    if (!(obj instanceof frutas)) return false;

    frutas outra = (frutas) obj;

    return this.nome_fruta.equals(outra.nome_fruta);
}
}
