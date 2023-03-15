package dev.pelkum.yamif.gui;

import java.util.UUID;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

/**
 * Represents the inventory holder of a GUI
 *
 * @author Lukas Schulte Pelkum
 * @version 1.0.0
 * @since 1.0.0
 */
public class GUIInventoryHolder implements InventoryHolder {

    // Define and initialize the UUID
    private final UUID uuid = UUID.randomUUID();
    private final GUI gui;

    public GUIInventoryHolder(final GUI gui) {
        this.gui = gui;
    }

    /**
     * @return The UUID of this inventory holder
     */
    public UUID getUUID() {
        return this.uuid;
    }

    @Override
    public Inventory getInventory() {
        return null;
    }

    public GUI getGui() {
        return this.gui;
    }

}
