class Bruch
{
    int zaehler, nenner;

    public Bruch(int z, int n)
    {
        zaehler = z;
        nenner = n;
    }

    public int getNenner()
    {
        return nenner;
    }

    public int getZaehler()
    {
        return zaehler;
    }

    public double getWert()
    {
        return zaehler / nenner;
    }

    public void show()
    {
        System.out.println(zaehler + "/" + nenner);
    }
}
