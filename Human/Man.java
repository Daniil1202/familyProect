package Human;
public  class Man extends Human  {
    private int wife;
    private GenderType sex;
    public Man(String name,String surname, int birthYear, int birthMonth, int birthDay){
        super(name,surname,birthDay,birthMonth,birthYear);
        this.sex = GenderType.male;
    }
    public Man(String name, String surname){
        super(name,surname);
        this.sex = GenderType.male;
    }

    public String toString(){
        return super.toString() +", мужчина";
    }
    public void getMarrid(Human wife){
        super.getMarried(wife);
    }
    public int getWife(){
        return wife;
    }
    public void setWife(int wife){
        this.wife = wife;
    }

    //  @Override
    //     public void setMother(int mother) {
    //         this.mother = mother;
    //     }

    //  @Override
    //     public void setFather(int father) {
    //         this.father = father;
    //     }
}
