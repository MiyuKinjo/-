public  class Main{
    public static void main(String[] args) {
    System.out.println("勇者よ、この仮想世界に生まれよ！");
    Hero h = new Hero();
    h.name = "ミナト";
    System.out.println(h.hp);

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    System.out.println("勇者"+ h.name+ "を生み出しました！");
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();


    
    
    }
}