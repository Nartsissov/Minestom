package net.minestom.server.entity;

import net.minestom.server.network.packet.server.play.SpawnEntityPacket;
import net.minestom.server.network.player.PlayerConnection;
import net.minestom.server.utils.Position;

public abstract class ObjectEntity extends Entity {

    public ObjectEntity(EntityType entityType, Position spawnPosition) {
        super(entityType.getId(), spawnPosition);
        setGravity(0.02f);
    }

    /**
     * Objects data can be found <a href="https://wiki.vg/Object_Data">here</a>
     *
     * @return an object data
     */
    public abstract int getObjectData();

    @Override
    public void update(long time) {

    }

    @Override
    public void spawn() {

    }

    @Override
    public boolean addViewer(Player player) {
        final boolean result = super.addViewer(player);
        if (!result)
            return false;

        PlayerConnection playerConnection = player.getPlayerConnection();

        SpawnEntityPacket spawnEntityPacket = new SpawnEntityPacket();
        spawnEntityPacket.entityId = getEntityId();
        spawnEntityPacket.uuid = getUuid();
        spawnEntityPacket.type = getEntityType();
        spawnEntityPacket.position = getPosition();
        spawnEntityPacket.data = getObjectData();
        playerConnection.sendPacket(spawnEntityPacket);
        playerConnection.sendPacket(getVelocityPacket());
        playerConnection.sendPacket(getMetadataPacket());

        if (hasPassenger()) {
            playerConnection.sendPacket(getPassengersPacket());
        }

        return result;
    }

}
