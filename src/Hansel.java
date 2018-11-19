import java.util.List;
public class Hansel {
    private Integer footSize = 41;
    private boolean isRightSize(HikingBoot hikingBoot) {
        return(footSize.equals(hikingBoot.getSize()));
    }
    public void tryHikingBoots(List<HikingBoot> boots) {
        for(HikingBoot hikingBoot : boots) {
            if (isRightSize(hikingBoot)) {
                System.out.println("I’m buying this one, thanks! ");
                return;
            }
            System.out.println("This one does not fit, sorry.");

        }
    }
}