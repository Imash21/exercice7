package Animal;

class Fish extends Animal
{
    private String General_typeImamidin57105;

    public Fish()
    {
        super();
        General_typeImamidin57105="XX";
    }
    public Fish(String name,int age , int weight , String General_type)
    {
        super(name,age,weight);
        this.General_typeImamidin57105=General_type;
    }

    public Fish(int age , String General_type)
    {
        super(age);
        this.General_typeImamidin57105=General_type;
    }

    public void Search_For_Food()
    {System.out.println("Looking for food");}

    @Override
    void getVoiceImamidin57105()
    {System.out.println("ASJKLDHJASLHD");}

    @Override
    public void eatImamidin57105(String meal)
    {System.out.println("Fish s eatin "+ meal);}

    public String getGTypeImamidin57105()
    {return this.General_typeImamidin57105;};

    public void setGTypeImamidin57105(String w)
    {this.General_typeImamidin57105=w;};

    public String ToString()
    {return "Fish :\n "+"General Type of Fish : "+General_typeImamidin57105;}
}
