public class lesson5 {

    public static void main(String[] args) {

        //seasons of the year - as var
        //warm jacket, t-shirt, swimming suit, raincoat
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        String clothes = "";
        if (seasons.equals("spring")) {
            clothes = "t-shirt";
        } else if (seasons.equals("winter")) {
            clothes = "warm jacket";
        } else if (seasons.equals("summer")) {
            clothes = "swimsuit";
        } else if (seasons.equals("autumn")) {
            clothes = "raincoat";
        }
        System.out.print("Wear a " + clothes);


        //temp -20 +5 super warm clothes
        //+5 +15 warm
        //15 30 normal
        //30+ cooling
        var temperature = 25;
        //String clothes = "";
        if (temperature >= -20 && temperature < 5) {
            clothes = "super warm clothes";
        } else if (temperature >= 5 && temperature < 15) {
            clothes = "warm clothes";
        } else if (temperature >= 15 && temperature < 30) {
            clothes = "normal clothes";
        } else if (temperature >= 30) {
            clothes = "cooling clothes";
        }
        System.out.println("For a temperature of " + temperature + "°C, wear " + clothes + ".");

    }
}
