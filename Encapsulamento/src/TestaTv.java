public class TestaTv {
    public void main(String[] args){

        SmartTv obj1 = new SmartTv("Sansung", "32 Polegadas ", 0);
        System.out.println(obj1.toString());

        //altera volume
        obj1.setVolume(30);
        obj1.setVolume(120);
        System.out.println("Valor do volume " + obj1.getVolume());

        SmartTv obj3 = new SmartTv("LG", "32 windescreen", -120);
        System.out.println(obj3.toString());
        obj3.setVolume(30);
        obj3.entrarYouTube();



    }
}
