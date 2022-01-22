package list_8_1_a;

import list_8_1_a.pack.CuboidPack;
import list_8_1_a.pack.CylindricalPack;
import list_8_1_a.pack.Pack;
import list_8_1_a.paper.WrappingPaper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ElfPacker elfPacker1 = new ElfPacker(50.0, 150.0);

        Pack cuboidPresent = new CuboidPack(5.0, 5.0, 1.0);
        Present cuboidWrappedPresent = elfPacker1.wrapPresent("PlayBox", cuboidPresent);

        log.info("Present: {}", cuboidWrappedPresent);

        System.out.println("\n");

        Pack cylindricalPack = new CylindricalPack(5.0, 8.0);
        Present cylindricalWrappedPresent = elfPacker1.wrapPresent("Klejnot Nilu", cylindricalPack);

        log.info("Present: {}", cylindricalWrappedPresent);

    }
}
