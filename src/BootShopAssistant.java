import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BootShopAssistant {
    public List<HikingBoot> getHikingBootRecommendations() {
        List<HikingBoot> bootSize = new ArrayList();
        bootSize.add(new HikingBoot(40));
        bootSize.add(new HikingBoot(42));
        bootSize.add(new HikingBoot(41));
        return bootSize;
    }
}