package RPG;

public class Character {
    public String Name;
    public String[] Inventory = new String[5];
    public float Money;
    public String Level;
    public int maxItems = 5;

    public String Species = "";

    public int influenced = 0;

    public int curHP = 100;
    public int maxHp = 100;

    public int curMP = 100;
    public int maxMp = 100;

    public int curAP = 10;
    public int maxAp = 10;

    public int curDP = 0;
    public int maxDp = 0;

    public int curAt = 0;
    public int maxAt = 100;

    public int curDv = 0;
    public int maxDv = 100;

    public Character(String N, float Mo)
    {
        Name = N;
        Money = Mo;
    }
}
