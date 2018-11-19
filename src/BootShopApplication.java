// Hansel signed up for the hike Matilda is organizing for the weekend, but he doesn’t have proper hiking boots. He decides to go directly to a shop, since time is of the essence. Hopefully he finds the right hiking boots with the size 41.
// Develop the following code:
// a. Define the HikingBoot data class that has a size attribute.
// b. Define the BootShopAssistant agent class that has a getHikingBootRecommendations method that returns a list of three different hiking boots with sizes 40, 41 and 42 in random order.
// c.Define the Hansel agent class that has a footSize attribute with the value 41.
// d. Define in the Hansel class an isRightSize method that receives a HikingBoot and compares its size with his footSize and returns if they are the same. This method has private visibility so that only the Hansel class can use it.
// e. Define in the Hansel class a tryHikingBoots method that receives a list of HikingBoot and tries them one by one. If the HikingBoot doesn’t have the right size, he will say “This one does not fit, sorry.” and continue with the next. If it is 41 he will say “I’m buying this one, thanks!” and stop trying more boots.
// f. Define the BootShopApplication class that has a main method that uses the BootShopAssistant and Hansel 
import java.util.List;
public class BootShopApplication {
    public static void main(String[] args) {
        BootShopAssistant assistant = new BootShopAssistant();
        List<HikingBoot> recommendations = assistant.getHikingBootRecommendations();
        Hansel hansel = new Hansel();
        hansel.tryHikingBoots(recommendations);
    }

}
