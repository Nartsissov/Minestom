package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class WitherSkeletonWallSkull {
	public static void initStates() {
		WITHER_SKELETON_WALL_SKULL.addBlockAlternative(new BlockAlternative((short) 6526, "facing=north"));
		WITHER_SKELETON_WALL_SKULL.addBlockAlternative(new BlockAlternative((short) 6527, "facing=south"));
		WITHER_SKELETON_WALL_SKULL.addBlockAlternative(new BlockAlternative((short) 6528, "facing=west"));
		WITHER_SKELETON_WALL_SKULL.addBlockAlternative(new BlockAlternative((short) 6529, "facing=east"));
	}
}
