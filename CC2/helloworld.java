public class helloworld {
    public static void main(String[] args) {
               
        int temperature = 30;

        if ( temperature >= 30 ) {
            System.out.println("It's hot outside! Stay hydrated.");
        } else if (temperature >= 20 && temperature <= 29) {
                System.out.println("Nice weather! Maybe go for a walk.");              
            } else if (temperature >= 10 && temperature <= 19) {   
                System.out.println("A bit chilly. Wear a light jacket.");
            } else {
                System.out.println("It's cold! Bundle up.");
            }
        
    }
}
