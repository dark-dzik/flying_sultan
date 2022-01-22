package list8;

import list8.pack.CuboidPack;
import list8.pack.CylindricalPack;
import list8.pack.Pack;
import list8.paper.WrappingPaper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ElfPacker elfPacker1 = new ElfPacker(50.0, 150.0);

        Pack cuboidPresent = new CuboidPack("PlayBox", 5.0, 5.0, 1.0);
        WrappingPaper cuboidWrappedPresent = elfPacker1.wrapPresent(cuboidPresent);

        log.info("Cuboid Pack: {}", cuboidPresent);
        log.info("Paper: {}", cuboidWrappedPresent);


        System.out.println("\n");

        Pack cylindricalPack = new CylindricalPack("Klejnot Nilu", 5.0, 8.0);
        WrappingPaper cylindricalWrappedPresent = elfPacker1.wrapPresent(cylindricalPack);

        log.info("Cylindrical Pack: {}", cylindricalPack);
        log.info("Paper: {}", cylindricalWrappedPresent);

    }
}
