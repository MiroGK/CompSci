package U2_PracticeTest;

public class TankTester {
    public static void main(String[] args) {
        System.out.println(WaterUtils.isSafeTemp("26.5"));
        Fish coral = new Fish("Coral", "Clownfish");
        Fish dot = new Fish("Dot");
        RareFish sunny = new RareFish("Sunny", "Mandarin Dragonet", "Fiji");
        coral.feed(2, 15);
        coral.feed(4, 20);
        coral.feed(2, 10);
        int[] copy = coral.copyFeedings();
        copy[4] = 0;
        System.out.println(coral.totalFed());
        System.out.println(coral.busiestDay());
        System.out.println(coral.lastFeeding());
        System.out.println(dot.lastFeeding());
        System.out.println(dot);
        System.out.println(sunny);
        Tank tank = new Tank("Reef Room",
                new Fish[] {coral, null, dot, new Fish("Pip", "Clownfish")});
        System.out.println(tank.findByName("Pip"));
        System.out.println(tank.countSpecies("Clownfish"));
        System.out.println(tank);
    }
}
