package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class MelonStem {
	public static void initStates() {
		MELON_STEM.addBlockAlternative(new BlockAlternative((short) 4780, "age=0"));
		MELON_STEM.addBlockAlternative(new BlockAlternative((short) 4781, "age=1"));
		MELON_STEM.addBlockAlternative(new BlockAlternative((short) 4782, "age=2"));
		MELON_STEM.addBlockAlternative(new BlockAlternative((short) 4783, "age=3"));
		MELON_STEM.addBlockAlternative(new BlockAlternative((short) 4784, "age=4"));
		MELON_STEM.addBlockAlternative(new BlockAlternative((short) 4785, "age=5"));
		MELON_STEM.addBlockAlternative(new BlockAlternative((short) 4786, "age=6"));
		MELON_STEM.addBlockAlternative(new BlockAlternative((short) 4787, "age=7"));
	}
}
