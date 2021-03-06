package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class SmoothSandstoneSlab {
	public static void initStates() {
		SMOOTH_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10825, "type=top", "waterlogged=true"));
		SMOOTH_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10826, "type=top", "waterlogged=false"));
		SMOOTH_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10827, "type=bottom", "waterlogged=true"));
		SMOOTH_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10828, "type=bottom", "waterlogged=false"));
		SMOOTH_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10829, "type=double", "waterlogged=true"));
		SMOOTH_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10830, "type=double", "waterlogged=false"));
	}
}
